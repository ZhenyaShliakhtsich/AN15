package com.teachMeSkills.an15.MatveevArtyom.hw5;

import java.time.LocalDate;

public class MainWine {
    public static void main(String[] args) {
        Wine wine =  new Wine();
        wine.setBrand("Шато Савильён");
        wine.setCountry("Франция");
        wine.setDate(LocalDate.of(2019, 8, 22));
        System.out.println(wine.getDate());
        wine.setName("Игристое");
        wine.setNote("Изысканное вино");
        wine.payment(wine.getDate());
    }
}
