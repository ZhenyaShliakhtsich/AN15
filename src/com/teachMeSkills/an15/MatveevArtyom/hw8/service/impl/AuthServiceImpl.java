package com.teachMeSkills.an15.MatveevArtyom.hw8.service.impl;

import com.teachMeSkills.an15.MatveevArtyom.hw8.model.Basket;
import com.teachMeSkills.an15.MatveevArtyom.hw8.model.Product;
import com.teachMeSkills.an15.MatveevArtyom.hw8.model.User;
import com.teachMeSkills.an15.MatveevArtyom.hw8.service.AuthService;

import java.util.ArrayList;
import java.util.Scanner;

import static com.teachMeSkills.an15.MatveevArtyom.hw8.DataBase.USERS;

public class AuthServiceImpl implements AuthService {

    @Override
    public User login() {
        System.out.println("Введите логин:");
        Scanner scanner = new Scanner(System.in);
        String login = scanner.nextLine();
        System.out.println("Введите пароль:");
        String password = scanner.nextLine();
        if (USERS.size() == 1 && "admin".equalsIgnoreCase(login) && "admin".equalsIgnoreCase(password) || USERS.size() > 1) {
            User enteredUser = new User(login, password);
            if (USERS.containsKey(enteredUser.getLogin())) {
                if (USERS.get(enteredUser.getLogin()).getPassword().equals(enteredUser.getPassword())) {
                    System.out.println("Ты авторизирован");
                    USERS.put(login, enteredUser);
                    return USERS.get(enteredUser.getLogin());
                } else {
                    System.out.println("Логин или пароль неверные, попробуйте ещё раз!");
                    login();
                }
            } else {
                System.out.println("Логин или пароль неверные, попробуйте ещё раз!");
                login();
            }
        } else {
            System.out.println("Если вы не админ, вам сначала надо зарегистрироваться! \nРегистрация: ");
            registration();
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
        user.setBasket(new Basket());
        ArrayList<Product> products = new ArrayList<>();
        user.getBasket().setProducts(products);
        USERS.put(user.getLogin(), user);
        System.out.println("Ты зарегистрирован! Авторизируйся!");
        login();
    }
}
