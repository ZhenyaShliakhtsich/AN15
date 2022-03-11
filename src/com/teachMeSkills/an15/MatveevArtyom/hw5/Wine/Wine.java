package com.teachMeSkills.an15.MatveevArtyom.hw5.Wine;

import java.time.LocalDate;
import java.time.Period;

public class Wine {
    private String name;
    private String brand;
    private String country;
    private LocalDate date;
    private String note;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public void wineAging(LocalDate someDate) {
        System.out.println("Текущая дата: " + someDate);
        System.out.println("Выдержка вина составляет = " + Period.between(someDate, date));

    }
}
