package com.teachMeSkills.an15.PilyushinYuri.hw8.task2.service.impl;

import com.teachMeSkills.an15.PilyushinYuri.hw8.task2.model.Basket;
import com.teachMeSkills.an15.PilyushinYuri.hw8.task2.model.User;
import com.teachMeSkills.an15.PilyushinYuri.hw8.task2.service.AuthService;

import java.util.ArrayList;
import java.util.Scanner;

import static com.teachMeSkills.an15.PilyushinYuri.hw8.task2.DataBase.USERS;

public class AuthServiceImpl implements AuthService {
    @Override
    public User login() {
        MenuServiceImpl menuService = new MenuServiceImpl();
        System.out.println("Введите логин:");
        Scanner scanner = new Scanner(System.in);
        String login = scanner.nextLine();
        System.out.println("Введите пароль:");
        String password = scanner.nextLine();
        User enteredUser = new User(login, password);
        User user;
        if (USERS.containsKey(enteredUser.getLogin())) {
            if (USERS.get(enteredUser.getLogin()).getPassword().equals(enteredUser.getPassword())) {
                System.out.println("Ты авторизирован");
                user = USERS.get(enteredUser.getLogin());
                if (user.isHasAdminRole()) {
                    menuService.adminMenu();
                } else {
                    user.setBasket(new Basket());
                    user.getBasket().setProducts(new ArrayList<>());
                    menuService.userMenu(user);
                } return user;
            }
            }else {
                System.out.println("Логин или пароль неверные");
                login();

        }
        return null;
    }

    @Override
    public void registration() {
        System.out.println("Введите логин:");
        Scanner scanner = new Scanner(System.in);
        String login = scanner.nextLine();
        System.out.println("Введите пароль:");
        String password = scanner.nextLine();
        User user = new User(login, password);
        USERS.put(user.getLogin(), user);
        System.out.println("Ты зарегистрирован! Авторизируйся!");
        login();

    }
}
