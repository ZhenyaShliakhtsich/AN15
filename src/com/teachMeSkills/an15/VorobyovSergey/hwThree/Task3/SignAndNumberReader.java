package com.teachMeSkills.an15.VorobyovSergey.hwThree.Task3;

import java.util.Scanner;

public class SignAndNumberReader {
    public double readNumber(String message) {
        double number;
        System.out.println(message);
        Scanner scanner = new Scanner(System.in);
        while (!scanner.hasNextDouble()) {
            scanner.nextLine();
            System.out.println("Все-таки попробуй ввести целое число");
        }
        number = scanner.nextDouble();
        return number;
    }

    public String readSign(String message) {
        String sign;
        System.out.println(message);
        Scanner scanner = new Scanner(System.in);
        while (true) {
            sign = scanner.nextLine();
            if (sign.equals("+") || sign.equals("-") || sign.equals("/") || sign.equals("*")) {
                return sign;
            } else System.out.println("Попробуй ввести знак + - / *, я знаю ты сможешь!!!");
        }
    }


}
