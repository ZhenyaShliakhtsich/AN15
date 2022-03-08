package com.teachMeSkills.an15.TuskalSergey.hw5.Task1;

import static com.company.Main.powerInKilowatts;

public class FreightTransport extends GroundTransport {
    int loadCapacity;

    public FreightTransport(int power, int maxSpeed, int weight, String model, int numberOfWheels, double fuelConsumption, int loadCapacity) {
        super(power, maxSpeed, weight, model, numberOfWheels, fuelConsumption);
        this.loadCapacity = loadCapacity;
    }

    @Override
    public String toString() {
        return "FreightTransport{" +
                "loadCapacity=" + loadCapacity +
                ", power=" + power +
                ", maxSpeed=" + maxSpeed +
                ", model=" + model +
                ", numberOfWheels=" + numberOfWheels +
                ", fuelConsumption=" + fuelConsumption +
                ", weight=" + weight +
                ", powerInKilowatts='" + powerInKilowatts() + '\'' +
                '}';
    }
}
