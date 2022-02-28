package com.teachMeSkills.an15.PilyushinYuri.hw1;

import java.util.Scanner;

public class Task2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите число: ");
        int num = input.nextInt();
        if (num == 5 || num == 10 || num == 17 || num == 47 || num == 77 || num == 93 || num == 99) {
            System.out.println("Вы выйграли!");
        } else if (num < 100) {
            System.out.println("Вы проиграли.");
        } else if (num > 100) {
            System.out.println("Ошибка диапазона.");
        }
    }
}

// почему | одна вертикальная (Исправил)