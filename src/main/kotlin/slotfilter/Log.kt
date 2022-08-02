package slotfilter

private const val verbose = false

private fun verbose(str: String) {
    if (verbose)
        println(str)
}

fun verbose(correlationId: CorrelationId, chatName: String, msgId: MsgId) {
    verbose("correlation ${correlationId.asLong}: $chatName - ${msgId.asLong}")
}

fun verbose(correlationId: CorrelationId, chatName: String, oldMsgId: MsgId, newMsgId: MsgId) {
    verbose("correlation ${correlationId.asLong}: $chatName - ${oldMsgId.asLong} -> ${newMsgId.asLong}")
}

fun verbose(fn: () -> String) {
    if (verbose)
        verbose(fn())
}
