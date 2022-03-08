package com.teachMeSkills.an15.TuskalSergey.hw5.Task1;

public class GroundTransport extends Transport {
    int numberOfWheels;
    static double fuelConsumption;

    public GroundTransport(int power, int maxSpeed, int weight, String model, int numberOfWheels, double fuelConsumption) {
        super(power, maxSpeed, weight, model);
        this.numberOfWheels = numberOfWheels;
        this.fuelConsumption = fuelConsumption;
    }
}
