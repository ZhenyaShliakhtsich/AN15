package com.teachMeSkills.an15.ShlyakhtichEvgeniy.hw8.service.impl;

import com.teachMeSkills.an15.ShlyakhtichEvgeniy.hw8.model.Basket;
import com.teachMeSkills.an15.ShlyakhtichEvgeniy.hw8.model.Product;
import com.teachMeSkills.an15.ShlyakhtichEvgeniy.hw8.model.User;
import com.teachMeSkills.an15.ShlyakhtichEvgeniy.hw8.service.AuthService;
import com.teachMeSkills.an15.ShlyakhtichEvgeniy.hw8.service.DataBaseService;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;


public class AuthServiceImpl implements AuthService {
    DataBaseService dataBaseService = new DataBaseServiceImpl();

    @Override
    public User login() {
        HashMap<String, User> users = (HashMap<String, User>) dataBaseService.loadUsersDataBase();
        System.out.println("Введите логин:");
        Scanner scanner = new Scanner(System.in);
        String login = scanner.nextLine();
        System.out.println("Введите пароль:");
        String password = scanner.nextLine();

        User enteredUser = new User(login, password);
        String enteredUserLogin =enteredUser.getLogin();
        if (users.containsKey(enteredUserLogin)) {
            if (users.get(enteredUserLogin).getPassword().equals(enteredUser.getPassword())) {
                System.out.println("Ты авторизирован");
                return users.get(enteredUserLogin);
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
        HashMap<String, User> users = (HashMap<String, User>) dataBaseService.loadUsersDataBase();
        System.out.println("Введите логин:");
        Scanner scanner = new Scanner(System.in);
        String login = scanner.nextLine();
        if (users.containsKey(login)) {
            System.out.println("Такой логин уже есть.Выберите новый");
            registration();
        } else {
            System.out.println("Введите пароль:");
            String password = scanner.nextLine();
            User user = new User(login, password);
            user.setBasket(new Basket());
            ArrayList<Product> products = new ArrayList<>();
            user.getBasket().setProducts(products);
            users.put(user.getLogin(), user);
            System.out.println("Ты зарегистрирован! Авторизируйся!");
            dataBaseService.saveUsersDataBase(users);
        }
    }
}
