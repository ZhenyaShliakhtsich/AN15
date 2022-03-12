package com.teachMeSkills.an15.MatveevArtyom.hw6.Inheritance.task1.groundTransport;

import com.teachMeSkills.an15.MatveevArtyom.hw6.Inheritance.task1.Transport;

public abstract class GroundTransport extends Transport {
    private int countOfWheels;
    private double fuelConsumption;

    public int getCountOfWheels() {
        return countOfWheels;
    }

    public void setCountOfWheels(int countOfWheels) {
        this.countOfWheels = countOfWheels;
    }

    public double getFuelConsumption() {
        return fuelConsumption;
    }

    public void setFuelConsumption(double fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }
}
