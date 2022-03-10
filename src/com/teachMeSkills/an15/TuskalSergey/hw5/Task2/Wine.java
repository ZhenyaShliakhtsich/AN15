package com.teachMeSkills.an15.TuskalSergey.hw5.Task2;

public class Wine {
    String title;
    String trademark;
    String country;
    String date;
    String note;

    public Wine(String title, String trademark, String country, String date, String note) {
        this.title = title;
        this.trademark = trademark;
        this.country = country;
        this.date = date;
        this.note = note;
    }

    public Wine() {

    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setTrademark(String trademark) {
        this.trademark = trademark;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public String getTitle() {
        return title;
    }

    public String getTrademark() {
        return trademark;
    }

    public String getCountry() {
        return country;
    }

    public String getDate() {
        return date;
    }

    public String getNote() {
        return note;
    }
}
