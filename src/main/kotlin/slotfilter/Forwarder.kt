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
                val sourceChat = chatList.getSourceChat(event.message)
                if (sourceChat != null)
                    messagePosted(sourceChat, event.message)
            }

            is UpdateMessageContent -> {
                val sourceChat = chatList.getSourceChat(event.chatId)
                if (sourceChat != null)
                    messageEdited(sourceChat, event)
            }

            is UpdateDeleteMessages -> {
                val sourceChat = chatList.getSourceChat(event.chatId)
                if (sourceChat != null)
                    deleteMessage(sourceChat, event)
            }

            is UpdateMessageSendSucceeded -> {
                chatList.getChat(event.message.chatId)
                    ?.msgIdChange(event.oldMessageId.asMsgId, event.message.id.asMsgId)
            }
        }
    }

    private suspend fun messagePosted(sourceChat: SourceChat, message: Message) = coroutineScope {
        val content = message.content
        val msgText = content.text()
        val photoDetails = when(content) {
            is MessagePhoto -> {
                val largestPhotoSize = content.photo?.sizes
                    ?.maxByOrNull { it.photo?.remote?.uploadedSize ?: 0}
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
            val prefix = Formatter.formatTimeForFwd(message.time) + "\n"

            val correlationId = idGen.generate()
            sourceChat.addSeenMessage(correlationId, message)
            if (isPriority) {
                launch { chatList.priority.send(correlationId, prefix, msgText, photoDetails) }
            }
            launch { chatList.filtered.send(correlationId, prefix, msgText, photoDetails) }
        }
    }

    private suspend fun messageEdited(sourceChat: SourceChat, event: UpdateMessageContent) {
        val msgId = event.messageId.asMsgId
        val correlationId = sourceChat.getCorrelationId(msgId) ?: return

        val newContent = event.newContent.text()

        chatList.priority.update(correlationId, newContent)
        chatList.filtered.update(correlationId, newContent)
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
