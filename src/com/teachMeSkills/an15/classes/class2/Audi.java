package com.teachMeSkills.an15.classes.class2;

import java.util.Objects;

public class Audi extends Car {
    int kovriki;
    boolean ifConditionPresent;

    public Audi(int kovriki, boolean ifConditionPresent, String color, double weight,
                int kolesa) {
        this.kovriki = kovriki;
        this.ifConditionPresent = ifConditionPresent;
        super.color = color;
        super.weight = weight;
        super.kolesa = kolesa;
    }

    @Override
    public String toString() {
        return "Audi{" +
                "kovriki=" + kovriki +
                ", ifConditionPresent=" + ifConditionPresent +
                ", kolesa=" + kolesa +
                ", color='" + color + '\'' +
                ", weight=" + weight +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Audi audi = (Audi) o;
        return kovriki == audi.kovriki && ifConditionPresent == audi.ifConditionPresent
                && super.equals(o);
    }

    @Override
    public int hashCode() {
        return Objects.hash(kovriki, ifConditionPresent);
    }
}
