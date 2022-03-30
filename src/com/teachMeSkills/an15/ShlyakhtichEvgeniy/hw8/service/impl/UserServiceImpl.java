package com.teachMeSkills.an15.ShlyakhtichEvgeniy.hw8.service.impl;

import com.teachMeSkills.an15.ShlyakhtichEvgeniy.hw8.model.Product;
import com.teachMeSkills.an15.ShlyakhtichEvgeniy.hw8.model.User;
import com.teachMeSkills.an15.ShlyakhtichEvgeniy.hw8.service.UserService;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.*;

public class UserServiceImpl implements UserService {

    private Scanner scanner = new Scanner(System.in);

    @Override
    public void addProduct(ArrayList<Product> products) {
        int amount = 0;
        BigDecimal price  = new BigDecimal(0);
        System.out.println("Введите название продукта:");
        String name = scanner.nextLine();
        try {
        System.out.println("Введите цену продукта");
        price = scanner.nextBigDecimal();
        System.out.println("Введите количество продукта");
        amount = scanner.nextInt();
        if (amount < 0 || price.intValue() < 0 ){
            System.out.println("Цена и количество не могут быть отрицательными");
            addProduct(products);
        }
        }catch (InputMismatchException e ){
            addProduct(products);
        }
        HashSet<String> carSet = new HashSet<>();
        boolean stop = false;
        while (!stop) {
            System.out.println("Введите машину,к которой подходит этот продукт.Введите СТОП если хотите закончить");
            String car = scanner.nextLine();
            if (car.equals("СТОП")) {
                stop = true;
            } else
                carSet.add(car);
        }
        ArrayList<String> reviews = new ArrayList<>();
        ArrayList<Integer> rates = new ArrayList<>();
        Product product = new Product(name, price, amount, reviews, carSet, rates);
        products.add(product);
    }

