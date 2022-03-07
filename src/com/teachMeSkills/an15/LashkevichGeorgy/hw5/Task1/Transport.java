package com.teachMeSkills.an15.LashkevichGeorgy.hw5.Task1;
public class Transport {
    int power;
    int maxSpeed;
    int weight;

    @Override
    public String toString() {
        return "Transport{" +
                "power=" + power +
                ", maxSpeed=" + maxSpeed +
                ", weight=" + weight +
                ", mark='" + mark + '\'' +
                '}';
    }

    String mark;

    public Transport() {
    }

    public Transport(int power, int maxSpeed, int weight, String mark) {
        this.power = power;
        this.maxSpeed = maxSpeed;
        this.weight = weight;
        this.mark = mark;
    }
}
