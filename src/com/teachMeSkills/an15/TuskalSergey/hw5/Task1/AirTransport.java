package com.teachMeSkills.an15.TuskalSergey.hw5.Task1;

public class AirTransport extends Transport{
    int wingspan;
    int minLengthOfFlightStrip;


    public AirTransport(int power, int maxSpeed, int weight, String model, int wingspan, int minLengthOfFlightStrip) {
        super(power, maxSpeed, weight, model);
        this.wingspan = wingspan;
        this.minLengthOfFlightStrip = minLengthOfFlightStrip;
    }
}
