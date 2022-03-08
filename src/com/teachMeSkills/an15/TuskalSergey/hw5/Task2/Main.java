package com.teachMeSkills.an15.TuskalSergey.hw5.Task2;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

public class Main {
    public static void main(String[] args) {
        Wine wine1 = new Wine();

        wine1.setTitle("Винишко");
        wine1.setTrademark("Винный погреб");
        wine1.setCountry("Беларусь");
        wine1.setDate("08/03/2012");
        wine1.setNote("вкусное вино");

        wineInfo(wine1);

        wineAging(wine1);

    }

    public static void wineInfo(Wine wine) {
        System.out.println("Название вина: " + wine.getTitle());
        System.out.println("Торговая марка: " + wine.getTrademark());
        System.out.println("Страна изготовления: " + wine.getCountry());
        System.out.println("Дата разлива: " + wine.getDate());
        System.out.println("Примечание: " + wine.getNote());
    }

    public static long wineAging(Wine wine) {
        Date d1 = new Date();
        SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
        df.setTimeZone(TimeZone.getTimeZone("EAT"));
        String currentDate = df.format(d1);
        Date date1 = null;
        Date date2 = null;
        try {
            date1 = df.parse(currentDate);
            date2 = df.parse(wine.date);
        } catch (java.text.ParseException e) {
            e.printStackTrace();
        }
        long diff = date1.getTime() - date2.getTime();
        long years = diff / (24 * 60 * 60 * 1000) / 365;
        System.out.println("Выдержка вина " + wine.title + " составляет " + years + " лет");
        return years;
    }
}
