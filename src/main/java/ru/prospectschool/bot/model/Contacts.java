package ru.prospectschool.bot.model;

public class Contacts {

    private String address;
    private String email;
    private String phone;

    public Contacts(String address, String email, String phone) {
        this.address = address;
        this.email = email;
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
