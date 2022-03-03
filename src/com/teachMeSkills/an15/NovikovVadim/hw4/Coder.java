package com.teachMeSkills.an15.NovikovVadim.hw4;

import java.util.Date;

public class Coder {
    String FIO;
    Date dateOfBirdth;
    String position;
    int salary;
    String telephoneNumber;

    public Coder(String FIO, Date dateOfBirdth, String position, int salary, String telephoneNumber) {
        this.FIO = FIO;
        this.dateOfBirdth = dateOfBirdth;
        this.position = position;
        this.salary = salary;
        this.telephoneNumber = telephoneNumber;
    }

    public String takeVacation(int days) {
        return FIO + " взял отпуск на " + getDays(days);
    }

    public String takeVacation(String... country) {
        StringBuilder stringBuilder = new StringBuilder(); // !!!! я бы тогда сразу начал с заполненного стрингбилдера и его и вернул
        for (String s : country) {
            stringBuilder.
                    append(s).
                    append(", ");
        }
        return FIO + " взял отпуск чтобы посетить " + stringBuilder;
    }

    public String takeVacation(Country... country) {
        StringBuilder stringBuilder = new StringBuilder();
        for (Country value : country) {
            stringBuilder.
                    append(value.getCountry()).
                    append(" - ").
                    append(value.getCapital()).
                    append(", ");
        }
        return FIO + " взял отпуск чтобы посетить " + stringBuilder;
    }

    public String returnBack(Country... country) {
        StringBuilder stringBuilder = new StringBuilder();
        for (Country value : country) {
            stringBuilder.
                    append(value.getCountry()).
                    append(" - ").
                    append(value.getCapital()).
                    append(", ");
        }
        return FIO + " вернулся из отпуска из " + stringBuilder;
    }

    public String returnBack(int days) {
        return FIO + " вернулся из отпуска длиной в " + getDays(days);
    }

    public String returnBack(String... country) {
        StringBuilder stringBuilder = new StringBuilder();
        for (String s : country) {
            stringBuilder.append(s).append(" ");
        }
        return FIO + " вернулся из отпуска из " + stringBuilder;
    }

    //!!!Клево, я поленился
    private String getDays(int day) {
        int r_100 = day % 100;
        int r_10 = r_100 % 10;

        String str = "";
        if (r_100 > 4 && r_100 < 21) {
            str = (day + " дней");
        } else {
            if (r_10 == 1) {
                str = (day + " день");
            } else if (r_10 > 1 && r_10 < 5) {
                str = (day + " дня");
            } else {
                str = (day + " дней");
            }
        }
        return str;
    }

}
