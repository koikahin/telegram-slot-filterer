package org.drinkless.tdlib.example

import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.launch
import org.drinkless.tdlib.Client
import org.drinkless.tdlib.TdApi
import org.drinkless.tdlib.TdApi.*
import java.time.Duration
import java.time.Instant
import java.time.ZoneId
import java.time.format.DateTimeFormatter
import kotlin.coroutines.resume
import kotlin.coroutines.resumeWithException
import kotlin.coroutines.suspendCoroutine


private const val targetChatId = filteredSlots
private const val priorityTargetChatId = sri
private val sourceChatIds = arrayOf(/*allSlots, */mockedAllSlots).also {
    println("Listening to: ${it.joinToString(", ")}")
}
private val destChatIds = arrayOf(targetChatId, priorityTargetChatId)

val idMappings = IdMappings()
val msgIdUpdates = IdMappings()

private val messages = sizeLimitedSynchronizedMap<Long, String>(10_000)


suspend fun interestingUpdates(event: Object) {
    val client = Main.client
    when (event) {
        is UpdateNewMessage -> {
            val message = event.message
            if (message.chatId !in sourceChatIds)
                return
            onMessagePosted(message, client)
        }

        is UpdateMessageContent -> {
            if (event.chatId !in sourceChatIds)
                return
            onMessageEdited(event, client)
        }

        is UpdateMessageSendSucceeded -> {
            if (event.message.chatId !in destChatIds)
                return
            trackMessageIdUpdate(event, client)
        }

        is UpdateDeleteMessages -> {
            if (event.chatId !in sourceChatIds)
                return
            onMessageDelete(event, client)
        }
    }
}

fun trackMessageIdUpdate(event: UpdateMessageSendSucceeded, client: Client) {
    val chatId = event.message.chatId
    msgIdUpdates.setId(chatId, event.oldMessageId, event.message.id)
}

fun getFwdIds(msgId: Long): Map<Long, Long> {
    return idMappings.getId(msgId).mapValues { (fwdChatId, fwdMsgId) ->
        msgIdUpdates.getId(fwdChatId)[fwdMsgId] ?: fwdMsgId
    }
}

private suspend fun onMessageDelete(event: UpdateDeleteMessages, client: Client) {
    event.messageIds.map { messages[it] }
        .filterNotNull()
        .forEach {
            println(
                "deleted | " +
                        soutFmt.format(Instant.now().atZone(ZoneId.systemDefault())) +
                        "      " +
                        " | $it"
            )
        }
    client.propagateDelete(event.messageIds)
}

private suspend fun onMessageEdited(event: UpdateMessageContent, client: Client) {
    val newContent = event.newContent

    val msgId = event.messageId
    if (msgId !in idMappings.keys())
        return

    val changedMsg = when (newContent) {
        is MessageText -> newContent.text.text
        is MessagePhoto -> newContent.caption.text
        else -> {
//            System.err.println("Updated content type not handled $event")
            return
        }
    }

    val fwdMsg = toFwdMsg(Instant.now(), changedMsg)
    client.propagateEdits(msgId, fwdMsg)
}

private suspend fun Client.sendMessage(message: String, destChatId: Long): Message {
    return sendSuspend(
        SendMessage(
            destChatId,
            0,
            0,
            null,
            null,
            InputMessageText(FormattedText(message, null), false, true)
        )
    )
}

private val soutFmt = DateTimeFormatter.ofPattern("MMM dd hh:mm:ss a")
private val fwdFmt = DateTimeFormatter.ofPattern("hh:mm:ss a")

private suspend fun onMessagePosted(message: Message, client: Client) = coroutineScope {
    val msgText = message.content.text()!!
    val shouldFwd = msgText.shouldFwd()
    val priority = msgText.shouldFwdPriority()

    val msgTime = Instant.ofEpochSecond(message.date.toLong())
    val now = Instant.now()
    val delay = Duration.between(msgTime, now).seconds

    val fwdMsgText = toFwdMsg(msgTime, msgText)

    val sout = (if (priority) "**" else "  ") +
            (if (shouldFwd) " fwd  | " else "      | ") +
            soutFmt.format(now.atZone(ZoneId.systemDefault())) +
            " - " + delay.toString().padStart(3) +
            " | $msgText"

    println(sout)

    if (shouldFwd) {
        messages[message.id] = fwdMsgText
        if (priority) {
            launch {
                val fwdMsg = client.sendMessage(fwdMsgText, priorityTargetChatId)
                idMappings.setId(message.id, priorityTargetChatId, fwdMsg.id)
            }
        }
        launch {
            val fwdMsg = client.sendMessage(fwdMsgText, targetChatId)
            idMappings.setId(message.id, targetChatId, fwdMsg.id)
        }
    }

//    if (shouldFwd) {
//        idMessages[message.id] = msgText
//        if (priority)
//            client.fwd(priorityTargetChatId, message, priorityTargetMappings)
//        client.fwd(targetChatId, message, targetMappings)
//    }
}

private fun toFwdMsg(msgTime: Instant, msgText: String): String {
    val fwdMsg = fwdFmt.format(msgTime.atZone(ZoneId.systemDefault())) + ": $msgText"
    return fwdMsg
}

private suspend fun Client.propagateDelete(messageIds: LongArray) {
    val toBeDeleted = messageIds.flatMap { msgId ->
        getFwdIds(msgId).map { (fwdChatId, fwdMsgId) -> fwdChatId to fwdMsgId }
    }.groupBy({ it.first }, { it.second })

    toBeDeleted.map { (chatId, msgIds) ->
        sendSuspend<Ok>(DeleteMessages(chatId, msgIds.toLongArray(), true))
    }
}

private suspend fun Client.propagateEdits(srcMsgId: Long, changedMsg: String) {
    getFwdIds(srcMsgId).map { (targetChatId, targetMsgId) ->
        sendSuspend<Message>(
            EditMessageText(
                targetChatId, targetMsgId, null,
                InputMessageText(FormattedText(changedMsg, null), false, true)
            )
        )
    }
}

//private fun Client.fwd(targetChatId: Long, message: Message, mappings: IdMappings) {
//    val forwardMessages = ForwardMessages(
//        targetChatId,
//        message.chatId,
//        longArrayOf(message.id),
//        null,
//        false,
//        false,
//        false
//    )
//
//    sendSuspend<Messages>(forwardMessages) { fwdMessages ->
//        val fwdMessage = fwdMessages.messages[0]
////                println(fwdMessage)
//        mappings.set(message.id, fwdMessage.id)
//    }
//}

private fun MessageContent.text(): String? = when (this) {
    is MessageText -> {
        this.text.text
    }

    is MessagePhoto -> {
        this.photo
        this.caption.text
    }

    else -> {
        null
    }
}

suspend inline fun <reified T : Object> Client.sendSuspend(
    query: TdApi.Function<*>
): T = suspendCoroutine { cont ->
    send(query) {
        when (it) {
            is Error -> {
                cont.resumeWithException(Exception(it.toString()))
            }

            null -> {
                cont.resumeWithException(Exception("Unexpected null response"))
            }

            !is T -> {
                cont.resumeWithException(Exception("Expected result type: ${T::class.java} but found ${it.javaClass}"))
            }

            else -> {
                cont.resume(it)
            }
        }
    }
}

