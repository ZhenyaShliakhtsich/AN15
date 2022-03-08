package com.teachMeSkills.an15.PilyushinYuri.hw5;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class WineUser {
    public static void main(String[] args) {
        Wine data = setNewWine();
        getWine(data);
        getExcerpt(data);


    }

    public static Wine setNewWine() {
        Scanner scanner = new Scanner(System.in);
        Wine wine = new Wine();
        System.out.println("Название");
        wine.setName(scanner.next());
        System.out.println("Тип");
        wine.setType(scanner.next());
        System.out.println("Страна");
        wine.setCountry(scanner.next());
        System.out.println("Год");
        wine.setYear(scanner.next());

        return wine;
    }
    public static Wine getWine(Wine data){
        System.out.println("Название: " + data.getName());
        System.out.println("Тип: " + data.getType());
        System.out.println("Страна: " + data.getCountry());
        System.out.println("Год: " + data.getYear());
        return data;
    }
    public static Wine getExcerpt (Wine data){
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy");
        try {
            String spillDate = data.getYear();
            Date parsingSpillDate = dateFormat.parse(spillDate);
            System.out.println(parsingSpillDate);
            Date date = new Date();
            System.out.println(date);
        } catch (ParseException e) {
            e.printStackTrace();
        }


        return data;
    }

}
