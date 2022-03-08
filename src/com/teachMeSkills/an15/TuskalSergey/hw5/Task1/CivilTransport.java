package com.teachMeSkills.an15.TuskalSergey.hw5.Task1;

public class CivilTransport extends AirTransport {
    int numberOfPassengers;
    boolean businessClass;

    public CivilTransport(int power, int maxSpeed, int weight, String model, int wingspan, int minLengthOfFlightStrip,
                          int numberOfPassengers, boolean businessClass) {
        super(power, maxSpeed, weight, model, wingspan, minLengthOfFlightStrip);
        this.numberOfPassengers = numberOfPassengers;
        this.businessClass = businessClass;
    }

    @Override
    public String toString() {
        return "CivilTransport{" +
                "wingspan=" + wingspan +
                ", power=" + power +
                ", maxSpeed=" + maxSpeed +
                ", model=" + model +
                ", minLengthOfFlightStrip=" + minLengthOfFlightStrip +
                ", numberOfPassengers=" + numberOfPassengers +
                ", businessClass=" + businessClass +
                ", weight=" + weight +
                '}';
    }
}
