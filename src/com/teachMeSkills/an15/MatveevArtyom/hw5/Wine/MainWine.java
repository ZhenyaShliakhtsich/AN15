package com.teachMeSkills.an15.MatveevArtyom.hw5.Wine;

import java.time.LocalDate;

public class MainWine {
    public static void main(String[] args) {
        Wine wine =  new Wine();
        wine.setBrand("Шато Савильён");
        wine.setCountry("Франция");
        wine.setDate(LocalDate.of(2010, 8, 22));
        System.out.println("Дата создания: " + wine.getDate());
        wine.setName("Игристое");
        wine.setNote("Изысканное вино");
        LocalDate nowDate = LocalDate.of(2020,5,14);
        wine.wineAging(nowDate);
    }
}
