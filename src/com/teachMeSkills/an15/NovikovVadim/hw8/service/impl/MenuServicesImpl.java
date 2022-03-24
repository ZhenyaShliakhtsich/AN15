package com.teachMeSkills.an15.NovikovVadim.hw8.service.impl;

import com.teachMeSkills.an15.NovikovVadim.hw8.EnumMenu;
import com.teachMeSkills.an15.NovikovVadim.hw8.model.Product;
import com.teachMeSkills.an15.NovikovVadim.hw8.model.User;
import com.teachMeSkills.an15.NovikovVadim.hw8.service.AuthService;
import com.teachMeSkills.an15.NovikovVadim.hw8.service.MenuServices;
import com.teachMeSkills.an15.NovikovVadim.hw8.service.UserService;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class MenuServicesImpl implements MenuServices {
    AuthService authService = new AuthServiceImpl();
    UserService userService = new UserServiceImpl();

    public void productMenuSHow(User user, HashMap<String, User> users, boolean isAdmin, ArrayList<Product> products) {

        if (user == null) {
            menu(users, products);
            return;
        }

        System.out.println(user.getLoginAndPassword());

        if (isAdmin) {
            System.out.println(EnumMenu.ProductAdmin);
            System.out.println("1. " + EnumMenu.ProductAdmin_add);
            System.out.println("2. " + EnumMenu.ProductAdmin_del);
            System.out.println("3. " + EnumMenu.ProductAdmin_change);
            System.out.println("4. " + EnumMenu.ProductAdmin_show);
            System.out.println("5. " + EnumMenu.Menu);
            System.out.println("6. " + EnumMenu.Menu_Exit);
            Scanner scanner = new Scanner(System.in);
            int command = getCommand();

            switch (command) {
                case 1:
                    userService.addProduct(products);
                    productMenuSHow(user, users, isAdmin, products);
                    break;
                case 2:
                    userService.deleteProduct(products);
                    productMenuSHow(user, users, isAdmin, products);
                    break;
                case 3:
                    userService.changeProduct(products);
                    productMenuSHow(user, users, isAdmin, products);
                    break;
                case 4:
                    userService.showProducts(products);
                    productMenuSHow(user, users, isAdmin, products);
                    break;
                case 5:
                    menu(users, products);
                    break;
                case 6:
                    return;
                default:
                    System.out.println("Неверная команда");
                    productMenuSHow(user, users, isAdmin, products);
            }

        } else {
            System.out.println(EnumMenu.ProductUser);
            System.out.println("1. " + EnumMenu.Menu);
            System.out.println("2. " + EnumMenu.Menu_Exit);
            Scanner scanner = new Scanner(System.in);
            int command = getCommand();

            switch (command) {
                case 1:
                    menu(users, products);
                    break;
                case 2:
                    return;
                default:
                    System.out.println("Неверная команда");
                    productMenuSHow(user, users, isAdmin, products);
            }
        }
    }

    public void sign(HashMap<String, User> users, boolean isAdmin, ArrayList<Product> products) {
        System.out.println(EnumMenu.Sign);
        System.out.println("1. " + EnumMenu.Sign_Reg);
        System.out.println("2. " + EnumMenu.Sign_Auth);
        System.out.println("3. " + EnumMenu.Menu);
        System.out.println("4. " + EnumMenu.Menu_Exit);

        Scanner scanner = new Scanner(System.in);
        int command = getCommand();

        switch (command) {
            case 1:
                productMenuSHow(authService.registration(users, "", isAdmin), users, isAdmin, products);
                break;
            case 2:
                productMenuSHow(authService.authlogin(users, "", isAdmin), users, isAdmin, products);
                break;
            case 3:
                menu(users, products);
                break;
            case 4:
                return;
            default:
                System.out.println("Неверная команда");
                sign(users, isAdmin, products);
                //menu(users);
        }

    }

    @Override
    public void menu(HashMap<String, User> users, ArrayList<Product> products) {
        System.out.println(EnumMenu.Menu);
        System.out.println("1. " + EnumMenu.Menu_Admin);
        System.out.println("2. " + EnumMenu.Menu_User);
        System.out.println("3. " + EnumMenu.Menu_Exit);

        Scanner scanner = new Scanner(System.in);
        int command = getCommand();

        switch (command) {
            case 1:
                sign(users, true, products);
                break;
            case 2:
                sign(users, false, products);
                //menu(users);
                break;
            case 3:
                return;
            default:
                System.out.println("Неверная команда, повторите ввод:");
                menu(users, products);

        }
    }

    private int getCommand() {
        Scanner scanner = new Scanner(System.in);
        try {
            int result = scanner.nextInt();
            return result;
        } catch (Exception e) {
            System.out.println("Неверная команда, повторите ввод");
            return getCommand();
        }
    }
}
