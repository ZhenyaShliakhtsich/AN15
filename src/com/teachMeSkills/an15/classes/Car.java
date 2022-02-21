package com.teachMeSkills.an15.classes;

import java.util.Objects;

public abstract class Car {
    int kolesa;
    String color;
    double weight;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return kolesa == car.kolesa && Double.compare(car.weight, weight) == 0 && Objects.equals(color, car.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(kolesa, color, weight);
    }
}
