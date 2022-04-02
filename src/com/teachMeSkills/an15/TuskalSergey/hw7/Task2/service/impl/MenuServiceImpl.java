package com.teachMeSkills.an15.TuskalSergey.hw7.Task2.service.impl;

import com.teachMeSkills.an15.TuskalSergey.hw7.Task2.model.Product;
import com.teachMeSkills.an15.TuskalSergey.hw7.Task2.model.User;
import com.teachMeSkills.an15.TuskalSergey.hw7.Task2.service.AuthService;
import com.teachMeSkills.an15.TuskalSergey.hw7.Task2.service.MenuService;
import com.teachMeSkills.an15.TuskalSergey.hw7.Task2.service.UserService;

import java.util.Scanner;

import static com.teachMeSkills.an15.TuskalSergey.hw7.Task2.Database.PRODUCTS;
import static com.teachMeSkills.an15.TuskalSergey.hw7.Task2.Database.USERS;

public class MenuServiceImpl implements MenuService {

    private Scanner scanner = new Scanner(System.in);

    UserService userService = new UserServiceImpl();
    AuthService authService = new AuthServiceImpl();

    @Override
    public void authMenu() {
        System.out.println("Желаете зарегистрироваться(1), войти(2) или завершить работу(3)?");

            String signInOrSignUp = scanner.nextLine();
        switch (signInOrSignUp) {
            case "1":
                authService.registration(USERS);
                User currentUser = authService.login();
                if (currentUser == null) {
                    authMenu();
                } else if (currentUser.isHasAdminRole()) {
                    adminMenu();
                } else {
                    userMenu(currentUser);
                }
                break;
            case "2":
                User currentUser1 = authService.login();
                if (currentUser1 == null) {
                    authMenu();
                } else if (currentUser1.isHasAdminRole()) {
                    adminMenu();
                } else {
                    userMenu(currentUser1);
                }
                break;
            case "3":
                break;
            default:
                System.out.println("Неверно указан номер действия.");
                authMenu();
        }
    }

    @Override
    public void adminMenu() {
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
                for (Product p : PRODUCTS) {
                    System.out.println(p);
                }
                adminMenu();
                break;
            case "2":
                userService.addProduct(PRODUCTS);
                adminMenu();
                break;
            case "3":
                userService.deleteProduct(PRODUCTS);
                adminMenu();
                break;
            case "4":
                userService.changeProduct(PRODUCTS);
                adminMenu();
                break;
            case "5":
                authMenu();
                break;
            case "6":
                System.out.println("Работа завершена.");
                break;
            default:
                System.out.println("Неверно указан номер действия.");
                adminMenu();
        }
    }

    @Override
    public void userMenu(User user) {
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
                userService.searchProductByCarName(PRODUCTS);
                userMenu(user);
                break;
            case "2":
                userService.addProductToBasket(user, PRODUCTS);
                userMenu(user);
                break;
            case "3":
                userService.deleteProductFromBasket(user);
                userMenu(user);
                break;
            case "4":
                userService.payForBasket(user, PRODUCTS);
                userMenu(user);
                break;
            case "5":
                authMenu();
                break;
            case "6":
                System.out.println("Работа завершена.");
                break;
            default:
                System.out.println("Неверно указан номер действия.");
                userMenu(user);
        }
    }
}
