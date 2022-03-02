package com.teachMeSkills.an15.BuzukArtyom.hw4.Zadacha4;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
//        Определить класс Coder, хранящий такую информацию о программисте:
//ФИО,
//дата рождения,
//должность,
//зарплата,
//телефон.
//Методы takeVacation(), returnBack().
//Разработать программу, в которой создается массив объектов данного класса.
//Перегрузить методы takeVacation(), returnBack():
//- takeVacation, который будет принимать количество взятых дней. Выводит на консоль сообщение "Петров В. В. взял отпуск на 21 день".
//- takeVacation, который будет принимать переменное количество названий планируемых к посещению мест.
// Выводит на консоль сообщение "Петров В. В. взял отпуск, чтобы посетить: Грузию, Армению, Китай".
//- takeVacation, который будет принимать переменное количество объектов класса Country (создать новый класс, содержащий название и и столицу). Выводит на консоль сообщение "Петров В. В. взял отпуск, чтобы посетить: в Грузии - Тбилиси, Армении - Ереван, Китае - Пекин".
// Аналогичным образом перегрузить метод returnBack(). Выводит на консоль сообщение "Петров В. В. вернул из отпуска." и тд.
        Coder coder1 = new Coder("Иванов И.И. ", "10.02.1994", "Программист JavaScript", 2000, 293456789);
        Coder coder2 = new Coder("Петров П.П. ", "15.12.1990", "HTML-верстальщик", 1800, 293454869);
        Coder coder3 = new Coder("Сергеев А.И. ", "23.05.1998", "Программист PHP", 2000, 248626789);
        Coder[] coders = {coder1, coder2, coder3};

        coder1.takeVacation(12);
        coder2.takeVacation(24);
        coder3.takeVacation(22);

        coder1.takeVacation("Грузию", "Армению", "Китай");
        coder2.takeVacation("Грузию", "Россию");
        coder3.takeVacation("Беларусь");

        Country country1 = new Country("Грузии", "Тбилиси");
        Country country2 = new Country("Армении", "Ереван");
        Country country3 = new Country("Китае", "Пекин");

        System.out.println(coder1.fio + "взял отпуск, чтобы посетить в: " + country1.country + " - " + country1.capital + ", " + country2.country + " - " + country2.capital + ", " + country3.country + " - " + country3.capital);
        coder1.returnBack(10);
        coder2.returnBack("Россия", "Беларусь");
    }
}
