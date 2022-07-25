package org.drinkless.tdlib.example

import java.io.BufferedReader
import java.io.IOException
import java.io.InputStreamReader

object Console {
    @Volatile
    private var currentPrompt: String? = null

    fun out(str: String?) {
        if (currentPrompt != null) {
            println("")
        }
        println(str)
        if (currentPrompt != null) {
            print(currentPrompt)
        }
    }

    fun ask(prompt: String): String {
        out(prompt)
        currentPrompt = prompt
        val reader = BufferedReader(InputStreamReader(System.`in`))
        var str = ""
        try {
            str = reader.readLine()
        } catch (e: IOException) {
            e.printStackTrace()
        }
        currentPrompt = null
        return str
    }
}
