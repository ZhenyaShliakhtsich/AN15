package com.teachMeSkills.an15.MatveevArtyom.hw8.service.impl;

import com.teachMeSkills.an15.MatveevArtyom.hw8.model.Basket;
import com.teachMeSkills.an15.MatveevArtyom.hw8.model.Product;
import com.teachMeSkills.an15.MatveevArtyom.hw8.model.User;
import com.teachMeSkills.an15.MatveevArtyom.hw8.service.PriceService;
import com.teachMeSkills.an15.MatveevArtyom.hw8.service.UserService;

import java.io.*;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class UserServiceImpl implements UserService {

    private Scanner scanner = new Scanner(System.in);

    @Override
    public void addProduct(ArrayList<Product> products) {
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
        Product product = new Product(name, price, amount, review, cars);
        products.add(product);
    }

    @Override
    public void changeProduct(ArrayList<Product> products) {
        System.out.println("Введите название запчасти, информацию о которой вы хотите изменить");
        for (Product product : products) {
            System.out.println(product.getName());
        }
        String name = new Scanner(System.in).nextLine();
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
            System.out.println("Че хочешь изменить?(Название, количество, цену, оценку, отзыв, машину)");
            String choice = new Scanner(System.in).nextLine();
            if (choice.equalsIgnoreCase("Название")) {
                System.out.println("Введи новое название");
                String name1 = scanner.nextLine();
                products.get(index).setName(name1);
                break;
            } else if (choice.equalsIgnoreCase("Количество") || choice.equalsIgnoreCase("кол-во")) {
                System.out.println("Введите новое количество");
                int amount = scanner.nextInt();
                products.get(index).setAmount(amount);
                break;
            } else if (choice.equalsIgnoreCase("цену") || choice.equalsIgnoreCase("цена")) {
                System.out.println("Введите новую цену");
                BigDecimal price = scanner.nextBigDecimal();
                products.get(index).setPrice(price);
                break;
            } else if (choice.equalsIgnoreCase("оценку") || choice.equalsIgnoreCase("оценка")) {
                System.out.println("Введите новую среднюю оценку");
                double rate = scanner.nextDouble();
                products.get(index).setAvgRate(rate);
                break;
            } else if (choice.equalsIgnoreCase("отзыв")) {
                System.out.println("Введите новый отзыв");
                String comment = scanner.nextLine();
                products.get(index).setComment(comment);
                break;
            } else if (choice.equalsIgnoreCase("машину") || choice.equalsIgnoreCase("машина")) {
                System.out.println(products.get(index).getCarNames() + "\nВыберите машину,которую вы хотите изменить");
                String carChoice = scanner.nextLine();
                for (String car : products.get(index).getCarNames()) {
                    if (carChoice.equals(car)) {
                        System.out.println("Введите новую машину");
                        car = scanner.nextLine();
                        products.get(index).getCarNames().remove(car);
                        break;
                    }
                }
            }
        }
    }

    @Override
    public void deleteProduct(ArrayList<Product> products) {
        System.out.println("Введите название запчасти, информацию о которой вы хотите удалить");
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
        System.out.println("Введите какой продукт вы хотите добавить в корзину:");
        for (Product product : products) {
            System.out.println(product.getName());
        }
        String choose = new Scanner(System.in).nextLine();
        boolean flag = true;
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
                System.out.println("Товар был успешно добавлен в корзину!");
                flag = false;
                break;
            }
        }
        if (flag) {
            System.out.println("Такого продукта нет, попробуйте ещё раз!");
            addProductToBasket(user, products);
        }
    }

    @Override
    public void payForBasket(User user, ArrayList<Product> products) {
        try {
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
                BigDecimal bd = new BigDecimal(discountWithoutPercents).setScale(3, RoundingMode.CEILING);
                System.out.println("Ваша скидка составляет " + discount + " % и сумма к оплате будет составлять " +
                        user.getBasket().getTotalPrice().subtract(user.getBasket().getTotalPrice().multiply(bd)));
                System.out.println("Если хотите оплатить, то введите - Оплачиваю");
                String choice = scanner.nextLine();
                if (choice.equalsIgnoreCase("Оплачиваю")) {
                    System.out.println("Покупка совершена! Чек печатается!");
                    try {
                        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream
                                ("C:\\Users\\tema1\\IdeaProjects\\AN15\\src\\com\\teachMeSkills\\an15\\MatveevArtyom\\hw8\\receipt\\receipt.txt"));
                        objectOutputStream.writeObject(user);
                        objectOutputStream.close();
                        ObjectInputStream objectInputStream = new ObjectInputStream
                                (new FileInputStream("C:\\Users\\tema1\\IdeaProjects\\AN15\\src\\com\\teachMeSkills\\an15\\MatveevArtyom\\hw8\\receipt\\receipt.txt"));
                        User newUser = (User) objectInputStream.readObject();
                        System.out.println("Ваша корзина - " + newUser.getBasket());
                        System.out.println("Ваша цена со скидкой " +
                                user.getBasket().getTotalPrice().subtract(user.getBasket().getTotalPrice().multiply(bd)));
                    } catch (IOException | ClassNotFoundException e) {
                        e.printStackTrace();
                    }
                    for (Product productFromBasket : user.getBasket().getProducts()) {
                        for (Product product : products) {
                            if (productFromBasket.getName().equals(product.getName())) {
                                product.setAmount(product.getAmount() - 1);
                            }
                        }
                    }
                    user.getBasket().getProducts().removeAll(products);
                }
            } else {
                System.out.println("Корзина пуста! вы не можете ничего удалить из неё!");
            }
        } catch (NullPointerException e) {
            System.out.println("Корзина пуста! вы не можете ничего удалить из неё!");
        }
    }

    @Override
    public void deleteProductFromBasket(User user) {
        try {
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
        } catch (NullPointerException e) {
            System.out.println("Корзина пуста! вы не можете ничего удалить из неё!");
        }
    }

    @Override
    public void rateProduct(ArrayList<Product> products) {
        System.out.println("Введите какой продукт вы хотите оценить:");
        for (Product product : products) {
            System.out.println(product.getName());
        }
        String choose = new Scanner(System.in).nextLine();
        boolean flag = true;
        for (Product product : products) {
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
                double sr = 0;
                for (int i = 0; i < product.getRates().size(); i++) {
                    sr += product.getRates().get(i);
                }
                product.setAvgRate(sr / product.getRates().size());
                System.out.println("Теперь средняя оценка равна " + product.getAvgRate());
                flag = false;
                break;
            }
        }
        if (flag) {
            System.out.println("Такого продукта нет, попробуйте ещё раз!");
            rateProduct(products);
        }
    }

    @Override
    public void commentProduct(ArrayList<Product> products) {
        System.out.println("Введите продукт, к которому вы хотите написать отзыв:");
        for (Product product : products) {
            System.out.println(product.getName());
        }
        String choose = new Scanner(System.in).nextLine();
        boolean flag = true;
        for (Product product : products) {
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
            commentProduct(products);
        }
    }

    @Override
    public void search(Product product) {
        System.out.println("введите какую машину вы хотите найти?");
        String choose = new Scanner(System.in).nextLine();
        boolean flag = true;
        for (String car : product.getCarNames()) {
            if (car.equalsIgnoreCase(choose)) {
                System.out.println("Такая машина есть!");
                flag = false;
                break;
            }
        }
        if (flag) {
            System.out.println("Такой машины нет, попробуй ещё раз");
            search(product);
        }
    }
}
