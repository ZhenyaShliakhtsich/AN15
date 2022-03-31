package com.teachMeSkills.an15.BuzukArtyom.hw8.service.impl;

import com.teachMeSkills.an15.BuzukArtyom.hw8.service.AuthService;
import com.teachMeSkills.an15.BuzukArtyom.hw8.service.MenuService;
import com.teachMeSkills.an15.BuzukArtyom.hw8.service.UserService;
import com.teachMeSkills.an15.BuzukArtyom.hw8.model.User;
import com.teachMeSkills.an15.BuzukArtyom.hw8.model.Product;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

import static com.teachMeSkills.an15.BuzukArtyom.hw8.DataBase.PRODUCTS;
import static com.teachMeSkills.an15.BuzukArtyom.hw8.DataBase.USERS;

public class MenuServiceImpl implements MenuService {
    AuthService authService = new AuthServiceImpl();
    UserService userService = new UserServiceImpl();

    @Override
    public void menuAuth() {
        try {
            boolean flag = true;
            while (flag) {
                System.out.println("Меню: \n1.Регистрация\n2.Авторизация\n3.Выйти");
                int choose = new Scanner(System.in).nextInt();
                switch (choose) {
                    case 1:
                        authService.registration(USERS);
                        break;
                    case 2:
                        User authUser = authService.login();
                        if (authUser == null) {
                            menuAuth();
                        } else if (authUser.isHasAdminRole()) {
                            menuAdmin();
                        } else {
                            menuUser(authUser);
                        }
                    default:
                        System.out.println("До встречи!");
                        flag = false;
                        break;
                }
            }
        } catch (Exception e) {
            System.out.println("Введите цифру!!!");
            menuAuth();
        }
    }

    @Override
    public void menuAdmin() {
        try {
            System.out.println("""
                    Меню Админа:\s
                     1.Добавить продукт\s
                     2.Удалить продукт\s
                     3.Изменить продукт\s
                     4.Назад""");
            while (true) {
                int choose = new Scanner(System.in).nextInt();
                switch (choose) {
                    case 1 -> userService.addProduct(PRODUCTS);
                    case 2 -> userService.deleteProduct(PRODUCTS);
                    case 3 -> userService.changeProduct(PRODUCTS);
                    default -> menuAuth();
                }
            }
        } catch (Exception e) {
            System.out.println("Введите цифру!!!");
            menuAdmin();
        }
    }

    @Override
    public void menuUser(User user) {
        try {
            while (true) {
                System.out.println("""
                        Меню пользователя:
                         1.Добавить продукт в корзину
                         2.Удалить продукт из корзины
                         3.Оставить отзыв
                         4.Оставить оценку
                         5.Оплатить
                         6.Назад\s""");
                int choose = new Scanner(System.in).nextInt();
                switch (choose) {
                    case 1 -> {
                        userService.addProductToBasket(user, PRODUCTS);
                        break;
                    }
                    case 2 -> userService.deleteProductFromBasket(user);
                    case 3 -> userService.commentProduct(PRODUCTS);
                    case 4 -> userService.rateProduct(PRODUCTS);
                    case 5 -> userService.payForBasket(user);
                    case 6 -> menuAuth();
                    default -> menuUser(user);
                }
            }
        } catch (Exception e) {
            System.out.println("Введите цифру!!!");
            menuUser(user);
        }
    }
}