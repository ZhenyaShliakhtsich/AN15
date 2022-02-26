package com.teachMeSkills.an15.BuzukArtyom.hw3.zadacha8;

import java.util.Arrays;

public class Phone {
    int number;
    String model;
    double weight;
//    String name;


    Phone(int number, String model, double weight) {
//        this.number = number;
//        this.model = model;
        this(number, model);
        this.weight = weight;
    }

    public Phone(int number, String model) {
        this.number = number;
        this.model = model;
    }

    public Phone() {

    }

    public void setNumber(int number) {
        this.number = number;

    }

    void receiveCall(String name) {
        System.out.println("Звонит " + name);
    }

    void receiveCall(String name, int number) {
        System.out.println("Звонит " + name + " номер: " + number);
    }

    int getNumber() {
        return number;
    }

    void sendMessage(String message, int... numbers) {
        System.out.println("Сообщение " + message + " отправится на номер: " + Arrays.toString(numbers));
    }
}
