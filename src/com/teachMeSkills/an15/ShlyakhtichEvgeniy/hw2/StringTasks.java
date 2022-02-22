package com.teachMeSkills.an15.ShlyakhtichEvgeniy.hw2;

public class StringTasks {
    public static void main(String[] args){
        String string = "I like Java!!!";//Напишите параметр, который принимает строку, “I like Java!!!”.
        System.out.println(string.charAt(13));// Распечатать последний символ строки. Используем метод String.charAt().
        System.out.println(string.endsWith("!!!"))// Проверить, заканчивается ли ваша строка подстрокой “!!!”. Используем метод String.endsWith().
        System.out.println(string.startsWith("I like"))//Проверить, начинается ли ваша строка подстрокой “I like”. Используем метод String.startsWith().
        System.out.println(string.contains("Java"));//Проверить, содержит ли ваша строка подстроку “Java”. Используем метод String.contains()
        int a = string.indexOf("Java")//Найти позицию подстроки “Java” в строке “I like Java!!!
        int b = string.lastIndexOf("Java");
        System.out.println(a);//
        System.out.println(string.replace("а","о"));//Заменить все символы “а” на “о”
        System.out.println(string.toUpperCase());//Преобразуйте строку к верхнему регистру.
        System.out.println(string.toLowerCase());//Преобразуйте строку к нижнему регистру.
        System.out.println(string.substring(a , b));// Вырезать строку Java c помощью метода String.substring().
    }
}
