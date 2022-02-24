package com.teachMeSkills.an15.NovikovVadim.hw2;

import java.util.Random;

public class Main {

    public static void main(String[] args) {

        System.out.println("Вывести отметки студентов");
        Student student1 = new Student("Иван", "Иванов", "математика", 1);
        Student student2 = new Student("Сергей", "Иванов", "физика", 2);
        Student student3 = new Student("Владимир", "Иванов", "химия", 3);
        Student student4 = new Student("Евгений", "Иванов", "география", 4);
        Student student5 = new Student("Елена", "Иванов", "математика", 5);
        Student student6 = new Student("Юлия", "Иванова", "ИЗО", 6);
        Student student7 = new Student("Максим", "Иванов", "физкультура", 7);
        Student student8 = new Student("Матвей", "Иванов", "литература", 8);
        Student student9 = new Student("Иван", "Иванов", "программирование", 9);
        Student student10 = new Student("Ирина", "Иванова", "иное", 10);

        System.out.println(student1);
        System.out.println(student2);
        System.out.println(student3);
        System.out.println(student4);
        System.out.println(student5);
        System.out.println(student6);
        System.out.println(student7);
        System.out.println(student8);
        System.out.println(student9);
        System.out.println(student10);

        //Необходимо, чтоб программа выводила на экран вот такую последовательность:
        //5 10 15 20 25 30 35 40 45 50 55 60 65 70 75 80 85 90 95 100
        //Использовать StringBuilde

        System.out.println("Вывести последовательность чисел: ");
        int i;
        StringBuilder stringBuilder = new StringBuilder();
        for (i = 5; i < 101; i = i + 5) {
            stringBuilder.append(i);
            stringBuilder.append(" ");
        }
        System.out.println(stringBuilder);

        //Есть 30 монет. Одна из них (рандомно заданная) является счастливой.
        //Найти в цикле счастливую. Если монета не счастливая,
        //выводить в консоль «надеюсь следующая будет счастливая + номер монеты».
        //Если дошли до счастливой, вывести «счастливая монета номер n найдена» и завершить цикл

        System.out.println("Найти счастливую монету:");
        Random random = new Random();
        int r = random.nextInt(30) + 1; //счастливая монета
        System.out.println(r);
        for (i = 1; i < 32; i++) {
            if (i == r) {
                System.out.println("Счастливая монета номер " + i + " найдена");
                break;
            } else {
                System.out.println("Надесь следующая будет счастливая " + i);
            }
        }

        //Вывести в цикле числа от 1 до 10.
        //Вывести в цикле числа от 10 до 0.
        System.out.println("Вывести в цикле числа от 1 до 10 и от 10 до 1");
        for (i = 1; i < 11; i++) {
            System.out.println("" + i + " " + (11 - i));
        }

        //Вывести в консоль таблицу умножения для числа 7.
        // Пример 7 * 1 = 7
        //7 * 2 = 14 и тд до 7 * 10 = 70
        System.out.println("Вывести в консоль таблицу умножения для числа 7");
        for (i = 0; i < 11; i++) {
            System.out.println("7 * " + i + " = " + 7 * i);
        }

    }

}
