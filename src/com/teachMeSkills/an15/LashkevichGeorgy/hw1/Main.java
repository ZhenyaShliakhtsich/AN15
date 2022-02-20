package com.teachMeSkills.an15.LashkevichGeorgy.hw1;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        // Задача №1
        int num1 = 123, num2 = 346, num3 = 546;
        // через if
        if (num1 > num2 && num1 > num3) {
            System.out.println("max через if:  " + num1);
        } else if (num2 > num1 && num2 > num3) {
            System.out.println("max через if:  " + num2);
        } else if (num3 > num1 && num3 > num2) {
            System.out.println("max через if:  " + num3);
        }
        if (num1 < num2 && num1 < num3) {
            System.out.println("min через if:  " + num1);
        } else if (num2 < num1 && num2 < num3) {
            System.out.println("min через if:  " + num2);
        } else if (num3 < num1 && num3 < num2) {
            System.out.println("min через if:  " + num3);
        }
        System.out.println("-----------------");
        // через Math
        int preMax = Math.max(num1, num2);
        int preMin = Math.min(num1, num2);
        System.out.println("Максимум из трех чисел через Math: " + Math.max(preMax, num3));
        System.out.println("Минимум из трех чисел через Math: " + Math.min(preMin, num3));

        System.out.println("-----------------");
        // Задача №2
        Scanner scan = new Scanner(System.in);
        int num10 = scan.nextInt();
        if (num10 < 1 || num10 > 100) {
            System.out.println("Ошибка");
        } else if (num10 == 5 || num10 == 10 || num10 == 17 || num10 == 47 || num10 == 93 || num10 == 99) {
            System.out.println("Пользователь выиграл");
        } else {
            System.out.println("Пользователь проиграл");
        }

        System.out.println("-------------------");
        // Задача №3

        System.out.println("Какой сегодня день?");
        Scanner scanner = new Scanner(System.in);

        int min = 0, max = 30;
        int rand = min + (int) (Math.random() * max);
        while (true) {
            int number = scanner.nextInt();
            if (number == rand) {
                System.out.println("Угадал! Хорошего дня!");
                break;
            } else {
                System.out.println("Не угадал, " + rand);
            }
        }

    }
}


//Зачем 2 сканнера 31 и 51 стр