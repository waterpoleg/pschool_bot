package ru.prospectschool.bot.model;

import java.util.List;

public class Teacher extends Employee {

    private List<Subject> subjects;

    public Teacher(String firstName, String lastName, int age, String bio, List<Subject> subjects) {
        super(firstName, lastName, age, bio);
        this.subjects = subjects;
    }

    public List<Subject> getSubjects() {
        return subjects;
    }

    public void setSubjects(List<Subject> subjects) {
        this.subjects = subjects;
    }
}
