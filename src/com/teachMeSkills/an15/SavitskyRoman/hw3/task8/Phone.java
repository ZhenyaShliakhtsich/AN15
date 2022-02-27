package com.teachMeSkills.an15.SavitskyRoman.hw3.task8;

import java.util.Arrays;

public class Phone {
    int number;
    String model;
    double weight;

    public void receiveCall(String name) {
        System.out.println("Звонит " + name);
    }

    public int getNumber() {
        return number;
    }

    public Phone(int number, String model, double weight) {
        this(number, model);
        this.weight = weight;

    }

    public Phone(int number, String model) {
        this.number = number;
        this.model = model;
    }

    public Phone() {
    }

    public void receiveCall(String name, int number) {
        System.out.println("Звонит " + name + ", его номер телефона: " + number);
    }

    public void sendMessage(int... number) {
        System.out.println(Arrays.toString(number));
    }

    @Override
    public String toString() {
        return "Phone{" +
                "number=" + number +
                ", model='" + model + '\'' +
                ", weight=" + weight +
                '}';
    }
}

