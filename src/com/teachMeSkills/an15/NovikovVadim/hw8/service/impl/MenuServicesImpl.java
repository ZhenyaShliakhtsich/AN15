package com.teachMeSkills.an15.NovikovVadim.hw8.service.impl;

import com.teachMeSkills.an15.NovikovVadim.hw8.EnumMenu;
import com.teachMeSkills.an15.NovikovVadim.hw8.model.MyScanner;
import com.teachMeSkills.an15.NovikovVadim.hw8.model.Product;
import com.teachMeSkills.an15.NovikovVadim.hw8.model.User;
import com.teachMeSkills.an15.NovikovVadim.hw8.service.AuthService;
import com.teachMeSkills.an15.NovikovVadim.hw8.service.DataBaseService;
import com.teachMeSkills.an15.NovikovVadim.hw8.service.MenuServices;
import com.teachMeSkills.an15.NovikovVadim.hw8.service.UserService;

import java.util.ArrayList;
import java.util.HashMap;

public class MenuServicesImpl extends MyScanner implements MenuServices {
    AuthService authService = new AuthServiceImpl();
    UserService userService = new UserServiceImpl();

    public void sign(HashMap<String, User> users, boolean isAdmin, ArrayList<Product> products) {

        int iter = 1;
        System.out.println("****************************");
        System.out.println(EnumMenu.Sign);
        System.out.println(String.format("%d. %s", iter++, EnumMenu.Sign_Reg));
        System.out.println(String.format("%d. %s", iter++, EnumMenu.Sign_Auth));
        System.out.println(String.format("%d. %s", iter++, EnumMenu.Menu));
        System.out.println(String.format("%d. %s", iter++, EnumMenu.Menu_Exit));
        System.out.println("****************************");

        int command = getIntFromScanner();

        switch (command) {
            case 1:
                productMenuSHow(authService.registration(users, "", isAdmin), users, isAdmin, products);
                break;
            case 2:
                productMenuSHow(authService.authorization(users, "", isAdmin), users, isAdmin, products);
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

    public void productMenuSHow(User user, HashMap<String, User> users, boolean isAdmin, ArrayList<Product> products) {
        if (user == null) {
            menu(users, products);
            return;
        }

        if (isAdmin) {
            int iter = 1;
            System.out.println("****************************");
            System.out.println(EnumMenu.ProductAdmin);
            System.out.println(String.format("%d. %s", iter++, EnumMenu.ProductAdmin_add));
            System.out.println(String.format("%d. %s", iter++, EnumMenu.ProductAdmin_del));
            System.out.println(String.format("%d. %s", iter++, EnumMenu.ProductAdmin_change));
            System.out.println(String.format("%d. %s", iter++, EnumMenu.ProductAdmin_show));
            System.out.println(String.format("%d. %s", iter++, EnumMenu.Menu));
            System.out.println(String.format("%d. %s", iter++, EnumMenu.Menu_Exit));
            System.out.println("****************************");

            int command = getIntFromScanner();

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
                    userService.showProducts(products, false);
                    productMenuSHow(user, users, isAdmin, products);
                    break;
                case 5:
                    menu(users, products);
                    break;
                case 6:
                    DataBaseService dataBaseService = new DataBaseServiceImpl();
                    dataBaseService.saveDB(users, products);
                    return;
                default:
                    System.out.println("Неверная команда");
                    productMenuSHow(user, users, isAdmin, products);
            }

        } else {
            int iter = 1;
            System.out.println("****************************");
            System.out.println(EnumMenu.ProductUser);
            System.out.println(String.format("%d. %s", iter++, EnumMenu.ProductUser_show));
            System.out.println(String.format("%d. %s", iter++, EnumMenu.ProductUser_searchCarName));
            System.out.println(String.format("%d. %s", iter++, EnumMenu.ProductUser_searchName));
            System.out.println(String.format("%d. %s", iter++, EnumMenu.ProductUser_comment));
            System.out.println(String.format("%d. %s", iter++, EnumMenu.ProductUser_rate));
            //ystem.out.println(String.format("%d. %s", iter++, EnumMenu.ProductBasket_showBasket));
            System.out.println(String.format("%d. %s", iter++, EnumMenu.ProductBasket));
            System.out.println(String.format("%d. %s", iter++, EnumMenu.Menu));
            System.out.println(String.format("%d. %s", iter++, EnumMenu.Menu_Exit));
            System.out.println("****************************");

            int command = getIntFromScanner();

            switch (command) {
                case 1:
                    userService.showProducts(products, false);
                    productMenuSHow(user, users, isAdmin, products);
                    break;
                case 2:
                    userService.searchCarName(user, products);
                    productMenuSHow(user, users, isAdmin, products);
                    break;
                case 3:
                    userService.searchName(user, products);
                    productMenuSHow(user, users, isAdmin, products);
                    break;
                case 4:
                    userService.setCommentProduct(user, products);
                    productMenuSHow(user, users, isAdmin, products);
                    break;
                case 5:
                    userService.setRateProduct(user, products);
                    productMenuSHow(user, users, isAdmin, products);
                    break;
//                case 6:
//                    userService.basket(user, products);
//                    break;
                case 6:
                    menuBasket(user, users, products);
                    productMenuSHow(user, users, isAdmin, products);
                    break;
                case 7:
                    menu(users, products);
                    break;
                case 8:
                    return;
                default:
                    System.out.println("Неверная команда");
                    productMenuSHow(user, users, isAdmin, products);
            }
        }
    }

    private void menuBasket(User user, HashMap<String, User> users, ArrayList<Product> products) {
        int iter = 1;
        System.out.println("****************************");
        System.out.println(EnumMenu.ProductBasket);
        System.out.println(String.format("%d. %s", iter++, EnumMenu.ProductBasket_showBasket));
        System.out.println(String.format("%d. %s", iter++, EnumMenu.ProductBasket_add));
        System.out.println(String.format("%d. %s", iter++, EnumMenu.ProductBasket_del));
        System.out.println(String.format("%d. %s", iter++, EnumMenu.ProductBasket_pay));
        System.out.println(String.format("%d. %s", iter++, EnumMenu.ProductUser));
        System.out.println("****************************");

        int command = getIntFromScanner();

        switch (command) {
            case 1:
                userService.showBasket(user);
                menuBasket(user, users, products);
                break;
            case 2:
                userService.addProductToBasket(user, products);
                menuBasket(user, users, products);
                break;
            case 3:
                userService.deleteProductFromBasket(user);
                menuBasket(user, users, products);
                break;
            case 4:
                userService.payForBasket(user);
                menuBasket(user, users, products);
                break;
            case 5:
                return;
            default:
                System.out.println("Неверная команда, повторите ввод.");
                menuBasket(user, users, products);

        }

    }

    @Override
    public void menu(HashMap<String, User> users, ArrayList<Product> products) {
        int iter = 1;
        System.out.println("****************************");
        System.out.println(EnumMenu.Menu);
        System.out.println(String.format("%d. %s", iter++, EnumMenu.Menu_Admin));
        System.out.println(String.format("%d. %s", iter++, EnumMenu.Menu_User));
        System.out.println(String.format("%d. %s", iter++, EnumMenu.Menu_Exit));
        System.out.println("****************************");

        int command = getIntFromScanner();

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
                System.out.println("Неверная команда, повторите ввод.");
                menu(users, products);

        }
    }

}
