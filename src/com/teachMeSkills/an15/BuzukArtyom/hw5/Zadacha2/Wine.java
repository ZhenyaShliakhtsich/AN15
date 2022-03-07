package com.teachMeSkills.an15.BuzukArtyom.hw5.Zadacha2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Wine {
    String name;
    String tradeMark;
    String country;
    String dateSpill;
    String note;

    public Wine() {
        this.name = name;
        this.tradeMark = tradeMark;
        this.country = country;
        this.dateSpill = dateSpill;
        this.note = note;
    }

    public long Viderzhka(String curDate) {
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        Date date1 = null;
        Date date2 = null;
        try {
            date1 = format.parse(curDate);
            date2 = format.parse(dateSpill);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        long difference = date1.getTime() - date2.getTime();
        long days = difference / (24 * 60 * 60 * 1000);
        return days;
    }
}
