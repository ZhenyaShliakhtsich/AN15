package com.teachMeSkills.an15.VorobyovSergey.hwThree;

import java.util.Scanner;

public class ReaderHw3 {
    public int readPleas(String message) {
        int number;
        System.out.println(message);
        Scanner scanner = new Scanner(System.in);
        while (!scanner.hasNextInt()) {
            scanner.nextLine();
            System.out.println("Все-таки попробуй ввести целое число");
        }
        number = scanner.nextInt();
        return Math.abs(number);
    }
}
