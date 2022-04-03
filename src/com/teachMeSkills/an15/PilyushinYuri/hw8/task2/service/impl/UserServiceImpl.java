package com.teachMeSkills.an15.PilyushinYuri.hw8.task2.service.impl;

import com.teachMeSkills.an15.PilyushinYuri.hw8.task2.model.*;
import com.teachMeSkills.an15.PilyushinYuri.hw8.task2.service.UserService;


import java.math.BigDecimal;
import java.util.*;

import static com.teachMeSkills.an15.PilyushinYuri.hw8.task2.DataBase.PRODUCTS;


public class UserServiceImpl implements UserService {

    private Scanner scanner = new Scanner(System.in);

    @Override
    public void addProduct() {
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

        PRODUCTS.add(product);

    }

    @Override
    public void changeProduct() {

        System.out.println("Введите продукт, который хотите изменить");
        Scanner scanner = new Scanner(System.in);
        System.out.println(PRODUCTS);

        //TODO: show list of products
        String name = scanner.nextLine();

        int index = -1;
        for (int i = 0; i < PRODUCTS.size(); i++) {
            if (name.equalsIgnoreCase(PRODUCTS.get(i).getName())) {
                index = i;
                break;
            }
        }
        if (index == -1) {
            changeProduct();
        }
        System.out.println("Че хочешь изменить?");
        String choice = scanner.nextLine();
        switch (choice) {
            case "название продукта":
                PRODUCTS.get(index).setName(scanner.nextLine());
                break;

            case "цена продукта":
                PRODUCTS.get(index).setPrice(scanner.nextBigDecimal());
                break;
            case "количество продукта в наличии:":
                PRODUCTS.get(index).setAmount(scanner.nextInt());
                break;
            case "добавить еще машину":
                PRODUCTS.get(index).getCarNames().add(scanner.nextLine());
                break;
        }
        //TODO: CHOICE SWITCH WITH POSSIBLE CHANGES
    }

    @Override
    public void deleteProduct() {
        System.out.println("Введите продукт, который хотите удалить");
        System.out.println(PRODUCTS);
        //TODO: show list of products
        String name = scanner.nextLine();

        int index = -1;
        for (int i = 0; i < PRODUCTS.size(); i++) {
            if (name.equalsIgnoreCase(PRODUCTS.get(i).getName())) {
                index = i;
                break;
            }
        }
        if (index == -1) {
            deleteProduct();
        } else {
            PRODUCTS.remove(PRODUCTS.get(index));
        }
    }

    @Override
    public void addProductToBasket(User user) {
        System.out.println(PRODUCTS);
        System.out.println("Введите название продукта");
        String productSelect = scanner.nextLine();
        int index = -1;
        Product productAdd = null;
        for (int i = 0; i < PRODUCTS.size(); i++) {
            if (productSelect.equalsIgnoreCase(PRODUCTS.get(i).getName())) {
                index = i;
                productAdd = PRODUCTS.get(i);
                break;
            }
        }
        if (index == -1) {
            addProductToBasket(user);
        } else {
            Basket basket = user.getBasket();
            basket.getProducts().add(productAdd);
        }


    }

    @Override
    public void payForBasket(User user) {
        PriceServiceImpl priceService = new PriceServiceImpl();
        System.out.println("Цена на скидкой : " + priceService.calculateTotalBasketPrice(user));
        System.out.println("Введите /Оплачиваю/ чтобы оплатить");
        String payment = scanner.nextLine();
        if (payment.equals("Оплачиваю")) {
            System.out.println("Товары оплачены");
            for (Product productsBasket: user.getBasket().getProducts()) {
                for (Product product : PRODUCTS) {
                    if (productsBasket.getName().equals(product.getName())) {
                        product.setAmount(product.getAmount() - 1);
                    }
                }
                System.out.println(PRODUCTS);
            }
        }

        System.out.println("Цена на скидкой : " + priceService.calculateTotalBasketPrice(user));
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
    public void rateProduct(User user) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите название чтобы оценить");
        String nameOfProduct = scanner.nextLine();
        for (int i =0; i<user.getBasket().getProducts().size();i++){
            if (nameOfProduct.equals(user.getBasket().getProducts().get(i).getName())) {
                System.out.println("Введите оценку:");
            user.getBasket().getProducts().get(i).getRates().add(scanner.nextInt());
                    }
                }
                System.out.println(PRODUCTS);
            }


    @Override
    public void commentProduct(User user) {
        System.out.println(PRODUCTS);
        System.out.println("Введите название продукта");
        String productSelect = scanner.nextLine();
        int index = -1;
        for (int i = 0; i < PRODUCTS.size(); i++) {
            if (productSelect.equalsIgnoreCase(PRODUCTS.get(i).getName())) {
                index = i;
                break;
            }
        }
        if (index == -1) {
            commentProduct(user);
        } else {
            PRODUCTS.get(index).setComment(scanner.nextLine());
        }

    }
}
