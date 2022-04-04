package com.teachMeSkills.an15.LashkevichGeorgy.hw7.Task2.service.impl;


import com.teachMeSkills.an15.LashkevichGeorgy.hw7.Task2.models.Basket;
import com.teachMeSkills.an15.LashkevichGeorgy.hw7.Task2.models.Product;
import com.teachMeSkills.an15.LashkevichGeorgy.hw7.Task2.models.User;
import com.teachMeSkills.an15.LashkevichGeorgy.hw7.Task2.service.UserService;

import java.io.*;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.*;

public class UserServiceImpl implements UserService {


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
        Scanner scanner4 = new Scanner(System.in);
        System.out.println("\nВведите название продукта:");
        String name = scanner4.nextLine();
        System.out.println("Введите количество продуктов:");
        int amount = scanner4.nextInt();
        System.out.println("Введите цену продукта:");
        BigDecimal price = scanner4.nextBigDecimal();
        System.out.println("Введите название машины:");
        String carName = scanner4.nextLine();
        System.out.println(scanner4.next());
         /*System.out.println("Введи коммент:");
        String comment = scanner.nextLine();*/


        //TODO: all other parameters should be scanned from console and set to object

        Product product = new Product();
        product.setName(name);
        product.setAmount(amount);
        product.setPrice(price);
       //product.setComment(comment);
        product.setCarNames(carName);


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
        Scanner scanner2 = new Scanner(System.in);
        String name = scanner2.nextLine();
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


        boolean flag = true;

        while (flag) {
            System.out.println("Че хочешь изменить?\n" +
                    "Чтобы изменить название нажать \"1\"\n" +
                    "Чтобы изменить цену нажать \"2\"\n" +
                    "Чтобы изменить оценку нажать \"3\"\n" +
                    "Чтобы изменить количество нажать \"4\"\n" +
                    "Чтобы изменить комментарий нажать \"5\"\n" +
                    "ЧТобы выйти из программы набрать \"10\"");
            Scanner scanner3 = new Scanner(System.in);
            int choice = scanner3.nextInt();
            //TODO: CHOICE SWITCH WITH POSSIBLE CHANGES
            switch (choice) {
                case 1:
                    System.out.println("Введи новое имя");
                    System.out.println(scanner3.nextLine());
                    products.get(index).setName(scanner3.nextLine());
                    break;
                case 2:
                    System.out.println("Введи новую цену");
//                BigDecimal newPrice = ;
                    products.get(index).setPrice(scanner3.nextBigDecimal());
                    break;
                case 3:
                    System.out.println("Введи новую оценку");
                    //нужна проверка
//                int newRate = ;
                    products.get(index).getRates().set(0, scanner3.nextInt());
                    break;
                case 4:
                    System.out.println("Меняем количество на:");
                    System.out.println(scanner3.nextLine());
                    products.get(index).setAmount(scanner3.nextInt());
                    break;
                case 5:
                    System.out.println("Изменить комментарий на:");
                    System.out.println(scanner3.nextLine());
                    products.get(index).setComment(scanner3.nextLine());
                    break;
                case 6:
                    System.out.println("Изменить мраку машины на:");
                    products.get(index).setCarNames(scanner3.nextLine());
                    break;
                case 10:
                    System.out.println("Админ, иди спать.");
                    flag = false;

            }
            System.out.println("после изменения\n" + products.get(index));
        }

    }


    @Override
    public void deleteProduct(ArrayList<Product> products) {
        Scanner scanner = new Scanner(System.in);
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
        ArrayList<Product> array = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        if (user.getBasket() == null) {
        } else {
            for (int i = 0; i < user.getBasket().getProducts().size(); i++) {
                array.add(user.getBasket().getProducts().get(i));
            }
        }
        Basket basket = new Basket();
        showAllProducts(products);
        System.out.println("\nКакой продукт хотим добавить в корзину?\n");
        String productToBasket = scanner.nextLine();
        int index = -1;
        for (int i = 0; i < products.size(); i++) {
            if (productToBasket.equalsIgnoreCase(products.get(i).getName())) {
                index = i;
                break;
            }
        }
        if (index == -1) {
            addProductToBasket(user, products);
        } else {
            array.add(products.get(index));
            basket.setProducts(array);
            user.setBasket(basket);
        }


    }

    @Override
    public void payForBasket(User user, ArrayList<Product> products) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy.MM.dd-HH.mm.ss");
        ArrayList<String> finalText = new ArrayList<>();
        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(String.format(
                    "src/com/teachMeSkills/an15/LashkevichGeorgy/hw7/Task2/receipt%s.txt", simpleDateFormat.format(new Date()))));
            finalText.add("Покупка проведена успешно. Оплачено: " + user.getBasket().getTotalPrice() + " у.е.");
            for (int i = 0; i < user.getBasket().getProducts().size(); i++) {
                finalText.add(" Был куплен товар " + user.getBasket().getProducts().get(i).getName());
                for (int j = 0; j < products.size(); j++) {
                    if (products.get(j) == user.getBasket().getProducts().get(i)) {
                        products.get(j).setAmount(products.get(j).getAmount() - 1);
                    }
                }
            }
            bufferedWriter.write(Arrays.toString(new ArrayList[]{finalText}));
            bufferedWriter.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        user.getBasket().setProducts(new ArrayList<>());

    }

    @Override
    public void deleteProductFromBasket(User user) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Что удалить из корзины?");
        String deleteFromBasket = scanner.nextLine();
        int index = -1;
        for (int i = 0; i < user.getBasket().getProducts().size(); i++) {
            if (deleteFromBasket.equalsIgnoreCase(user.getBasket().getProducts().get(i).getName())) {
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
        Scanner scanner = new Scanner(System.in);
        System.out.println("Какому продукту ставим оценку?");
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
            rateProduct(products);
        } else {
            System.out.println("Ввести оценку");
            products.get(index).getRates().add(scanner.nextInt());
        }
    }

    @Override
    public void commentProduct(ArrayList<Product> products) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Какому продукту добавляем коммент?");
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
            commentProduct(products);
        } else {
            System.out.println("Введите текст комментария");
            products.get(index).setComment(scanner.nextLine());
        }
    }

    @Override
    public void showProducts(ArrayList<Product> products) {
        for (int i = 0; i < products.size(); i++) {
            System.out.print(products.get(i) + ", \n");
        }
    }
}