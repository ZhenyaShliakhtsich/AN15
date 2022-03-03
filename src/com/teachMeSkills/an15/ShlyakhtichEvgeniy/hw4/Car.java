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

    //Можно было создать ещё один конструктор с 1-м параметром - model

    public String start() throws CarException {
        Random random = new Random();
        int startint = random.nextInt(20); // до 21 должно быть
        if (startint % 2 != 0) { // Если выпадает ноль, то будет считать как чётным
            CarException e = new CarException(startint);
            throw e; //можно было сразу сделать через new
        } else {
            return "Машина марки " + model + " завелась";
        }
        }
}

// Не нажал ctr+alt+L