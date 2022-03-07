package com.teachMeSkills.an15.BuzukArtyom.hw5.Zadacha1;

public class Vozdushniy extends Transport{
    double razmahKriliev;
    int minDlinaVPP;

    public Vozdushniy(int power, int maxSpeed, int weight, String brand, double razmahKriliev, int minDlinaVPP) {
        super(power, maxSpeed, weight, brand);
        this.razmahKriliev = razmahKriliev;
        this.minDlinaVPP = minDlinaVPP;
    }

    public Vozdushniy() {
    }
}
