package com.teachMeSkills.an15.ShlyakhtichEvgeniy.hw8.menu;

import com.teachMeSkills.an15.ShlyakhtichEvgeniy.hw8.model.Product;
import com.teachMeSkills.an15.ShlyakhtichEvgeniy.hw8.model.User;
import com.teachMeSkills.an15.ShlyakhtichEvgeniy.hw8.service.impl.AuthServiceImpl;
import com.teachMeSkills.an15.ShlyakhtichEvgeniy.hw8.service.impl.PriceServiceImpl;
import com.teachMeSkills.an15.ShlyakhtichEvgeniy.hw8.service.impl.RateServiceImpl;
import com.teachMeSkills.an15.ShlyakhtichEvgeniy.hw8.service.impl.UserServiceImpl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Scanner;

public class MenuServiceImpl implements MenuService {
    AuthServiceImpl authService = new AuthServiceImpl();
    UserServiceImpl userService = new UserServiceImpl();
    Scanner scanner = new Scanner(System.in);

    public void adminMenu(User user, ArrayList<Product> products, HashMap<String, User> users) {
        System.out.println("1.Добавить запчасть\n2.Изменить запчасть\n3.Удалить запчать.\n4.Выйти из пользователя" +
                "\n5.Выйти из программы");
       try {
           int choice = scanner.nextInt();
           switch (choice) {
               case 1:
                   userService.addProduct(products);
                   adminMenu(user, products, users);
                   break;
               case 2:
                   userService.changeProduct(products);
                   adminMenu(user, products, users);
                   break;
               case 3:
                   userService.deleteProduct(products);
                   adminMenu(user, products, users);
                   break;
               case 4:
                   authMenu(user, products, users);
                   break;
               case 5:
                   break;
               default:
                   adminMenu(user, products, users);
           }

       } catch (InputMismatchException e){
           System.out.println("Введите номер пункта меню");
           adminMenu(user, products, users);//бесконечная рекурсия при неправильном вводе
       }

    }

    public void authMenu(User user, ArrayList<Product> products, HashMap<String, User> users) {
        System.out.println("1.Авторизироваться\n2.Зарегистрироваться\n3.Выйти из программы");
        try {
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    User userTest;
                    userTest = authService.login(users);
                    if (userTest == null){
                       authMenu(user, products, users);
                    }else if (userTest.isHasAdminRole()) {
                        adminMenu(user, products, users);
                    } else {
                        userMenu(user, users, products);
                    }
                    break;
                case 2:
                    authService.registration(users);
                    authMenu(user, products, users);
                    break;
                case 3:
                    break;
                default:
                    authMenu(user, products, users);
            }
        } catch (InputMismatchException e) {
            System.out.println("Введите номер пункта меню");
            authMenu(user, products, users);
        }
    }

    public void userMenu(User user, HashMap<String, User> users, ArrayList<Product> products) {
        System.out.println("1.Поиск продуктов\n2.Выбор продукта\n3.Корзина\n4.Выйти из пользователя" +
                "\n5.Выйти из программы");
        try {
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    userService.searchForProducts(products);
                    userMenu(user, users, products);
                    break;
                case 2:
                    Product currentProduct;
                    currentProduct = userService.chooseProduct(products);
                    if (currentProduct == null) {
                        System.out.println("Такого продукта нет");
                        userMenu(user, users, products);
                    } else {
                        productMenu(user, users, products, currentProduct);
                        userMenu(user, users, products);
                    }
                    break;
                case 3:
                    basketMenu(user, users, products);
                    userMenu(user, users, products);
                    break;
                case 4:
                    authMenu(user, products, users);
                    break;
                case 5:
                    break;
                default:
                    userMenu(user, users, products);
            }
        } catch (InputMismatchException e) {
            System.out.println("Введите номер пункта меню");
            userMenu(user, users, products);
        }
    }

    public void basketMenu(User user, HashMap<String, User> users, ArrayList<Product> products) {
        PriceServiceImpl priceService = new PriceServiceImpl();
        for (Product product : user.getBasket().getProducts()) {
            System.out.println(product.getName() + " " + product.getPrice() + " руб.");
        }
        System.out.println(priceService.calculateTotalBasketPrice(user) + " руб.");
        System.out.println("1.Оплатить корзину\n2.Удалить продукт из корзины\n3.Назад");
        try {
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    userService.payForBasket(user, products);
                    break;
                case 2:
                    userService.deleteProductFromBasket(user);
                    basketMenu(user, users, products);
                    break;
                case 3:
                    userMenu(user, users, products);
                default:
                    basketMenu(user, users, products);
            }
        } catch (InputMismatchException e) {
            System.out.println("Введите номер пункта меню");
            basketMenu(user, users, products);
        }
    }

    public void productMenu(User user, HashMap<String, User> users, ArrayList<Product> products, Product product) {
        RateServiceImpl rateService = new RateServiceImpl();
        System.out.println(product.toString() + "\nРейтинг : " + rateService.calculateAvgRate(product));
        System.out.println("1.Добавить товар в корзину\n2.Оценить товар\n3.Оставить отзыв о товаре\n4.Назад");
        try {
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    userService.addProductToBasket(user, product);
                    productMenu(user, users, products, product);
                    break;
                case 2:
                    userService.rateProduct(product);
                    productMenu(user, users, products, product);
                    break;
                case 3:
                    userService.commentProduct(product);
                    productMenu(user, users, products, product);
                    break;
                case 4:
                    userMenu(user, users, products);
                default:
                    productMenu(user, users, products, product);
            }
        } catch (InputMismatchException e) {
            System.out.println("Введите номер пункта меню");
            productMenu(user, users, products, product);
        }
    }
}
