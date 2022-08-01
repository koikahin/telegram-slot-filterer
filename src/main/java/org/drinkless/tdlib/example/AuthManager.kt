package org.drinkless.tdlib.example

import org.drinkless.tdlib.Client
import org.drinkless.tdlib.TdApi
import slotfilter.Consts.API_HASH
import slotfilter.Consts.API_ID
import slotfilter.newLine


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
                parameters.apiId = API_ID
                parameters.apiHash = API_HASH
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
            else -> System.err.println("Unsupported authorization state:$newLine$authorizationState")
        }
    }
}
