package com.teachMeSkills.an15.SavitskyRoman.hw5.task1;

public abstract class AirTransport extends Transport {
    double wingLength;
    double runwayLength;

    public AirTransport(double power, int speed, double weight, String brand, double wingLength, double runwayLength) {
        super(power, speed, weight, brand);
        this.wingLength = wingLength;
        this.runwayLength = runwayLength;
    }
}
