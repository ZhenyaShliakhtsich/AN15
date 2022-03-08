package com.teachMeSkills.an15.TuskalSergey.hw5.Task1;

public class MilitaryTransport extends AirTransport {
    boolean bailoutSystem;
    int numberOfRockets;

    public MilitaryTransport(int power, int maxSpeed, int weight, String model, int wingspan, int minLengthOfFlightStrip, boolean bailoutSystem, int numberOfRockets) {
        super(power, maxSpeed, weight, model, wingspan, minLengthOfFlightStrip);
        this.bailoutSystem = bailoutSystem;
        this.numberOfRockets = numberOfRockets;
    }

    @Override
    public String toString() {
        return "MilitaryTransport{" +
                "wingspan=" + wingspan +
                ", power=" + power +
                ", maxSpeed=" + maxSpeed +
                ", model=" + model +
                ", minLengthOfFlightStrip=" + minLengthOfFlightStrip +
                ", bailoutSystem=" + bailoutSystem +
                ", numberOfRockets=" + numberOfRockets +
                ", weight=" + weight +
                '}';
    }
}
