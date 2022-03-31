package com.teachMeSkills.an15.TuskalSergey.hw7.Task2.service.impl;

import Task2.model.Product;
import Task2.model.User;
import Task2.service.AuthService;
import Task2.service.MenuService;
import Task2.service.UserService;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class MenuServiceImpl implements MenuService {

    private Scanner scanner = new Scanner(System.in);

    UserService userService = new UserServiceImpl();
    AuthService authService = new AuthServiceImpl();

    @Override
    public void authMenu(User user, HashMap<String, User> users, HashMap<String, User> currentUser,
                         ArrayList<Product> products) {
        System.out.println("Желаете зарегистрироваться(1), войти(2) или завершить работу(3)?");

            String signInOrSignUp = scanner.nextLine();
        switch (signInOrSignUp) {
            case "1":
                authService.registration(users);
                authService.login(users, currentUser);
                if (currentUser.get("currentUser").isHasAdminRole()) {
                    adminMenu(user, users, currentUser, products);
                } else {
                    userMenu(user, users,  currentUser, products);
                }
                break;
            case "2":
                authService.login(users, currentUser);
                if (currentUser.get("currentUser").isHasAdminRole()) {
                    adminMenu(user, users,  currentUser, products);
                } else {
                    userMenu(user, users,  currentUser, products);
                }
                break;
            case "3":
                break;
            default:
                System.out.println("Неверно указан номер действия.");
                authMenu(user, users,  currentUser, products);
        }
    }

    @Override
    public void adminMenu(User user, HashMap<String, User> users, HashMap<String, User> currentUser,
                          ArrayList<Product> products) {
        System.out.println("Выберите действие:" + "\n"
                + "1 - просмотреть список товаров" + "\n"
                + "2 - добавить товар" + "\n"
                + "3 - удалить товар" + "\n"
                + "4 - изменить информацию о товаре" + "\n"
                + "5 - выйти и зарегистрироваться/войти под другой учетной записью" + "\n"
                + "6 - завершить работу");

            String choice = scanner.nextLine();
        switch (choice) {
            case "1":
                for (Product p : products) {
                    System.out.println(p);
                }
                adminMenu(user, users,  currentUser, products);
                break;
            case "2":
                userService.addProduct(products);
                adminMenu(user, users,  currentUser, products);
                break;
            case "3":
                userService.deleteProduct(products);
                adminMenu(user, users,  currentUser, products);
                break;
            case "4":
                userService.changeProduct(products);
                adminMenu(user, users,  currentUser, products);
                break;
            case "5":
                authMenu(user, users,  currentUser, products);
                break;
            case "6":
                System.out.println("Работа завершена.");
                break;
            default:
                System.out.println("Неверно указан номер действия.");
                adminMenu(user, users,  currentUser, products);
        }
    }

    @Override
    public void userMenu(User user, HashMap<String, User> users, HashMap<String, User> currentUser,
                         ArrayList<Product> products) {
        System.out.println("Выберите действие:" + "\n"
                + "1 - найти товар по марке машины" + "\n"
                + "2 - добавить товар в корзину" + "\n"
                + "3 - удалить товар из корзины" + "\n"
                + "4 - оплатить товары в корзине" + "\n"
                + "5 - выйти и зарегистрироваться/войти под другой учетной записью" + "\n"
                + "6 - завершить работу");

            String choice = scanner.nextLine();
        switch (choice) {
            case "1":
                userService.searchProductByCarName(products);
                userMenu(user, users, currentUser, products);
                break;
            case "2":
                userService.addProductToBasket(user, products);
                userMenu(user, users, currentUser, products);
                break;
            case "3":
                userService.deleteProductFromBasket(user);
                userMenu(user, users, currentUser, products);
                break;
            case "4":
                userService.payForBasket(user, products);
                userMenu(user, users, currentUser, products);
                break;
            case "5":
                authMenu(user, users, currentUser, products);
                break;
            case "6":
                System.out.println("Работа завершена.");
                break;
            default:
                System.out.println("Неверно указан номер действия.");
                userMenu(user, users, currentUser, products);
        }
    }
}
