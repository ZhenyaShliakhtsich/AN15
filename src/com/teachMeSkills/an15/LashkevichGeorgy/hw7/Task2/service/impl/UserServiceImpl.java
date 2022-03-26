package com.teachMeSkills.an15.LashkevichGeorgy.hw7.Task2.service.impl;


import com.teachMeSkills.an15.LashkevichGeorgy.hw7.Task2.models.Basket;
import com.teachMeSkills.an15.LashkevichGeorgy.hw7.Task2.models.Product;
import com.teachMeSkills.an15.LashkevichGeorgy.hw7.Task2.models.User;
import com.teachMeSkills.an15.LashkevichGeorgy.hw7.Task2.service.UserService;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class UserServiceImpl implements UserService {

    private Scanner scanner = new Scanner(System.in);

    /* @Override
     public void addProduct(ArrayList<Product> products) {
         System.out.println("Введите название продукта:");
         String name = scanner.nextLine();
         System.out.println("Введите количество продуктов:");
         int amount = scanner.nextInt();
         System.out.println("Введите цену продукта:");
         BigDecimal price = scanner.nextBigDecimal();
         System.out.println("Введите комментарий для продукта:");
         System.out.println(scanner.nextLine());
         String comment = scanner.nextLine();
         System.out.println("Введите название машины:");
         String carName = scanner.nextLine();


         //TODO: all other parameters should be scanned from console and set to object

         Product product = new Product();
         product.setName(name);
         product.setAmount(amount);
         product.setPrice(price);
         product.setComment(comment);
         product.setCarNames(carName);


         //TODO: should be changed from setters to constructor initialization

         products.add(product);

     }
 */
    @Override
    public void addProduct(ArrayList<Product> products) {
        System.out.println("Введите название продукта:");
        String name = scanner.nextLine();
        System.out.println("Введите количество продуктов:");
        int amount = scanner.nextInt();
        System.out.println("Введите цену продукта:");
        BigDecimal price = scanner.nextBigDecimal();
        System.out.println("Введите комментарий для продукта:");
        System.out.println(scanner.nextLine());
        String comment = scanner.nextLine();
        System.out.println("Введите оценку продукта:");
        ArrayList<Integer> rate = new ArrayList<>();
        rate.add(scanner.nextInt());
        System.out.println("Введите название машины:");
        System.out.println(scanner.nextLine());
        String carName = scanner.nextLine();


        //TODO: all other parameters should be scanned from console and set to object

        Product product = new Product();
        product.setName(name);
        product.setAmount(amount);
        product.setPrice(price);
        product.setComment(comment);
        product.setCarNames(carName);
        product.setRates(rate);


        //TODO: should be changed from setters to constructor initialization

        products.add(product);

    }

    void showAllProducts(ArrayList<Product> products) {
        for (int i = 0; i < products.size(); i++) {
            System.out.print(products.get(i).getName() + ", ");
        }
    }

    @Override
    public void changeProduct(ArrayList<Product> products) {

        System.out.println("Введите продукт, который хотите изменить\n");
        showAllProducts(products);
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
        System.out.println("Че хочешь изменить?\n" +
                "Чтобы изменить название нажать \"1\"\n" +
                /*"Чтобы изменить цену нажать \"2\"\n" +
                "Чтобы изменить оценку нажать \"3\"\n" +*/
                "Чтобы изменить количество нажать \"4\"\n" +
                "Чтобы изменить комментарий нажать \"5\"\n");


        int choice = scanner.nextInt();
        //TODO: CHOICE SWITCH WITH POSSIBLE CHANGES
        switch (choice) {
            case 1:
                System.out.println("Введи новое имя");
                System.out.println(scanner.nextLine());
                products.get(index).setName(scanner.nextLine());
                break;
            /*case 2:
                System.out.println("Введи новую цену");
//                BigDecimal newPrice = ;
                products.get(index).setPrice(scanner.nextBigDecimal());
                break;*/
           /* case 3:
                System.out.println("Введи новую оценку");
                //нужна проверка
//                int newRate = ;
                products.get(index).getRates().set(0, scanner.nextInt());
                break;*/
            case 4:
                System.out.println("Меняем количество на:");
                System.out.println(scanner.nextLine());
                products.get(index).setAmount(scanner.nextInt());
                break;
            case 5:
                System.out.println("Изменить комментарий на:");
                System.out.println(scanner.nextLine());
                products.get(index).setComment(scanner.nextLine());
                break;
           /* case 6:
                System.out.println("Изменить мраку машины на:");
                products.get(index).setCarNames(scanner.nextLine());
                break;*/


        }
        System.out.println("после изменения\n" + products.get(index));


    }


    @Override
    public void deleteProduct(ArrayList<Product> products) {
        System.out.println("\nВведите продукт, который хотите удалить");
        //TODO: show list of products
        showAllProducts(products);
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
        Basket basket = new Basket();
        System.out.println("Какой продукт хотим добавить в корзину?\n");
        showAllProducts(products);
        String productToBasket = scanner.nextLine();
        System.out.println("\nКакое количество?");
        int amountToBasket = scanner.nextInt();
        int index = -1;
        for (int i = 0; i < products.size(); i++) {
            if (productToBasket.equalsIgnoreCase(products.get(i).getName())) {
                index = i;
                break;
            }
            if (index == -1) {
                addProductToBasket(user, products);
            } else {
                user.setBasket(basket.getProducts().get(index));
                user.getBasket().getProducts().get(index).setAmount(amountToBasket);
            }
        }
        System.out.println(user.getBasket().toString());

    }

    @Override
    public void payForBasket(User user) {
        BigDecimal total = BigDecimal.valueOf(0);
        for (int i = 0; i < user.getBasket().getProducts().size(); i++) {
            total.add(user.getBasket().getProducts().get(i).getPrice());
        }
        user.getBasket().setTotalPrice(total);
        System.out.println(user.getBasket());
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
