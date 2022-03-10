package com.teachMeSkills.an15.ShlyakhtichEvgeniy.hw5.task1;

import java.util.Objects;

public class Air extends Transport {
    int wingspan;
    int airstripLength;

    public Air(int power, int speed, int mass, String model, int wingspan, int airstripLength) {
        super(power, speed, mass, model);
        this.wingspan = wingspan;
        this.airstripLength = airstripLength;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Air air = (Air) o;
        return wingspan == air.wingspan && airstripLength == air.airstripLength;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), wingspan, airstripLength);
    }

    @Override
    public String toString() {
        return "Air{" +
                "wingspan=" + wingspan +
                ", airstripLength=" + airstripLength +
                ", power=" + power +
                ", speed=" + speed +
                ", mass=" + mass +
                ", model='" + model + '\'' +
                '}';
    }
}
