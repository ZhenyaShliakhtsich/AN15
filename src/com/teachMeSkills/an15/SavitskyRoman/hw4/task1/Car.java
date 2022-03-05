package com.teachMeSkills.an15.SavitskyRoman.hw4.task1;

import java.util.Random;

public class Car {
    String brand;
    int speed;
    double cost;

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", speed=" + speed +
                ", cost=" + cost +
                '}';
    }

    public Car(String brand, int speed, double cost) {
        this.brand = brand;
        this.speed = speed;
        this.cost = cost;
    }

    public Car() {

    }

    public void start() throws com.teachMeSkills.an15.SavitskyRoman.hw4.task1.CarException {
        Random random = new Random();
        int a = random.nextInt(21);
        if (a % 2 == 0) throw new com.teachMeSkills.an15.SavitskyRoman.hw4.task1.CarException(a, brand);
        else
            System.out.println("Автомобиль марки " + brand + " завелся");
    }
}
