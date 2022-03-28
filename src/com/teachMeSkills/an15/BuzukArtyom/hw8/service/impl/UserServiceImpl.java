package com.teachMeSkills.an15.BuzukArtyom.hw8.service.impl;

import com.teachMeSkills.an15.BuzukArtyom.hw8.model.Basket;
import com.teachMeSkills.an15.BuzukArtyom.hw8.model.Product;
import com.teachMeSkills.an15.BuzukArtyom.hw8.model.User;
import com.teachMeSkills.an15.BuzukArtyom.hw8.service.PriceService;
import com.teachMeSkills.an15.BuzukArtyom.hw8.service.UserService;

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
    }

    @Override
    public void changeProduct(ArrayList<Product> products) {

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
    }

    @Override
    public void deleteProduct(ArrayList<Product> products) {
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

    }

    @Override
    public void addProductToBasket(User user, ArrayList<Product> products) {
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
                }else {
                    user.getBasket().getProducts().add(product);
                }
                System.out.println("Товар добавлен в корзину");
            }
        }
    }

    @Override
    public void payForBasket(User user) {
        if (user.getBasket().getProducts().size() != 0) {
            System.out.println("Ваша корзина:");
            for (Product product : user.getBasket().getProducts()) {
                System.out.println(product.getName() + " цена: " + product.getPrice());
            }
            PriceService priceService = new PriceServiceImpl();
            priceService.calculateTotalBasketPrice(user);
            System.out.println("Ваша скидка: " + priceService.calculateDiscount()+" %");
          //  int discont = priceService.calculateDiscount();
           // double discontProcent = discont/100;
            double discontProcent = priceService.calculateDiscount()/100;
            BigDecimal bigDecimal = new BigDecimal(priceService.calculateDiscount()/100);
           // System.out.println(discont);
            System.out.println(discontProcent);
            System.out.println(bigDecimal);
            System.out.println("К оплате сумма со скидкой: " + user.getBasket().getTotalPrice().subtract
                    (user.getBasket().getTotalPrice().multiply(bigDecimal)));
            System.out.println("Для оплаты введите - ОПЛАТИТЬ");
            String choose = new Scanner(System.in).nextLine();
            if (choose.equals("ОПЛАТИТЬ")) {
                System.out.println("Оплата прошла успешно!");
            } else {
                System.out.println("Произошла ошибка!!!");
            }
        }
    }

    @Override
    public void deleteProductFromBasket(User user) {
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
    }

    @Override
    public void rateProduct(ArrayList<Product> products) {
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
    }

    @Override
    public void commentProduct(ArrayList<Product> products) {
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
    }
}
