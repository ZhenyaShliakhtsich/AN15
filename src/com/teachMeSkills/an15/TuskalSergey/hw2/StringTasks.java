package com.teachMeSkills.an15.TuskalSergey.hw2;

public class StringTasks {

    public static void main(String[] args) {
//1 Напишите параметр, который принимает строку, “I like Java!!!”.
// 2 Распечатать последний символ строки. Используем метод String.charAt().
// 3 Проверить, заканчивается ли ваша строка подстрокой “!!!”. Используем метод String.endsWith().
// 4 Проверить, начинается ли ваша строка подстрокой “I like”. Используем метод String.startsWith().
// 5 Проверить, содержит ли ваша строка подстроку “Java”. Используем метод String.contains().
// 6 Найти позицию подстроки “Java” в строке “I like Java!!!”.
// 7 Заменить все символы “а” на “о”.
// 8 Преобразуйте строку к верхнему регистру.
// 9 Преобразуйте строку к нижнему регистру.
// 10 Вырезать строку Java c помощью метода String.substring().
        System.out.println("Task 1");

	String string = "I like Java!!!";
        System.out.println("1 - " + string);

    int last = string.length() - 1;
    System.out.println("2 - Последний символ строки = " + string.charAt(last));

    boolean endsWith = string.endsWith("!!!");
    if (endsWith == true) {
        System.out.println("3 - Строка заканчивается подстрокой !!!");
    }
    else System.out.println("3 - Строка не заканчивается подстрокой !!!");

    boolean startsWith = string.startsWith("I like");
    if (startsWith == true) {
        System.out.println("4 - Строка начинается подстрокой I like");
    }
    else System.out.println("4 - Строка не начинается подстрокой I like");

    boolean contains = string.contains("Java");
    if (contains == true) {
        System.out.println("5 - Строка содержит подстроку “Java”");
    } else System.out.println("5 - Строка не содержит подстроку “Java”");

    int index = string.indexOf("Java");
        System.out.println("6 - Позиция подстроки “Java” в строке “I like Java!!!” - " + index);

    String string1 = string.replace('a', 'o');
        System.out.println("7 - Замена в строке всех символов а на о: " + string1);

    String string2 = string.toUpperCase();
        System.out.println("8 - " + string2);

    String string3 = string.toLowerCase();
        System.out.println("9 - " + string3);

    String string4 = "Java";
        int index1 = string.indexOf(string4);
        String string5 = string.substring(index1, index1 + string4.length());
        System.out.println("10 - " + string5);
    }
}
