package com.teachMeSkills.an15.BuzukArtyom.hw1;

import java.util.Locale;

public class StringTasks {
    public static void main(String[] args) {

    //    Задачи по String. Выполнить в 1 классе с названием StringTasks
//
// 1 Напишите параметр, который принимает строку, “I like Java!!!”.
//            2 Распечатать последний символ строки. Используем метод String.charAt().
//            3 Проверить, заканчивается ли ваша строка подстрокой “!!!”. Используем метод String.endsWith().
//            4 Проверить, начинается ли ваша строка подстрокой “I like”. Используем метод String.startsWith().
//            5 Проверить, содержит ли ваша строка подстроку “Java”. Используем метод String.contains().
//            6 Найти позицию подстроки “Java” в строке “I like Java!!!”.
//            7 Заменить все символы “а” на “о”.
//            8 Преобразуйте строку к верхнему регистру.
// 9 Преобразуйте строку к нижнему регистру.
// 10 Вырезать строку Java c помощью метода String.substring().
    String string = "I like Java!!!";
    System.out.println("1. " + string);

    System.out.println("2. " + "Последний символ " + string.substring(string.length()-1));

    System.out.println("3. " + "Строка заканчивается на !!! ? "+ string.endsWith("!!!"));

    System.out.println("4. " + "Строка начинается на I like ? " + string.startsWith("I like"));

    System.out.println("5. " + "В строке есть слово Java ? " + string.contains("Java"));

    int index = string.indexOf("Java");
        System.out.println("6. " + index);

    String zamena = string.replace('a','o');
        System.out.println("7. " + zamena);

        System.out.println("8. " + string.toUpperCase());

        System.out.println("9. " + string.toLowerCase());

        System.out.println("10. " + string.substring(0,index));













}
}
