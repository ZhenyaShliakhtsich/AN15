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
        User enteredUser = new User(login, password);
        if (USERS.containsKey(enteredUser.getLogin())) {
            if (USERS.get(enteredUser.getLogin()).getPassword().equals(enteredUser.getPassword())) {
                System.out.println("Ты авторизирован");
                if ("admin".equalsIgnoreCase(USERS.get(enteredUser.getLogin()).getLogin())) {
                    enteredUser.setHasAdminRole(true);
                }
                USERS.put(login, enteredUser);
                return USERS.get(enteredUser.getLogin());
            } else {
                System.out.println("Логин или пароль неверные, попробуйте ещё раз! \n " +
                        "или нажмите 1 чтобы выйти назад");
                int choose = new Scanner(System.in).nextInt();
                if (choose == 1) {
                    return null;
                } else {
                    login();
                }
            }
        } else {
            System.out.println("Логин или пароль неверные, попробуйте ещё раз! \n " +
                    "или нажмите 1 чтобы выйти назад");
            int choose = new Scanner(System.in).nextInt();
            if (choose == 1) {
                return null;
            } else {
                login();
            }
        }
        return null;
    }

    @Override
    public User registration() {
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
        return login();
    }
}
