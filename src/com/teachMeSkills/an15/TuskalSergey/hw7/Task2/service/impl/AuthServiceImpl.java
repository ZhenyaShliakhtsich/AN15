package com.teachMeSkills.an15.TuskalSergey.hw7.Task2.service.impl;

import com.teachMeSkills.an15.TuskalSergey.hw7.Task2.model.User;
import com.teachMeSkills.an15.TuskalSergey.hw7.Task2.service.AuthService;

import java.util.HashMap;
import java.util.Scanner;

import static com.teachMeSkills.an15.TuskalSergey.hw7.Task2.Database.USERS;

public class AuthServiceImpl implements AuthService {

    private Scanner scanner = new Scanner(System.in);
    User user = null;

    @Override
    public User login() {
        System.out.println("Введите логин:");
        String login = scanner.nextLine();
        System.out.println("Введите пароль:");
        String password = scanner.nextLine();
        User enteredUser = new User(login, password);
        if (USERS.containsKey(enteredUser.getLogin()) &&
                USERS.get(enteredUser.getLogin()).getPassword().equals(enteredUser.getPassword())) {
            if (USERS.get(enteredUser.getLogin()).isHasAdminRole()) {
                System.out.println("Вы авторизированы как администратор");
            } else {
                System.out.println("Вы авторизированы как пользователь");
            }
            user = USERS.get(enteredUser.getLogin());
        } else {
            System.out.println("Логин или пароль неверные");
            login();
        }
        return user;
    }

    @Override
    public void registration(HashMap<String, User> users) {
        System.out.println("Введите логин:");
        String login = scanner.nextLine();
        if (users.containsKey(login)) {
            System.out.println("Пользователь с таким логином уже существует. Придумайте другой логин.");
            registration(users);
        } else {
            System.out.println("Введите пароль:");
            String password = scanner.nextLine();

            User user = new User(login, password);
            users.put(login, user);
            System.out.println("Вы зарегистрированы! Авторизируйтесь!");
        }
    }
}
