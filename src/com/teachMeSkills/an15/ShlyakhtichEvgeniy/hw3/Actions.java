package com.teachMeSkills.an15.ShlyakhtichEvgeniy.hw3;

import java.util.Scanner;

public class Actions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);//Задание 3
        System.out.println("Введите два числа");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        String st = "Выберите одно из действий:\n1:Cложение\n2:Вычитание\n3:Умножене\n4:Деление";
        System.out.println(st);
        String st2 = sc.next();
        if (st2.contains("1") || st2.contains("Сложение")) {
            System.out.println(add(a, b));
            ;
        }
        if (st2.contains("2") || st2.contains("Вычитание")) {
            System.out.println(sub(a, b));
            ;
        }
        if (st2.contains("3") || st2.contains("Умножене")) {
            System.out.println(mult(a, b));
            ;
        }
        if (st2.contains("4") || st2.contains("Деление")) {
            System.out.println(div(a, b));
            ;
        }
    }

    public static double add(double a, double b) {
        return a + b;
    }

    public static double sub(double a, double b) {
        return a - b;
    }

    public static double mult(double a, double b) {
        return a * b;
    }

    public static double div(double a, double b) {
        return a / b;
    }
}
