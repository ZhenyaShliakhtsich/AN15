package com.teachMeSkills.an15.classes.class3;

import java.util.Objects;

public class Posechaemost {
    int numberOfClass;
    boolean isPresent;

    public Posechaemost(int numberOfClass, boolean isPresent) {
        this.numberOfClass = numberOfClass;
        this.isPresent = isPresent;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Posechaemost that = (Posechaemost) o;
        return numberOfClass == that.numberOfClass && isPresent == that.isPresent;
    }

    @Override
    public String toString() {
        return "Posechaemost{" +
                "numberOfClass=" + numberOfClass +
                ", isPresent=" + isPresent +
                '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(numberOfClass, isPresent);
    }
}
