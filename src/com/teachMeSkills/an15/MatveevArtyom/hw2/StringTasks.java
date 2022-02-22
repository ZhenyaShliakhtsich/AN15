package com.teachMeSkills.an15.MatveevArtyom.hw2;

public class StringTasks {
    public static void main(String[] args) {
        //1 Напишите параметр, который принимает строку, “I like Java!!!”.
        String string = "I like Java!!!";
        //2 Распечатать последний символ строки. Используем метод String.charAt().
        System.out.println(string.charAt(string.length()-1));
        //3 Проверить, заканчивается ли ваша строка подстрокой “!!!”. Используем метод String.endsWith().
        if(string.endsWith("!!!")){
            System.out.println("строка заканчивается подстрокой !!!");
        }
        else System.out.println("строка не заканчивается подстрокой !!!");
        //4 Проверить, начинается ли ваша строка подстрокой “I like”. Используем метод String.startsWith().
        if(string.startsWith("I like")){
            System.out.println("строка начинается подстрокой I like ");
        }
        else System.out.println("строка не начинается подстрокой I like");
        // 5 Проверить, содержит ли ваша строка подстроку “Java”. Используем метод String.contains().
        if(string.contains("Java")){
            System.out.println("строка содержит подстроку Java");
        }
        else System.out.println("строка не содержит подстроку Java");
        //6 Найти позицию подстроки “Java” в строке “I like Java!!!”.
        System.out.println("Позиция подстроки Java равна " + string.indexOf("Java"));
        //7 Заменить все символы “а” на “о”.
        System.out.println(string.replace('a','o'));
        //8 Преобразуйте строку к верхнему регистру.
        System.out.println(string.toUpperCase());
        //9 Преобразуйте строку к нижнему регистру.
        System.out.println(string.toLowerCase());
        //10 Вырезать строку Java c помощью метода String.substring().
        System.out.println(string.substring(7,11));
    }
}
