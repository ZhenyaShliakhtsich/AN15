package com.teachMeSkills.an15.ShlyakhtichEvgeniy.hw8.service.impl;

import com.teachMeSkills.an15.ShlyakhtichEvgeniy.hw8.DataBase;
import com.teachMeSkills.an15.ShlyakhtichEvgeniy.hw8.model.Basket;
import com.teachMeSkills.an15.ShlyakhtichEvgeniy.hw8.model.Product;
import com.teachMeSkills.an15.ShlyakhtichEvgeniy.hw8.model.User;
import com.teachMeSkills.an15.ShlyakhtichEvgeniy.hw8.service.AuthService;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

import static com.teachMeSkills.an15.ShlyakhtichEvgeniy.hw8.DataBase.USERS;

public class AuthServiceImpl implements AuthService {
    @Override
    public User login() {
        System.out.println("Введите логин:");
        Scanner scanner = new Scanner(System.in);
        String login = scanner.nextLine();
        System.out.println("Введите пароль:");
        String password = scanner.nextLine();

        User enteredUser = new User(login, password);
        if (USERS.containsKey(enteredUser.getLogin())) {
            if (USERS.get(enteredUser.getLogin()).getPassword().equals(enteredUser.getPassword())) {
                System.out.println("Ты авторизирован");
                return USERS.get(enteredUser.getLogin());
            } else {
                System.out.println("Логин или пароль неверные");
            }
        } else {
            System.out.println("Логин или пароль неверные");
        }
        return null;
    }

    @Override
    public void registration() {
        System.out.println("Введите логин:");
        Scanner scanner = new Scanner(System.in);
        String login = scanner.nextLine();
        if (USERS.containsKey(login)){
            System.out.println("Такой логин уже есть.Выберите новый");
            registration();
        }else {
            System.out.println("Введите пароль:");
            String password = scanner.nextLine();
            User user = new User(login, password);
            user.setBasket(new Basket());
            ArrayList<Product> products = new ArrayList<>();
            user.getBasket().setProducts(products);
            USERS.put(user.getLogin(), user);
            System.out.println("Ты зарегистрирован! Авторизируйся!");
        }
    }
}
