package com.teachMeSkills.an15.ShlyakhtichEvgeniy.hw8.service.impl;

import com.teachMeSkills.an15.ShlyakhtichEvgeniy.hw8.model.Product;
import com.teachMeSkills.an15.ShlyakhtichEvgeniy.hw8.model.User;
import com.teachMeSkills.an15.ShlyakhtichEvgeniy.hw8.service.DataBaseService;
import com.teachMeSkills.an15.ShlyakhtichEvgeniy.hw8.service.UserService;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.*;


public class UserServiceImpl implements UserService {
    DataBaseService dataBaseService = new DataBaseServiceImpl();

    private final Scanner scanner = new Scanner(System.in);

    @Override
    public void addProduct() {
        int amount = 0;
        BigDecimal price = new BigDecimal(0);
        System.out.println("Введите название продукта:");
        String name = scanner.nextLine();
        try {
            System.out.println("Введите цену продукта");
            price = scanner.nextBigDecimal();
            System.out.println("Введите количество продукта");
            amount = scanner.nextInt();
            if (amount < 0 || price.intValue() < 0) {
                System.out.println("Цена и количество не могут быть отрицательными");
                addProduct();
            }
        } catch (InputMismatchException e) {
            addProduct();
        }
        HashSet<String> carSet = new HashSet<>();
        while (true) {
            System.out.println("Введите машину,к которой подходит этот продукт.Введите СТОП если хотите закончить");
            String car = scanner.nextLine();
            if (car.equals("СТОП")) {
                break;
            } else
                carSet.add(car);
        }
        ArrayList<String> reviews = new ArrayList<>();
        ArrayList<Integer> rates = new ArrayList<>();
        Product product = new Product(name, price, amount, reviews, carSet, rates);
        ArrayList<Product> products = (ArrayList<Product>) dataBaseService.loadProductsDataBase();
        products.add(product);
        dataBaseService.saveProductsDataBase(products);
    }

