package com.teachMeSkills.an15.ShlyakhtichEvgeniy.hw4;

import java.util.Random;

public class Car {
    String model;
    int speed;
    int price;

    public Car(String model, int speed, int price) {
        this.model = model;
        this.speed = speed;
        this.price = price;
    }

    public Car() {
    }

    public String start() throws CarException {
        Random random = new Random();
        int startint = random.nextInt(20);
        if (startint % 2 != 0 ){
            CarException e = new CarException(startint);
            throw e;
        } else {
            return "Машина марки " + model + " завелась";
        }
        }
}
