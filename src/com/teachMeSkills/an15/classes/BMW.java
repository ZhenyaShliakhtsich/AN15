package com.teachMeSkills.an15.classes;

public class BMW extends Car{
    boolean isPontyPresent;
    boolean isPovorotnikiPresent;
    int kovriki;

    public BMW(boolean isPontyPresent, boolean isPovorotnikiPresent, int kovriki) {
        this.isPontyPresent = isPontyPresent;
        this.isPovorotnikiPresent = isPovorotnikiPresent;
        this.kovriki = kovriki;
    }

    @Override
    public String toString() {
        return "BMW{" +
                "isPontyPresent=" + isPontyPresent +
                ", isPovorotnikiPresent=" + isPovorotnikiPresent +
                ", kovriki=" + kovriki +
                ", kolesa=" + kolesa +
                ", color='" + color + '\'' +
                ", weight=" + weight +
                '}';
    }
}
