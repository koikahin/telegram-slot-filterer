package org.drinkless.tdlib.example

import org.drinkless.tdlib.Client
import org.drinkless.tdlib.TdApi


//parameters.apiId = 94575
//parameters.apiHash = "a3406de8d171bb422bb6ddf3bbd800e2"

const val apiId = 9366375
const val apiHash = "f5210f6295fd7dcb64fc16379213a22a"

object AuthManager {
    private var authorizationState: TdApi.AuthorizationState? = null
    fun onAuthorizationStateUpdated(newState: TdApi.AuthorizationState?) {
        if (newState != null) {
            authorizationState = newState
        }
        when (authorizationState!!.constructor) {
            TdApi.AuthorizationStateWaitTdlibParameters.CONSTRUCTOR -> {
                val parameters = TdApi.TdlibParameters()
                parameters.databaseDirectory = "tdlib"
                parameters.useMessageDatabase = true
                parameters.useSecretChats = true
                parameters.apiId = apiId
                parameters.apiHash = apiHash
                parameters.systemLanguageCode = "en"
                parameters.deviceModel = "Desktop"
                parameters.applicationVersion = "1.0"
                parameters.enableStorageOptimizer = true
                Main.client.send(TdApi.SetTdlibParameters(parameters), AuthorizationRequestHandler(this))
            }
            TdApi.AuthorizationStateWaitEncryptionKey.CONSTRUCTOR -> Main.client.send(
                TdApi.CheckDatabaseEncryptionKey(),
                AuthorizationRequestHandler(this)
            )
            TdApi.AuthorizationStateWaitPhoneNumber.CONSTRUCTOR -> {
                val phoneNumber = Console.ask("Please enter phone number: ")
                Main.client.send(
                    TdApi.SetAuthenticationPhoneNumber(phoneNumber, null),
                    AuthorizationRequestHandler(this)
                )
            }
            TdApi.AuthorizationStateWaitOtherDeviceConfirmation.CONSTRUCTOR -> {
                val link = (authorizationState as TdApi.AuthorizationStateWaitOtherDeviceConfirmation?)!!.link
                println("Please confirm this login link on another device: $link")
            }
            TdApi.AuthorizationStateWaitCode.CONSTRUCTOR -> {
                val code = Console.ask("Please enter authentication code: ")
                Main.client!!.send(TdApi.CheckAuthenticationCode(code), AuthorizationRequestHandler(this))
            }
            TdApi.AuthorizationStateWaitRegistration.CONSTRUCTOR -> {
                val firstName = Console.ask("Please enter your first name: ")
                val lastName = Console.ask("Please enter your last name: ")
                Main.client!!.send(TdApi.RegisterUser(firstName, lastName), AuthorizationRequestHandler(this))
            }
            TdApi.AuthorizationStateWaitPassword.CONSTRUCTOR -> {
                val password = Console.ask("Please enter password: ")
                Main.client!!.send(TdApi.CheckAuthenticationPassword(password), AuthorizationRequestHandler(this))
            }
            TdApi.AuthorizationStateReady.CONSTRUCTOR -> {
                Main.haveAuthorization = true
                Main.authorizationLock.lock()
                try {
                    Main.gotAuthorization.signal()
                } finally {
                    Main.authorizationLock.unlock()
                }
            }
            TdApi.AuthorizationStateLoggingOut.CONSTRUCTOR -> {
                Main.haveAuthorization = false
                print("Logging out")
            }
            TdApi.AuthorizationStateClosing.CONSTRUCTOR -> {
                Main.haveAuthorization = false
                print("Closing")
            }
            TdApi.AuthorizationStateClosed.CONSTRUCTOR -> {
                print("Closed")
                if (!Main.needQuit) {
                    Main.client =
                        Client.create(UpdateHandler, null, null) // recreate client after previous has closed
                } else {
                    Main.canQuit = true
                }
            }
            else -> System.err.println("Unsupported authorization state:$lineSeparator$authorizationState")
        }
    }
}
