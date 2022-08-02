package slotfilter

@JvmInline value class MsgId(val asLong: Long)
val Long.asMsgId get() = MsgId(this)

@JvmInline value class ChatId(val asLong: Long)
val Long.asChatId get() = ChatId(this)

@JvmInline value class CorrelationId(val asLong: Long)