    @Override
    public void changeProduct(ArrayList<Product> products) {
        System.out.println("Введите продукт, который хотите изменить");
        for (Product product : products) {
            System.out.println(product.getName() + ", ");
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
        boolean stop = false;
        while (!stop) {
            System.out.println("Че хочешь изменить?(Название/Цена/Количество/Машины");
            String choice = scanner.nextLine();
            try {
                if (choice.equalsIgnoreCase("Название")) {
                    System.out.println("Введите новое название");
                    products.get(index).setName(scanner.nextLine());
                    stop = true;
                } else if (choice.equalsIgnoreCase("Цена")) {
                    System.out.println("Введите новую цену");
                    BigDecimal price = scanner.nextBigDecimal();
                    if(price.compareTo(new BigDecimal(0))  == 1) {
                        products.get(index).setPrice(price);
                    }else {
                        System.out.println("Цена не может быть отрицательной");
                        changeProduct(products);
                    }
                    stop = true;
                } else if (choice.equalsIgnoreCase("Количество")) {
                    System.out.println("Введите новое количество");
                    int amount = scanner.nextInt();
                    if(amount > 0) {
                        products.get(index).setAmount(amount);
                    }else {
                        System.out.println("Количество не может быть отрицательным");
                        changeProduct(products);
                    }
                    stop = true;
                } else if (choice.equalsIgnoreCase("Машины")) {
                    System.out.println("Хотите добавить или изменить текущую?");
                    String carChoice = scanner.nextLine();
                    if (carChoice.equalsIgnoreCase("Добавить")) {
                        System.out.println("Введите новую машину");
                        String car = scanner.nextLine();
                        products.get(index).getCarNames().add(car);
                    } else if (carChoice.equalsIgnoreCase("Изменить")) {
                        System.out.println(products.get(index).getCarNames() + "\nВыберите машину,которую вы хотите изменить");
                        String choiceOfCar = scanner.nextLine();
                        for (String car : products.get(index).getCarNames()) {
                            if (choiceOfCar.equals(car)) {
                                System.out.println("Хотите заменить или удалить");
                                choice = scanner.nextLine();
                                if (choice.equalsIgnoreCase("Заменить")) {
                                    System.out.println("Введите изменения");
                                    car = scanner.nextLine();
                                } else if (choice.equalsIgnoreCase("Удалить")) {
                                    products.get(index).getCarNames().remove(car);
                                }
                            }
                        }
                    }

                }
            } catch (InputMismatchException e) {
                changeProduct(products);
            }
        }
    }

    @Override
    public void deleteProduct(ArrayList<Product> products) {
        System.out.println("Введите продукт, который хотите удалить");
        for (Product product : products) {
            System.out.println(product.getName() + ", ");
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
    public void addProductToBasket(User user, Product product) {
        int countOfProduct = 0;
        for (Product productInBasket : user.getBasket().getProducts()){
            if (product.getName().equals(productInBasket.getName())){
                countOfProduct++;
            }
        }
        if (product.getAmount() > 0 && countOfProduct < product.getAmount()) {
            user.getBasket().getProducts().add(product);
            System.out.println("Продукт был добавлен в корзину");
        } else {
            System.out.println("Этого продукта больше нет в наличии");
        }
    }

    @Override
    public void payForBasket(User user, ArrayList<Product> products) {
        PriceServiceImpl priceService = new PriceServiceImpl();
        System.out.println("Цена : " + priceService.calculateTotalBasketPrice(user)
        + "\nСкидка : " + priceService.calculateDiscount()
                + "\nЦена со скидкой : " + priceService.calculateTotalBasketPriceWithDiscount(user));
        System.out.println("Введите \"Оплачиваю\" чтобы оплатить");
        String payment = scanner.nextLine();
        if (payment.equals("Оплачиваю")) {
            System.out.println("Товары оплачены");
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy.MM.dd-HH.mm");
            Date date = new Date();
            try {
                BufferedWriter bufferedWriter = new BufferedWriter(
                        new FileWriter(String.format("src/com/teachMeSkills/an15/ShlyakhtichEvgeniy/hw8/receipt_%s.txt",
                                simpleDateFormat.format(date))));
                        bufferedWriter.write(simpleDateFormat.format(date));
                        bufferedWriter.newLine();
                        for(Product product : user.getBasket().getProducts()){
                            bufferedWriter.write(product.getName());
                            bufferedWriter.write(" - ");
                            bufferedWriter.write(String.valueOf(product.getPrice()));
                            bufferedWriter.newLine();
                        }
                        bufferedWriter.write("Цена : " + priceService.calculateTotalBasketPrice(user));
                        bufferedWriter.newLine();
                        bufferedWriter.write("Скидка : " + priceService.calculateDiscountPrice(user));
                        bufferedWriter.newLine();
                        bufferedWriter.write("Цена со скидкой : " + priceService.calculateTotalBasketPriceWithDiscount(user));
                        bufferedWriter.close();

            } catch (IOException e) {
                e.printStackTrace();
            }
            for (Product productFromBasket : user.getBasket().getProducts()) {
                for (Product product : products) {
                    if (productFromBasket.getName().equals(product.getName())) {
                        product.setAmount(product.getAmount() - 1);
                    }
                }
            }
           user.getBasket().setProducts(new ArrayList<Product>());

        }
    }

    @Override
    public void deleteProductFromBasket(User user) {
        System.out.println("Выберите продукт,который хотите удалить из корзины");
        for (Product product : user.getBasket().getProducts()) {
            System.out.println(product.getName());
        }
        String choice = scanner.nextLine();
        int index = -1;
        for (int i = 0; i < user.getBasket().getProducts().size(); i++) {
            if (user.getBasket().getProducts().get(i).getName().equalsIgnoreCase(choice)){
                index = i;
                break;
            }
        }
        if (index == -1) {
            deleteProductFromBasket(user);
        } else {
            user.getBasket().getProducts().remove(user.getBasket().getProducts().get(index));
        }
    }

    @Override
    public void rateProduct(Product product) {
        System.out.println("Введите вашу оценку(от 1 до 5)");
        int rate = scanner.nextInt();
        product.getRates().add(rate);

    }

    @Override
    public void commentProduct(Product product) {
        System.out.println("Напишите ваш отзыв");
        String review = scanner.nextLine();
        product.getComments().add(review);
    }

    @Override
    public void searchForProducts(ArrayList<Product> products) {
        RateServiceImpl rateService = new RateServiceImpl();
        System.out.println("Введите название машины");
        String search = scanner.nextLine();
        for (Product product : products) {
            if(product.getCarNames().contains(search)){
                System.out.println(product + "\nРейтинг : " + rateService.calculateAvgRate(product));
            }
        }
    }

    public Product chooseProduct(ArrayList<Product> products) {
        System.out.println("Введите название продукта");
        String search = scanner.nextLine();
        for (Product product : products) {
            if (search.equalsIgnoreCase(product.getName())) {
                return product;
            }
        }
        return null;
    }

}
