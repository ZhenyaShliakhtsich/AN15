package com.teachMeSkills.an15.PilyushinYuri.hw8.task2.service.impl;

import com.teachMeSkills.an15.PilyushinYuri.hw8.task2.model.Basket;
import com.teachMeSkills.an15.PilyushinYuri.hw8.task2.model.Product;
import com.teachMeSkills.an15.PilyushinYuri.hw8.task2.model.User;
import com.teachMeSkills.an15.PilyushinYuri.hw8.task2.service.AuthService;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class AuthServiceImpl implements AuthService {
    @Override
    public User login(HashMap<String, User> users, ArrayList<Product> products) {
        MenuServiceImpl menuService = new MenuServiceImpl();
        System.out.println("Введите логин:");
        Scanner scanner = new Scanner(System.in);
        String login = scanner.nextLine();
        System.out.println("Введите пароль:");
        String password = scanner.nextLine();
        User enteredUser = new User(login, password);
        User user;
        if (users.containsKey(enteredUser.getLogin())) {
            if (users.get(enteredUser.getLogin()).getPassword().equals(enteredUser.getPassword())) {
                System.out.println("Ты авторизирован");
                user = users.get(enteredUser.getLogin());
                if (user.isHasAdminRole()) {
                    menuService.adminMenu(user, products,users);
                } else {
                    user.setBasket(new Basket());
                    user.getBasket().setProducts(new ArrayList<>());
                    menuService.userMenu(user, products,users);
                } return user;
            }
            }else {
                System.out.println("Логин или пароль неверные");
                login(users, products);

        }
        return null;
    }

    @Override
    public void registration(HashMap<String, User> users, ArrayList<Product> products) {
        System.out.println("Введите логин:");
        Scanner scanner = new Scanner(System.in);
        String login = scanner.nextLine();
        System.out.println("Введите пароль:");
        String password = scanner.nextLine();
        User user = new User(login, password);
        users.put(user.getLogin(), user);
        System.out.println("Ты зарегистрирован! Авторизируйся!");
        login(users, products);

    }
}
