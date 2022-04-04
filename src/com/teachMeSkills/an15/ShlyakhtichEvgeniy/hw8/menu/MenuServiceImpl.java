package com.teachMeSkills.an15.ShlyakhtichEvgeniy.hw8.menu;

import com.teachMeSkills.an15.ShlyakhtichEvgeniy.hw8.model.Product;
import com.teachMeSkills.an15.ShlyakhtichEvgeniy.hw8.model.User;
import com.teachMeSkills.an15.ShlyakhtichEvgeniy.hw8.service.impl.AuthServiceImpl;
import com.teachMeSkills.an15.ShlyakhtichEvgeniy.hw8.service.impl.UserServiceImpl;

import java.util.InputMismatchException;
import java.util.Scanner;

import static com.teachMeSkills.an15.ShlyakhtichEvgeniy.hw8.DataBase.PRODUCTS;
import static com.teachMeSkills.an15.ShlyakhtichEvgeniy.hw8.DataBase.USERS;

public class MenuServiceImpl implements MenuService {
    AuthServiceImpl authService = new AuthServiceImpl();
    UserServiceImpl userService = new UserServiceImpl();


    public void adminMenu() {
        System.out.println("""
                1.Добавить запчасть
                2.Изменить запчасть
                3.Удалить запчать.
                4.Выйти из пользователя
                5.Выйти из программы""");
        try {
            Scanner scanner = new Scanner(System.in);
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    userService.addProduct();
                    adminMenu();
                    break;
                case 2:
                    userService.changeProduct();
                    adminMenu();
                    break;
                case 3:
                    userService.deleteProduct();
                    adminMenu();
                    break;
                case 4:
                    authMenu();
                    break;
                case 5:
                    System.exit(0);
                default:
                    adminMenu();
            }

        } catch (InputMismatchException e) {
            System.out.println("Введите номер пункта меню");
            adminMenu();
        }

    }

    public void authMenu() {
        System.out.println("1.Авторизироваться\n2.Зарегистрироваться\n3.Выйти из программы");
        try {
            Scanner scanner = new Scanner(System.in);
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    User userTest;
                    userTest = authService.login(USERS);
                    if (userTest == null) {
                        authMenu();
                    } else if (userTest.isHasAdminRole()) {
                        adminMenu();
                    } else {
                        userMenu(userTest);
                    }
                    break;
                case 2:
                    authService.registration(USERS);
                    authMenu();
                    break;
                case 3:
                    break;
                default:
                    authMenu();
            }
        } catch (InputMismatchException e) {
            System.out.println("Введите номер пункта меню");
            authMenu();
        }
    }

    public void userMenu(User user) {
        System.out.println("""
                1.Список продуктов
                2.Поиск продуктов
                3.Выбор продукта
                4.Корзина
                5.Выйти из пользователя
                6.Выйти из программы""");
        try {
            Scanner scanner = new Scanner(System.in);
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    for (Product product : PRODUCTS) {
                        System.out.println(product.toString());
                    }
                    userMenu(user);
                case 2:
                    userService.searchProductByCarName();
                    userMenu(user);
                    break;
                case 3:
                    Product currentProduct;
                    currentProduct = userService.chooseProduct(PRODUCTS);
                    if (currentProduct == null) {
                        System.out.println("Такого продукта нет");
                        userMenu(user);
                    } else {
                        productMenu(user, currentProduct);
                        userMenu(user);
                    }
                    break;
                case 4:
                    basketMenu(user);
                    userMenu(user);
                    break;
                case 5:
                    authMenu();
                    break;
                case 6:
                    System.exit(0);
                default:
                    userMenu(user);
            }
        } catch (InputMismatchException e) {
            System.out.println("Введите номер пункта меню");
            userMenu(user);
        }
    }

    public void basketMenu(User user) {
        for (Product product : user.getBasket().getProducts()) {
            System.out.println(product.getName() + " " + product.getPrice() + " руб.");
        }
        System.out.println(user.getBasket().getTotalPrice()+ " руб.");
        System.out.println("1.Оплатить корзину\n2.Удалить продукт из корзины\n3.Назад");
        try {
            Scanner scanner = new Scanner(System.in);
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    userService.payForBasket(user);
                    break;
                case 2:
                    userService.deleteProductFromBasket(user);
                    basketMenu(user);
                    break;
                case 3:
                    userMenu(user);
                    break;
                default:
                    basketMenu(user);
            }
        } catch (InputMismatchException e) {
            System.out.println("Введите номер пункта меню");
            basketMenu(user);
        }
    }

    public void productMenu(User user, Product product) {
        System.out.println(product.toString());
        System.out.println("1.Добавить товар в корзину\n2.Оценить товар\n3.Оставить отзыв о товаре\n4.Назад");
        try {
            Scanner scanner = new Scanner(System.in);
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    userService.addProductToBasket(user, product);
                    productMenu(user, product);
                    break;
                case 2:
                    userService.rateProduct(product);
                    productMenu(user, product);
                    break;
                case 3:
                    userService.commentProduct(product);
                    productMenu(user, product);
                    break;
                case 4:
                    userMenu(user);
                default:
                    productMenu(user, product);
            }
        } catch (InputMismatchException e) {
            System.out.println("Введите номер пункта меню");
            productMenu(user, product);
        }
    }
}
