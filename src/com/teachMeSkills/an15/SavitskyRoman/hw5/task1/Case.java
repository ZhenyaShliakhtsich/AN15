package com.teachMeSkills.an15.SavitskyRoman.hw5.task1;

public class Case {
    public static void main(String[] args) {
        Wine wineOne = new Wine("Oro Dei Sani Passo Rosso Terre di Chieti", "Italy", "dry", "red");
        Wine wineTwo = new Wine();

        wineOne.setDateWine(2019, 3, 28);
        wineOne.setNote("Пишем что-нибудь.");
        wineOne.setNote("Вспомнили - добавили.");
        wineOne.wineExtract();
        System.out.println(wineOne.getNote());

        wineTwo.setDateWine(1960, 5, 28);
        wineTwo.wineExtract();
    }
}
