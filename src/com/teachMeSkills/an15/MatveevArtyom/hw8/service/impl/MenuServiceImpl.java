package com.teachMeSkills.an15.MatveevArtyom.hw8.service.impl;

import com.teachMeSkills.an15.MatveevArtyom.hw8.model.User;
import com.teachMeSkills.an15.MatveevArtyom.hw8.service.AuthService;
import com.teachMeSkills.an15.MatveevArtyom.hw8.service.Menu;
import com.teachMeSkills.an15.MatveevArtyom.hw8.service.UserService;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MenuServiceImpl implements Menu {

    UserService userService = new UserServiceImpl();
    AuthService authService = new AuthServiceImpl();

    @Override
    public void menuAuth() {
        try {
            boolean flag = true;
            while (flag) {
                System.out.println("Введите что вы хотите: \n 1. Регистрация \n 2. Авторизация \n 3. Выйти");
                int choose = new Scanner(System.in).nextInt();
                switch (choose) {
                    case 1:
                        User enteredUser = authService.registration();
                        if (enteredUser == null) {
                            menuAuth();
                        } else if (enteredUser.isHasAdminRole()) {
                            menuAdmin();
                        } else {
                            menuUser(enteredUser);
                        }
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
                        break;
                    case 3:
                        System.out.println("Вы вышли из меню!");
                        flag = false;
                    default:
                        System.out.println("Выберите пункт меню!");
                        menuAuth();
                }
            }
        } catch (InputMismatchException e) {
            System.out.println("Введите цифру!");
            menuAuth();
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
                    case 4:
                        flag = false;
                    default:
                        System.out.println("Выберите пункт меню!");
                        menuAdmin();
                }
            }
        } catch (InputMismatchException e) {
            System.out.println("Введите цифру!");
            menuAdmin();
        }
    }

    @Override
    public void menuUser(User user) {
        try {
            boolean flag = true;
            while (flag) {
                System.out.println("Введите что вы хотите сделать: \n 1. Поиск продукта\n 2. Написать отзыв \n 3. Поставить оценку " +
                        "\n 4. Добавить товар в корзину \n 5. Удалить товар из корзины" +
                        "\n 6. Оплатить корзину \n 7. Назад");
                int choose = new Scanner(System.in).nextInt();
                switch (choose) {
                    case 1:
                        userService.searchByProduct();
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
                    case 7:
                        flag = false;
                        break;
                    default:
                        System.out.println("Выберите пункт меню!");
                        menuUser(user);
                }
            }
        } catch (InputMismatchException e) {
            System.out.println("Введите цифру!");
            menuUser(user);
        }
    }
}
