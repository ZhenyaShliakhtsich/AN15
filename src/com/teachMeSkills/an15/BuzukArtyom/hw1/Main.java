package com.teachMeSkills.an15.BuzukArtyom.hw1;

import java.util.Scanner;

public class Main<random> {


    public static void main(String[] args) {
        // 1. Создать 3 целочисленные переменные и найти максимальное и минимальное значения.
        // Вывести их в консоль. Два варианта решения (1 - через if, 2 - через Math)
        Scanner in = new Scanner(System.in);
        System.out.print("Введите первое целое число: ");
        int num1 = in.nextInt();
        System.out.print("Введите второе целое число: ");
        int num2 = in.nextInt();
        System.out.print("Введите третье целое число: ");
        int num3 = in.nextInt();
        // Через if
        if (num1 <= num2 && num1 <= num3) {
            System.out.println("Минимальное число " + num1);
        } else if (num2 <= num1 && num2 <= num3) {
            System.out.println("Минимальное число " + num2);
        } else if (num3 <= num1 && num3 <= num2) {
            System.out.println("Минимальное число " + num3);
        }
        if (num1 >= num2 && num1 >= num3) {
            System.out.println("Максимальное число " + num1);
        } else if (num2 >= num1 && num2 >= num3) {
            System.out.println("Максимальное число " + num2);
        } else if (num3 >= num1 && num3 >= num2) {
            System.out.println("Максимальное число " + num3);
        }
        System.out.println("-------------------------------------");

        //через math
        int num4 = Math.min(num1, num2);
        int num5 = Math.max(num1, num2);
        System.out.println("Минимальное число через math " + Math.min(num4, num3));
        System.out.println("Максимальное число через math " + Math.max(num5, num3));

        System.out.println("-------------------------------------");

        //2. Пользователь вводит число от 1 до 100.
        // Если введенное число равно 5, 10, 17, 47, 77, 93, 99,
        // то вывести в консоль, что вы пользователь выиграл.
        // Если введено было любое другое, то проиграл.
        // Если было введено не из заданного диапазона, вывести ошибку

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число от 0 до 100");
        int chislo = scanner.nextInt();
        if (chislo < 0 || chislo > 100) {
            System.out.println("Ошибка!!! Ваше Число " + chislo);
        } else if (chislo == 5 || chislo == 10 || chislo == 17 || chislo == 47 || chislo == 77 || chislo == 93 || chislo == 99) {
            System.out.println("Вы выйграли!!! " + "Выйгрышное число " + chislo);
        } else {
            System.out.println("Вы проиграли");
        }
        System.out.println("---------------------------");

        // При запуске приложения в консоль выводится "какой сегодня день?" (от 1 до 30).
        // После того как пользователь вводит значение,
        // значение должно сравниться с рандомно сгенерированным значением.
        // Если пользователь не угадал, вывести в консоль "не угадал, (реальный день)".
        // Продолжить работу приложения сначала.
        // Если пользователь угадал, вывести в консоль "Угадал! Хорошего дня!" и завершить выполнение программы.

        Scanner scanner1 = new Scanner(System.in);
        int min = 1;
        int max = 30;
        int day;
        int random;
        do {
            System.out.println("Какое сегодня число: ");
            day = scanner.nextInt();
            random = (int) (min + (Math.random() * (max - min) + 1));
            if (day!=random)
            { System.out.println("Не угадал!!! Сегодня " + random + " число ");
                System.out.println("Попробуй ещё раз");}
        } while (day != random);
        {
            System.out.println("Угадал! Хорошего дня! " + "Реальный день: " + random);
        }
    }
}


// зачем еще один сканнер? 68 стр
// почему ду-вайл