package com.teachMeSkills.an15.PilyushinYuri.hw5.Workers;

public abstract class Workers {
    String firstName;
    String secondName;

    public Workers(String firstName, String secondName) {
        this.firstName = firstName;
        this.secondName = secondName;

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
    abstract double getAveragePayment();

    @Override
    public String toString() {
        return "Workers{" +
                "firstName='" + firstName + '\'' +
                ", secondName='" + secondName + '\'' +
                '}';
    }
}

