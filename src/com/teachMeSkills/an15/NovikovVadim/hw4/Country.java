package com.teachMeSkills.an15.NovikovVadim.hw4;

public class Country {
    private String country;
    private String capital;

    public void setCountry(String country) {
        this.country = country;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    public String getCountry() {
        return country;
    }

    public String getCapital() {
        return capital;
    }

    public Country() {

    }

    public Country(String country, String capital) {
        this.country = country;
        this.capital = capital;
    }
}
