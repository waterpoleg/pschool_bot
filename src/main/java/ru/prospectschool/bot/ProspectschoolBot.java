package ru.prospectschool.bot;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Message;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;
import ru.prospectschool.bot.controller.IncomeMessageController;

@Component
public class ProspectschoolBot extends TelegramLongPollingBot {

    @Value("${bot.name}")
    private String botUsername;

    @Value("${bot.token}")
    private String botToken;

    private final IncomeMessageController incomeMessageController;

    public ProspectschoolBot(IncomeMessageController incomeMessageController) {
        this.incomeMessageController = incomeMessageController;
    }

    @Override
    public void onUpdateReceived(Update update) {
        if (update.hasMessage()) {
            Message message = update.getMessage();
            if (message.hasText()) {
                SendMessage response = incomeMessageController.getResponse(message);
                try {
                    execute(response);
                    //logger.info("Sent message \"{}\" to {}", text, chatId);
                } catch (TelegramApiException e) {
                    //logger.error("Failed to send message \"{}\" to {} due to error: {}", text, chatId, e.getMessage());
                    e.printStackTrace();
                }
            }
        }
    }

    @Override
    public String getBotUsername() {
        return botUsername;
    }

    @Override
    public String getBotToken() {
        return botToken;
    }
}
