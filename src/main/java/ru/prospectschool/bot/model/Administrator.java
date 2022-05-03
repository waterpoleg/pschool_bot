package ru.prospectschool.bot.model;

public class Administrator extends Employee {

    private final Contacts contacts;

    public Administrator(int id,
                         String firstName,
                         String lastName,
                         int age,
                         String bio,
                         Contacts contacts) {
        super(id, firstName, lastName, age, bio);
        this.contacts = contacts;
    }
}
