package com.teachMeSkills.an15.PilyushinYuri.hw8.task2.service.impl;

import com.teachMeSkills.an15.PilyushinYuri.hw8.task2.model.Product;
import com.teachMeSkills.an15.PilyushinYuri.hw8.task2.model.User;
import com.teachMeSkills.an15.PilyushinYuri.hw8.task2.service.UserService;


import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class UserServiceImpl implements UserService {

    private Scanner scanner = new Scanner(System.in);

    @Override
    public void addProduct(ArrayList<Product> products) {
        System.out.println("Введите название продукта:");
        String name = scanner.nextLine();
        System.out.println("Введите цену продукта:");
        BigDecimal price = scanner.nextBigDecimal();
        System.out.println("Введите количество продукта в наличии:");
        int amount = scanner.nextInt();
        System.out.println("Добавить машину:");
        HashSet<String> carNames = new HashSet<>();
        boolean stop = false;
        while (!stop) {
            System.out.println("Введите машину,к которой подходит этот продукт.Введите СТОП если хотите закончить");
            String car = scanner.nextLine();
            if (car.equals("СТОП")) {
                stop = true;
            } else
                carNames.add(car);
        }

        //TODO: all other parameters should be scanned from console and set to object

        Product product = new Product();
        product.setName(name);
        product.setPrice(price);
        product.setAmount(amount);
        product.setCarNames(carNames);

        //TODO: should be changed from setters to constructor initialization

        products.add(product);

    }

    @Override
    public void changeProduct(ArrayList<Product> products) {

        System.out.println("Введите продукт, который хотите изменить");
        Scanner scanner = new Scanner(System.in);
        System.out.println(products);

        //TODO: show list of products
        String name = scanner.nextLine();

        int index = -1;
        for (int i = 0; i < products.size(); i++) {
            if (name.equalsIgnoreCase(products.get(i).getName())) {
                index = i;
                break;
            }
        }
        if (index == -1) {
            changeProduct(products);
        }
        System.out.println("Че хочешь изменить?");
        String choice = scanner.nextLine();
        switch (choice) {
            case "название продукта":
                products.get(index).setName(scanner.nextLine());
                break;

            case "цена продукта":
                products.get(index).setPrice(scanner.nextBigDecimal());
                break;
            case "количество продукта в наличии:":
                products.get(index).setAmount(scanner.nextInt());
                break;
            case "добавить еще машину":
                products.get(index).getCarNames().add(scanner.nextLine());
                break;
        }
        //TODO: CHOICE SWITCH WITH POSSIBLE CHANGES
    }

    @Override
    public void deleteProduct(ArrayList<Product> products) {
        System.out.println("Введите продукт, который хотите удалить");
        System.out.println(products);
        //TODO: show list of products
        String name = scanner.nextLine();

        int index = -1;
        for (int i = 0; i < products.size(); i++) {
            if (name.equalsIgnoreCase(products.get(i).getName())) {
                index = i;
                break;
            }
        }
        if (index == -1) {
            deleteProduct(products);
        } else {
            products.remove(products.get(index));
        }
    }

    @Override
    public void addProductToBasket(User user, ArrayList<Product> products) {
        System.out.println(products);
        System.out.println("Введите название продукта");
        String productSelect = scanner.nextLine();
        int index = -1;
        for (int i = 0; i < products.size(); i++) {
            if (productSelect.equalsIgnoreCase(products.get(i).getName())) {
                index = i;
                break;
            }
        }
        if (index == -1) {
            addProductToBasket(user, products);
        } else {
            user.getBasket().getProducts().get(index);
        }


    }

    @Override
    public void payForBasket(User user, ArrayList<Product> products) {
        PriceServiceImpl priceService = new PriceServiceImpl();
        System.out.println("Цена на скидкой : " + priceService.calculateTotalBasketPrice(user));
        System.out.println("Введите /Оплачиваю/ чтобы оплатить");
        String payment = scanner.nextLine();
        if (payment.equals("Оплачиваю")) {
            System.out.println("Товары оплачены");
            for (Product productsBasket: user.getBasket().getProducts()) {
                for (Product product : products) {
                    if (productsBasket.getName().equals(product.getName())) {
                        product.setAmount(product.getAmount() - 1);
                    }
                }
            }
        }
    }



    @Override
    public void deleteProductFromBasket(User user) {
        System.out.println(user.getBasket().getProducts());
        System.out.println("Введите название продукта");
        String productToDelete = scanner.nextLine();
        int index = -1;
        for (int i = 0; i < user.getBasket().getProducts().size(); i++) {
            if (productToDelete.equalsIgnoreCase(user.getBasket().getProducts().get(i).getName())) {
                index = i;
                break;
            }
        }
        if (index == -1) {
            deleteProductFromBasket(user);
        } else {
            user.getBasket().getProducts().remove(index);
        }

    }

    @Override
    public void rateProduct(ArrayList<Product> products) {
        System.out.println("");
        products.get(products.indexOf(scanner.nextLine()));


    }

    @Override
    public void commentProduct(ArrayList<Product> products) {
        System.out.println(products);
        System.out.println("Введите название продукта");
        String productSelect = scanner.nextLine();
        int index = -1;
        for (int i = 0; i < products.size(); i++) {
            if (productSelect.equalsIgnoreCase(products.get(i).getName())) {
                index = i;
                break;
            }
        }
        if (index == -1) {
            commentProduct(products);
        } else {
            products.get(index).setComment(scanner.nextLine());
        }

    }
}
