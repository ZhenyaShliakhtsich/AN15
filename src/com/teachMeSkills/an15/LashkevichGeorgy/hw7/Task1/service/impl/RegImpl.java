package com.teachMeSkills.an15.LashkevichGeorgy.hw7.Task1.service.impl;

import com.teachMeSkills.an15.LashkevichGeorgy.hw7.Task1.models.UserReg;
import com.teachMeSkills.an15.LashkevichGeorgy.hw7.Task1.service.RegService;

import java.util.Scanner;

public class RegImpl implements RegService {
    @Override
    public UserReg newUser() {
        System.out.println("Регистрация нового пользователя");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ведите имя: ");
        String name = scanner.nextLine();
        System.out.println("Введите фамилию: ");
        String secondName = scanner.nextLine();
        System.out.println("Введите логин: ");
        String login = scanner.nextLine();
        System.out.println("Введите email: ");
        String email = scanner.nextLine();
        System.out.println("Введите пароль: ");
        String pass = scanner.nextLine();
        System.out.println("Введите пароль повторно: ");
        String passCheck = scanner.nextLine();
        UserReg userReg = null;
        if (name != null && login != null && pass != null && !login.equals("") && pass.equals(passCheck)) {
            System.out.println("Регистрация прошла успешно!");
            userReg = new UserReg();
            userReg.setLogin(login);
            userReg.setPassword(pass);
            userReg.setName(name);
            userReg.setSecondName(secondName);
            userReg.setEmail(email);
        } else {
            System.out.println("Введены некорректные данные. Попробуйте зарегестрироваться заново.");
            newUser();
        }
        return userReg;
    }
}
