package org.drinkless.tdlib.example

import org.drinkless.tdlib.Client
import org.drinkless.tdlib.TdApi

object SysoutHandler : Client.ResultHandler {
    override fun onResult(obj: TdApi.Object) {
        printObj(obj)
    }
}

fun printObj(obj: TdApi.Object) {
    println(obj.toString())
}
