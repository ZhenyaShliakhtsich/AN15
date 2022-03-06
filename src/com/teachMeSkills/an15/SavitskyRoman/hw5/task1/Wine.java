package com.teachMeSkills.an15.SavitskyRoman.hw5.task1;

import java.time.LocalDate;
import java.time.Period;

public class Wine {
    private String brand;
    private String country;
    private String sugar;
    private String colour;
    private LocalDate dateWine;
    private final StringBuilder note = new StringBuilder();

    public StringBuilder getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note.append(note).append(" ");
    }

    public Wine(String brand, String country, String sugar, String colour) {
        this.brand = brand;
        this.country = country;
        this.sugar = sugar;
        this.colour = colour;
    }

    public Wine() {
    }

    public LocalDate getDateWine() {
        return dateWine;
    }

    public void setDateWine(int year, int month, int dayOfMonth) {
        this.dateWine = LocalDate.of(year, month, dayOfMonth);
    }

    public void wineExtract() {
        LocalDate dateNow = LocalDate.now();
        Period period = Period.between(getDateWine(), dateNow);
        System.out.println("Срок выжержки YY.MM.DD: " + period.getYears() + "." + period.getMonths()
                + "." + period.getDays());
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getSugar() {
        return sugar;
    }

    public void setSugar(String sugar) {
        this.sugar = sugar;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    @Override
    public String toString() {
        return "Wine{" +
                "brand='" + brand + '\'' +
                ", country='" + country + '\'' +
                ", sugar='" + sugar + '\'' +
                ", colour='" + colour + '\'' +
                '}';
    }

}

