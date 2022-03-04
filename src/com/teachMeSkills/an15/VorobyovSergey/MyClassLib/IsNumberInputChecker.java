package com.teachMeSkills.an15.VorobyovSergey.MyClassLib;

import java.util.Scanner;

public class IsNumberInputChecker {

    public int readIntNumber() {
        int number;
        Scanner scanner = new Scanner(System.in);
        while (!scanner.hasNextInt()) {
            scanner.nextLine();
            System.out.println("Все-таки попробуй ввести число");
        }
        number = scanner.nextInt();
        return number;
    }

    public int readIntNumber(String message) {
        int number;
        System.out.println(message);
        Scanner scanner = new Scanner(System.in);
        while (!scanner.hasNextInt()) {
            scanner.nextLine();
            System.out.println("Все-таки попробуй ввести число");
        }
        number = scanner.nextInt();
        return number;
    }
}
