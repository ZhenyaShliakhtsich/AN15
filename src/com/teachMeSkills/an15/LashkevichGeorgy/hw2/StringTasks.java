package com.teachMeSkills.an15.LashkevichGeorgy.hw2;

import java.util.Locale;

public class StringTasks {
    public static void main(String[] args) {
        String tellJava = "I like Java!!!";
        // 2 Распечатать последний символ строки. Используем метод String.charAt().
        System.out.println("Последний символ: " + tellJava.charAt(tellJava.length() - 1));
        // 3 Проверить, заканчивается ли ваша строка подстрокой “!!!”. Используем метод String.endsWith().
        System.out.println("Заканчивается ли на \"!!!\": " + tellJava.endsWith("!!!"));
        // 4 Проверить, начинается ли ваша строка подстрокой “I like”. Используем метод String.startsWith().
        System.out.println("Начитается ли на \"I like\": " + tellJava.startsWith("I like"));
        // 5 Проверить, содержит ли ваша строка подстроку “Java”. Используем метод String.contains().
        System.out.println("Содержит ли \"Java\": " + tellJava.contains("Java"));
        //6 Найти позицию подстроки “Java” в строке “I like Java!!!”.
        System.out.println("Позиция подстроки \"Java\": " + tellJava.indexOf("Java"));
        //7 Заменить все символы “а” на “о”.
        System.out.println("Замена а на о: " + tellJava.replace("a", "o"));
        // 8 Преобразуйте строку к верхнему регистру.
        System.out.println("Преобразование к верхнему регистру: " + tellJava.toUpperCase(Locale.ROOT));
        // 9 Преобразуйте строку к нижнему регистру.
        System.out.println(tellJava.toLowerCase(Locale.ROOT));
        //10 Вырезать строку Java c помощью метода String.substring().
        System.out.println("Вырезать строку \"Java\": " + tellJava.substring(0, tellJava.indexOf("Java")) + tellJava.substring(tellJava.lastIndexOf("a") + 1, tellJava.length()));
    }
}