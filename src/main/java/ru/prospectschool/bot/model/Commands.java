package ru.prospectschool.bot.model;

public enum Commands {
    INFO("/info"),
    CONTACTS("/contacts"),
    TEACHERS("/teachers"),
    PRICES("/prices");

    private final String command;

    Commands(String command) {
        this.command = command;
    }

    public static Commands valueOfCommand(String command) {
        for (Commands ce : values()) {
            if (ce.getCommand().equals(command)) {
                return ce;
            }
        }
        return null;
    }

    public String getCommand() {
        return command;
    }
}
