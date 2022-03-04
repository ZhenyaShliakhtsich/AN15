package com.teachMeSkills.an15.VorobyovSergey.hWFour.Task1;

import java.util.Random;

public class Car {
    private String model;
    private int price;
    private int maxSpeed;

    public Car() {
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
            throw new CarStartException(number);  // проброс исключения, обработаем позже
        } else {
            System.out.printf("Тебе попалось нечетное число %d. Машина завелась.\n", number);
        }
    }
}
