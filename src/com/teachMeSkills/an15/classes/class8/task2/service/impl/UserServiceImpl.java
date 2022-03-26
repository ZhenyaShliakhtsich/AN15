package com.teachMeSkills.an15.classes.class8.task2.service.impl;

import com.teachMeSkills.an15.classes.class8.task2.model.Basket;
import com.teachMeSkills.an15.classes.class8.task2.model.Product;
import com.teachMeSkills.an15.classes.class8.task2.model.User;
import com.teachMeSkills.an15.classes.class8.task2.service.UserService;

import java.util.ArrayList;
import java.util.Scanner;

public class UserServiceImpl implements UserService {

    private Scanner scanner = new Scanner(System.in);

    @Override
    public void addProduct(ArrayList<Product> products) {
        System.out.println("Введите название продукта:");
        String name = scanner.nextLine();

        //TODO: all other parameters should be scanned from console and set to object

        Product product = new Product();
        product.setName(name);

        //TODO: should be changed from setters to constructor initialization

        products.add(product);

    }

    @Override
    public void changeProduct(ArrayList<Product> products) {

        System.out.println("Введите продукт, который хотите изменить");
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
        //TODO: CHOICE SWITCH WITH POSSIBLE CHANGES

    }

    @Override
    public void deleteProduct(ArrayList<Product> products) {
        System.out.println("Введите продукт, который хотите удалить");
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
}
