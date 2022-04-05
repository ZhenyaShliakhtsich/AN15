package com.teachMeSkills.an15.MatveevArtyom.hw8.service.impl;

import com.teachMeSkills.an15.MatveevArtyom.hw8.model.Basket;
import com.teachMeSkills.an15.MatveevArtyom.hw8.model.Product;
import com.teachMeSkills.an15.MatveevArtyom.hw8.model.User;
import com.teachMeSkills.an15.MatveevArtyom.hw8.service.Menu;
import com.teachMeSkills.an15.MatveevArtyom.hw8.service.PriceService;
import com.teachMeSkills.an15.MatveevArtyom.hw8.service.UserService;

import java.io.*;
import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.Scanner;

import static com.teachMeSkills.an15.MatveevArtyom.hw8.DataBase.PRODUCTS;

public class UserServiceImpl implements UserService {

    private Scanner scanner = new Scanner(System.in);

    @Override
    public void addProduct() {
        System.out.println("Введите название продукта:");
        String name = scanner.nextLine();
        System.out.println("Введите кол-во продуктов");
        int amount = scanner.nextInt();
        System.out.println("Введите цену продукта");
        BigDecimal price = scanner.nextBigDecimal();
        System.out.println("Введите отзыв: ");
        String review = scanner.nextLine();
        HashSet<String> cars = new HashSet<>();
        while (true) {
            System.out.println("Введите названия машин, к которым данная деталь подходит");
            String carName = new Scanner(System.in).nextLine();
            cars.add(carName);
            System.out.println("Если хотите закончить, то нажмите цифру 1, иначе любую другую цифру");
            int choose = scanner.nextInt();
            if (choose == 1) {
                break;
            }
        }
        PRODUCTS.add(new Product(name, price, amount, review, cars));
    }

    @Override
    public void changeProduct() {
        System.out.println("Введите название запчасти, информацию о которой вы хотите изменить");
        for (Product product : PRODUCTS) {
            System.out.println(product.getName());
        }
        String name = new Scanner(System.in).nextLine();
        int index = -1;
        for (int i = 0; i < PRODUCTS.size(); i++) {
            if (name.equalsIgnoreCase(PRODUCTS.get(i).getName())) {
                index = i;
                break;
            }
        }
        if (index == -1) {
            changeProduct();
        }
        boolean flag = true;
        while (flag) {
            System.out.println("Че хочешь изменить?(Название, количество, цену, оценку, отзыв, машину)");
            String choice = new Scanner(System.in).nextLine();
            if (choice.equalsIgnoreCase("Название")) {
                System.out.println("Введи новое название");
                String newProductName = scanner.nextLine();
                PRODUCTS.get(index).setName(newProductName);
                break;
            } else if (choice.equalsIgnoreCase("Количество") || choice.equalsIgnoreCase("кол-во")) {
                System.out.println("Введите новое количество");
                int newProductAmount = scanner.nextInt();
                PRODUCTS.get(index).setAmount(newProductAmount);//поменять
                break;
            } else if (choice.equalsIgnoreCase("цену") || choice.equalsIgnoreCase("цена")) {
                System.out.println("Введите новую цену");
                BigDecimal newProductPrice = scanner.nextBigDecimal();
                PRODUCTS.get(index).setPrice(newProductPrice);
                break;
            } else if (choice.equalsIgnoreCase("оценку") || choice.equalsIgnoreCase("оценка")) {
                System.out.println("Введите новую среднюю оценку");
                double newProductRate = scanner.nextDouble();
                PRODUCTS.get(index).setAvgRate(newProductRate);
                break;
            } else if (choice.equalsIgnoreCase("отзыв")) {
                System.out.println("Введите новый отзыв");
                String newProductComment = scanner.nextLine();
                PRODUCTS.get(index).setComment(newProductComment);
                break;
            } else if (choice.equalsIgnoreCase("машину") || choice.equalsIgnoreCase("машина")) {
                System.out.println(PRODUCTS.get(index).getCarNames() + "\nВыберите машину,которую вы хотите изменить");
                String carChoice = scanner.nextLine();
                for (String car : PRODUCTS.get(index).getCarNames()) {
                    if (carChoice.equals(car)) {
                        System.out.println("Введите новую машину");
                        String newCar = scanner.nextLine();
                        PRODUCTS.get(index).getCarNames().remove(car);
                        PRODUCTS.get(index).getCarNames().add(newCar);
                        flag = false;
                        break;
                    }
                }
            }
        }
    }

