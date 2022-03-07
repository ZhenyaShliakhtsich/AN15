package com.teachMeSkills.an15.BuzukArtyom.hw5.Zadacha1;

public class Nazemny extends Transport {
    int kolKoles;
    double rashod;
    public Nazemny(int power, int maxSpeed, int weight, String brand, int kolKoles, double rashod) {
        super(power, maxSpeed, weight, brand);
        this.kolKoles = kolKoles;
        this.rashod = rashod;
    }

    public Nazemny() {
    }
}
