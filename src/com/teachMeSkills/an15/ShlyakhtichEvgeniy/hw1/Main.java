package com.teachMeSkills.an15.ShlyakhtichEvgeniy.hw1;

import java.util.Scanner;

import static java.lang.Math.max;
import static java.lang.Math.min;
import java.util.concurrent.ThreadLocalRandom;

public class Main {

    public static void main(String[] args) {
        // write your code here

        int a = 17; // а если здесь будет 10?
        int b = 23;
        int c = 13;
        int max = 0;
        int min = 0;
        if (a > b && a > c) {
            max = a;
            if (b > c) {
                min = c;
            }
        } else if (b > c) {
            max = b;
            min = c;
        } else if (a > b) {
            max = c;
            min = b;
        } else {
            min = a;
            max = c;
        }
        System.out.println("Максимальное = " + max + " Минимальное = " + min);

        max = max(a, b);
        max = max(max, c);
        min = min(a, b);
        min = min(min, c);

        System.out.println("Максимальное = " + max + " Минимальное = " + min);
        System.out.println("--------------------------");

        Scanner sc = new Scanner(System.in);

        System.out.println("Введите число от 1 до 100");
        int num = sc.nextInt();
        if (num < 1 || num > 100) {
            System.out.println("Ошибка");
            System.exit(0);
        }

        switch (num) {
            case 5:
                System.out.println("Вы выиграли");
                break;
            case 10:
                System.out.println("Вы выиграли");
                break;
            case 17:
                System.out.println("Вы выиграли");
                break;
            case 47:
                System.out.println("Вы выиграли");
                break;
            case 77:
                System.out.println("Вы выиграли");
                break;
            case 93:
                System.out.println("Вы выиграли");
                break;
            case 99:
                System.out.println("Вы выиграли");
                break;
            default:
                System.out.println("Вы проиграли");
        }


        System.out.println("----------------");

        int a1 = 0;
        while (a1 == 0) {
            int day2 = ThreadLocalRandom.current().nextInt(1, 31);
            System.out.println("Какой сегодня день?");
            int day1 = sc.nextInt();
            if (day1 == day2) {
                System.out.println("Угадал! Хорошего дня!");
                a1 = 1;
            } else {
                System.out.println("Не угадал," + day2);
            }
        }

        System.out.println("---------------------");



        int programm = ThreadLocalRandom.current().nextInt(1, 1000);
        int a2 = programm / 100;
        int a3 = a2 % 10;
        if(a2 > 4 && a2 < 21) {
            System.out.println(programm + "программистов");
        }else if(a3 == 1){
            System.out.println(programm + "программист");
        }else if (a3 == 2 || a3 == 3 || a3 == 4){
            System.out.println(programm + "программиста");
        }else {
            System.out.println(programm + "программистов");
        }


    }
}
// System.exit(0); не оч правильное решение
//ThreadLocalRandom.current().nextInt(1, 31); где взял?