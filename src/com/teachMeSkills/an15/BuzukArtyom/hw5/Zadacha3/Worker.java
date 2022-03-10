package com.teachMeSkills.an15.BuzukArtyom.hw5.Zadacha3;

public abstract class Worker {
    String firstName;
    String secondName;
    int id;

    public Worker(String firstName, String secondName, int id) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.id = id;
    }

    String getFirstName() {
        return firstName;
    }

    String getSecondName() {
        return secondName;
    }

    abstract double getAveragePayment();

    @Override
    public String toString() {
        return "№" + id + " " + firstName + " " + secondName;
    }
}

// геттер  для фамилии не используется