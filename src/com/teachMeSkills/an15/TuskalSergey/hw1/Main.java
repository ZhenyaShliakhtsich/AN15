package com.teachMeSkills.an15.TuskalSergey.hw1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Задание 1");
        //1. Создать 3 целочисленные переменные и найти максимальное и минимальное значения.
        // Вывести их в консоль. Два варианта решения (1 - через if, 2 - через Math)
        System.out.print("Введите 3 числа: "); //Исправлено
        Scanner scan0 = new Scanner(System.in);
        int a = scan0.nextInt();
        int b = scan0.nextInt();
        int c = scan0.nextInt();

        System.out.println("Даны 3 числа: " + a + ", " + b + ", " + c);
        if (a > b) {
            if (a >= c) {
                System.out.println("Максимальное значение = " + a); // а если а == с, то почему выведем только а? Ответ: если а>c, то а - max; если a=c, то а и с - max. а - max в обоих случаях, с - только во втором, поэтому вывожу в консоль а.
            }}
        else if (b >= c) {
            System.out.println("Максимальное значение = " + b); // то же самое
        }
        else {
            System.out.println("Максимальное значение = " + c);
        }
        if (a < b) {
            if (a <= c) {
                System.out.println("Минимальное значение = " + a);
            }}
        else if (b <= c) {
            System.out.println("Минимальное значение = " + b);
        }
        else {
            System.out.println("Минимальное значение = " + c);
        }

        System.out.println("Задание 2");
        // 2. Пользователь вводит число от 1 до 100. Если введенное число равно 5, 10, 17, 47, 77, 93, 99,
        // то вывести в консоль, что пользователь выиграл. Если введено было любое другое, то проиграл.
        // Если было введено не из заданного диапазона, вывести ошибку.
        System.out.print("Введите любое целое число от 1 до 100: ");
        Scanner scan = new Scanner(System.in);
        int a1 = scan.nextInt();

        if (a1 < 1 || a1 > 100) {
            System.out.println("Ошибка");
        } else {
            switch (a1) {
                case 5:
                    System.out.println("Вы выиграли!!!");
                    break;
                case 10:
                    System.out.println("Вы выиграли!!!");
                    break;
                case 17:
                    System.out.println("Вы выиграли!!!");
                    break;
                case 47:
                    System.out.println("Вы выиграли!!!");
                    break;
                case 77:
                    System.out.println("Вы выиграли!!!");
                    break;
                case 93:
                    System.out.println("Вы выиграли!!!");
                    break;
                case 99:
                    System.out.println("Вы выиграли!!!");
                    break;
                default:
                    System.out.println("Вы проиграли.");
            }}

        //3. При запуске приложения в консоль выводится "какой сегодня день?" (от 1 до 30).
        // После того как пользователь вводит значение, значение должно сравниться с рандомно
        // сгенерированным значением. Если пользователь не угадал,
        // вывести в консоль "не угадал, (реальный день)".
        // Продолжить работу приложения сначала. Если пользователь угадал,
        // вывести в консоль "Угадал! Хорошего дня!" и завершить выполнение программы.
        System.out.println("Задание 3");
        System.out.print("Какой сегодня день?: ");
        Scanner scan1 = new Scanner(System.in);
        int a2 = scan1.nextInt();

        int min = 1;
        int max = 30;
        int random_number = min + (int) (Math.random() * max);

        while (a2 != random_number) {                                       //Исправлено
            System.out.println("Не угадал" + " (" + random_number + ")");
            System.out.print("Какой сегодня день?: ");
            Scanner scan2 = new Scanner(System.in);
            a2 = scan2.nextInt();
            if (a2 == random_number) {
                break;
            }
        }
        System.out.println("Угадал! Хорошего дня!");


        System.out.println("______________________");
        System.out.println("Задание про программистов, которое было на занятии (до 1000)");
        // В переменную записываете количество программистов. В
        //зависимости от количества программистов необходимо вывести правильно
        //окончание. Например:
        //• 2 программиста
        //• 1 программист
        //• 10 программистов
        System.out.print("Введите количество программистов: ");
        Scanner scan2 = new Scanner(System.in);
        int p1 = scan2.nextInt();

        int q = 10;

        if (p1 > 110) {
            q = 100;
        }

        int ostatok = p1 % q;

        if (ostatok > 20) {
            ostatok = ostatok % 10;
        }

        if (p1 > 4 && p1 < 21) {
            System.out.println(p1 + " программистов");
        } else if (ostatok == 1) {
            System.out.println(p1 + " программист");
        } else if (ostatok == 2 || ostatok == 3 || ostatok == 4) {
            System.out.println(p1 + " программиста");
        } else {
            System.out.println(p1 + " программистов");
        }
    }
}

// 1 задание зачем 3 сканнера

// ду вайл зачем

