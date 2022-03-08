package com.teachMeSkills.an15.SavitskyRoman.hw5.task1;

public class CivilPlane extends AirTransport {
    int numberOfPassengers;
    boolean businessClass;

    public CivilPlane(double power, int speed, double weight, String brand,
                      double wingLength, double runwayLength, int numberOfPassengers, boolean businessClass) {
        super(power, speed, weight, brand, wingLength, runwayLength);
        this.numberOfPassengers = numberOfPassengers;
        this.businessClass = businessClass;
    }

    public void capacity(int capacity) {
        if (numberOfPassengers >= capacity) System.out.println("Самолет загружен.");
        else System.out.println("Самолет перегуржен, но есть свободные парашюты:)");
    }
}
