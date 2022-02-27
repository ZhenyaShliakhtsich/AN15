package com.teachMeSkills.an15.LashkevichGeorgy.hw3;
//7. Создать программу, которая будет проверять,
// является ли слово из пяти букв, введённое пользователем, палиндромом (примеры: «комок», «ротор»)

import java.util.Scanner;


public class IsPoly {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите слово");
        String word = scanner.nextLine();

        if (word.charAt(0) == word.charAt(4) && word.charAt(1) == word.charAt(3)) {
            System.out.println("Слово " + word + " является полиндромом");
        } else System.out.println("Слово " + word + " не является полиндромом");
    }
}
