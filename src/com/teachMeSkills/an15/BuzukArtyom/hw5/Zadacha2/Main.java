package com.teachMeSkills.an15.BuzukArtyom.hw5.Zadacha2;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

public class Main {
    public static void main(String[] args) {
        Wine wine1 = new Wine();
        wine1.name = "Chateau Lafite ";
        wine1.dateSpill = "01/08/1787";
        wine1.country = "USA";
        wine1.tradeMark = "THJ";
        wine1.note = "это вино уже испортилось, но всё равно оно очень дорогое ($160 000 за бутылку) и престижное." +
                "\n Все дело в инициалах «Th.J.», принадлежащих Томасу Джефферсону. " +
                "\n Борец за независимость США приобрел Chateau Lafite во время путешествия во Францию, " +
                "\n там же на этикетки нанесли его инициалы.";

        Date d = new Date();
        DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
        df.setTimeZone(TimeZone.getTimeZone("EAT"));
        String d1 = df.format(d);


        System.out.println("Выдержка вина под названием " + wine1.name + " составляет " + wine1.Viderzhka(d1) + " дней");
        System.out.println("Его торговая марка: " + wine1.tradeMark);
        System.out.println("Страна производства: " + wine1.country);
        System.out.println("Примечание: " + wine1.note);


    }
}

// выдержку вина обычно указывают в годах (не критично)