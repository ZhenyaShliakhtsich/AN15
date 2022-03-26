package com.teachMeSkills.an15.PilyushinYuri.hw8.task2.service.impl;

import com.teachMeSkills.an15.PilyushinYuri.hw8.task2.model.User;
import com.teachMeSkills.an15.PilyushinYuri.hw8.task2.service.AuthService;

import java.util.HashMap;
import java.util.Scanner;

public class AuthServiceImpl implements AuthService {
    @Override
    public User login(HashMap<User, User> users) {
        System.out.println("Введите логин:");
        Scanner scanner = new Scanner(System.in);
        String login = scanner.nextLine();
        System.out.println("Введите пароль:");
        String password = scanner.nextLine();

        User enteredUser = new User(login, password);
        if (users.containsKey(enteredUser)) {
            System.out.println("Ты авторизирован");
            return users.get(enteredUser);
        } else {
            System.out.println("Логин или пароль неверные");
            login(users);
        }
        return null;
    }

    @Override
    public void registration(HashMap<User, User> users) {
        System.out.println("Введите логин:");
        Scanner scanner = new Scanner(System.in);
        String login = scanner.nextLine();
        System.out.println("Введите пароль:");
        String password = scanner.nextLine();

        User user = new User(login, password);
        users.put(user, user);
        System.out.println("Ты зарегистрирован! Авторизируйся!");
        login(users);

    }
}
