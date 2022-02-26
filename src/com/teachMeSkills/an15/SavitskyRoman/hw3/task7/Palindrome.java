package com.teachMeSkills.an15.SavitskyRoman.hw3.task7;


import java.util.InputMismatchException;
import java.util.Scanner;

public class Palindrome {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите проверяемое слово на палиндром:");
        try {
            String getString = sc.next(".{5}");
            StringBuilder stringBuilder = new StringBuilder(getString).reverse();
            System.out.println("Является ли слово " + getString + " палиндромом: " + getString.equals(stringBuilder.toString()));
        } catch (InputMismatchException e) {
            System.out.println("Следовало вводить слово из 5 букв");
        }
        sc.close();
    }
}
