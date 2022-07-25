package org.drinkless.tdlib.example

import org.drinkless.tdlib.TdApi

data class OrderedChat (val chatId: Long, val position: TdApi.ChatPosition) :
    Comparable<OrderedChat> {
    override fun compareTo(o: OrderedChat): Int {
        if (position.order != o.position.order) {
            return if (o.position.order < position.order) -1 else 1
        }
        return if (chatId != o.chatId) {
            if (o.chatId < chatId) -1 else 1
        } else 0
    }
}
