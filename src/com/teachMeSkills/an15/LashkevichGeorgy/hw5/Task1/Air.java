package com.teachMeSkills.an15.LashkevichGeorgy.hw5.Task1;

public class Air extends Transport {
    int razmahKil;
    int minDlinnaPolosi;

    public Air(int power, int maxSpeed, int weight, String mark, int razmahKil, int minDlinnaPolosi) {
        super(power, maxSpeed, weight, mark);
        this.razmahKil = razmahKil;
        this.minDlinnaPolosi = minDlinnaPolosi;
    }

    @Override
    public String toString() {
        return "Air{" +
                "razmahKil=" + razmahKil +
                ", minDlinnaPolosi=" + minDlinnaPolosi +
                ", power=" + power +
                ", maxSpeed=" + maxSpeed +
                ", weight=" + weight +
                ", mark='" + mark + '\'' +
                '}';
    }

    public Air() {
    }
}
