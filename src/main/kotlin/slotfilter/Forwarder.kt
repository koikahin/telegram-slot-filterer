package slotfilter

import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.launch
import org.drinkless.tdlib.TdApi.*

object Forwarder {
    private val chatList = ChatList()
    private val idGen = IdGen()

    suspend fun processEvent(event: Object) {
        when (event) {
            is UpdateNewMessage -> {
                val sourceChat = chatList.getSourceChat(event.message) ?: return
                messagePosted(sourceChat, event.message)
            }

            is UpdateMessageContent -> {
                val sourceChat = chatList.getSourceChat(event.chatId) ?: return
                messageEdited(sourceChat, event)
            }

            is UpdateDeleteMessages -> {
                val sourceChat = chatList.getSourceChat(event.chatId) ?: return
                deleteMessage(sourceChat, event)
            }

            is UpdateMessageSendSucceeded -> {
                val chat = chatList.getChat(event.message.chatId) ?: return
                chat.msgIdChange(event.oldMessageId.asMsgId, event.message.id.asMsgId)
            }

            is UpdateMessageIsPinned -> {
                val sourceChat = chatList.getSourceChat(event.chatId) ?: return
                messagePinned(sourceChat, event)
            }
        }
    }

    private suspend fun messagePosted(sourceChat: SourceChat, message: Message) = coroutineScope {
        val content = message.content
        val msgText = content.text() ?: return@coroutineScope

        val photoDetails = when (content) {
            is MessagePhoto -> {
                val largestPhotoSize = content.photo?.sizes
                    ?.maxByOrNull { it.photo?.remote?.uploadedSize ?: 0 }
                if (largestPhotoSize?.photo?.remote != null) {
                    PhotoDetails(
                        InputFileRemote(largestPhotoSize.photo.remote.id),
                        largestPhotoSize.width,
                        largestPhotoSize.height
                    )
                } else null
            }

            else -> null
        }

        val shouldFwd = msgText.shouldFwd()
        val isPriority = msgText.isPriority()

        val sout = Formatter.formatNewMessageForPrint(message, shouldFwd, isPriority)
        println(sout)

        if (shouldFwd) {
            val postfix = " - " + Formatter.formatTimeForFwd(message.time)

            val correlationId = idGen.generate()
            sourceChat.addSeenMessage(correlationId, message)
            if (isPriority) {
                launch { chatList.priority.send(correlationId, postfix, msgText, photoDetails) }
            }
            launch { chatList.filtered.send(correlationId, postfix, msgText, photoDetails) }
        }
    }

    private suspend fun messageEdited(sourceChat: SourceChat, event: UpdateMessageContent) {
        val newContent = event.newContent.text() ?: return

        val msgId = event.messageId.asMsgId
        val correlationId = sourceChat.getCorrelationId(msgId) ?: return

        chatList.priority.update(correlationId, newContent)
        chatList.filtered.update(correlationId, newContent)
    }

    private suspend fun messagePinned(sourceChat: SourceChat, event: UpdateMessageIsPinned) {
        val msgId = event.messageId.asMsgId
        val correlationId = sourceChat.getCorrelationId(msgId) ?: return
        chatList.priority.pin(correlationId)
        chatList.filtered.pin(correlationId)
    }

    private suspend fun deleteMessage(sourceChat: SourceChat, event: UpdateDeleteMessages) {
        if (!event.isPermanent)
            return

        val deletedCorrelationIds = event.messageIds.map {
            val correlationId = sourceChat.getCorrelationId(it.asMsgId)
            if (correlationId != null) {
                val origMsgStr = sourceChat.getSeenMessage(correlationId)
                if (origMsgStr != null)
                    println(Formatter.formatDeletedForPrint(origMsgStr))
            }
            correlationId
        }.filterNotNull()

        chatList.priority.delete(deletedCorrelationIds)
        chatList.filtered.delete(deletedCorrelationIds)
    }
}
