package com.teachMeSkills.an15.BuzukArtyom.hw8.service.impl;

import com.teachMeSkills.an15.BuzukArtyom.hw8.service.AuthService;
import com.teachMeSkills.an15.BuzukArtyom.hw8.service.MenuService;
import com.teachMeSkills.an15.BuzukArtyom.hw8.service.UserService;
import com.teachMeSkills.an15.BuzukArtyom.hw8.model.User;
import com.teachMeSkills.an15.BuzukArtyom.hw8.model.Product;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class MenuServiceImpl implements MenuService {
    AuthService authService = new AuthServiceImpl();
    UserService userService = new UserServiceImpl();

    @Override
    public void menuAuth(User user, HashMap<String, User> users, Product product, ArrayList<Product> products) {
        try {
            boolean flag = true;
            while (flag) {
                System.out.println("Меню: \n1.Регистрация\n2.Авторизация\n3.Выйти");
                int choose = new Scanner(System.in).nextInt();
                switch (choose) {
                    case 1:
                        authService.registration(users);
                        break;
                    case 2:
                        authService.login(users);
                        if (users.containsKey("admin")) {
                            break;
                        } else {
                            menuAuth(user, users, product, products);
                        }
                    default:
                        System.out.println("До встречи!");
                        flag = false;
                        break;
                }
                if (flag) {
                    if (users.containsKey("admin") && users.size() == 1) {
                        user.setHasAdminRole(true);
                    } else {
                        user.setHasAdminRole(false);
                    }
                    if (user.isHasAdminRole()) {
                        menuAdmin(user, users, product, products);
                    } else {
                        menuUser(user, users, product, products);
                    }
                }
            }
        } catch (Exception e) {
            System.out.println("Введите цифру!!!");
            menuAuth(user, users, product, products);
        }
    }

    @Override
    public void menuAdmin(User user, HashMap<String, User> users, Product product, ArrayList<Product> products) {
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
                    case 1 -> userService.addProduct(products);
                    case 2 -> userService.deleteProduct(products);
                    case 3 -> userService.changeProduct(products);
                    default -> menuAuth(user, users, product, products);
                }
            }
        } catch (Exception e) {
            System.out.println("Введите цифру!!!");
            menuAdmin(user, users, product, products);
        }
    }

    @Override
    public void menuUser(User user, HashMap<String, User> users, Product product, ArrayList<Product> products) {
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
                        userService.addProductToBasket(user, products);
                        break;
                    }
                    case 2 -> userService.deleteProductFromBasket(user);
                    case 3 -> userService.commentProduct(products);
                    case 4 -> userService.rateProduct(products);
                    case 5 -> userService.payForBasket(user);
                    case 6 -> menuAuth(user, users, product, products);
                    default -> menuUser(user, users, product, products);
                }
            }
        } catch (Exception e) {
            System.out.println("Введите цифру!!!");
            menuUser(user, users, product, products);
        }
    }
}