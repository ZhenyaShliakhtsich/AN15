package com.teachMeSkills.an15.SavitskyRoman.hw5.task1;

public abstract class GroundTransportation extends Transport {
    int wheels;
    double fuelConsumption;

    public GroundTransportation(double power, int speed, double weight,
                                String brand, int wheels, double fuelConsumption) {
        super(power, speed, weight, brand);
        this.wheels = wheels;
        this.fuelConsumption = fuelConsumption;
    }
}
