package com.teachMeSkills.an15.MatveevArtyom.hw3;

public class Phone {
    int number;
    String model;
    double weight;

    public Phone(int number, String model, double weight) {
        this.number = number;
        this.model = model;
        this.weight = weight;
    }

    public Phone(int number, String model) {
        this.number = number;
        this.model = model;
    }

    public Phone() {
        number = 0;
        model = "Unknown";
        weight = 0;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "number=" + number +
                ", model='" + model + '\'' +
                ", weight=" + weight +
                '}';
    }

    public String receiveCall(int name){
        return "Звонит {" + name + "}";
    }
    public int getNumber(int number){
        return number;
    }
}
