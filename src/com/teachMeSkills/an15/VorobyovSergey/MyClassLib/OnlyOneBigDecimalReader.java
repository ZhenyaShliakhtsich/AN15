package com.teachMeSkills.an15.VorobyovSergey.MyClassLib;

import java.math.BigDecimal;
import java.util.Scanner;

public class OnlyOneBigDecimalReader {
    public BigDecimal readNumberFromConsole() {
        BigDecimal number;
        Scanner scanner = new Scanner(System.in);
        while (!scanner.hasNextBigDecimal()) {
            scanner.nextLine();
            System.out.println("Все-таки попробуй ввести число");
        }
        number = scanner.nextBigDecimal();
        return number;
    }
}
