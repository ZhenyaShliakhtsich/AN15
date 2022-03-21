package com.teachMeSkills.an15.BuzukArtyom.hw7.zadacha1.service.blog;

public class Registration {
    private String firstName;
    private String secondName;
    private String email;
    private String login;
    private String password;

    public Registration(String firstName, String secondName, String email, String login, String password) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.email = email;
        this.login = login;
        this.password = password;
    }

    public Registration() {
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String eMail) {
        this.email = eMail;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


    @Override
    public String toString() {
        return "Registration{" +
                "firstName='" + firstName + '\'' +
                ", secondName='" + secondName + '\'' +
                ", email='" + email + '\'' +
                ", login='" + login + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
