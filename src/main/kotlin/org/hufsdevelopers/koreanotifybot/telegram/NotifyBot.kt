package org.hufsdevelopers.koreanotifybot.telegram

import org.hufsdevelopers.koreanotifybot.credential.BotCredential
import org.telegram.telegrambots.bots.TelegramLongPollingBot
import org.telegram.telegrambots.meta.api.objects.Update

class NotifyBot : TelegramLongPollingBot() {
    override fun onUpdateReceived(update: Update) {
        update.message?.let { message ->
            println(message)
        }
    }

    override fun getBotUsername(): String {
        return BotCredential.getUsername()
    }

    override fun getBotToken(): String {
        return BotCredential.getToken()
    }
}