package com.teachMeSkills.an15.SavitskyRoman.hw5.task1;

public abstract class Transport {
    double power;
    int speed;
    double weight;
    String brand;

    public Transport(double power, int speed, double weight, String brand) {
        this.power = power;
        this.speed = speed;
        this.weight = weight;
        this.brand = brand;
    }
}
