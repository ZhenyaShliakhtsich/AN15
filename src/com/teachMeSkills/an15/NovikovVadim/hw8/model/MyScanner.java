package com.teachMeSkills.an15.NovikovVadim.hw8.model;

import java.math.BigDecimal;
import java.util.Scanner;

public class MyScanner {

    public String getStringFromScanner() {
        Scanner scanner = new Scanner(System.in);
        try {
            String result = scanner.nextLine();
            return result;
        } catch (Exception e) {
            System.out.println("Некорректная команда, повторите ввод");
            return getStringFromScanner();
        }
    }

    public String getTextFromScanner(String message) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(message);
        String text = scanner.nextLine();

        if (text == null || text.isEmpty()) {
            System.out.println("Пустая строка, повторите ввод.");
            return getTextFromScanner(message);
        }
        return text;
    }

    public int getIntFromScanner() {
        Scanner scanner = new Scanner(System.in);
        try {
            int result = scanner.nextInt();
            return result;
        } catch (Exception e) {
            System.out.println("Некорректная команда, повторите ввод");
            return getIntFromScanner();
        }
    }

    public BigDecimal getBigDecimalFromScanner() {
        Scanner scanner = new Scanner(System.in);
        try {
            String str = scanner.nextBigDecimal().toString();
            BigDecimal result = new BigDecimal(str).setScale(2, BigDecimal.ROUND_HALF_UP);
            return result;
        } catch (Exception e) {
            System.out.println("Некорректная команда, повторите ввод");
            return getBigDecimalFromScanner();
        }
    }
}
