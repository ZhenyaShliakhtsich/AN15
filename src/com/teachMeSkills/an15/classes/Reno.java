package com.teachMeSkills.an15.classes;

public class Reno extends Car {

    int vesla;

    Reno(int vesla) {
        this.vesla = vesla;
    }

    @Override
    public String toString() {
        return "Reno{" +
                "kolesa=" + kolesa +
                ", color='" + color + '\'' +
                ", weight=" + weight +
                ", vesla=" + vesla +
                '}';
    }
}
