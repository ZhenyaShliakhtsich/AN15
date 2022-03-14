package com.teachMeSkills.an15.BuzukArtyom.hw6.Zadacha3;

import java.util.Arrays;

public class Category {
    private String name;
    Product[] products;

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Category{" +
                "name='" + name + '\'' +
                ", products=" + Arrays.toString(products) +
                '}';
    }

    public Category(String name, Product[] products) {
        this.name = name;
        this.products = products;


    }

    public static void displayProductCatalogByCategory(Category category) {
        System.out.println("Каталог товаров: \n" + category.getName());
        for (Product p : category.products) {
            System.out.println(p);
        }
    }

    public static void displayCatalog(Category[] catalog) {
        System.out.println("Весь каталог:");
        for (Category b : catalog) {
            System.out.println(b.name);
        }
    }
}
