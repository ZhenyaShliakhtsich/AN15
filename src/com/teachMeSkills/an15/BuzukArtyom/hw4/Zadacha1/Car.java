package com.teachMeSkills.an15.BuzukArtyom.hw4.Zadacha1;

import java.util.Objects;
import java.util.Random;

public class Car {
    String marka;
    int skorost;
    int cena;

    public Car(String marka, int skorost, int cena) {
        this.marka = marka;
        this.skorost = skorost;
        this.cena = cena;
    }

    public Car(String marka, int skorost) {
        this.marka = marka;
        this.skorost = skorost;
    }

    public Car(String marka) {
        this.marka = marka;
    }

    public Car() {
    }

    public void start() throws StartException {
        Random random = new Random();
        int number = random.nextInt(21);
        if (number % 2 == 0) {
            throw new StartException();
        } else {
            System.out.println("Попалось нечётное число, машина " + marka + " завелась. " + "Число:" + number);
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return skorost == car.skorost && cena == car.cena && Objects.equals(marka, car.marka);
    }

    @Override
    public int hashCode() {
        return Objects.hash(marka, skorost, cena);
    }

    @Override
    public String toString() {
        return "Car{" +
                "marka='" + marka + '\'' +
                ", skorost=" + skorost +
                ", cena=" + cena +
                '}';
    }
}
