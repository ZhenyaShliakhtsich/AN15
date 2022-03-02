package com.teachMeSkills.an15.TuskalSergey.hw4;

import java.util.Scanner;

public class LoginAndPassword {
    String login;
    String password;
    String confirmPassword;

    public LoginAndPassword() {

    }

    public static String inputLoginAndPassword() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите логин: ");
        String login = scanner.next("[a-zA-Z_0-9]*");
        System.out.println("Введите пароль: ");
        String password = scanner.nextLine();
        System.out.println("Подтвердите пароль: ");
        String confirmPassword = scanner.nextLine();
        scanner.close();
        return login;
    }
}

