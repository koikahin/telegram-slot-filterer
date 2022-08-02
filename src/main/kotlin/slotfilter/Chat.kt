package slotfilter

import org.drinkless.tdlib.TdApi.*
import org.drinkless.tdlib.example.client

open class Chat(val chatId: ChatId, val chatName: String) {
    constructor(chatDtls: Pair<Long, String>) : this(chatDtls.first.asChatId, chatDtls.second)

    private val msgIdCorrelations = sizeLimitedMap<MsgId, CorrelationId>(Consts.MAP_SIZE)

    fun msgIdChange(prev: MsgId, new: MsgId) = msgIdCorrelations {
        val corId = this.remove(prev)
        if (corId != null) {
            this[new] = corId
            verbose(corId, chatName, prev, new)
        }
    }

    fun getCorrelationId(msgId: MsgId) = msgIdCorrelations { this[msgId] }

    protected fun getMsgId(correlationId: CorrelationId): MsgId? = msgIdCorrelations<MsgId?> {
        // inefficiency is okay for this usecase. bi-maps that are size limited are going to be a pain to implement
        forEach { if (it.value == correlationId) return it.key }
        return null
    }

    protected fun getMsgIds(correlationIds: Set<CorrelationId>): List<MsgId> {
        return msgIdCorrelations {
            filter { it.value in correlationIds }.map { it.key }
        }
    }

    protected fun setCorrelationId(msgId: MsgId, correlationId: CorrelationId) = msgIdCorrelations {
        verbose(correlationId, chatName, msgId)
        this[msgId] = correlationId
    }
}

class SourceChat(chatDtls: Pair<Long, String>) : Chat(chatDtls) {
    private val seenMessages = sizeLimitedMap<CorrelationId, String>(Consts.MAP_SIZE)

    fun addSeenMessage(correlationId: CorrelationId, message: Message) {
        setCorrelationId(message.id.asMsgId, correlationId)
        seenMessages { this[correlationId] = message.content.text() }
    }

    fun getSeenMessage(correlationId: CorrelationId) = seenMessages { this[correlationId] }
}

data class PhotoDetails(val remote: InputFileRemote, val width: Int, val height: Int)
class TargetChat(chatDtls: Pair<Long, String>) : Chat(chatDtls) {
    private data class Metadata(val prefix: String, val isPhoto: Boolean)

    private val msgMetadata = sizeLimitedMap<CorrelationId, Metadata>(Consts.MAP_SIZE)

    suspend fun send(correlationId: CorrelationId, prefix: String, msgText: String, photoDetails: PhotoDetails?) {
        val message = prefix + msgText

        val isPhoto: Boolean
        val sentMessage = if (photoDetails != null) {
            isPhoto = true
            client.sendPhoto(chatId, message, photoDetails)
        } else {
            isPhoto = false
            client.sendMessage(chatId, message)
        }

        val msgId = sentMessage.id.asMsgId

        msgMetadata { this[correlationId] = Metadata(prefix, isPhoto) }

        setCorrelationId(msgId, correlationId)
    }

    suspend fun update(correlationId: CorrelationId, newContent: String) {
        val msgId = getMsgId(correlationId) ?: return
        val md = msgMetadata { this[correlationId] } ?: return
        val message = md.prefix + newContent
        if (md.isPhoto) {
            client.updatePhotoCaption(chatId, msgId, message)
        } else {
            client.updateMessage(chatId, msgId, message)
        }
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
