package com.teachMeSkills.an15.ShlyakhtichEvgeniy.hw4;

public class Coder {
    String name;
    String birthDate;
    String post;
    int salary;
    int number;

    public Coder(String name, String birthDate, String post, int salary, int number) {
        this.name = name;
        this.birthDate = birthDate;
        this.post = post;
        this.salary = salary;
        this.number = number;
    }

    public String takeBook() {
        return " ";
    }

    public String takeVacation(int days) {
        return name + " взял отпуск на " + days + " дней";
    }

    public String takeVacation(String... country) {
        StringBuilder st = new StringBuilder();
        for (int i = 0; i < country.length; i++) {
            st.append(country[i]).append(" ");
        }
        return name + " взял отпуск чтобы посетить " + st;
    }

    public String takeVacation(Country... country) {
        StringBuilder st = new StringBuilder();
        for (int i = 0; i < country.length; i++) {
            st.append(country[i].country).append(" - ").append(country[i].capital).append(",");
        }
        return name + " взял отпуск чтобы посетить в " + st;
    }

    public String returnBack(Country... country) {
        StringBuilder st = new StringBuilder();
        for (int i = 0; i < country.length; i++) {
            st.append(country[i].country).append(" - ").append(country[i].capital).append(",");
        }
        return name + " вернулся из отпуска из " + st;
    }
    public String returnBack(int days) {
        return name + " вернулся из отпуска длиной в " + days + " дней ";
    }
    public String returnBack(String... country) {
        StringBuilder st = new StringBuilder();
        for (int i = 0; i < country.length; i++) {
            st.append(country[i]).append(" ");
        }
        return name + " вернулся из отпуска из " + st;
    }
}
