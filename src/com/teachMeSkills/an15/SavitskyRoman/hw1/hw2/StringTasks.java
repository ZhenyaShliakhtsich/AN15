package com.teachMeSkills.an15.SavitskyRoman.hw1.hw2;

import java.util.Locale;
/* Задачи по String. Выполнить в 1 классе с названием StringTasks
 1 Напишите параметр, который принимает строку, “I like Java!!!”.
 2 Распечатать последний символ строки. Используем метод String.charAt().
 3 Проверить, заканчивается ли ваша строка подстрокой “!!!”. Используем метод String.endsWith().
 4 Проверить, начинается ли ваша строка подстрокой “I like”. Используем метод String.startsWith().
 5 Проверить, содержит ли ваша строка подстроку “Java”. Используем метод String.contains().
 6 Найти позицию подстроки “Java” в строке “I like Java!!!”.
 7 Заменить все символы “а” на “о”.
 8 Преобразуйте строку к верхнему регистру.
 9 Преобразуйте строку к нижнему регистру.
 10 Вырезать строку Java c помощью метода String.substring().
String string = “I like Java!!!”;
Все задачи выполняются так string.(методы для всех заданий)*/
public class StringTasks {
public static void main(String[] args){
    String string = "I like Java!!!";
    System.out.println("Последний символ строки: " + string.charAt(12));
    System.out.println("Строка заканчивается на \"!!!\"? " + string.endsWith("!!!"));
    System.out.println("Строка начинается на \"I like\"? " + string.startsWith("I like"));
    System.out.println("Строка содержит подстроку \"Java\"? " + string.contains("Java"));
    System.out.println("Заменили все символы в строке с \"а\" на \"о\": " + string.replace('a','o'));
    System.out.println("Преобразовали строку к верхнему регистру: " + string.toUpperCase(Locale.ROOT));
    System.out.println("Преобразовали строку к нижнему регистру: " + string.toLowerCase(Locale.ROOT));
    System.out.println("Вырезали из строки: " + string.substring(7, 11)); //
    }
}
