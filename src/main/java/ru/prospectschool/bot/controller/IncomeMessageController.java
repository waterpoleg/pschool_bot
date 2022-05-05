package ru.prospectschool.bot.controller;

import org.springframework.stereotype.Controller;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Message;
import ru.prospectschool.bot.model.Commands;
import ru.prospectschool.bot.model.CommandsEnum;

@Controller
public class IncomeMessageController {

    public SendMessage getResponse(Message message) {
        /*SendMessage response = SendMessage.builder()
                .chatId(message.getChatId().toString())
                .text(" --->> " + message.getText())
                .build();*/

        String responseMessage = "unknown command";
        String command = message.getText();
        switch (command) {
            case (Commands.INFO):
                responseMessage = "Идет набор в очные и онлайн группы!\n" +
                        "Спешите приобрести абонемент со СКИДКОЙ 30%!\n" +
                        "Всего 6400 руб за месяц  обучения с носителем языка!";
            case (Commands.CONTACTS):
            case (Commands.TEACHERS):
            case (Commands.PRICES):
            default: {
                break;
            }
        }
        /*switch (command) {
            case (Commands.INFO.getCommand()):
            case (Commands.CONTACTS):
            case (Commands.TEACHERS):
            case (Commands.PRICES):
            default: {
                break;
            }
        }*/
        SendMessage response = SendMessage.builder()
                .chatId(message.getChatId().toString())
                .text(responseMessage)
                .build();
        return response;
    }
}
