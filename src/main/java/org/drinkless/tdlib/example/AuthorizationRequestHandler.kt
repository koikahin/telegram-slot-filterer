package org.drinkless.tdlib.example

import org.drinkless.tdlib.Client
import org.drinkless.tdlib.TdApi

class AuthorizationRequestHandler(private val authManager: AuthManager) : Client.ResultHandler {
    override fun onResult(obj: TdApi.Object) {
        when (obj.constructor) {
            TdApi.Error.CONSTRUCTOR -> {
                System.err.println("Receive an error:$lineSeparator$obj")
                authManager.onAuthorizationStateUpdated(null) // repeat last action
            }
            TdApi.Ok.CONSTRUCTOR -> {}
            else -> System.err.println("Receive wrong response from TDLib:$lineSeparator$obj")
        }
    }
}
