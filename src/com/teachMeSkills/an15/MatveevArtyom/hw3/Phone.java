package com.teachMeSkills.an15.MatveevArtyom.hw3;

import java.util.Arrays;

public class Phone {
    int number;
    String name;
    double weight;


    public Phone(int number, String name, double weight) {
        this(number, name);
        this.weight = weight;
    }

    public Phone(int number, String name) {
        this.number = number;
        this.name = name;
    }

    public Phone() {
        number = 0;
        name = "Unknown";
        weight = 0;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "number=" + number +
                ", model='" + name + '\'' +
                ", weight=" + weight +
                '}';
    }

    public void receiveCall(String name) {
        System.out.println("Звонит {" + name + "}");
    }

    public void receiveCall(String name, int number) {
        System.out.println("Звонит {" + name + "} " + " с номером {" + number + "}");
    }

    public void getNumber(int number) {
        System.out.println("номер - " + number);
    }

    public void sendMessage(int... numbers) {
        System.out.println("номер телефона, отправившего сообщение: " + Arrays.toString(numbers));
    }
}
