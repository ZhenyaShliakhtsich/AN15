package com.teachMeSkills.an15.PilyushinYuri.hw5.Transport.transport;

import java.util.Objects;

public class Ground extends Transport {
    int wheel;
    int averageFuel;

    public Ground (int hp, int maxSpeed, int weight, String name, int wheel, int averageFuel){
     super(hp, maxSpeed, weight, name);
     this.wheel = wheel;
     this.averageFuel = averageFuel;
    }
    public Ground(int wheel, int averageFuel){

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Ground ground = (Ground) o;
        return wheel == ground.wheel && averageFuel == ground.averageFuel;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), wheel, averageFuel);
    }

    @Override
    public String toString() {
        return "Ground{" +
                "wheel=" + wheel +
                ", averageFuel=" + averageFuel +
                '}';
    }

    public int getWheel() {
        return wheel;
    }

    public void setWheel(int wheel) {
        this.wheel = wheel;
    }

    public int getAverageFuel() {
        return averageFuel;
    }

    public void setAverageFuel(int averageFuel) {
        this.averageFuel = averageFuel;
    }
}
