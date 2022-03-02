package com.teachMeSkills.an15.VorobyovSergey.hWFour.Task4;

import com.teachMeSkills.an15.AltievAli.hm3.Arrays;

//Определить класс Coder, хранящий такую информацию о программисте:
//        ФИО,
//        дата рождения,
//        должность,
//        зарплата,
//        телефон.
//        Методы takeBook takeVacation(), returnBack().
class Coder {
    private String fio;
    private String dateOfBirth;
    private String post;
    private int salary;
    private int phoneNumber;

    public Coder(String fio, String dateOfBirth, String post, int salary, int phoneNumber) {
        this.fio = fio;
        this.dateOfBirth = dateOfBirth;
        this.post = post;
        this.salary = salary;
        this.phoneNumber = phoneNumber;
    }

    void takeBook() {

    }

    void takeVacation(int days) {
        System.out.println(this.fio + " взял отпуск на " + days + " день.");
    }

    void takeVacation(String... countries) {
        StringBuilder builder = new StringBuilder();
        for (String s : countries) {
            builder.append(s).append(" ");
        }
        System.out.println(this.fio + " взял отпуск, чтобы посетить: " +
                builder);
    }

    void takeVacation(Country... countries) {
        StringBuilder builder = new StringBuilder();
        for (Country c : countries) {
            builder.append("в ").append(c.getCounry()).append(" - ").
                    append(c.getCapital()).append(" ");
        }
        System.out.println(this.fio + " взял отпуск, чтобы посетить: " +
                builder);
    }

    void returnBack(int days) {
        System.out.println(this.fio + " вернулся из отпуска в " + days + " день.");
    }

    void returnBack(String... countries) {
        StringBuilder builder = new StringBuilder();
        for (String s : countries) {
            builder.append(s).append(" ");
        }
        System.out.println(this.fio + " вернулся из отпуска где посетил: " +
                builder);
    }

    void returnBack(Country... countries) {
        StringBuilder builder = new StringBuilder();
        for (Country c : countries) {
            builder.append("в ").append(c.getCounry()).append(" - ").
                    append(c.getCapital()).append(" ");
        }
        System.out.println(this.fio + " вернулся из отпуска где посетил: " +
                builder);
    }
}