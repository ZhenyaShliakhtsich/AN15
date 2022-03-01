package com.teachMeSkills.an15.classes.class4;

import java.util.InputMismatchException;
import java.util.Scanner;

public class User {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println(getInt(scanner));
    }

    static int getInt(Scanner scanner) {

        try {
            return scanner.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Введите число, а не слова!");
            return getInt(scanner);
        } finally {
            scanner.close();
            System.out.println("Я закрылся");
        }
    }
}
