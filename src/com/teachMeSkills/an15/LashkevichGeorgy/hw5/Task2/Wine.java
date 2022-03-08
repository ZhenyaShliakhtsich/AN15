package com.teachMeSkills.an15.LashkevichGeorgy.hw5.Task2;


import java.text.SimpleDateFormat;
import java.util.Date;

public class Wine {
    private String title;
    private String mark;
    private String country;
    private String dateOfRazliv; // dd.MM.yyyy


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getDateOfRazliv() {
        return dateOfRazliv;
    }

    @Override
    public String toString() {
        return "Wine{" +
                "title='" + title + '\'' +
                ", mark='" + mark + '\'' +
                ", country='" + country + '\'' +
                ", dateOfRazliv=" + dateOfRazliv +
                '}';
    }

    public void setDateOfRazliv(String dateOfRazliv) {
        this.dateOfRazliv = dateOfRazliv;
    }

    public Wine() {
    }

    public void Vidergka() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy");
        Date date = new Date(System.currentTimeMillis());
        Date date1 = null;
        try {
            date1 = dateFormat.parse(dateOfRazliv);
        } catch (Exception e) {
            System.out.println("беда");
        }
        long millisec = date.getTime() - date1.getTime();
        int month = (int) (millisec / (24 * 60 * 60 * 1000) / 30);

        System.out.println("Выдержка составляет " + month + " месяцев, или " + month / 12 + " лет");
    }
}

