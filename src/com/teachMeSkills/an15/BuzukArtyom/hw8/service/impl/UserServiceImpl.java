package com.teachMeSkills.an15.BuzukArtyom.hw8.service.impl;

import com.teachMeSkills.an15.BuzukArtyom.hw8.model.Basket;
import com.teachMeSkills.an15.BuzukArtyom.hw8.model.Product;
import com.teachMeSkills.an15.BuzukArtyom.hw8.model.User;
import com.teachMeSkills.an15.BuzukArtyom.hw8.service.PriceService;
import com.teachMeSkills.an15.BuzukArtyom.hw8.service.UserService;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.Scanner;

public class UserServiceImpl implements UserService {
    private Scanner scanner = new Scanner(System.in);

    @Override
    public void addProduct(ArrayList<Product> products) {
        try {
            System.out.println("Введите название продукта:");
            String name = scanner.nextLine();
            System.out.println("Введите количество:");
            int amount = scanner.nextInt();
            System.out.println("Введите стоимость:");
            BigDecimal price = scanner.nextBigDecimal();
            System.out.println("Введите отзыв:");
            String comment = scanner.nextLine();
            HashSet<String> cars = new HashSet<>();
            System.out.println("Введите название авто,к которому подходит: ");
            String carName = scanner.nextLine();
            cars.add(carName);
            Product product = new Product(name, price, amount, comment, cars);
            products.add(product);
        } catch (Exception e) {
            System.out.println("Ошидка");
        }
    }

    @Override
    public void changeProduct(ArrayList<Product> products) {
        try {
            System.out.println("Введите продукт, который хотите изменить");
            for (Product product : products) {
                System.out.println(product.getName());
            }
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
            while (true) {
                System.out.println("""
                        Чё хочешь изменить?
                         1.Название
                         2.Количество
                         3.Цену
                         4.Рейтинг
                         5.Отзыв
                         6.Автомобиль""");
                int choice = scanner.nextInt();
                switch (choice) {
                    case 1 -> {
                        System.out.println("Введите новое название");
                        Scanner scanner = new Scanner(System.in);
                        String name1 = scanner.nextLine();
                        products.get(index).setName(name1);
                        break;
                    }
                    case 2 -> {
                        System.out.println("Введите количество");
                        int amount = scanner.nextInt();
                        products.get(index).setAmount(amount);
                    }
                    case 3 -> {
                        System.out.println("Введите новую стоимость");
                        BigDecimal price = scanner.nextBigDecimal();
                        products.get(index).setPrice(price);
                    }
                    case 4 -> {
                        System.out.println("Введите рейтинг");
                        double rate = scanner.nextDouble();
                        products.get(index).setAvgRate(rate);
                    }
                    case 5 -> {
                        System.out.println("Введите отзыв");
                        String comment = scanner.nextLine();
                        products.get(index).setComment(comment);
                    }
                    case 6 -> {
                        System.out.println("К какому автомобилю подходит?");
                        HashSet<String> carName = new HashSet<>();
                        carName.add(scanner.nextLine());
                        products.get(index).setCarNames(carName);
                    }
                }
            }
        } catch (Exception e) {
            System.out.println("Ошибка");
        }
    }

    @Override
    public void deleteProduct(ArrayList<Product> products) {
        try {
            System.out.println("Введите продукт, который хотите удалить");
            for (Product product : products) {
                System.out.println(product.getName());
            }
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

        } catch (Exception e) {
            System.out.println("Ошибка");
        }
    }

    @Override
    public void addProductToBasket(User user, ArrayList<Product> products) {
        try {
            System.out.println("Что добавить в корзину?");
            for (Product product : products) {
                System.out.println(product.getName());
            }
            String choose = new Scanner(System.in).nextLine();
            for (Product product : products) {
                if (product.getName().equalsIgnoreCase(choose)) {
                    if (user.getBasket() == null) {
                        Basket basket = new Basket();
                        ArrayList<Product> products1 = new ArrayList<>();
                        products1.add(product);
                        basket.setProducts(products1);
                        user.setBasket(basket);
                    } else {
                        user.getBasket().getProducts().add(product);
                    }
                    System.out.println("Товар добавлен в корзину");
                }
            }
        } catch (Exception e) {
            System.out.println("Ошибка!!!");
        }
    }

