package com.teachMeSkills.an15.MatveevArtyom.hw4;

public class Country {
    String name;
    String capital;

    public Country(String name, String capital) {
        this.name = name;
        this.capital = capital;
    }

    @Override
    public String toString() {
        return name + " - " + capital;
    }
}
