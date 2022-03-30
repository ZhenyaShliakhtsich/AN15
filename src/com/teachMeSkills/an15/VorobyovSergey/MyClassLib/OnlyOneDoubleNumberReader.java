package com.teachMeSkills.an15.VorobyovSergey.MyClassLib;

import java.util.Scanner;

public class OnlyOneDoubleNumberReader {
    public double readNumberFromConsole() {
        double number;
        Scanner scanner = new Scanner(System.in);
        while (!scanner.hasNextDouble()) {
            scanner.nextLine();
            System.out.println("Все-таки попробуй ввести число");
        }
        number = scanner.nextDouble();
        return number;
    }
}
