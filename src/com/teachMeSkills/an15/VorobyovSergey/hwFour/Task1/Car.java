package com.teachMeSkills.an15.VorobyovSergey.hwFour.Task1;

import java.util.Random;

public class Car {
    private String model;
    private int price;
    private int maxSpeed;

    public Car() {
        this.model = "YouWantDefault";
        this.price = -1;
        this.maxSpeed = -1;
    }

    public Car(String model, int price, int maxSpeed) {
        this.model = model;
        this.price = price;
        this.maxSpeed = maxSpeed;
    }

    public void start() throws CarStartException {
        Random random = new Random();
        int number = random.nextInt(21);
        if (number % 2 == 0) {
            throw new CarStartException();
        } else {
            System.out.println("Тебе попалось нечетное число. Машина завелась." + this.getModel());
        }
    }

    public String getModel() {
        return model;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", price=" + price +
                ", maxSpeed=" + maxSpeed +
                '}';
    }
}
