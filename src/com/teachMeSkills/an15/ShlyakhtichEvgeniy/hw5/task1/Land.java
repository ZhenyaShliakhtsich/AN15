package com.teachMeSkills.an15.ShlyakhtichEvgeniy.hw5.task1;

import java.util.Objects;

public class Land extends  Transport{
    int wheels;

    public Land(int power, int speed, int mass, String model, int wheels) {
        super(power, speed, mass, model);
        this.wheels = wheels;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Land land = (Land) o;
        return wheels == land.wheels;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), wheels);
    }

    @Override
    public String toString() {
        return "Land{" +
                "wheels=" + wheels +
                ", power=" + power +
                ", speed=" + speed +
                ", mass=" + mass +
                ", model='" + model + '\'' +
                '}';
    }
}
