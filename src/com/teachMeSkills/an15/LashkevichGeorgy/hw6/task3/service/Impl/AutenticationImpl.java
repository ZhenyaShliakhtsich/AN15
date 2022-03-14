package com.teachMeSkills.an15.LashkevichGeorgy.hw6.task3.service.Impl;

import com.teachMeSkills.an15.LashkevichGeorgy.hw6.task3.classes.User;
import com.teachMeSkills.an15.LashkevichGeorgy.hw6.task3.service.AuthenticationService;

import java.util.Scanner;

public class AutenticationImpl implements AuthenticationService {
    @Override
    public void authentication(User user) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите логин:");
        String login = scanner.nextLine();
        System.out.println("Введите пароль:");
        String pass = scanner.nextLine();
        if (user.getLogin().equals(login) && user.getPassword().equals(pass)){
            System.out.println("Аутентификация пользователя прошла успешно");
        } else System.out.println("Введн неверный логин или пароль");
    }
}