    @Override
    public void deleteProduct() {
        System.out.println("Введите название запчасти, информацию о которой вы хотите удалить");
        for (Product product : PRODUCTS) {
            System.out.println(product.getName());
        }
        String name = scanner.nextLine();
        int index = -1;
        for (int i = 0; i < PRODUCTS.size(); i++) {
            if (name.equalsIgnoreCase(PRODUCTS.get(i).getName())) {
                index = i;
                break;
            }
        }
        if (index == -1) {
            System.out.println("Такого продукта нет! \n Если хотите выйти назад, нажмите 1");
            int choose = new Scanner(System.in).nextInt();
            if (choose == 1) {
                Menu menu = new MenuServiceImpl();
                menu.menuAdmin();
            } else {
                deleteProduct();
            }
        } else {
            PRODUCTS.remove(index);
            System.out.println("Удаление прошло успешно!");
        }
    }

    @Override
    public void addProductToBasket(User user) {
        System.out.println("Введите какой продукт вы хотите добавить в корзину:");
        for (Product product : PRODUCTS) {
            System.out.println(product.getName());
        }
        String choose = new Scanner(System.in).nextLine();
        boolean flag = true;
        for (Product product : PRODUCTS) {
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
                System.out.println("Товар был успешно добавлен в корзину!");
                flag = false;
                break;
            }
        }
        if (flag) {
            System.out.println("Такого продукта нет, попробуйте ещё раз!");
            addProductToBasket(user);
        }
    }

    @Override
    public void payForBasket(User user) {
        if (user.getBasket() != null) {
            if (user.getBasket().getProducts().size() != 0) {
                System.out.println("Вот, что у вас в корзине");
                for (Product product : user.getBasket().getProducts()) {
                    System.out.println(product.getName() + " с ценой " + product.getPrice());
                }
                System.out.println("Вы участвуете в акции! Сейчас узнаем вашу скидку");
                PriceService priceService = new PriceServiceImpl();
                priceService.calculateTotalBasketPrice(user);
                int discount = priceService.calculateDiscount();
                double discountWithoutPercents = (double) discount / 100;

                BigDecimal bd = new BigDecimal(discountWithoutPercents);
                BigDecimal priceWithDiscount = user.getBasket().getTotalPrice().subtract(user.getBasket().getTotalPrice().multiply(bd));
                String formattedBigDecimal = new DecimalFormat("#0.00").format(priceWithDiscount);
                System.out.println("Ваша скидка составляет " + discount + " % и сумма к оплате будет составлять " + formattedBigDecimal);
                System.out.println("Если хотите оплатить, то введите - Оплачиваю");
                String choice = scanner.nextLine();
                if (choice.equalsIgnoreCase("Оплачиваю")) {
                    System.out.println("Покупка совершена! Чек печатается!");
                    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy.MM.dd-HH.mm.ss");
                    try {
                        BufferedWriter bufferedWriter =
                                new BufferedWriter(new FileWriter(String.format
                                        ("src/com/teachMeSkills/an15/MatveevArtyom/hw8/receipt/receipt_%s.txt",
                                                simpleDateFormat.format(new Date()))));
                        bufferedWriter.write("Ваша корзина:");
                        bufferedWriter.write(System.lineSeparator());
                        bufferedWriter.write(String.valueOf(user.getBasket()));
                        bufferedWriter.write(System.lineSeparator());
                        bufferedWriter.write("Цена со скидкой равна " + priceWithDiscount);
                        bufferedWriter.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    for (Product productFromBasket : user.getBasket().getProducts()) {
                        for (Product product : PRODUCTS) {
                            if (productFromBasket.getName().equals(product.getName())) {
                                product.setAmount(product.getAmount() - 1);
                            }
                        }
                    }
                    user.getBasket().getProducts().removeAll(PRODUCTS);
                }
            } else {
                System.out.println("Корзина пуста! вы не можете ничего удалить из неё!");
            }
        } else {
            System.out.println("Корзина пуста! вы не можете ничего удалить из неё!");
        }
    }

    @Override
    public void deleteProductFromBasket(User user) {

        if (user.getBasket() != null) {
            if (user.getBasket().getProducts().size() != 0) {
                System.out.println("Введите какой продукт вы хотите удалить из корзины:");
                for (Product product : user.getBasket().getProducts()) {
                    System.out.println(product.getName());
                }
                String choose = new Scanner(System.in).nextLine();
                boolean flag = true;
                for (Product product : user.getBasket().getProducts()) {
                    if (product.getName().equalsIgnoreCase(choose)) {
                        user.getBasket().getProducts().remove(product);
                        System.out.println("Товар был успешно удалён из корзины!");
                        flag = false;
                        break;
                    }
                }
                if (flag) {
                    System.out.println("Такого продукта нет, попробуйте ещё раз!");
                    deleteProductFromBasket(user);
                }
            } else {
                System.out.println("Корзина пуста! вы не можете ничего удалить из неё!");
            }
        } else {
            System.out.println("Корзина пуста! вы не можете ничего удалить из неё!");
        }
    }

    @Override
    public void rateProduct() {
        System.out.println("Введите какой продукт вы хотите оценить:");
        for (Product product : PRODUCTS) {
            System.out.println(product.getName());
        }
        String choose = new Scanner(System.in).nextLine();
        boolean flag = true;
        for (Product product : PRODUCTS) {
            if (product.getName().equalsIgnoreCase(choose)) {
                System.out.println("Введите вашу оценку(от 1 до 10)");
                int rate = new Scanner(System.in).nextInt();
                if (product.getRates() == null) {
                    ArrayList<Integer> rates = new ArrayList<>();
                    rates.add(rate);
                    product.setRates(rates);
                } else {
                    product.getRates().add(rate);
                }
                double avgRate = 0;
                for (int i = 0; i < product.getRates().size(); i++) {
                    avgRate += product.getRates().get(i);
                }
                product.setAvgRate(avgRate / product.getRates().size());
                System.out.println("Теперь средняя оценка равна " + product.getAvgRate());
                flag = false;
                break;
            }
        }
        if (flag) {
            System.out.println("Такого продукта нет, попробуйте ещё раз!");
            rateProduct();
        }
    }

    @Override
    public void commentProduct() {
        System.out.println("Введите продукт, к которому вы хотите написать отзыв:");
        for (Product product : PRODUCTS) {
            System.out.println(product.getName());
        }
        String choose = new Scanner(System.in).nextLine();
        boolean flag = true;
        for (Product product : PRODUCTS) {
            if (product.getName().equalsIgnoreCase(choose)) {
                System.out.println("Напишите ваш отзыв к детали - " + product.getName());
                String comment = new Scanner(System.in).nextLine();
                product.setComment(comment);
                System.out.println("Теперь отзыв такой: " + product.getComment());
                flag = false;
                break;
            }
        }
        if (flag) {
            System.out.println("Такого продукта нет, попробуйте ещё раз!");
            commentProduct();
        }
    }

    @Override
    public void searchByProduct() {
        System.out.println("введите какой продукт вы хотите найти?");
        String choose = new Scanner(System.in).nextLine();
        boolean flag = true;
        for (Product product : PRODUCTS) {
            if (choose.equalsIgnoreCase(product.getName())) {
                System.out.println("Такой продукт есть!");
                flag = false;
                break;
            }
        }
        if (flag) {
            System.out.println("Такого продукта нет, попробуй ещё раз");
            searchByProduct();
        }
    }
}
