package org.drinkless.tdlib.example

import org.drinkless.tdlib.Client
import org.drinkless.tdlib.TdApi
import org.drinkless.tdlib.TdApi.*
import java.time.Duration
import java.time.Instant
import java.time.ZoneId
import java.time.format.DateTimeFormatter

private val sourceChatIds = arrayOf(allSlots, mockedAllSlots).also {
    println("Listening to: ${it.joinToString(", ")}")
}

private const val targetChatId = filteredSlots
private const val priorityTargetChatId = sri

val targetMappings = IdMappings()
val priorityTargetMappings = IdMappings()
val idMessages = sizeLimitedSynchronizedMap<Long, String?>(100_000)

fun interestingUpdates(event: Object) {
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
//            onEditedMessage(event, client)
        }

        is UpdateDeleteMessages -> {
            if (event.chatId !in sourceChatIds)
                return
//            onMessageDelete(event, client)
        }
    }
}

private fun onMessageDelete(event: UpdateDeleteMessages, client: Client) {
    event.messageIds.map { idMessages[it] }.filterNotNull().forEach {
        println("deleted - $it")
    }
    client.propagateDelete(event, targetChatId, targetMappings)
    client.propagateDelete(event, priorityTargetChatId, priorityTargetMappings)
}

private fun onEditedMessage(event: UpdateMessageContent, client: Client) {
    val newContent = event.newContent

    val msgId = event.messageId
    if (msgId !in idMessages)
        return

    val origMsg = idMessages[msgId]
    val changedMsg = when (newContent) {
        is MessageText -> newContent.text.text
        is MessagePhoto -> newContent.caption.text
        else -> {
            System.err.println("Updated content type not handled $event")
            return
        }
    }

    client.sendMessage("Message edited from \"$origMsg\" to \"$changedMsg\"", targetChatId)
}

private fun Client.sendMessage(message: String, destChatId: Long) {
    sendValidated<Message>(
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

private fun onMessagePosted(message: Message, client: Client) {
    val msgText = message.content.text()!!
    val shouldFwd = msgText.shouldFwd()
    val priority = msgText.shouldFwdPriority()

    val msgTime = Instant.ofEpochSecond(message.date.toLong())
    val now = Instant.now()
    val delay = Duration.between(msgTime, now).seconds

    if (shouldFwd) {
        println((if (priority) "**" else "  ") +
                (if (shouldFwd) " fwd  | " else "      | ") +
                        soutFmt.format(now.atZone(ZoneId.systemDefault())) +
                        " - " + delay.toString().padStart(3) +
                        " | " + msgText
        )
        if (priority) {
            client.sendMessage(fwdFmt.format(msgTime.atZone(ZoneId.systemDefault())) + ": $msgText", priorityTargetChatId)
        }
    }

//    if (shouldFwd) {
//        idMessages[message.id] = msgText
//        if (priority)
//            client.fwd(priorityTargetChatId, message, priorityTargetMappings)
//        client.fwd(targetChatId, message, targetMappings)
//    }
}

private fun Client.propagateDelete(event: UpdateDeleteMessages, targetChatId: Long, targetMappings: IdMappings) {
    val fwdsDeleted = event.messageIds.map {
        targetMappings.get(it)
    }.filterNotNull()
        .toLongArray()

    sendValidated<Ok>(DeleteMessages(targetChatId, fwdsDeleted, true))
}

private fun Client.fwd(targetChatId: Long, message: Message, mappings: IdMappings) {
    val forwardMessages = ForwardMessages(
        targetChatId,
        message.chatId,
        longArrayOf(message.id),
        null,
        false,
        false,
        false
    )

    sendValidated<Messages>(forwardMessages) { fwdMessages ->
        val fwdMessage = fwdMessages.messages[0]
//                println(fwdMessage)
        mappings.set(message.id, fwdMessage.id)
    }
}

private fun MessageContent.text(): String? = when (this) {
    is MessageText -> {
        this.text.text
    }

    is MessagePhoto -> {
        this.photo
        this.caption.text
    }

    else -> {
//        System.err.println("Unknown content: $this")
        null
    }
}

inline fun <reified T : Object> Client.sendValidated(
    query: TdApi.Function<*>,
    crossinline resultHandler: (T) -> Unit = {}
) {
    send(query) {
        when (it) {
            is Error -> {
                System.err.println("Encountered error: $it")
            }

            null -> {
                System.err.println("Unexpected null response")
            }

            !is T -> {
                System.err.println("Expected result type: ${T::class.java} but found ${it.javaClass}")
            }

            else -> {
                resultHandler(it)
            }
        }
    }
}

