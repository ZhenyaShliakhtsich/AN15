package com.teachMeSkills.an15.NovikovVadim.hw4;

import java.util.Random;

public class Car {
    //    1. Создать собственное исключение
//- Создать класс Car c полями (марка, скорость, цена), конструкторы (с
//    параметрами и default).
//    Создать метод старт в котором пытаетесь завести автомобиль. В методе старт
//    генерируете случайное число от 0 до 20, если полученное число оказалось
//    четным, то выбрасываете созданное ранее вами исключение и передаете его к
//    месту откуда вызывали метод старт. Если все хорошо и исключение не
//    вылетело, то выводить в консоль сообщение что автомобиль с такой-то маркой
//    завелся.
//    В main создаете парочку автомобилей и пытаетесь их завести. И обрабатываете
//    исключение которое может вылететь при старте автомобиля
//
    String brand;
    int speed;
    int cost;

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", speed=" + speed +
                ", cost=" + cost + " y.e." +
                '}';
    }

    public String getBrand() {
        return this.brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Car(String brand, int speed, int cost) {
        this.brand = brand;
        this.speed = speed;
        this.cost = cost;
    }

    public Car(String brand) {
        this.brand = brand;
    }

    public boolean start(String brand) throws ExceptionCar {
        Random random = new Random();
        int key = random.nextInt(0, 20);
        if (key % 2 == 0) {
            throw new ExceptionCar("\nНе завелся автомобиль марки " + brand);
        } else {
            return true;
        }
    }


}
