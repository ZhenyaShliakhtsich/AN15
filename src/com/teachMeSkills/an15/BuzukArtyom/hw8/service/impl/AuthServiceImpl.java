package com.teachMeSkills.an15.BuzukArtyom.hw8.service.impl;

import com.teachMeSkills.an15.BuzukArtyom.hw8.model.Basket;
import com.teachMeSkills.an15.BuzukArtyom.hw8.model.Product;
import com.teachMeSkills.an15.BuzukArtyom.hw8.model.User;
import com.teachMeSkills.an15.BuzukArtyom.hw8.service.AuthService;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

import static com.teachMeSkills.an15.BuzukArtyom.hw8.DataBase.USERS;

public class AuthServiceImpl implements AuthService {
    Scanner scanner = new Scanner(System.in);
    User user = null;

    @Override
    public User login() {
        System.out.println("Введите логин:");
        String login = scanner.nextLine();
        System.out.println("Введите пароль:");
        String password = scanner.nextLine();
        User enteredUser = new User(login, password);
        if (USERS.containsKey(enteredUser.getLogin())) {
            if (USERS.get(enteredUser.getLogin()).getPassword().equals(enteredUser.getPassword())) {
                System.out.println("Ты авторизирован");
                user = USERS.get(enteredUser.getLogin());
            } else {
                System.out.println("Логин или пароль неверные, попробуйте ещё раз!");
                login();
            }
        }
        return user;
    }


    @Override
    public void registration(HashMap<String, User> users) {
        System.out.println("Введите логин:");
        Scanner scanner = new Scanner(System.in);
        String login = scanner.nextLine();
        System.out.println("Введите пароль:");
        String password = scanner.nextLine();
        User user = new User(login, password);
        user.setBasket(new Basket());
        ArrayList<Product> products = new ArrayList<>();
        user.getBasket().setProducts(products);
        users.put(user.getLogin(), user);
        System.out.println("Ты зарегистрирован! Авторизируйся!");
    }
}
