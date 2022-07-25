package org.drinkless.tdlib.example

import org.drinkless.tdlib.Client
import java.util.concurrent.atomic.AtomicLong

class LogMessageHandler : Client.LogMessageHandler {
    override fun onLogMessage(verbosityLevel: Int, message: String) {
        if (verbosityLevel == 0) {
            onFatalError(message)
            return
        }
        System.err.println(message)
    }
}

private fun onFatalError(errorMessage: String) {
    class ThrowError(private val errorMessage: String, private val errorThrowTime: AtomicLong) : Runnable {
        override fun run() {
            if (isDatabaseBrokenError(errorMessage) || isDiskFullError(errorMessage) || isDiskError(errorMessage)) {
                processExternalError()
                return
            }
            errorThrowTime.set(System.currentTimeMillis())
            throw ClientError("TDLib fatal error: $errorMessage")
        }

        private fun processExternalError() {
            errorThrowTime.set(System.currentTimeMillis())
            throw ExternalClientError("Fatal error: $errorMessage")
        }

        inner class ClientError(message: String) : Throwable(message)
        inner class ExternalClientError(message: String?) : Throwable(message)

        private fun isDatabaseBrokenError(message: String): Boolean {
            return message.contains("Wrong key or database is corrupted") || message.contains("SQL logic error or missing database") || message.contains(
                "database disk image is malformed"
            ) || message.contains("file is encrypted or is not a database") || message.contains("unsupported file format") || message.contains(
                "Database was corrupted and deleted during execution and can't be recreated"
            )
        }

        private fun isDiskFullError(message: String): Boolean {
            return message.contains("PosixError : No space left on device") || message.contains("database or disk is full")
        }

        private fun isDiskError(message: String): Boolean {
            return message.contains("I/O error") || message.contains("Structure needs cleaning")
        }
    }

    val errorThrowTime = AtomicLong(Long.MAX_VALUE)
    Thread(ThrowError(errorMessage, errorThrowTime), "TDLib fatal error thread").start()

    // wait at least 10 seconds after the error is thrown
    while (errorThrowTime.get() >= System.currentTimeMillis() - 10000) {
        try {
            Thread.sleep(1000 /* milliseconds */)
        } catch (ignore: InterruptedException) {
            Thread.currentThread().interrupt()
        }
    }
}
