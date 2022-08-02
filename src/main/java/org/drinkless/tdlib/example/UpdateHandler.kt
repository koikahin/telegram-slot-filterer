package org.drinkless.tdlib.example

import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import org.drinkless.tdlib.Client
import org.drinkless.tdlib.TdApi.*
import slotfilter.Forwarder
import java.util.concurrent.ConcurrentHashMap
import java.util.concurrent.ConcurrentMap

@Suppress("USELESS_CAST")
object UpdateHandler : Client.ResultHandler {
    val users: ConcurrentMap<Long, User> = ConcurrentHashMap()
    val basicGroups: ConcurrentMap<Long, BasicGroup> = ConcurrentHashMap()
    val supergroups: ConcurrentMap<Long, Supergroup> = ConcurrentHashMap()
    val secretChats: ConcurrentMap<Int, SecretChat> = ConcurrentHashMap()
    val supergroupsFullInfo: ConcurrentMap<Long, SupergroupFullInfo> = ConcurrentHashMap()
    val basicGroupsFullInfo: ConcurrentMap<Long, BasicGroupFullInfo> = ConcurrentHashMap()
    val usersFullInfo: ConcurrentMap<Long, UserFullInfo> = ConcurrentHashMap()
    override fun onResult(obj: Object) {
        GlobalScope.launch {
            Forwarder.processEvent(obj)
        }
        when (obj) {
            is UpdateAuthorizationState ->
                AuthManager.onAuthorizationStateUpdated((obj as UpdateAuthorizationState).authorizationState)
            is UpdateUser -> {
                val updateUser = obj as UpdateUser
                users[updateUser.user.id] = updateUser.user
            }
            is UpdateUserStatus -> {
                val updateUserStatus = obj as UpdateUserStatus
                val user = users[updateUserStatus.userId]
                synchronized(user!!) { user.status = updateUserStatus.status }
            }
            is UpdateBasicGroup -> {
                val updateBasicGroup = obj as UpdateBasicGroup
                basicGroups[updateBasicGroup.basicGroup.id] = updateBasicGroup.basicGroup
            }
            is UpdateSupergroup -> {
                val updateSupergroup = obj as UpdateSupergroup
                supergroups[updateSupergroup.supergroup.id] = updateSupergroup.supergroup
            }
            is UpdateSecretChat -> {
                val updateSecretChat = obj as UpdateSecretChat
                secretChats[updateSecretChat.secretChat.id] = updateSecretChat.secretChat
            }
            is UpdateNewChat -> {
                val updateNewChat = obj as UpdateNewChat
                val chat = updateNewChat.chat
                synchronized(chat) {
                    Main.chats[chat.id] = chat
                    val positions = chat.positions
                    chat.positions = arrayOfNulls(0)
                    Main.setChatPositions(chat, positions)
                }
            }
            is UpdateChatTitle -> {
                val updateChat = obj as UpdateChatTitle
                val chat = Main.chats[updateChat.chatId]
                synchronized(chat!!) { chat.title = updateChat.title }
            }
            is UpdateChatPhoto -> {
                val updateChat = obj as UpdateChatPhoto
                val chat = Main.chats[updateChat.chatId]
                synchronized(chat!!) { chat.photo = updateChat.photo }
            }
            is UpdateChatLastMessage -> {
                val updateChat = obj as UpdateChatLastMessage
                val chat = Main.chats[updateChat.chatId]
                synchronized(chat!!) {
                    chat.lastMessage = updateChat.lastMessage
                    Main.setChatPositions(chat, updateChat.positions)
                }
            }
            is UpdateChatPosition -> {
                val updateChat = obj as UpdateChatPosition
                if (updateChat.position.list.constructor == ChatListMain.CONSTRUCTOR) {
                    val chat = Main.chats[updateChat.chatId]
                    synchronized(chat!!) {
                        var i: Int
                        i = 0
                        while (i < chat.positions.size) {
                            if (chat.positions[i].list.constructor == ChatListMain.CONSTRUCTOR) {
                                break
                            }
                            i++
                        }
                        val new_positions =
                            arrayOfNulls<ChatPosition>(chat.positions.size + (if (updateChat.position.order == 0L) 0 else 1) - (if (i < chat.positions.size) 1 else 0))
                        var pos = 0
                        if (updateChat.position.order != 0L) {
                            new_positions[pos++] = updateChat.position
                        }
                        var j = 0
                        while (j < chat.positions.size) {
                            if (j != i) {
                                new_positions[pos++] = chat.positions[j]
                            }
                            j++
                        }
                        assert(pos == new_positions.size)
                        Main.setChatPositions(chat, new_positions)
                    }
                }
            }
            is UpdateChatReadInbox -> {
                val updateChat = obj as UpdateChatReadInbox
                val chat = Main.chats[updateChat.chatId]
                synchronized(chat!!) {
                    chat.lastReadInboxMessageId = updateChat.lastReadInboxMessageId
                    chat.unreadCount = updateChat.unreadCount
                }
            }
            is UpdateChatReadOutbox -> {
                val updateChat = obj as UpdateChatReadOutbox
                val chat = Main.chats[updateChat.chatId]
                synchronized(chat!!) { chat.lastReadOutboxMessageId = updateChat.lastReadOutboxMessageId }
            }
            is UpdateChatUnreadMentionCount -> {
                val updateChat = obj as UpdateChatUnreadMentionCount
                val chat = Main.chats[updateChat.chatId]
                synchronized(chat!!) { chat.unreadMentionCount = updateChat.unreadMentionCount }
            }
            is UpdateMessageMentionRead -> {
                val updateChat = obj as UpdateMessageMentionRead
                val chat = Main.chats[updateChat.chatId]
                synchronized(chat!!) { chat.unreadMentionCount = updateChat.unreadMentionCount }
            }
            is UpdateChatReplyMarkup -> {
                val updateChat = obj as UpdateChatReplyMarkup
                val chat = Main.chats[updateChat.chatId]
                synchronized(chat!!) { chat.replyMarkupMessageId = updateChat.replyMarkupMessageId }
            }
            is UpdateChatDraftMessage -> {
                val updateChat = obj as UpdateChatDraftMessage
                val chat = Main.chats[updateChat.chatId]
                synchronized(chat!!) {
                    chat.draftMessage = updateChat.draftMessage
                    Main.setChatPositions(chat, updateChat.positions)
                }
            }
            is UpdateChatPermissions -> {
                val update = obj as UpdateChatPermissions
                val chat = Main.chats[update.chatId]
                synchronized(chat!!) { chat.permissions = update.permissions }
            }
            is UpdateChatNotificationSettings -> {
                val update = obj as UpdateChatNotificationSettings
                val chat = Main.chats[update.chatId]
                synchronized(chat!!) { chat.notificationSettings = update.notificationSettings }
            }
            is UpdateChatDefaultDisableNotification -> {
                val update = obj as UpdateChatDefaultDisableNotification
                val chat = Main.chats[update.chatId]
                synchronized(chat!!) { chat.defaultDisableNotification = update.defaultDisableNotification }
            }
            is UpdateChatIsMarkedAsUnread -> {
                val update = obj as UpdateChatIsMarkedAsUnread
                val chat = Main.chats[update.chatId]
                synchronized(chat!!) { chat.isMarkedAsUnread = update.isMarkedAsUnread }
            }
            is UpdateChatIsBlocked -> {
                val update = obj as UpdateChatIsBlocked
                val chat = Main.chats[update.chatId]
                synchronized(chat!!) { chat.isBlocked = update.isBlocked }
            }
            is UpdateChatHasScheduledMessages -> {
                val update = obj
                val chat = Main.chats[update.chatId]
                synchronized(chat!!) { chat.hasScheduledMessages = update.hasScheduledMessages }
            }
            is UpdateUserFullInfo -> {
                val updateUserFullInfo = obj as UpdateUserFullInfo
                usersFullInfo[updateUserFullInfo.userId] = updateUserFullInfo.userFullInfo
            }
            is UpdateBasicGroupFullInfo -> {
                val updateBasicGroupFullInfo = obj as UpdateBasicGroupFullInfo
                basicGroupsFullInfo[updateBasicGroupFullInfo.basicGroupId] =
                    updateBasicGroupFullInfo.basicGroupFullInfo
            }
            is UpdateSupergroupFullInfo -> {
                val updateSupergroupFullInfo = obj as UpdateSupergroupFullInfo
                supergroupsFullInfo[updateSupergroupFullInfo.supergroupId] =
                    updateSupergroupFullInfo.supergroupFullInfo
            }
        }
    }
}

