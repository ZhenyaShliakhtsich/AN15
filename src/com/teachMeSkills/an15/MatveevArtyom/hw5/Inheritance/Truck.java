package com.teachMeSkills.an15.MatveevArtyom.hw5.Inheritance;


public class Truck extends GroundTransport {
    protected double loadCapacity;

    @Override
    public String toString() {
        return "Truck{" +
                "power=" + power +
                ", maxSpeed=" + maxSpeed +
                ", weight=" + weight +
                ", model='" + model + '\'' +
                ", loadCapacity=" + loadCapacity +
                ", power in kilowatts= " + power * 0.74 +
                '}';
    }


    public void howMuch(double someWeight) {
        if (someWeight <= loadCapacity) {
            System.out.println("Грузовик загружен");
        } else {
            System.out.println("Вам нужен грузовик побольше");
        }
    }
}
