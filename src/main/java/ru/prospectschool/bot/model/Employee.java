package ru.prospectschool.bot.model;

public abstract class Employee {

    private String firstName;
    private String lastName;
    private int age;
    private String bio;

    public Employee(String firstName, String lastName, int age, String bio) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.bio = bio;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getBio() {
        return bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }
}
