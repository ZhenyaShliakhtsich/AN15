package com.teachMeSkills.an15.MatveevArtyom.hw7.task1;

public class RegistrationAndAuthorisation {
    private String firstName;
    private String secondName;
    private String eMail;
    private String login;
    private String password;

    public RegistrationAndAuthorisation(String firstName, String secondName, String eMail, String login, String password) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.eMail = eMail;
        this.login = login;
        this.password = password;
    }

    public RegistrationAndAuthorisation(){

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

    public String getEMail() {
        return eMail;
    }

    public void setEMail(String eMail) {
        this.eMail = eMail;
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
                ", eMail='" + eMail + '\'' +
                ", login='" + login + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
