package com.teachMeSkills.an15.MatveevArtyom.hw4;

import java.util.Random;

public class Car {
    String brand;
    double speed;
    double price;

    public Car(String brand, double speed, double price) {
        this.brand = brand;
        this.speed = speed;
        this.price = price;
    }

    public Car() {

    }

    public void start() throws MyException {
        Random random = new Random();
        int luck = random.nextInt(21);
        if (luck % 2 == 0 && luck != 0) {
            throw new MyException();
        } else System.out.println("Маишна " + brand + " завелась!");
    }
}
