package com.teachMeSkills.an15.PilyushinYuri.hw5.Transport.transport;

import java.util.Objects;

public class Air extends Transport {
    int wingspan;
    int minRunway;

    public Air(int hp, int maxSpeed, int weight, String name, int wingspan, int minRunway) {
        super(hp, maxSpeed, weight, name);
        this.wingspan = wingspan;
        this.minRunway = minRunway;
    }

    public int getWingspan() {
        return wingspan;
    }

    public void setWingspan(int wingspan) {
        this.wingspan = wingspan;
    }

    public int getMinRunway() {
        return minRunway;
    }

    public void setMinRunway(int minRunway) {
        this.minRunway = minRunway;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Air air = (Air) o;
        return wingspan == air.wingspan && minRunway == air.minRunway;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), wingspan, minRunway);
    }

    @Override
    public String toString() {
        return "Air{" +
                "wingspan=" + wingspan +
                ", minRunway=" + minRunway +
                '}';
    }
}
