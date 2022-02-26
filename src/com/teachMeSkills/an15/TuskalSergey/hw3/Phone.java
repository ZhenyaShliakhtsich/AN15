package com.teachMeSkills.an15.TuskalSergey.hw3;

public class Phone {
    int number;
    String model;
    int weight;

    public Phone(int number, String model, int weight) {
        this.number = number;
        this.model = model;
        this.weight = weight;
    }

    public Phone(int number, String model) {
        this.number = number;
        this.model = model;
    }

    public Phone() {
    }

    public void receiveCall() {
        System.out.println("Звонит телефон " + model);
    }

    public void receiveCall(String model, int number) {
        System.out.println("Звонит телефон " + model + " номер " + number);
    }

    int getNumber() {
        return number;
    }

    int sendMessage() {
        System.out.println("Сообщение будет отправлено на номер: " + getNumber());
        return number;
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


