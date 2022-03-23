package com.teachMeSkills.an15.MatveevArtyom.hw8.service.impl;

import com.teachMeSkills.an15.MatveevArtyom.hw8.model.Basket;
import com.teachMeSkills.an15.MatveevArtyom.hw8.model.Product;
import com.teachMeSkills.an15.MatveevArtyom.hw8.model.User;
import com.teachMeSkills.an15.MatveevArtyom.hw8.service.PriceService;
import com.teachMeSkills.an15.MatveevArtyom.hw8.service.UserService;

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
        System.out.println("Введите кол-во продуктов");
        int amount = scanner.nextInt();
        System.out.println("Введите цену продукта");
        BigDecimal price = scanner.nextBigDecimal();
        System.out.println("ВВедите среднюю оценку");
        double rate = scanner.nextDouble();
        System.out.println("Введите отзыв: ");
        String review = scanner.nextLine();
        System.out.println("Введите названия машин, к которым данная деталь подходит");
        HashSet<String> cars = new HashSet<>();
        while (true) {
            String carName = scanner.nextLine();
            cars.add(carName);
            System.out.println("Если хотите закончить, то нажмите цифру от 0 до 10");
            int choose = scanner.nextInt();
            if (choose >= 0 && choose <= 10) {
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
            System.out.println("Че хочешь изменить?(Название, количество, цену, оценку, отзыв, машину)");
            String choice = scanner.nextLine();
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
    public void addProductToBasket(User user, Product product) {
        user.getBasket().getProducts().add(product);
        System.out.println("Товар был успешно добавлен в корзину");
    }

    @Override
    public void payForBasket(User user, ArrayList<Product> products) {
        System.out.println("Вот, что у вас в корзине");
        for (Product product : user.getBasket().getProducts()) {
            System.out.println(product);
        }
        System.out.println("Вы участвуете в акции! Сейчас узнаем вашу скидку");
        PriceService priceService = new PriceServiceImpl();
        int discount = priceService.calculateDiscount();
        discount /= 100;
        BigDecimal bd = new BigDecimal(discount);
        System.out.println("Ваша скидка составляет " + discount + " % и сумма к оплате будет составлять " +
                user.getBasket().getTotalPrice().subtract(user.getBasket().getTotalPrice().multiply(bd)));
        System.out.println("Если хотите оплатить, то введите - Оплачиваю");
        String choice = scanner.nextLine();
        if (choice.equalsIgnoreCase("Оплачиваю")) {
            System.out.println("Покупка совершена!");
            for (Product productFromBasket : user.getBasket().getProducts()) {
                for (Product product : products) {
                    if (productFromBasket.getName().equals(product.getName())) {
                        product.setAmount(product.getAmount() - 1);
                    }
                }
            }
        }

    }

    @Override
    public void deleteProductFromBasket(User user, Product product) {
        user.getBasket().getProducts().remove(product);
        System.out.println("Продукт был успешно удалён");
    }

    @Override
    public void rateProduct(Product product) {
        System.out.println("Введите вашу оценку(от 1 до 10)");
        int rate = scanner.nextInt();
        product.getRates().add(rate);
    }

    @Override
    public void commentProduct(Product product) {
        System.out.println("Введите ваш комментарий");
        String comment = scanner.nextLine();
        product.setComment(comment);
    }

    @Override
    public void search(Product product) {
        System.out.println("введите какую машину вы хотите найти?");
        String choose = scanner.nextLine();
        for (String car : product.getCarNames()) {
            if (car.equalsIgnoreCase(choose)) {
                System.out.println("Такая машина есть!");
            } else {
                System.out.println("Такой машины нет! попробуйте ещё раз");
                search(product);
            }
        }
    }
}
