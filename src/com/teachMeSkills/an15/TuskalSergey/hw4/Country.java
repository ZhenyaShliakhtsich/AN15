package com.teachMeSkills.an15.TuskalSergey.hw4;

public class Country {
    String country;
    String capital;

    public Country(String country, String capital) {
        this.country = country;
        this.capital = capital;
    }

    @Override
    public String toString() {
        return country + " - " + capital;
    }
}
