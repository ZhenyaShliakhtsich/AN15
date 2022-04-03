package com.teachMeSkills.an15.NovikovVadim.hw8.service.impl;

import com.teachMeSkills.an15.NovikovVadim.hw8.EnumMenu;
import com.teachMeSkills.an15.NovikovVadim.hw8.model.*;
import com.teachMeSkills.an15.NovikovVadim.hw8.service.PriceService;
import com.teachMeSkills.an15.NovikovVadim.hw8.service.UserService;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.*;

public class UserServiceImpl extends MyScanner implements UserService {

    @Override
    public void addProduct(ArrayList<Product> products) {
        //сделаем общую обработку исключения.
        try {
            Product product = new Product();
            System.out.println("Введите название запчасти:");
            String name = getStringFromScanner();
            product.setName(name);

            System.out.println("Введите стоимость запчасти (разделитель дробной части - запятая):");
            BigDecimal cost = getBigDecimalFromScanner();
            product.setPrice(cost);

            boolean isNewProduct = true;
            for (Product iterProduct : products) {
                if (iterProduct.equals(product)) {
                    //в случае, если найден такой же продукт, мы его не создаем, а лишь добавляем количество
                    product = iterProduct;
                    isNewProduct = false;
                }
            }

            System.out.println("Введите количество запчастей (целое число):");
            int amount = getIntFromScanner();
            product.setAmount(product.getAmount() + amount);

            getListCarName(product);

            if (isNewProduct) {
                products.add(product);
            }

            System.out.println("Запчать успешно добавлена.");
        } catch (Exception e) {
            System.out.println("Ошибка ввода, повторите: ");
            e.printStackTrace();
            //Вопрос, продолжить редактирование или выход, сделать выбор
            addProduct(products);
        }

    }

    @Override
    public boolean showProducts(ArrayList<Product> products, boolean isQuantity) {
        System.out.println("Список запчастей>>>>>>>>>");
        int i = 0;
        boolean isProduct = false;
        for (Product product : products) {
//            if (isQuantity && product.getAmount() < 1) {
//                continue;
//            }
            isProduct = true;
            System.out.println("№" + ++i + ". " + product.getName()
                    + ", цена: " + product.getPrice()
                    + ", остаток: " + product.getAmount());
        }
        System.out.println("<<<<<<<<<Список запчастей");
        return isProduct;
    }

    @Override
    public void searchCarName(User user, ArrayList<Product> products) {

        System.out.println("Введите наименование марки автомобиля:");
        String carName = getStringFromScanner();

        boolean isProduct = false;
        for (Product product : products) {
            HashSet<String> carNames = product.getCarNames();
            if (carNames.contains(carName.toUpperCase())) {
                System.out.println(product.toString());
                isProduct = true;
            }
        }
        if (!isProduct) {
            System.out.println("Нет запчастей для вашего автомобиля.");
        }
    }

    @Override
    public void searchName(User user, ArrayList<Product> products) {

        System.out.println("Введите наименование запчасти:");
        String productName = getStringFromScanner();
        boolean isProduct = false;

        for (Product product : products) {
            if (product.getName().equalsIgnoreCase(productName)) {
                System.out.println(product.toString());
                isProduct = true;
            }
        }
        if (!isProduct) {
            System.out.println("Нет запчастей для вашего автомобиля.");
        }
    }

    @Override
    public void setCommentProduct(User user, ArrayList<Product> products) {

    }

    @Override
    public void setRateProduct(User user, ArrayList<Product> products) {

    }

    @Override
    public void changeProduct(ArrayList<Product> products) {

        System.out.println("Введите номер запчати из списка, которую хотите удалить");
        showProducts(products, false);
        int index = getIntFromScanner();

        Product product = null;
        if (index > products.size() || index < 1) {
            System.out.println("Неверная команда: ");
            changeProduct(products);
        } else {
            int iter = 1;
            System.out.println("Что изменить?");
            System.out.println(String.format("%d. %s", iter++, EnumMenu.ProductChangeMenu_name));
            System.out.println(String.format("%d. %s", iter++, EnumMenu.ProductChangeMenu_cost));
            System.out.println(String.format("%d. %s", iter++, EnumMenu.ProductChangeMenu_amount));
            System.out.println(String.format("%d. %s", iter++, EnumMenu.ProductChangeMenu_carModels));
            System.out.println(String.format("%d. %s", iter++, EnumMenu.ProductChangeMenu));

            product = products.get(index - 1);
            int command = getIntFromScanner();

            switch (command) {
                case 1:
                    System.out.println("Введите наименование запчасти:");
                    String str = getStringFromScanner();
                    product.setName(str);
                    break;
                case 2:
                    System.out.println("Введите стоимость запчасти:");
                    product.setPrice(getBigDecimalFromScanner());
                    break;
                case 3:
                    System.out.println("Введите количество запчастей:");
                    product.setAmount(getIntFromScanner());
                    break;
                case 4:
                    System.out.println("Введите марки автомобилей:");
                    getListCarName(product);
                    break;
                case 5:
                    return;
                default:
                    System.out.println("Неверная команда: ");

            }

        }
    }

    private void getListCarName(Product product) {
        HashSet<String> listOfCars = product.getCarNames();

        String carNames = "";

        System.out.println("Введите марки автомобилей, к которым подходит запчасть" +
                "\n\t- Для окончания ввода, напишите STOP):");
        while (!(carNames = getStringFromScanner()).equalsIgnoreCase("STOP")) {
            System.out.println("Название марки, либо STOP:");
            listOfCars.add(carNames);
        }
        product.setCarNames(listOfCars);
    }

