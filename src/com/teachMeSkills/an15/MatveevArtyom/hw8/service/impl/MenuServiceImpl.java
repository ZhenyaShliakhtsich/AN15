package com.teachMeSkills.an15.MatveevArtyom.hw8.service.impl;

import com.teachMeSkills.an15.MatveevArtyom.hw8.model.Product;
import com.teachMeSkills.an15.MatveevArtyom.hw8.model.User;
import com.teachMeSkills.an15.MatveevArtyom.hw8.service.AuthService;
import com.teachMeSkills.an15.MatveevArtyom.hw8.service.Menu;
import com.teachMeSkills.an15.MatveevArtyom.hw8.service.UserService;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Scanner;

public class MenuServiceImpl implements Menu {

    UserService userService = new UserServiceImpl();
    AuthService authService = new AuthServiceImpl();

    @Override
    public void menuAuth(User user, HashMap<String, User> users, Product product, ArrayList<Product> products) {
        try {
            boolean flag = true;
            while (flag) {
                System.out.println("Введите что вы хотите: \n 1. Регистрация \n 2. Авторизация \n 3. Выйти");
                System.out.println("Если вы админ, то введите логин и пароль - admin");
                int choose = new Scanner(System.in).nextInt();
                switch (choose) {
                    case 1:
                        authService.registration(users);
                        break;
                    case 2:
                        authService.login(users);
                        if (users.containsKey("admin") && users.size() > 1) {
                            break;
                        } else {
                            menuAuth(user, users, product, products);
                        }

                    default:
                        System.out.println("Вы вышли из меню!");
                        flag = false;
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
        } catch (InputMismatchException e) {
            System.out.println("Введите цифру!");
            menuAuth(user, users, product, products);
        }
    }

    @Override
    public void menuAdmin(User user, HashMap<String, User> users, Product product, ArrayList<Product> products) {
        try {
            boolean flag = true;
            while (flag) {
                System.out.println("Введите что вы хотите: \n 1. Добавить информацию \n 2. Удалить информацию \n" +
                        " 3. Изменить информацию \n 4.Назад(Или любую другую цифру)");
                int choose = new Scanner(System.in).nextInt();
                switch (choose) {
                    case 1:
                        userService.addProduct(products);
                        break;
                    case 2:
                        userService.deleteProduct(products);
                        break;
                    case 3:
                        userService.changeProduct(products);
                        break;
                    default:
                        flag = false;
                }
            }
        } catch (InputMismatchException e) {
            System.out.println("Введите цифру!");
            menuAdmin(user, users, product, products);
        }
    }

    @Override
    public void menuUser(User user, HashMap<String, User> users, Product product, ArrayList<Product> products) {
        try {
            boolean flag = true;
            while (flag) {
                System.out.println("Введите что вы хотите сделать: \n 1. Поиск машины\n 2. Написать отзыв \n 3. Поставить оценку " +
                        "\n 4. Добавить товар в корзину \n 5. Удалить товар из корзины" +
                        "\n 6. Оплатить корзину \n 7. Назад(или любая другая цифра)");
                int choose = new Scanner(System.in).nextInt();
                switch (choose) {
                    case 1:
                        userService.search(product);
                        break;
                    case 2:
                        userService.commentProduct(products);
                        break;
                    case 3:
                        userService.rateProduct(products);
                        break;
                    case 4:
                        userService.addProductToBasket(user, products);
                        break;
                    case 5:
                        userService.deleteProductFromBasket(user);
                        break;
                    case 6:
                        userService.payForBasket(user, products);
                        break;
                    default:
                        flag = false;
                }
            }
        } catch (InputMismatchException e) {
            System.out.println("Введите цифру!");
            menuUser(user, users, product, products);
        }
    }
}
