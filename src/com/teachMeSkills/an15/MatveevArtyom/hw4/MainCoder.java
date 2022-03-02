package com.teachMeSkills.an15.MatveevArtyom.hw4;

import java.util.Scanner;

public class MainCoder {
    public static void main(String[] args) {
        Coder[] coders = new Coder[5];
        Coder coder = new Coder("Матвеев А.К");
        coders[0] = coder;
        coders[0].takeVacation(21);
        coders[0].takeVacation(21,"Тбилиси", "Афганистан", "Чехию");
        Country country = new Country("Франция", "Париж");
        Country country1 = new Country("Германия", "Берлин");
        coders[0].takeVacation(country, country1);
        coders[0].returnBack(21);
        coders[0].returnBack(21, "Тбилиси", "Афганистан", "Чехию");
        coders[0].returnBack(country,country1);
    }
}
