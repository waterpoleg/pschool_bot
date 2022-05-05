package ru.prospectschool.bot.model;

public enum CommandsEnum {
    INFO("/info"),
    CONTACTS("/contacts"),
    TEACHERS("/teachers"),
    PRICES("/prices");

    private final String command;

    CommandsEnum(String command) {
        this.command = command;
    }

    public String getCommand() {
        return command;
    }
}
