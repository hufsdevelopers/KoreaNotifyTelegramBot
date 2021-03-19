package org.hufsdevelopers.koreanotifybot

import com.google.gson.Gson
import io.reactivex.rxjava3.core.Observable
import io.reactivex.rxjava3.core.Single
import org.hufsdevelopers.koreanotifybot.api.SafeKoreaApiClient
import org.hufsdevelopers.koreanotifybot.telegram.NotifyBot
import org.telegram.telegrambots.ApiContextInitializer
import org.telegram.telegrambots.meta.TelegramBotsApi
import org.telegram.telegrambots.meta.exceptions.TelegramApiException
import io.reactivex.rxjava3.schedulers.Schedulers
import org.hufsdevelopers.koreanotifybot.responses.DiasterMessageRow
import org.hufsdevelopers.koreanotifybot.responses.SafeKoreaResponse
import java.util.concurrent.TimeUnit

class Main {
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            initialize()

            SafeKoreaApiClient().api.showList(50, 1).subscribeOn(Schedulers.io())
                    .delay(10, TimeUnit.SECONDS)
                    .repeat().subscribe({
                        println(Gson().toJson(it))
                    }, {
                        println(it.message)
                    })

            while (true);
        }

        private fun initialize() {
            ApiContextInitializer.init()
            val botsApi = TelegramBotsApi()

            try {
                botsApi.registerBot(NotifyBot())
            } catch (e: TelegramApiException) {
                e.printStackTrace()
            }
        }
    }
}