package com.teachMeSkills.an15.ShlyakhtichEvgeniy.hw5.task2;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Wine {
    private String name;
    private String trademark;
    private String country;
    private GregorianCalendar dateOfBottling;
    private String note;

    public Wine(String name, String trademark, String country, GregorianCalendar dateOfBottling, String note) {
        this.name = name;
        this.trademark = trademark;
        this.country = country;
        this.dateOfBottling = dateOfBottling;
        this.note = note;
    }

    @Override
    public String toString() {
        return "Вино" +
                "\nНазвание :  " + name +
                "\nМарка : " + trademark +
                "\nСтрана : '" + country +
                "\nДата розлива : " + dateOfBottling +
                "\nПримечание : " + note;
    }

    protected int wineAging() {// По условию, текущая дата даётся как аргумент
        return GregorianCalendar.getInstance().get(Calendar.YEAR) - dateOfBottling.get(Calendar.YEAR);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTrademark() {
        return trademark;
    }

    public void setTrademark(String trademark) {
        this.trademark = trademark;
    }

    public String getCountry() {
        return country;
    }

    public GregorianCalendar getDateOfBottling() {
        return dateOfBottling;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public void setDateOfBottling(GregorianCalendar dateOfBottling) {
        this.dateOfBottling = dateOfBottling;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
