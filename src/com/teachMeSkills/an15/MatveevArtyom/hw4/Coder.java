package com.teachMeSkills.an15.MatveevArtyom.hw4;

public class Coder {
    String fio;
    int dateOfBirthday;
    String position;
    int salary;
    int phone;

    public Coder(String fio) {
        this.fio = fio;
    }

    public void takeVacation(int countOfDays) {
        System.out.println(fio + " взял отпуск на " + countOfDays + " день");
    }

    public String takeVacation(String... strings) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < strings.length; i++) {
            stringBuilder.append(strings[i]).append(" ");
        }
        return fio + " взял отпуск чтобы посетить " + stringBuilder;
    }

    public String takeVacation(Country... countries) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < countries.length; i++) {
            stringBuilder.append(countries[i].name).append(" - ").append(countries[i].capital).append(",");
        }
        return fio + " взял отпуск чтобы посетить в " + stringBuilder;
    }

    public void returnBack(int countOfDays) {
        System.out.println("\n" + fio + " вернулся из отпуска, который длился " + countOfDays + " день");
    }

    public String returnBack(String... strings) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < strings.length; i++) {
            stringBuilder.append(strings[i]).append(" ");
        }
        return fio + " вернулся из отпуска из " + stringBuilder;
    }

    public String returnBack(Country... countries) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < countries.length; i++) {
            stringBuilder.append(countries[i].name).append(" - ").append(countries[i].capital).append(" ");
        }
        return fio + " вернулся из отпуска из " + stringBuilder;
    }
}