package ru.prospectschool.bot.model;

public abstract class Empoyee {

    private int id;
    private String name;
    private String position;
    private String bio;
    private byte[] photo;

    public Empoyee(int id, String name, String position, String bio, byte[] photo) {
        this.id = id;
        this.name = name;
        this.position = position;
        this.bio = bio;
        this.photo = photo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getBio() {
        return bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }

    public byte[] getPhoto() {
        return photo;
    }

    public void setPhoto(byte[] photo) {
        this.photo = photo;
    }
}
