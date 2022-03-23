package com.teachMeSkills.an15.MatveevArtyom.hw8.service.impl;

import com.teachMeSkills.an15.MatveevArtyom.hw8.model.Basket;
import com.teachMeSkills.an15.MatveevArtyom.hw8.model.Product;
import com.teachMeSkills.an15.MatveevArtyom.hw8.model.User;
import com.teachMeSkills.an15.MatveevArtyom.hw8.service.AuthService;
import com.teachMeSkills.an15.MatveevArtyom.hw8.service.Menu;
import com.teachMeSkills.an15.MatveevArtyom.hw8.service.UserService;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class MenuServiceImpl implements Menu {

    UserService userService = new UserServiceImpl();
    AuthService authService = new AuthServiceImpl();
    Scanner scanner = new Scanner(System.in);

    @Override
    public void menuAuth(User user, HashMap<String, User> users, Product product, ArrayList<Product> products) {
        System.out.println("Введите что вы хотите: + \n 1. Регистрация \n 2.Авторизация \n 3.Выйти");
        int choose = scanner.nextInt();
        while (choose!=3) {
            switch (choose) {
                case 1:
                    authService.registration(users);
                    break;
                case 2:
                    authService.login(users);
                    break;
                case 3:
                    break;
            }
            System.out.println("Если вы админ, то нажмите 1, если вы пользователь то нажмите любую другую цифру");
            int choose1 = scanner.nextInt();
            if(choose1 == 1){
                user.setHasAdminRole(true);
            }else{
                user.setHasAdminRole(false);
            }
            if (user.isHasAdminRole()) {
                menuAdmin(user,users, product, products);
            } else {
                menuUser(user,users, product, products);
            }
        }
    }

    @Override
    public void menuAdmin(User user,HashMap<String, User> users, Product product, ArrayList<Product> products) {
        System.out.println("Введите что вы хотите: \n 1. Добавить информацию \n 2.Удалить информацию \n" +
                "3. Изменить информацию \n 4.Выйти(Или любую другую цифру)");
        int choose = scanner.nextInt();
        switch (choose){
            case 1: userService.addProduct(products);
            break;
            case 2: userService.changeProduct(products);
            break;
            case 3: userService.deleteProduct(products);
            break;
            default: break;
        }
    }

    @Override
    public void menuUser(User user,HashMap<String, User> users, Product product, ArrayList<Product> products) {
        System.out.println("Введите что вы хотите сделать: \n 1. Поиск машины\n 2.Написать отзыв \n 3.Поставить оценку " +
                "\n 4. Добавить товар в корзину" + "\n 5. Оплатить корзину \n 6. Выйти(или любая другая цифра)");
        int choose = scanner.nextInt();
        switch (choose){
            case 1: userService.search(product);
            break;
            case 2: userService.commentProduct(product);
            break;
            case 3: userService.rateProduct(product);
            break;
            case 4: userService.addProductToBasket(user,product);
            break;
            case 5:userService.payForBasket(user,products);
            break;
            default: break;
        }
    }
}
