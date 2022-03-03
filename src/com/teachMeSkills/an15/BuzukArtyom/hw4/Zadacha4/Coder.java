package com.teachMeSkills.an15.BuzukArtyom.hw4.Zadacha4;

public class Coder {
    String fio;
    String age;
    String dolzhnost;
    int zarplata;
    long telefon;

    public Coder(String fio, String age, String dolzhnost, int zarplata, long telefon) {
        this.fio = fio;
        this.age = age;
        this.dolzhnost = dolzhnost;
        this.zarplata = zarplata;
        this.telefon = telefon;
    }

    public Coder() {
    }

    public void takeVacation(int day) {
        System.out.println(this.fio + "взял отпуск на " + day + " дней.");
    }

    public void takeVacation(String... a) {
        System.out.println(this.fio + " взял отпуск, чтобы посетить: ");//можно было вывести без for
        for (String abs : a) {//будет выводится в столбец,нету метода для столиц
            System.out.println(abs);
        }
    }


    public void returnBack(int day) {
        System.out.println(this.fio + "вернулся из отпуска через " + day);
    }

    public void returnBack(String... b) {
        System.out.println(this.fio + "вернулся из стран: ");
        for (String abs : b) {//будет выводится в столбец,нету метода для столиц
            System.out.println(abs);
        }
    }


}
