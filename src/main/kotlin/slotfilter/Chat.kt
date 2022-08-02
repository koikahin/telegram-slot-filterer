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

class TargetChat(chatDtls: Pair<Long, String>) : Chat(chatDtls) {
    private val prefixes = sizeLimitedMap<CorrelationId, String>(Consts.MAP_SIZE)

    suspend fun send(correlationId: CorrelationId, prefix: String, msgText: String) {
        val sentMessage = client.sendMessage(chatId, prefix + msgText)
        val msgId = sentMessage.id.asMsgId

        prefixes { this[correlationId] = prefix }

        setCorrelationId(msgId, correlationId)
    }

    suspend fun update(correlationId: CorrelationId, newContent: String) {
        val msgId = getMsgId(correlationId) ?: return
        val prefix = prefixes { this[correlationId] } ?: return
        client.updateMessage(chatId, msgId, prefix + newContent)
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
