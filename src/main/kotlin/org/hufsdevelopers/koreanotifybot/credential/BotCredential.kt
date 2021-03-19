package org.hufsdevelopers.koreanotifybot.credential

import com.google.gson.Gson
import com.google.gson.JsonObject
import com.google.gson.JsonParser
import java.io.InputStream

object BotCredential {
    var jsonObject: JsonObject? = null

    init {
        val inputStream: InputStream = javaClass.classLoader.getResourceAsStream("keys-telegrambot.json")
        jsonObject = JsonParser.parseString(inputStream.readBytes().toString(Charsets.UTF_8)).asJsonObject
    }

    fun getUsername(): String {
        jsonObject?.get("bot_username")?.asString?.let {
            return it
        }
        return ""
    }

    fun getToken(): String {
        jsonObject?.get("bot_token")?.asString?.let {
            return it
        }
        return ""
    }
}