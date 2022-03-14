package com.teachMeSkills.an15.BuzukArtyom.hw6.Zadacha3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        User user1 = new User("Ivan", "pass1", new Basket(5));
        User user2 = new User("Roman", "pass2", new Basket(3));
        user1.checkUserNameAndPassword(scanner);

        Product noutbook1 = new Product("Acer", 500, 4);
        Product noutbook2 = new Product("Lenovo", 750, 5);
        Product noutbook3 = new Product("HP", 600, 4);

        Product telephone1 = new Product("Samsung", 1000, 5);
        Product telephone2 = new Product("Nokia", 200, 3);
        Product telephone3 = new Product("Apple", 1500, 4);

        Category noutbook = new Category("Ноутбуки", new Product[]{noutbook1, noutbook2, noutbook3});
        Category telephone = new Category("Телефоны", new Product[]{telephone1, telephone2, telephone3});

        Category television = new Category("Телевизор", new Product[]{new Product("Samsung", 699, 5),
                new Product("Xiaomi", 399, 4)});
        Basket user01 = new Basket(10);
        Basket user02 = new Basket(10);


        Category[] catalog = new Category[]{noutbook, telephone, television};

        user1.basket.addProduct(noutbook2);
        user1.basket.addProduct(telephone2);
        user1.basket.addProduct(telephone3);
        user1.basket.deleteProduct(noutbook2);
        System.out.println();

        Category.displayCatalog(catalog);
        System.out.println("---------------");
        Product[] products = new Product[]{noutbook1, noutbook2, noutbook3, telephone1, telephone2, telephone3};

        Category.displayProductCatalogByCategory(noutbook);
        System.out.println();
        Category.displayProductCatalogByCategory(telephone);
        System.out.println();
        Category.displayProductCatalogByCategory(television);
        System.out.println("--------------");
        System.out.println("Весь каталог: ");
        Basket.displayProducts(products);
        System.out.println();


    }
}

