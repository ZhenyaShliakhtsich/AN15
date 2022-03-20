package com.teachMeSkills.an15.TuskalSergey.hw6.Task3.service.impl;

import Task3.User;
import Task3.service.AuthenticationService;

import java.util.Scanner;

public class AuthenticationServiceImpl implements AuthenticationService {
    @Override
    public void userAuthentication(User user) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i <= 0;) {
            System.out.println("Введите логин:");
            String inputLogin = scanner.nextLine();
            if (inputLogin.equals(user.getLogin())) {
                i++;
                for (int i1 = 0; i1 <=0; ) {
                    System.out.println("Введите пароль:");
                    String inputPassword = scanner.nextLine();
                    if (inputPassword.equals(user.getPassword())) {
                        System.out.println("Вход выполнен");
                        i1++;
                    } else System.out.println("Неверный пароль");
                }
            } else System.out.println("Пользователя с таким логином не существует");
        }
    }
}
