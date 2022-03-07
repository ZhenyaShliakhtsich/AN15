package com.teachMeSkills.an15.LashkevichGeorgy.hw5.Task1;

public class Ground extends Transport {
    public Ground(int power, int maxSpeed, int weight, String mark) {
        super(power, maxSpeed, weight, mark);
    }

    int numbOfWheel;
    int rashod;

    @Override
    public String toString() {
        return "Ground{" +
                "numbOfWheel=" + numbOfWheel +
                ", rashod=" + rashod +
                ", power=" + power +
                ", maxSpeed=" + maxSpeed +
                ", weight=" + weight +
                ", mark='" + mark + '\'' +
                '}';
    }

    public Ground() {
    }

    public Ground(int power, int maxSpeed, int weight, String mark, int numbOfWheel, int rashod) {
        super(power, maxSpeed, weight, mark);
        this.numbOfWheel = numbOfWheel;
        this.rashod = rashod;
    }
}
