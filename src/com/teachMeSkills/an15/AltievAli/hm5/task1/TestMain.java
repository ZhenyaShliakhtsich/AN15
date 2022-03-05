package com.teachMeSkills.an15.AltievAli.hm5.task1;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class TestMain {

    public static void main(String[] args) {

        Wine wineObject = new Wine();
        wineObject.setKindOfWine("Red");
        wineObject.setBrandOfWine("Merlot");
        wineObject.setMadeIn("France");
        LocalDate spillDate = wineObject.setSpillDate(LocalDate.of(1992, 12, 31));
        wineObject.setNote("Here for note something");

        System.out.println("Kind of Wine: " + wineObject.getKindOfWine());
        System.out.println("Brand of Wine: " + wineObject.getBrandOfWine());
        System.out.println("Wine made in " + wineObject.getMadeIn());
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        System.out.println("Slipp Date of Wine: " + dateTimeFormatter.format(wineObject.getSpillDate()));
        LocalDate localDate = LocalDate.now();
        Period period = Period.between(spillDate, localDate);
        String st = String.format("Aging wine called " + wineObject.getBrandOfWine() + " %d day,%d month,%d year"
                , period.getDays()
                , period.getMonths()
                , period.getYears());
        System.out.println(st);

        System.out.println(wineObject.getNote());


    }


}