    @Override
    public void payForBasket(User user) {
        try {
            if (user.getBasket().getProducts().size() != 0) {
                System.out.println("Ваша корзина:");
                for (Product product : user.getBasket().getProducts()) {
                    System.out.println(product.getName() + " цена: " + product.getPrice());
                }
                PriceService priceService = new PriceServiceImpl();
                priceService.calculateTotalBasketPrice(user);
                int discont = priceService.calculateDiscount();
                double discontProcent = (double) discont / 100;
                BigDecimal bigDecimal = new BigDecimal(discontProcent).setScale(3, RoundingMode.CEILING);
                BigDecimal priceWithDiscount = user.getBasket().getTotalPrice().subtract(user.getBasket().getTotalPrice().multiply(bigDecimal));
                System.out.println("Ваша скидка: " + discont + " %");
                System.out.println("К оплате сумма со скидкой: " + priceWithDiscount);
                System.out.println("Для оплаты введите - ОПЛАТИТЬ");
                String choose = new Scanner(System.in).nextLine();
                if (choose.equals("ОПЛАТИТЬ")) {
                    System.out.println("Оплата прошла успешно!");
                    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy.MM.dd-HH.mm.ss");
                    try {
                        BufferedWriter bufferedWriter = new BufferedWriter(
                                new FileWriter(String.format("src/com/teachMeSkills/an15/BuzukArtyom/hw8/receipts/receipt%s.txt",
                                        simpleDateFormat.format(new Date()))));
                        bufferedWriter.write(new Date() + "\n");
                        bufferedWriter.write("Ваша корзина:\n");
                        if (user.getBasket().getProducts().size() != 0) {
                            for (Product product : user.getBasket().getProducts()) {
                                bufferedWriter.write(product.getName() + " цена: " + product.getPrice() + "\n");
                            }
                        }
                        bufferedWriter.write("Общая цена: " + user.getBasket().getTotalPrice() + "\n");
                        bufferedWriter.write("Ваша скидка: " + discont + "%\n");
                        bufferedWriter.write("Цена со скидкой равна " + priceWithDiscount);
                        bufferedWriter.close();

                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else {
                    System.out.println("Произошла ошибка!!!");
                }
            }
        } catch (Exception e) {
            System.out.println("Ошибка");
        }
    }

    @Override
    public void deleteProductFromBasket(User user) {
        try {
            if (user.getBasket().getProducts().size() != 0) {
                System.out.println("Что хотите удалить? ");
            }

            for (Product product : user.getBasket().getProducts()) {
                System.out.println(product.getName());
            }
            String choose = new Scanner(System.in).nextLine();
            for (Product product : user.getBasket().getProducts()) {
                if (product.getName().equalsIgnoreCase(choose)) {
                    user.getBasket().getProducts().remove(product);
                    System.out.println("Товар удалён из корзины");
                } else {
                    System.out.println("Произошла ошибка!!!");
                }
            }
        } catch (NullPointerException e) {
            System.out.println("Ваша корзина пуста");

        }
    }

    @Override
    public void rateProduct(ArrayList<Product> products) {
        try {
            System.out.println("Какой товар хотите оценить?");
            for (Product product : products) {
                System.out.println(product.getName());
            }
            String choose = new Scanner(System.in).nextLine();
            for (Product product : products) {
                if (product.getName().equalsIgnoreCase(choose)) {
                    double rate = 0;
                    if (product.getRates() == null) {
                        System.out.println("Введите оценку от 1 до 5");
                        rate = new Scanner(System.in).nextDouble();
                        ArrayList<Double> rates = new ArrayList<>();
                        rates.add(rate);
                        product.setRates(rates);
                    } else {
                        product.getRates().add(rate);
                    }
                    double sr = 0;
                    for (int i = 0; i < product.getRates().size(); i++) {
                        sr += product.getRates().get(i);
                    }
                    product.setAvgRate(sr / product.getRates().size());
                    System.out.println("Средняя оценка:" + product.getAvgRate());
                }
            }
        } catch (Exception e) {
            System.out.println("Ошибка");
        }
    }

    @Override
    public void commentProduct(ArrayList<Product> products) {
        try {
            System.out.println("К какому товару добавить отзыв? ");
            for (Product product : products) {
                System.out.println(product.getName());
            }
            String choose = new Scanner(System.in).nextLine();
            for (Product product : products) {
                if (product.getName().equalsIgnoreCase(choose)) {
                    System.out.println("Напишите отзыв к детали: " + product.getName());
                    String comment = new Scanner(System.in).nextLine();
                    product.setComment(comment);
                }
            }
        } catch (Exception e) {
            System.out.println("Ошибка");
        }
    }
}
