package com.teachMeSkills.an15.PilyushinYuri.hw4;

import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Objects.equals(model, car.model) && Objects.equals(speed, car.speed) && Objects.equals(price, car.price);
    }

    @Override
    public int hashCode() {
        return Objects.hash(model, speed, price);
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", speed='" + speed + '\'' +
                ", price='" + price + '\'' +
                '}';
    }

    public static int toStartCar() throws MyExeption {
        int launch = (int) (Math.random() * 21);
        if (launch % 2 == 0) {
            throw new MyExeption(  "Не завелась" );
        }
        return launch;
    }
}