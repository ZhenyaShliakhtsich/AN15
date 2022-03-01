package com.teachMeSkills.an15.AltievAli.hm4.Task1;

import java.util.Random;

class Car {

    String markOfCar;
    double price;
    int speed;

    public Car(String markOfCar, double price, int speed) {
        this.markOfCar = markOfCar;
        this.price = price;
        this.speed = speed;
    }

    public Car() {
    }

    void startCar() throws CreatedException {

        Random random = new Random();
        int randomNumber = random.nextInt(21);
        if (randomNumber % 2 == 0) {
            throw new CreatedException();
        } else {

            System.out.println("Автомобиль " + markOfCar + " завелась");

        }

    }

}
