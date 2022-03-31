package com.teachMeSkills.an15.TuskalSergey.hw7.Task2.service.impl;

import com.teachMeSkills.an15.TuskalSergey.hw7.Task2.model.User;
import com.teachMeSkills.an15.TuskalSergey.hw7.Task2.service.AuthService;

import java.util.HashMap;
import java.util.Scanner;

public class AuthServiceImpl implements AuthService {

    @Override
    public User login(HashMap<String, User> users, HashMap<String, User> currentUser) {
        System.out.println("Введите логин:");
        Scanner scanner = new Scanner(System.in);
        String login = scanner.nextLine();
        System.out.println("Введите пароль:");
        String password = scanner.nextLine();
        User user = new User();
        if (users.containsKey(login) &&
                users.get(login).getPassword().equals(password)) {
            user.setLogin(login);
            user.setPassword(password);
            if (users.get(user.getLogin()).isHasAdminRole()) {
                System.out.println("Вы авторизированы как администратор");
            } else {
                System.out.println("Вы авторизированы как пользователь");
            }
            currentUser.put("currentUser", users.get(login));
        } else {
            System.out.println("Логин или пароль неверные");
            login(users, currentUser);
        }
        return null;
    }

    @Override
    public void registration(HashMap<String, User> users) {
        System.out.println("Введите логин:");
        Scanner scanner = new Scanner(System.in);
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
