package com.teachMeSkills.an15.MatveevArtyom.hw8.service.impl;

import com.teachMeSkills.an15.MatveevArtyom.hw8.model.Product;
import com.teachMeSkills.an15.MatveevArtyom.hw8.model.User;
import com.teachMeSkills.an15.MatveevArtyom.hw8.service.AuthService;
import com.teachMeSkills.an15.MatveevArtyom.hw8.service.Menu;
import com.teachMeSkills.an15.MatveevArtyom.hw8.service.UserService;

import java.util.InputMismatchException;
import java.util.Scanner;

import static com.teachMeSkills.an15.MatveevArtyom.hw8.DataBase.USERS;

public class MenuServiceImpl implements Menu {

    UserService userService = new UserServiceImpl();
    AuthService authService = new AuthServiceImpl();

    @Override
    public void menuAuth(User user, Product product) {
        try {
            boolean flag = true;
            while (flag) {
                System.out.println("Введите что вы хотите: \n 1. Регистрация \n 2. Авторизация \n 3. Выйти");
                int choose = new Scanner(System.in).nextInt();
                switch (choose) {
                    case 1:
                        authService.registration();
                        break;
                    case 2:
                        User authUser = authService.login();
                        if (authUser == null)
                            authService.login();
                        break;
                    default:
                        System.out.println("Вы вышли из меню!");
                        flag = false;
                }
                if (flag) {
                    if (USERS.containsKey("admin") && USERS.size() == 1) {
                        user.setHasAdminRole(true);
                    } else {
                        user.setHasAdminRole(false);
                    }
                    if (user.isHasAdminRole()) {
                        menuAdmin();
                    } else {
                        menuUser(user, product);
                    }
                }
            }
        } catch (InputMismatchException e) {
            System.out.println("Введите цифру!");
            menuAuth(user, product);
        }
    }

    @Override
    public void menuAdmin() {
        try {
            boolean flag = true;
            while (flag) {
                System.out.println("Введите что вы хотите: \n 1. Добавить информацию \n 2. Удалить информацию \n" +
                        " 3. Изменить информацию \n 4.Назад(Или любую другую цифру)");
                int choose = new Scanner(System.in).nextInt();
                switch (choose) {
                    case 1:
                        userService.addProduct();
                        break;
                    case 2:
                        userService.deleteProduct();
                        break;
                    case 3:
                        userService.changeProduct();
                        break;
                    default:
                        flag = false;
                }
            }
        } catch (InputMismatchException e) {
            System.out.println("Введите цифру!");
            menuAdmin();
        }
    }

    @Override
    public void menuUser(User user, Product product) {
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
                        userService.commentProduct();
                        break;
                    case 3:
                        userService.rateProduct();
                        break;
                    case 4:
                        userService.addProductToBasket(user);
                        break;
                    case 5:
                        userService.deleteProductFromBasket(user);
                        break;
                    case 6:
                        userService.payForBasket(user);
                        break;
                    default:
                        flag = false;
                }
            }
        } catch (InputMismatchException e) {
            System.out.println("Введите цифру!");
            menuUser(user, product);
        }
    }
}