    @Override
    public void deleteProduct(ArrayList<Product> products) {

        System.out.println("Введите номер запчати из списка, которую хотите удалить");
        showProducts(products, false);
        int index = getIntFromScanner();

        if (index > products.size() || index < 1) {
            System.out.println("Неверная команда: ");
            deleteProduct(products);
        } else {
            products.remove(products.get(index - 1));
            System.out.println("Запчасть успешна удалена");
        }

    }

    @Override
    public void showBasket(User user) {
        if (user.getBasket() == null || user.getBasket().getProducts() == null || user.getBasket().getProducts().size() == 0) {
            System.out.println("Ваша корзина пуста");
        } else {
            System.out.println("<<<<<Товары в корзине>>>>>");

            int i = 0;
            for (Map.Entry<Product, Integer> iter : user.getBasket().getProducts().entrySet()) {
                System.out.println("№" + ++i + ". " + iter.getKey().getName()
                        + ", количество " + iter.getValue() + " шт.");
            }

            System.out.println("Товаров на сумму: " + user.getBasket().getTotalPrice());
        }
    }

    @Override
    public void addProductToBasket(User user, ArrayList<Product> products) {
        System.out.println("Введите номер запчати, которую хотите добавить в корзину");
        if (!showProducts(products, true)) {
            System.out.println("Нет товаров на остатке");
            return;
        }
        ;
        int index = getIntFromScanner();

        if (index > products.size() || index < 1) {
            System.out.println("Неверная команда: ");
            addProductToBasket(user, products);
        } else {
            Product product = products.get(index - 1);
            System.out.println(String.format("Введите количество товара не более %d шт.", product.getAmount()));

            while (true) {
                int amount = getIntFromScanner();

                if (amount < 0 || amount > product.getAmount()) {
                    System.out.println("Неверное количество, повторите ввод");
                    continue;
                }

                Basket basket = user.getBasket();
                HashMap<Product, Integer> userProducts = basket.getProducts();
                int amountInBasket = userProducts.getOrDefault(product, 0) + amount;
                product.setAmount(product.getAmount() - amount);
                userProducts.put(product, amountInBasket);
                basket.setTotalPrice(basket.getTotalPrice().add(product.getPrice()
                        .multiply(new BigDecimal(Integer.toString(amount)))));

                System.out.println("+++ Товар в корзине +++");
                return;
            }

        }

    }

    @Override
    public void payForBasket(User user) {

        Random random = new Random();
        int discount = random.nextInt(30);
        BigDecimal price = user.getBasket().getTotalPrice();

        PriceService priceService = new PriceServiceImpl();
        BigDecimal discountPrice = priceService.calculateDiscount(user, discount);

        System.out.println("Стоимость товаров: " + price);
        System.out.println("Ваша скидка: " + discount);
        System.out.println("К оплате: " + discountPrice);
        System.out.println("Если желаете оплатить чек, введите 'Оплачиваю'");
        String command = getStringFromScanner();
        if ("Оплачиваю".equalsIgnoreCase(command)) {
            Receipt receipt = new Receipt(price, "Чек №" + new Random().nextInt(1000000));
            receipt.setDiscount(discountPrice);
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy.MM.dd-HH.mm.ss");
            Date date = new Date();

            user.setBasket(new Basket());
            try {
                BufferedWriter bufferedWriter = new BufferedWriter(
                        new FileWriter(String.format("src/com/teachMeSkills/an15/NovikovVadim/hw8/receipt_%s.txt",
                                simpleDateFormat.format(date))));

                bufferedWriter.write(receipt.getName() + "\n");
                bufferedWriter.write("------------------------------" + "\n");
                int i = 1;
                for (Map.Entry<Product, Integer> iter : user.getBasket().getProducts().entrySet()) {

                    bufferedWriter.write("№" + i++ + " " + iter.getKey().getName() + "\n");
                    bufferedWriter.write("\t стоимость" + iter.getKey().getPrice().multiply(new BigDecimal(Integer.toString(iter.getValue()))) + "\n");
                    bufferedWriter.write("\t количество шт.: " + iter.getValue() + "\n");

                }
                bufferedWriter.write("------------------------------" + "\n");
                bufferedWriter.write("Стоимость всего: " + receipt.getPrice() + "\n");
                bufferedWriter.write("Скидка: " + receipt.getDiscount() + "\n");
                bufferedWriter.write("К оплате: " + discountPrice);

                bufferedWriter.close();

                System.out.println("Оплачено");
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            System.out.println("Вы не оплатили");
        }
    }

    @Override
    public void deleteProductFromBasket(User user) {
        if (user.getBasket() == null || user.getBasket().getProducts() == null || user.getBasket().getProducts().size() == 0) {
            System.out.println("Ваша корзина пуста");
            return;
        }

        System.out.println("Введите номер запчати, которую хотите удалить из корзины");
        showBasket(user);
        int index = getIntFromScanner();

        if (index > user.getBasket().getProducts().size() || index < 1) {
            System.out.println("Неверная команда: ");
            deleteProductFromBasket(user);
        } else {

            Basket basket = user.getBasket();
            HashMap<Product, Integer> products = basket.getProducts();
            int i = 1;
            for (Map.Entry<Product, Integer> iter : products.entrySet()) {
                if (i == index) {

                    //облновляем сумму корзины
                    basket.setTotalPrice(basket.getTotalPrice().subtract(iter.getKey().getPrice().multiply(
                            new BigDecimal(Integer.toString(iter.getValue())))));

                    products.remove(iter.getKey());
                    break;
                }
            }
            basket.setProducts(products);
            user.setBasket(basket);

            System.out.println("Товар успешно удален");
        }
    }

}
