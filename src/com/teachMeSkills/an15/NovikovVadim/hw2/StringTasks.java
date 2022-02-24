package com.teachMeSkills.an15.NovikovVadim.hw2;

import java.util.Locale;

public class StringTasks {
    //    Задачи по String. Выполнить в 1 классе с названием StringTasks
//
//        1 Напишите параметр, который принимает строку, “I like Java!!!”.
//        2 Распечатать последний символ строки. Используем метод String.charAt().
//        3 Проверить, заканчивается ли ваша строка подстрокой “!!!”. Используем метод String.endsWith().
//        4 Проверить, начинается ли ваша строка подстрокой “I like”. Используем метод String.startsWith().
//        5 Проверить, содержит ли ваша строка подстроку “Java”. Используем метод String.contains().
//        6 Найти позицию подстроки “Java” в строке “I like Java!!!”.
//        7 Заменить все символы “а” на “о”.
//        8 Преобразуйте строку к верхнему регистру.
//        9 Преобразуйте строку к нижнему регистру.
//        10 Вырезать строку Java c помощью метода String.substring().
    public static void main(String[] args) {
        String param = "I like Java!!!";
        System.out.println("Исходная строка: " + param);
        System.out.println("Последний символ: " + param.charAt(param.length() - 1));
        System.out.println("Последний символ строки: " + param.charAt(param.length() - 1));
        System.out.println("Проверка на окончание строки !!! - " + param.endsWith("!!!"));
        System.out.println("Проверкить, начинается ли строка подстрокой 'I like' - " + param.startsWith("I like"));
        System.out.println("Проверить, содержит ли строка подстроку 'Java' - " + param.contains("Java"));
        int indexJava = param.indexOf("Java");
        System.out.println(indexJava);
        String param2 = param.replace('a', 'o');
        System.out.println("Заменить все символы 'а' на 'о' - " + param2);
        System.out.println(param.toUpperCase(Locale.ROOT));
        System.out.println(param.toLowerCase(Locale.ROOT));
        System.out.println("Найти подстроку 'Java' " + param.substring(indexJava, indexJava + "Java".length()));


    }

}
