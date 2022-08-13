//
// Copyright Aliaksei Levin (levlam@telegram.org), Arseny Smirnov (arseny30@gmail.com) 2014-2022
//
// Distributed under the Boost Software License, Version 1.0. (See accompanying
// file LICENSE_1_0.txt or copy at http://www.boost.org/LICENSE_1_0.txt)
//
package org.drinkless.tdlib.example

import org.drinkless.tdlib.Client
import org.drinkless.tdlib.Client.ResultHandler
import org.drinkless.tdlib.TdApi.*
import slotfilter.newLine
import java.io.IOError
import java.io.IOException
import java.util.*
import java.util.concurrent.ConcurrentHashMap
import java.util.concurrent.ConcurrentMap
import java.util.concurrent.locks.Condition
import java.util.concurrent.locks.Lock
import java.util.concurrent.locks.ReentrantLock

lateinit var client: Client

/**
 * Example class for TDLib usage from Java.
 */
object Main {
    init {
        try {
            System.loadLibrary("tdjni")
        } catch (e: UnsatisfiedLinkError) {
            e.printStackTrace()
        }
    }

    @Volatile
    var haveAuthorization = false

    @Volatile
    var needQuit = false

    @Volatile
    var canQuit = false

    val authorizationLock: Lock = ReentrantLock()
    val gotAuthorization: Condition = authorizationLock.newCondition()

    val chats: ConcurrentMap<Long, Chat> = ConcurrentHashMap()

    private val mainChatList: NavigableSet<OrderedChat> = TreeSet()
    var haveFullMainChatList = false
    private const val commandsLine =
        "Enter command (gcs - GetChats, gc <chatId> - GetChat, me - GetMe, sm <chatId> <message> - SendMessage, lo - LogOut, q - Quit): "

    fun setChatPositions(chat: Chat?, positions: Array<ChatPosition?>) {
        synchronized(mainChatList) {
            synchronized((chat)!!) {
                for (position: ChatPosition in chat.positions) {
                    if (position.list.constructor == ChatListMain.CONSTRUCTOR) {
                        val isRemoved = mainChatList.remove(OrderedChat(chat.id, position))
                        assert(isRemoved)
                    }
                }
                chat.positions = positions
                for (position: ChatPosition in chat.positions) {
                    if (position.list.constructor == ChatListMain.CONSTRUCTOR) {
                        val isAdded = mainChatList.add(OrderedChat(chat.id, position))
                        assert(isAdded)
                    }
                }
            }
        }
    }

    private fun getAndExecuteCmd() {
        val command = Console.ask(commandsLine)
        val commands = command.split(" ".toRegex(), limit = 2).toTypedArray()
        try {
            when (commands[0]) {
                "gcs" -> {
                    var limit = 20
                    if (commands.size > 1) {
                        limit = commands[1].toInt()
                    }
                    getMainChatList(limit)
                }
                "gc" -> client.send(GetChat(commands[1].toLong()), SysoutHandler)
                "me" -> client.send(GetMe(), SysoutHandler)
                "sm" -> {
                    val args = commands[1].split(" ".toRegex(), limit = 2).toTypedArray()
                    sendMessage(args[0].toLong(), args[1])
                }
                "listen" -> {
//                    client.send(Message)
                }
                "lo" -> {
                    haveAuthorization = false
                    client.send(LogOut(), SysoutHandler)
                }
                "q" -> {
                    needQuit = true
                    haveAuthorization = false
                    client.send(Close(), SysoutHandler)
                }
                else -> System.err.println("Unsupported command: $command")
            }
        } catch (e: ArrayIndexOutOfBoundsException) {
            print("Not enough arguments")
        }
    }

    private fun getMainChatList(limit: Int) {
        synchronized(mainChatList) {
            if (!haveFullMainChatList && limit > mainChatList.size) {
                // send LoadChats request if there are some unknown chats and have not enough known chats
                client.send(LoadChats(ChatListMain(), limit - mainChatList.size), ResultHandler { `object` ->
                    when (`object`.constructor) {
                        Error.CONSTRUCTOR -> if ((`object` as Error).code == 404) {
                            synchronized(mainChatList) { haveFullMainChatList = true }
                        } else {
                            System.err.println("Receive an error for LoadChats:$newLine$`object`")
                        }

                        Ok.CONSTRUCTOR ->                                 // chats had already been received through updates, let's retry request
                            getMainChatList(limit)

                        else -> System.err.println("Receive wrong response from TDLib:$newLine$`object`")
                    }
                })
                return
            }
            val iter: Iterator<OrderedChat> = mainChatList.iterator()
            println()
            println("First " + limit + " chat(s) out of " + mainChatList.size + " known chat(s):")
            var i = 0
            while (i < limit && i < mainChatList.size) {
                val chatId = iter.next().chatId
                val chat = chats[chatId]
                synchronized((chat)!!) { println(chatId.toString() + ": " + chat.title) }
                i++
            }
            print("")
        }
    }

    private fun sendMessage(chatId: Long, message: String) {
        // initialize reply markup just for testing
        val row = arrayOf(
            InlineKeyboardButton("https://telegram.org?1", InlineKeyboardButtonTypeUrl()),
            InlineKeyboardButton("https://telegram.org?2", InlineKeyboardButtonTypeUrl()),
            InlineKeyboardButton("https://telegram.org?3", InlineKeyboardButtonTypeUrl())
        )
        val replyMarkup: ReplyMarkup = ReplyMarkupInlineKeyboard(arrayOf(row, row, row))
        val content: InputMessageContent = InputMessageText(FormattedText(message, null), false, true)
        client.send(SendMessage(chatId, 0, 0, null, replyMarkup, content), SysoutHandler)
    }

    @Throws(InterruptedException::class)
    @JvmStatic
    fun main(args: Array<String>) {
        // set log message handler to handle only fatal errors (0) and plain log messages (-1)
        Client.setLogMessageHandler(0, LogMessageHandler())

        // disable TDLib log and redirect fatal errors and plain log messages to a file
        Client.execute(SetLogVerbosityLevel(0))
        if (Client.execute(SetLogStream(LogStreamFile("tdlib.log", (1 shl 27).toLong(), false))) is Error) {
            throw IOError(IOException("Write access to the current directory is required"))
        }

        // create client
        client = Client.create(UpdateHandler, null, null)

        // test Client.execute
//        SysoutHandler.onResult(Client.execute(GetTextEntities("@telegram /test_command https://telegram.org telegram.me @gif @test")))

        // main loop
        while (!needQuit) {
            // await authorization
            authorizationLock.lock()
            try {
                while (!haveAuthorization) {
                    gotAuthorization.await()
                }
            } finally {
                authorizationLock.unlock()
            }
            while (haveAuthorization) {
                getAndExecuteCmd()
            }
        }
        while (!canQuit) {
            Thread.sleep(1)
        }
    }
}