    @Override
    public void changeProduct() {
        ArrayList<Product> products = (ArrayList<Product>) dataBaseService.loadProductsDataBase();
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
            changeProduct();
        }
        while (true) {
            System.out.println("Че хочешь изменить?(Название/Цена/Количество/Машины/Назад)");
            String choice = scanner.nextLine();
            try {
                if ("Название".equalsIgnoreCase(choice)) {
                    System.out.println("Введите новое название");
                    products.get(index).setName(scanner.nextLine());
                    break;
                } else if ("Цена".equalsIgnoreCase(choice)) {
                    System.out.println("Введите новую цену");
                    BigDecimal price = scanner.nextBigDecimal();
                    if (price.compareTo(new BigDecimal(0)) > 0) {
                        products.get(index).setPrice(price);
                    } else {
                        System.out.println("Цена не может быть отрицательной");
                        changeProduct();
                    }
                    break;
                } else if ("Количество".equalsIgnoreCase(choice)) {
                    System.out.println("Введите новое количество");
                    int amount = scanner.nextInt();
                    if (amount > 0) {
                        products.get(index).setAmount(amount);
                    } else {
                        System.out.println("Количество не может быть отрицательным");
                        changeProduct();
                    }
                    break;
                } else if ("Машины".equalsIgnoreCase(choice)) {
                    System.out.println("Хотите добавить или изменить текущую?");
                    String carChoice = scanner.nextLine();
                    if ("Добавить".equalsIgnoreCase(carChoice)) {
                        System.out.println("Введите новую машину");
                        String car = scanner.nextLine();
                        products.get(index).getCarNames().add(car);
                    } else if ("Изменить".equalsIgnoreCase(carChoice)) {
                        System.out.println(products.get(index).getCarNames() + "\nВыберите машину,которую вы хотите изменить");
                        String choiceOfCar = scanner.nextLine();
                        for (String car : products.get(index).getCarNames()) {
                            if (car.equals(choiceOfCar)) {
                                System.out.println("Хотите заменить или удалить");
                                choice = scanner.nextLine();
                                if ("Заменить".equalsIgnoreCase(choice)) {
                                    System.out.println("Введите изменения");
                                    car.replace(car, scanner.nextLine());
                                } else if ("Удалить".equalsIgnoreCase(choice)) {
                                    products.get(index).getCarNames().remove(car);
                                }
                            }
                        }
                    }

                }
                if ("Назад".equalsIgnoreCase(choice)) {

                    break;
                }
                dataBaseService.saveProductsDataBase(products);
            } catch (InputMismatchException e) {
                changeProduct();
            }
        }
    }

    @Override
    public void deleteProduct() {
        ArrayList<Product> products = (ArrayList<Product>) dataBaseService.loadProductsDataBase();
        System.out.println("Введите продукт, который хотите удалить");
        for (Product product : products) {
            System.out.println(product.getName());
        }

        String name = scanner.nextLine();

        int index = -1;
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).getName().equalsIgnoreCase(name)) {
                index = i;
                break;
            }
        }
        if (index == -1) {
            deleteProduct();
        } else {
            products.remove(index);
        }
    }


    @Override
    public void addProductToBasket(User user, Product product) {
        int countOfProduct = 0;
        for (Product productInBasket : user.getBasket().getProducts()) {
            if (product.getName().equals(productInBasket.getName())) {
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
    public void payForBasket(User user) {
        PriceServiceImpl priceService = new PriceServiceImpl();
        System.out.println("Цена : " + user.getBasket().getTotalPrice()
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
                for (Product product : user.getBasket().getProducts()) {
                    bufferedWriter.write(product.getName());
                    bufferedWriter.write(" - ");
                    bufferedWriter.write(String.valueOf(product.getPrice()));
                    bufferedWriter.newLine();
                }
                bufferedWriter.write("Цена : " + user.getBasket().getTotalPrice());
                bufferedWriter.newLine();
                bufferedWriter.write("Скидка : " + priceService.calculateDiscountPrice(user));
                bufferedWriter.newLine();
                bufferedWriter.write("Цена со скидкой : " + priceService.calculateTotalBasketPriceWithDiscount(user));
                bufferedWriter.close();

            } catch (IOException e) {
                e.printStackTrace();
            }
            ArrayList<Product> products = (ArrayList<Product>) dataBaseService.loadProductsDataBase();
            for (Product productFromBasket : user.getBasket().getProducts()) {
                for (Product product : products) {
                    if (productFromBasket.equals(product)) {
                        product.setAmount(product.getAmount() - 1);
                    }
                }
            }
            dataBaseService.saveProductsDataBase(products);
            user.getBasket().setProducts(new ArrayList<>());

        } else {
            new MenuServiceImpl().basketMenu(user);
        }
    }

    @Override
    public void deleteProductFromBasket(User user) {
        System.out.println("Выберите продукт,который хотите удалить из корзины");
        ArrayList<Product> basketProducts = user.getBasket().getProducts();
        for (Product product : basketProducts) {
            System.out.println(product.getName());
        }
        String choice = scanner.nextLine();
        int index = -1;
        for (int i = 0; i < basketProducts.size(); i++) {
            if (basketProducts.get(i).getName().equalsIgnoreCase(choice)) {
                index = i;
                break;
            }
        }
        if (index == -1) {
            System.out.println("Такого продукта нет в корзине");
        } else {
            basketProducts.remove(index);
        }
    }

    @Override
    public void rateProduct(Product product) {
        RateServiceImpl rateService = new RateServiceImpl();
        System.out.println("Введите вашу оценку(от 1 до 5)");
        int rate = scanner.nextInt();
        if (rate < 0 || rate > 5) {
            System.out.println("Введите оценку от 1 до 5");
            rateProduct(product);
        }
        product.getRates().add(rate);
        product.setAvgRate(rateService.calculateAvgRate(product));
    }

    @Override
    public void commentProduct(Product product) {
        System.out.println("Напишите ваш отзыв");
        String review = scanner.nextLine();
        product.getComments().add(review);
    }

    @Override
    public void searchProductByCarName() {
        ArrayList<Product> products = (ArrayList<Product>) dataBaseService.loadProductsDataBase();
        System.out.println("Введите название машины");
        String search = scanner.nextLine();
        for (Product product : products) {
            if (product.getCarNames().contains(search)) {
                System.out.println(product);
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
