package com.teachMeSkills.an15.NovikovVadim.hw8.service.impl;

import com.teachMeSkills.an15.NovikovVadim.hw8.EnumMenu;
import com.teachMeSkills.an15.NovikovVadim.hw8.model.Product;
import com.teachMeSkills.an15.NovikovVadim.hw8.model.User;
import com.teachMeSkills.an15.NovikovVadim.hw8.service.UserService;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Scanner;

public class UserServiceImpl implements UserService {

    private Scanner scanner = new Scanner(System.in);

    @Override
    public void addProduct(ArrayList<Product> products) {
        //сделаем общую обработку исключения.
        try {
            Product product = new Product();

            System.out.println("Введите название запчасти:");
            String name = scanner.nextLine();
            product.setName(name);

            System.out.println("Введите стоимость запчасти:");
            BigDecimal cost = scanner.nextBigDecimal();
            product.setPrice(cost);

            System.out.println("Введите количество запчастей:");
            int amount = getCommand();
            product.setAmount(amount);

            //product.setCarNames();

            products.add(product);

        } catch (Exception e) {
            System.out.println("Ошибка ввода, повторите: ");
            addProduct(products);
        }

    }

    @Override
    public void showProducts(ArrayList<Product> products) {
        System.out.println("Список запчастей>>>>>>>>>");
        int i = 0;
        for (Product product : products) {
            System.out.println(++i + ". " + product.getName());
        }
        System.out.println("<<<<<<<<<Список запчастей");
    }

    @Override
    public void changeProduct(ArrayList<Product> products) {

        System.out.println("Введите наименование запчасти, которую хотите изменить");
        showProducts(products);
        String name = scanner.nextLine();

        Product product = null;
        int index = -1;
        for (int i = 0; i < products.size(); i++) {
            if (name.equalsIgnoreCase(products.get(i).getName())) {
                index = i;
                product = products.get(index);
                break;
            }
        }
        if (index == -1) {
            System.out.println("Неверная команда: ");
            changeProduct(products);
        } else {
            System.out.println("Что изменить?");
            System.out.println("1. " + EnumMenu.ProductChangeMenu_name);
            System.out.println("2. " + EnumMenu.ProductChangeMenu_amount);
            System.out.println("3. " + EnumMenu.ProductChangeMenu_cost);
            System.out.println("4. " + EnumMenu.ProductChangeMenu);
            System.out.println("5. " + EnumMenu.ProductAdmin);
            System.out.println("6. " + EnumMenu.Menu);
            System.out.println("7. " + EnumMenu.Menu_Exit);

            int command = scanner.nextInt();

            switch (command) {
                case 1:
                    System.out.println("Введите наименование запчасти:");
                    product.setName(scanner.nextLine());
                    break;
                case 2:
                    System.out.println("Введите стоимость запчасти:");
                    product.setPrice(scanner.nextBigDecimal());
                    break;
                case 3:
                    System.out.println("Введите количество запчастей:");
                    product.setAmount(getCommand());
                    break;
                case 4:
                    return;
                default:
                    return;
            }

        }
    }

    @Override
    public void deleteProduct(ArrayList<Product> products) {
        System.out.println("Введите наименование запчати, которую хотите удалить");
        showProducts(products);
        String name = scanner.nextLine();

        int index = -1;
        for (int i = 0; i < products.size(); i++) {
            if (name.equalsIgnoreCase(products.get(i).getName())) {
                index = i;
                break;
            }
        }
        if (index == -1) {
            System.out.println("Неверная команда: ");
            deleteProduct(products);
        } else {
            products.remove(products.get(index));
        }

    }

    @Override
    public void addProductToBasket(User user, ArrayList<Product> products) {

    }

    @Override
    public void payForBasket(User user) {

    }

    @Override
    public void deleteProductFromBasket(User user) {

    }

    @Override
    public void rateProduct(ArrayList<Product> products) {

    }

    @Override
    public void commentProduct(ArrayList<Product> products) {

    }

    private int getCommand() {
        Scanner scanner = new Scanner(System.in);
        try {
            int result = scanner.nextInt();
            return result;
        } catch (Exception e) {
            System.out.println("Некорректная команда, повторите ввод");
            return getCommand();
        }
    }

}
