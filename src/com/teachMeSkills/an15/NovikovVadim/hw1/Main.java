package com.teachMeSkills.an15.NovikovVadim.hw1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        //Задача по правописанию
        System.out.println("Введите количество программистов");
        int r = console.nextInt();
        int r_100 = r%100;
        int r_10 = r_100%10;

        if (r_100>4 && r_100<21) {
            System.out.println(r + " программистов");
        }else {
            if (r_10 == 1) {
                System.out.println(r + " программист");
            } else if (r_10 > 1 && r_10 < 5) {
                System.out.println(r + " программиста");
            } else {
                System.out.println(r + " программистов");
            }
        }
        System.out.println("");

        // максимальное и минимальное значение
        System.out.println("Введите 3 значения");
        int p1 = console.nextInt();
        int p2 = console.nextInt();
        int p3 = console.nextInt();
        System.out.println("максимальное значение: " + Math.max(Math.max(p1,p2),p3));
        System.out.println("минимальное значение: " + Math.min(Math.min(p1,p2),p3));

        System.out.println("");

        //Задача - найти число победителя
        System.out.println("Введите число для игры в лотерею");
        int t = console.nextInt();
        if (t>0 && t<100) {
            switch (t) {
                case 5:
                case 10:
                case 17:
                case 47:
                case 77:
                case 93:
                case 99:
                    System.out.println("Вы выйграли");
                    break;
                default:
                    System.out.println("Вы проиграли");
            }
        }else{
            System.out.println("Ошибка");
        }

        while (true) {
            short y_random = (short)(Math.random()*30+1);
            System.out.println("Введите день месяц от 1 до 30");
            int y = console.nextShort();
            if (y<1 || y > 30){
                System.out.println("Неверное число");
            }else if(y==y_random){
                System.out.println("Угадал! Хорошего дня!");
                break;
            }else{
                System.out.println("не угадал, " + y_random);
            }
        }
    }
}

// Почему Boolean.class а не примитив boolean
