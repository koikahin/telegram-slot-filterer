package slotfilter

import org.drinkless.tdlib.Client
import org.drinkless.tdlib.TdApi
import org.drinkless.tdlib.TdApi.*
import kotlin.coroutines.resume
import kotlin.coroutines.resumeWithException
import kotlin.coroutines.suspendCoroutine

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

suspend fun Client.sendMessage(chatId: ChatId, message: String): Message {
    return sendSuspend(
        SendMessage(
            chatId.asLong,
            0,
            0,
            null,
            null,
            InputMessageText(FormattedText(message, null), false, true)
        )
    )
}

suspend fun Client.updateMessage(chatId: ChatId, msgId: MsgId, newMessage: String): Message {
    return sendSuspend(
        EditMessageText(
            chatId.asLong, msgId.asLong, null,
            InputMessageText(FormattedText(newMessage, null), false, true)
        )
    )
}

suspend fun Client.deleteMessages(chatId: ChatId, msgIds: List<MsgId>) {
    sendSuspend<Ok>(DeleteMessages(chatId.asLong, msgIds.map { it.asLong }.toLongArray(), true))
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
