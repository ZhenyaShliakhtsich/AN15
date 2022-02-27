package com.teachMeSkills.an15.BuzukArtyom.hw3;

import java.util.Scanner;

public class Zadacha3 {
    public static void main(String[] args) {
//        3. Пользователь вводит два числа.
//        После этого в консоль выводятся действия, которые мы можем произвести с этими числами
//        (умножение, деление, сложение, вычитание).
//        Пользователь выбирает одно из действий. С помощью метода выполняем это действие и выводим результат в консоль.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите 1-е число: ");
        int x = scanner.nextInt();
        System.out.println("Введите 2-е число: ");
        int y = scanner.nextInt();
        System.out.println("Введите номер действия: 1.умножение, 2.деление, 3.сложение, 4. вычитание");
        int action = scanner.nextInt();
        Reshenie reshenie = new Reshenie(x, y, action);
        System.out.println(reshenie.Result());

    }
}
