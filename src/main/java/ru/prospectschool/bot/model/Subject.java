package ru.prospectschool.bot.model;

public class Subject {

    private String name;
    private int pricePerHour;
    private SubjectType subjectType;

    public Subject(String name, int pricePerHour, SubjectType subjectType) {
        this.name = name;
        this.pricePerHour = pricePerHour;
        this.subjectType = subjectType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPricePerHour() {
        return pricePerHour;
    }

    public void setPricePerHour(int pricePerHour) {
        this.pricePerHour = pricePerHour;
    }

    public SubjectType getSubjectType() {
        return subjectType;
    }

    public void setSubjectType(SubjectType subjectType) {
        this.subjectType = subjectType;
    }
}
