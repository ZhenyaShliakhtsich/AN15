package com.teachMeSkills.an15.BuzukArtyom.hw6.Zadacha3;

import java.util.Arrays;

public class Basket {
    private Product[] products;
    private int size;

    public Basket(int capacity) {
        products = new Product[capacity];
    }

    public boolean addProduct(Product product) {
        if (size < products.length) {
            products[size] = product;
            size++;
            System.out.println("Корзина: " + product);
            return true;
        }
        return false;
    }

    public boolean deleteProduct(Product product) {
        for (int i = 0; i < size; i++) {
            if (products[i].equals(product)) {
                products[i] = products[size - 1];
                size--;
                System.out.println(product.getName() + " удалён");
                return true;
            }
        }
        return false;
    }

    public static void displayProducts(Product[] products) {
        for (int i = 0; i < products.length; i++) {
            System.out.println(products[i]);
        }
    }

    @Override
    public String toString() {
        return "Корзина:" + Arrays.toString(products);
    }
}
