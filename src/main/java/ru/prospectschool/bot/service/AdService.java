package ru.prospectschool.bot.service;

import org.jvnet.hk2.annotations.Service;

@Service
public class AdService {

    private final String text;

    public AdService(String text) {
        this.text = "Идет набор в очные и онлайн группы!\n" +
                "Спешите приобрести абонемент со СКИДКОЙ 30%!\n" +
                "Всего 6400 руб за месяц обучения с носителем языка!\n" +
                "Присоединяйтесь к нам в соцсетях и получайте скидку на обучение";
    }

    public String getText() {
        return text;
    }
}
