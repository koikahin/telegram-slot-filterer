package slotfilter

import org.drinkless.tdlib.TdApi.*
import org.drinkless.tdlib.example.client

open class Chat(val chatId: ChatId, val chatName: String) {
    constructor(chatDtls: Pair<Long, String>) : this(chatDtls.first.asChatId, chatDtls.second)

    private val msgIdCorrelations = sizeLimitedMap<MsgId, CorrelationId>(Consts.MAP_SIZE)

    fun msgIdChange(prev: MsgId, new: MsgId) = msgIdCorrelations.synchronized {
        val corId = this.remove(prev)
        if (corId != null) {
            this[new] = corId
            verbose(corId, chatName, prev, new)
        }
    }

    fun getCorrelationId(msgId: MsgId) = msgIdCorrelations.synchronized { this[msgId] }

    protected fun getMsgId(correlationId: CorrelationId): MsgId? = msgIdCorrelations.synchronized {
        // inefficiency is okay for this usecase. bi-maps that are size limited are going to be a pain to implement
        forEach { if (it.value == correlationId) return it.key }
        return null
    }

    protected fun getMsgIds(correlationIds: Set<CorrelationId>): List<MsgId> {
        return msgIdCorrelations.synchronized {
            filter { it.value in correlationIds }.map { it.key }
        }
    }

    protected fun setCorrelationId(msgId: MsgId, correlationId: CorrelationId) = msgIdCorrelations.synchronized {
        verbose(correlationId, chatName, msgId)
        this[msgId] = correlationId
    }
}

class SourceChat(chatDtls: Pair<Long, String>) : Chat(chatDtls) {
    private val seenMessages = sizeLimitedMap<CorrelationId, String>(Consts.MAP_SIZE)

    fun addSeenMessage(correlationId: CorrelationId, message: Message) {
        val text = message.content.text() ?: return
        setCorrelationId(message.id.asMsgId, correlationId)
        seenMessages.synchronized { this[correlationId] = text }
    }

    fun getSeenMessage(correlationId: CorrelationId) = seenMessages.synchronized { this[correlationId] }
}

data class PhotoDetails(val remote: InputFileRemote, val width: Int, val height: Int)
class TargetChat(chatDtls: Pair<Long, String>) : Chat(chatDtls) {
    private data class Metadata(val postfix: String, val isPhoto: Boolean)

    private val msgMetadata = sizeLimitedMap<CorrelationId, Metadata>(Consts.MAP_SIZE)

    suspend fun send(correlationId: CorrelationId, postfix: String, msgText: String, photoDetails: PhotoDetails?) {
        val message = msgText + postfix

        val isPhoto: Boolean
        val sentMessage = if (photoDetails != null) {
            isPhoto = true
            client.sendPhoto(chatId, message, photoDetails)
        } else {
            isPhoto = false
            client.sendMessage(chatId, message)
        }

        val msgId = sentMessage.id.asMsgId

        msgMetadata.synchronized { this[correlationId] = Metadata(postfix, isPhoto) }

        setCorrelationId(msgId, correlationId)
    }

    suspend fun update(correlationId: CorrelationId, newContent: String) {
        val msgId = getMsgId(correlationId) ?: return
        val md = msgMetadata.synchronized { this[correlationId] } ?: return
        val message = newContent + md.postfix
        if (md.isPhoto) {
            client.updatePhotoCaption(chatId, msgId, message)
        } else {
            client.updateMessage(chatId, msgId, message)
        }
    }

    suspend fun pin(correlationId: CorrelationId) {
        val msgId = getMsgId(correlationId) ?: return
        client.pinMessage(chatId, msgId)
    }

    suspend fun unpin(correlationId: CorrelationId) {
        val msgId = getMsgId(correlationId) ?: return
        client.unpinMessage(chatId, msgId)
    }

    suspend fun delete(deletedCorrelationIds: List<CorrelationId>) {
        val msgIds = getMsgIds(deletedCorrelationIds.toSet())
        if (msgIds.isEmpty())
            return

        verbose {
            "deleting from chat $chatName" +
                    " correlation ids: ${deletedCorrelationIds.joinToString(", ")}" +
                    " messageIds: ${msgIds.joinToString(", ")}"
        }
        client.deleteMessages(chatId, msgIds)
    }
}
