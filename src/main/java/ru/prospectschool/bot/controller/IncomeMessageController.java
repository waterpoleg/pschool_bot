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
                break;
            case (Commands.CONTACTS):
                responseMessage = "тел: +7 985 143 02 42\n" +
                        "email: prospectschool@niime.ru\n" +
                        "адрес: 124460, Москва, Зеленоград, ул. Академика Валиева, д.6, стр.6";
                break;
            case (Commands.TEACHERS):
                break;
            case (Commands.PRICES):
                responseMessage = "Групповые занятия (1,5 часа):\n" +
                        "8 занятий - 8000 руб\n" +
                        "Мини-группы (1,5 часа):\n" +
                        "8 занятий - 9200 руб.\n" +
                        "Индивидуальные занятия (45 минут / 1 час)\n" +
                        "Преподаватель носитель языка - 1600 руб./1800 руб.\n" +
                        "Старший преподаватель носитель языка - 2000 руб./2200 руб.";
                break;
            default:
                break;
        }
        /*switch (command) {
            case (CommandsEnum.INFO.getCommand()):
            case (CommandsEnum.CONTACTS):
            case (CommandsEnum.TEACHERS):
            case (CommandsEnum.PRICES):
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
