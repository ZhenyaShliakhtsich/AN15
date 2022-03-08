package com.teachMeSkills.an15.SavitskyRoman.hw5.task1;

public class CargoTransport extends GroundTransportation {
    private double loadCapacity;

    public CargoTransport(double power, int speed, double weight, String brand, int wheels
            , double fuelConsumption, double loadCapacity) {
        super(power, speed, weight, brand, wheels, fuelConsumption);
        this.loadCapacity = loadCapacity;
    }

    public void capacity(double capacity) {
        if (loadCapacity >= capacity) System.out.println("Грузовик загружен.");
        else System.out.println("Вам нужен грузовик побольше!");
    }

    public double powerToKW() {
        return loadCapacity * 0.74;
    }

    @Override
    public String toString() {
        return "CargoTransport{" +
                "loadCapacity=" + loadCapacity +
                ", wheels=" + wheels +
                ", fuelConsumption=" + fuelConsumption +
                ", power=" + power +
                ", speed=" + speed +
                ", weight=" + weight +
                ", brand='" + brand + '\'' +
                ", powerToKW=" + powerToKW() +
                '}';
    }
}
