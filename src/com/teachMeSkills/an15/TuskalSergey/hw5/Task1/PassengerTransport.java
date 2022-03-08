package com.teachMeSkills.an15.TuskalSergey.hw5.Task1;

public class PassengerTransport extends GroundTransport {
    String bodyType;
    int numberOfPassengers;

    public PassengerTransport(int power, int maxSpeed, int weight, String model, String bodyType, int numberOfPassengers,
                              int numberOfWheels, double fuelConsumption) {
        super(power, maxSpeed, weight, model, numberOfWheels, fuelConsumption);
        this.bodyType = bodyType;
        this.numberOfPassengers = numberOfPassengers;
    }

    @Override
    public String toString() {
        return "PassengerTransport{" +
                "power=" + power +
                ", maxSpeed=" + maxSpeed +
                ", model=" + model +
                ", fuelConsumption=" + fuelConsumption +
                ", numberOfWheels=" + numberOfWheels +
                ", bodyType='" + bodyType + '\'' +
                ", numberOfPassengers=" + numberOfPassengers +
                ", weight=" + weight +
                '}';
    }
}
