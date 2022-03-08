package com.teachMeSkills.an15.SavitskyRoman.hw5.task2;

import java.time.DateTimeException;

public class Case {
    public static void main(String[] args) {
        Wine wineOne = new Wine("Oro Dei Sani Passo Rosso Terre di Chieti", "Italy", "dry", "red");
        Wine wineTwo = new Wine();

        try {
            wineOne.setDateWine(2019, 10, 30);
            wineOne.wineExtract();

            wineOne.setNote("Пишем что-нибудь.");
            wineOne.setNote("Вспомнили - добавили.");
            System.out.println(wineOne.getNote());

            wineTwo.setDateWine(1960, 5, 28);
            wineTwo.wineExtract();

        } catch (DateTimeException e) {
            System.out.println(e.getMessage());
        }

    }
}
