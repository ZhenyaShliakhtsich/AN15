package com.teachMeSkills.an15.BuzukArtyom.hw3;

import java.util.Scanner;

public class Zadacha7 {
    public static void main(String[] args) {
//         Создать программу, которая будет проверять, является ли слово из пяти букв,
//         введённое пользователем, палиндромом (примеры: «комок», «ротор»).
        System.out.println("Введите слово из 5 букв: ");
        Scanner scanner = new Scanner(System.in);
        String string;
        string = scanner.nextLine().toLowerCase();
        if (string.length() == 5) {
            if (string.charAt(0) == string.charAt(4) && string.charAt(1) == string.charAt(3)){
                System.out.println("Слово палиндромом ");
            } else {
                System.out.println("Слово не палиндром ");
            }
        } else {
            System.out.println("Не правильное слово");
        }
    }
}
