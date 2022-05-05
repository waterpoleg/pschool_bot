package ru.prospectschool.bot.model;

public class Ad {

    private String text;

    public Ad(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
