package com.teachMeSkills.an15.TuskalSergey.hw4;

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

    int start() {
        return (int) (Math.random() * 21);
    }
}
