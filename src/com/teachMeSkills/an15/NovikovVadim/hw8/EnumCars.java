package com.teachMeSkills.an15.NovikovVadim.hw8;

public enum EnumCars {
    BMW("BMVW"),
    AUID("AUDI"),
    LADA("Жигули"),
    Mers("Mersedes"),
    VW("Volkswagen"),
    Skoda("Skoda");

    private String title;

    EnumCars(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public String toString() {
        return title;
    }
}
