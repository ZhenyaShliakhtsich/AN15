package com.teachMeSkills.an15.LashkevichGeorgy.hw3;

import java.util.Scanner;

public class Math {
    double first;
    double second;
    String znak;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Vichislenie vichislenie = new Vichislenie();
        System.out.println("Введите первое число");
        double one = scanner.nextDouble();
        System.out.println("Введите второе число");
        double two = scanner.nextDouble();
        System.out.println("Введите знак");
        String zn = scanner.next();
        System.out.println("Результат вычисления :" + vichislenie.Vichislenie(one, two, zn));


        // write your code here
    }
}