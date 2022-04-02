package com.teachMeSkills.an15.TuskalSergey.hw7.Task2.service.impl;

import com.teachMeSkills.an15.TuskalSergey.hw7.Task2.model.Basket;
import com.teachMeSkills.an15.TuskalSergey.hw7.Task2.model.Product;
import com.teachMeSkills.an15.TuskalSergey.hw7.Task2.model.User;
import com.teachMeSkills.an15.TuskalSergey.hw7.Task2.service.PriceService;
import com.teachMeSkills.an15.TuskalSergey.hw7.Task2.service.RateService;
import com.teachMeSkills.an15.TuskalSergey.hw7.Task2.service.UserService;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class UserServiceImpl implements UserService {

    private Scanner scanner = new Scanner(System.in);

    @Override
    public void addProduct(ArrayList<Product> products) {
        System.out.println("Введите название товара:");
        String name = scanner.nextLine();
        System.out.println("Введите цену товара:");
        String str = scanner.nextLine();
        BigDecimal price = new BigDecimal(str).setScale(2, RoundingMode.HALF_UP);
        System.out.println("Введите количество:");
        int amount = scanner.nextInt();
        System.out.println("Введите комментарий:");
        Scanner scanComment = new Scanner(System.in);
        String comment = scanComment.nextLine();

        //TODO: all other parameters should be scanned from console and set to object

        Product product = new Product();
        product.setName(name);
        product.setPrice(price);
        product.setAmount(amount);
        product.setComment(comment);

        //TODO: should be changed from setters to constructor initialization

        products.add(product);
        System.out.println("Товар " + product.getName() + " добавлен в список товаров");
    }

    @Override
    public void changeProduct(ArrayList<Product> products) {

        System.out.println("Введите название товара, который хотите изменить");
        //TODO: show list of products
        for (Product p : products) {
            System.out.println(p);
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
            System.out.println("Такого товара нет в списке.");
            changeProduct(products);
        }
        System.out.println("Что Вы хотите изменить? Название(1), цена(2), количество(3), комментарий(4):");
        String choice = scanner.nextLine();
        Scanner scanner = new Scanner(System.in);
        switch (choice) {
            case "1":
                System.out.println("Введите новое название:");
                String newName = scanner.nextLine();
                products.get(index).setName(newName);
                break;
            case "2":
                System.out.println("Введите новую цену:");
                String str = scanner.nextLine();
                BigDecimal newPrice = new BigDecimal(str).setScale(2, RoundingMode.HALF_UP);
                products.get(index).setPrice(newPrice);
                break;
            case "3":
                System.out.println("Введите новое количество:");
                int newAmount = scanner.nextInt();
                products.get(index).setAmount(newAmount);
                break;
            case "4":
                System.out.println("Введите новый комментарий:");
                Scanner scanComment = new Scanner(System.in);
                String newComment = scanComment.nextLine();
                products.get(index).setComment(newComment);
                break;
            default:
                System.out.println("Неверно указан номер действия. Процесс завершен.");
        }
    }

    @Override
    public void deleteProduct(ArrayList<Product> products) {
        System.out.println("Введите название товара, который хотите удалить:");
        Scanner scanner = new Scanner(System.in);
        //TODO: show list of products
        for (Product p : products) {
            System.out.println(p);
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
        int index = -1;
        for (Product p : products) {
            System.out.println(p);
        }
        System.out.println("Введите название товара, который хотите добавить в корзину:");
        Scanner scanner1 = new Scanner(System.in);
        String productToAddToBasket = scanner1.nextLine();
        for (Product p : products) {
            if (productToAddToBasket.equalsIgnoreCase(p.getName())) {
                if (user.getBasket() == null) {
                    Basket basket = new Basket();
                    ArrayList<Product> productsInBasket = new ArrayList<>();
                    basket.setProducts(productsInBasket);
                    user.setBasket(basket);
                }
                if (p.getAmount() > 0) {
                    user.getBasket().getProducts().add(p);
                    System.out.println("Товар " + p.getName() + " добавлен в корзину");
                } else {
                    System.out.println("Товар " + p.getName() + " не может быть добавлен в корзину, т.к. его нет на складе.");
                }
                index = 1;
                break;
            } else {
                try {
                    for (Product b : user.getBasket().getProducts()) {
                        if (p.getName().equalsIgnoreCase(b.getName())) {
                            System.out.println("Данный товар уже добавлен в корзину.");
                        } else {
                            if (p.getAmount() > 0) {
                                user.getBasket().getProducts().add(p);
                                System.out.println("Товар " + p.getName() + " добавлен в корзину");
                            } else {
                                System.out.println("Товар не может быть добавлен в корзину, т.к. его нет на складе.");
                                index = 1;
                                break;
                            }
                        }
                        index = 1;
                        break;
                    }
                } catch (NullPointerException e) {
                }
            }
        }
        if (index == -1) {
            System.out.println("Неправильно введено название товара!");
            System.out.println("Желаете повторить(1) или завершить(2)?");
            Scanner scanner = new Scanner(System.in);
            String continueOrFinish = scanner.nextLine();
            switch (continueOrFinish) {
                case "1":
                    addProductToBasket(user, products);
                    break;
                case "2":
                    break;
                default:
                    System.out.println("Неверно указан номер действия. Процесс завершен.");
            }
        }
    }


    @Override
    public void deleteProductFromBasket(User user) {
        try {
            if (user.getBasket().getProducts().size() != 0) {
                System.out.println("Товары в корзине:");
                for (Product b : user.getBasket().getProducts()) {
                    System.out.println(b.getName() + ", цена: " + b.getPrice());
                }
                System.out.println("Выберите товар, который хотите удалить из корзины:");
                Scanner scanner = new Scanner(System.in);
                String productToDelete = scanner.nextLine();
                int index = -1;
                for (Product b : user.getBasket().getProducts()) {
                    if (productToDelete.equalsIgnoreCase(b.getName())) {
                        user.getBasket().getProducts().remove(b);
                        System.out.println("Товар " + b.getName() + " удален из корзины.");
                        index = 1;
                        break;
                    }
                }
                if (index == -1) {
                    System.out.println("Неправильно введено название товара либо такого товара в корзине нет.");
                    System.out.println("Желаете повторить(1) или завершить(2)?");
                    String continueOrFinish = scanner.nextLine();
                    switch (continueOrFinish) {
                        case "1":
                            deleteProductFromBasket(user);
                            break;
                        case "2":
                            break;
                        default:
                            System.out.println("Неверно указан номер действия. Процесс завершен.");
                    }
                }
            } else System.out.println("В Вашей корзине нет товаров.");

        } catch (NullPointerException e) {
            System.out.println("В Вашей корзине нет товаров.");
        }
    }

    @Override
    public void payForBasket(User user, ArrayList<Product> products) {
        try {
            if (user.getBasket().getProducts().size() != 0) {
                PriceService priceService = new PriceServiceImpl();
                int discount = priceService.calculateDiscount();
                BigDecimal totalPrice = priceService.calculateTotalBasketPrice(user);
                BigDecimal ultimatePrice = (totalPrice.subtract(totalPrice.multiply(BigDecimal.valueOf(discount)).
                        divide(BigDecimal.valueOf(100)))).setScale(2, RoundingMode.HALF_UP);
                System.out.println("Стоимость с учетом скидки - " + ultimatePrice);
                System.out.println("Если желаете оплатить корзину целиком, то введите 'Оплачиваю':");
                Scanner scanner = new Scanner(System.in);
                String payment = scanner.nextLine();
                if (payment.equalsIgnoreCase("оплачиваю")) {
                    System.out.println("Оплата прошла успешно. Покупка завершена.");
                    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy.MM.dd-HH.mm.ss");
                    Date date = new Date();
                    BufferedWriter bufferedWriter =
                            new BufferedWriter(new FileWriter(String.format("src/com/teachMeSkills/an15" +
                                            "/TuskalSergey/hw7/Task2/receipts/receipt_%s.txt",
                                    simpleDateFormat.format(date))));
                    bufferedWriter.write("Чек оплаты");
                    bufferedWriter.newLine();
                    for (Product b : user.getBasket().getProducts()) {
                        bufferedWriter.write(b.getName() + " " + b.getPrice());
                        bufferedWriter.newLine();
                    }
                    bufferedWriter.write("Скидка - " + discount + "%");
                    bufferedWriter.newLine();
                    bufferedWriter.write("Итог " + ultimatePrice);
                    bufferedWriter.newLine();
                    bufferedWriter.write("Спасибо за покупку!");
                    bufferedWriter.close();
                    for (Product p : products) {
                        for (Product b : user.getBasket().getProducts()) {
                            if (p.getName().equalsIgnoreCase(b.getName())) {
                                p.setAmount(p.getAmount() - 1);
                            }
                        }
                    }
                    System.out.println("Желаете оценить покупки? (да/нет):");
                    String rateOrNot = scanner.nextLine();
                    switch (rateOrNot) {
                        case "да":
                            rateProduct(user, products);
                            break;
                        case "нет":
                            break;
                        default:
                            System.out.println("Неверно указан ответ.");
                    }
                    System.out.println("Желаете прокомментировать покупки? (да/нет):");
                    Scanner scanner2 = new Scanner(System.in);
                    String commentOrNot = scanner2.nextLine();
                    switch (commentOrNot) {
                        case "да":
                            commentProduct(user, products);
                            break;
                        case "нет":
                            break;
                        default:
                            System.out.println("Неверно указан ответ.");
                    }
                    user.getBasket().getProducts().removeAll(products);
                }
            }
        } catch (NullPointerException e) {
            System.out.println("В Вашей корзине нет товаров.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void searchProductByCarName(ArrayList<Product> products) {
        System.out.println("Введите марку машины для поиска запчастей:");
        String search = scanner.nextLine();
        for (Product p : products) {
            if (p.getCarNames().toString().contains(search.toLowerCase(Locale.ROOT))) {
                System.out.println(p);
            } else {
                System.out.println("По Вашему запросу ничего не найдено");
                break;
            }
        }
    }


    @Override
    public void rateProduct(User user, ArrayList<Product> products) {
        for (Product b : user.getBasket().getProducts()) {
            System.out.println("Оцените товар " + b.getName() + " по шкале от 1 до 5 (1 - плохо, 5 - хорошо):");
            int rate = scanner.nextInt();
            if (rate >= 1 && rate <= 5) {
                for (Product p : products) {
                    if (b.getName().equalsIgnoreCase(p.getName())) {
                        if (p.getRates() == null) {
                            ArrayList<Integer> rates = new ArrayList<>();
                            p.setRates(rates);
                        }
                        p.getRates().add(rate);
                        RateService rateService = new RateServiceImpl();
                        rateService.calculateAvgRate(p);
                    }
                }
            } else System.out.println("Оценка не засчитана.");
        }
    }

    @Override
    public void commentProduct(User user, ArrayList<Product> products) {
        for (Product b : user.getBasket().getProducts()) {
            System.out.println("Напишите комментарий для товара " + b.getName() + ":");
            Scanner scanner = new Scanner(System.in);
            String comment = scanner.nextLine();
            if (comment.equals("") == false) {
                for (Product p : products) {
                    if (b.getName().equalsIgnoreCase(p.getName())) {
                        p.setComment(comment);
                    }
                }
            } else System.out.println("Ваш комментарий не сохранен.");
        }
    }
}


