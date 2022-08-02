package slotfilter

import org.drinkless.tdlib.TdApi
import slotfilter.Consts.CHAT_ALL_SLOTS
import slotfilter.Consts.CHAT_FILTERED_SLOTS
import slotfilter.Consts.CHAT_MOCKED_ALL_SLOTS
import slotfilter.Consts.CHAT_SRI

class ChatList {
    val filtered = TargetChat(CHAT_FILTERED_SLOTS)
    val priority = TargetChat(CHAT_SRI)

    private val sourceChats = listOf(
        SourceChat(CHAT_MOCKED_ALL_SLOTS),
        SourceChat(CHAT_ALL_SLOTS),
    ).associateBy { it.chatId }


    // =========================================== //
    private val targetChats = listOf(filtered, priority).associateBy { it.chatId }
    private val allChats = sourceChats + targetChats

    init {
        assert(sourceChats.keys.intersect(targetChats.keys).isEmpty())
        println("Listening to: ${sourceChats.keys.map { it.asLong }.joinToString(", ")}")
    }

    private fun <ChatT : Chat> getChat(chatId: ChatId, chats: Map<ChatId, ChatT>): ChatT? = chats[chatId]

    private fun getSourceChat(chatId: ChatId) = getChat(chatId, sourceChats)
    fun getSourceChat(chatId: Long) = getSourceChat(chatId.asChatId)
    fun getSourceChat(message: TdApi.Message) = getSourceChat(message.chatId)
    fun getChat(chatId: Long) = getChat(chatId.asChatId, allChats)
}
