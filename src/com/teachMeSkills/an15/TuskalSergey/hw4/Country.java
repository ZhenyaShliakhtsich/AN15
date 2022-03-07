package com.teachMeSkills.an15.TuskalSergey.hw4;

import java.util.Objects;

public class Country {
    String country;
    String capital;

    public Country(String country, String capital) {
        this.country = country;
        this.capital = capital;
    }

    public Country() {

    }

    @Override
    public String toString() {
        return country + " - " + capital;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Country country1 = (Country) o;
        return Objects.equals(country, country1.country) && Objects.equals(capital, country1.capital);
    }

    @Override
    public int hashCode() {
        return Objects.hash(country, capital);
    }
}
