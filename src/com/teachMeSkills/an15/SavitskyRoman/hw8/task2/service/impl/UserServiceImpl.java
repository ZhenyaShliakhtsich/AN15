package com.teachMeSkills.an15.SavitskyRoman.hw8.task2.service.impl;

import com.teachMeSkills.an15.SavitskyRoman.hw8.task2.model.Basket;
import com.teachMeSkills.an15.SavitskyRoman.hw8.task2.model.Chapter;
import com.teachMeSkills.an15.SavitskyRoman.hw8.task2.model.Product;
import com.teachMeSkills.an15.SavitskyRoman.hw8.task2.model.User;
import com.teachMeSkills.an15.SavitskyRoman.hw8.task2.service.PriceService;
import com.teachMeSkills.an15.SavitskyRoman.hw8.task2.service.RateService;
import com.teachMeSkills.an15.SavitskyRoman.hw8.task2.service.UserService;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.SimpleDateFormat;
import java.util.*;

public class UserServiceImpl implements UserService {
    boolean isUserError;

    private String answerUser() {
        Scanner scanner = new Scanner(System.in);
        String answer = null;
        boolean isAnswer = false;
        while (!isAnswer) {
            answer = scanner.nextLine();
            if (answer.isEmpty()) {
                System.out.println("Ошибка ввода. Попробуйте еще раз");
                continue;
            }
            isAnswer = true;
        }
        return answer;

    }

    @Override
    public void addProduct(ArrayList<Product> products) {
        Product product = new Product();
        boolean isCarName = false;
        boolean isDecimal = false;
        boolean isAmount = false;
        HashSet<String> carNames = new HashSet<>();
        System.out.println("Введите имя продукта");
        product.setName(answerUser());
        while (!isDecimal) {
            try {
                System.out.println("Введите цену продукта");
                product.setPrice(new BigDecimal(Integer.parseInt(answerUser())));
                isDecimal = true;
            } catch (NumberFormatException ex) {
                System.out.println("Ввод только числовой!!!");
            }
        }
        while (!isAmount) {
            try {
                System.out.println("Введите количество в наличии продукта");
                product.setAmount(Integer.parseInt(answerUser()));
                isAmount = true;
            } catch (NumberFormatException ex) {
                System.out.println("Ввод только числовой!!!");
            }
        }

        while (!isCarName) {
            System.out.println("Введите марку авто, к которой подходит продукт");
            carNames.add(answerUser());
            System.out.println("Еще подходит к дургой марке?\n1 - Нет\n2 - Да, продолжить ввод марки авто");
            String answerUserString = answerUser();
            if ("1".equals(answerUserString)) isCarName = true;
            else if ("2".equals(answerUserString)) continue;
            else System.out.println("Ошибка ввода");
        }
        product.setCarNames(carNames);
        products.add(product);

    }

    @Override
    public void changeProduct(ArrayList<Product> products, StringBuilder adminStageFirstOfProductChange) {
        int x;
        boolean isStepDownDown = false;
        while (!isStepDownDown) {
            try {
                System.out.println(adminStageFirstOfProductChange);
                x = Integer.parseInt(answerUser()) - 1;
                if (x == products.size()) {
                    isStepDownDown = true;
                    continue;
                }
            } catch (NumberFormatException ex) {
                System.out.println("Ввод только числовой!!!");
                continue;
            }
            boolean isStepDown = false;
            while (!isStepDown) {
                try {
                    StringBuilder productString = new StringBuilder("Выберите номер пункта, который хотите изменить:\n");
                    productString.append("1 - Имя продукта: ").append(products.get(x).getName()).append("\n").
                            append("2 - Цена продукта:  ").append(products.get(x).getPrice()).append("\n").
                            append("3 - Количество в наличии продукта: ").append(products.get(x).getAmount()).append("\n").
                            append("4 - Марки авто, к которым подходит запчасть: ").append(products.get(x).getCarNames()).append("\n").
                            append("5 - Шаг назад");
                    System.out.println(productString);
                    String userChoice = answerUser();
                    if ("1".equals(userChoice)) {
                        System.out.println("Введите новое имя продукта");
                        products.get(x).setName(answerUser());
                    } else if ("2".equals(userChoice)) {
                        boolean isDecimal = false;
                        while (!isDecimal) {
                            try {
                                System.out.println("Введите новую цену продукта");
                                products.get(x).setPrice(new BigDecimal(Integer.parseInt(answerUser())));
                                isDecimal = true;
                            } catch (NumberFormatException ex) {
                                System.out.println("Ввод только числовой!!!");
                            }
                        }
                    } else if ("3".equals(userChoice)) {
                        boolean isAmount = false;
                        while (!isAmount) {
                            try {
                                System.out.println("Введите новое количество в наличии продукта");
                                products.get(x).setAmount(Integer.parseInt(answerUser()));
                                isAmount = true;
                            } catch (NumberFormatException ex) {
                                System.out.println("Ввод только числовой!!!");
                            }
                        }
                    } else if ("4".equals(userChoice)) {
                        System.out.println("Введите:\n1 - Для добавления марки авто, к которой подходит продукт\n" +
                                "2 - Для удаления марки авто");
                        boolean isCarName = false;
                        String carUserChoice = answerUser();
                        if ("1".equals(carUserChoice)) {
                            while (!isCarName) {
                                HashSet<String> carNamesService;
                                carNamesService = products.get(x).getCarNames();
                                System.out.println("Введите марку авто, к которой подходит запчасть");
                                carNamesService.add(answerUser());
                                products.get(x).setCarNames(carNamesService);
                                System.out.println("Еще подходит к дургой марке?\n1 - Нет\n2 - Да, продолжить ввод марки авто");
                                String answerUserString = answerUser();
                                if (answerUserString.equals("1")) isCarName = true;
                                else if (answerUserString.equals("2")) continue;
                                else System.out.println("Ошибка ввода");
                            }

                        } else if ("2".equals(carUserChoice)) {
                            ArrayList<String> carNameService = new ArrayList<>(products.get(x).getCarNames());
                            boolean isDeleteCarName = false;
                            StringBuilder carNameDelete = new StringBuilder("Выберите марку авто, которую удалить:\n");
                            for (int v = 0; v < carNameService.size(); v++) {
                                carNameDelete.append(v + 1).append(" - ").append(carNameService.get(v));
                                if (v != carNameService.size() - 1) carNameDelete.append("\n");
                            }
                            while (!isDeleteCarName) {
                                try {
                                    System.out.println(carNameDelete);
                                    int anw = Integer.parseInt(answerUser()) - 1;
                                    carNameService.remove(anw);
                                    HashSet<String> serviceHashSet = new HashSet<>(carNameService);
                                    products.get(x).setCarNames(serviceHashSet);
                                    System.out.println(products.get(x).getCarNames());
                                    isDeleteCarName = true;
                                } catch (NumberFormatException ex) {
                                    System.out.println("Ввод только числовой!!!");
                                } catch (IndexOutOfBoundsException ex) {
                                    System.out.println("Такого номера продукта нету!!!");
                                }
                            }
                        }
                    } else if ("5".equals(userChoice)) {
                        isStepDown = true;
                        continue;
                    } else {
                        System.out.println("Ошибка ввода.");
                    }
                } catch (NumberFormatException ex) {
                    System.out.println("Ввод только числовой!!!");
                } catch (IndexOutOfBoundsException ex) {
                    System.out.println("Такого номера продукта нету!!!");
                    break;
                }
            }
        }
    }

    @Override
    public void deleteProduct(ArrayList<Product> products) {
        boolean isName = false;
        StringBuilder productsListName = new StringBuilder("Введите номер продукта, которого хотите удалить:\n");
        for (int x = 0; x < products.size(); x++) {
            productsListName.append(x + 1).append(" - ").append(products.get(x).
                    getName());
            if (x != products.size() - 1) productsListName.append("\n");
        }
        while (!isName) {
            try {
                System.out.println(productsListName);
                products.remove(Integer.parseInt(answerUser()) - 1);
                isName = true;
            } catch (NumberFormatException ex) {
                System.out.println("Ввод только числовой!!!");
            } catch (IndexOutOfBoundsException ex) {
                System.out.println("Такого номера продукта нету!!!");
            }
        }
    }

    @Override
    public void addProductToBasket(User user, Product products) {
        if (products == null) {
            System.out.println("Продукта нету в наличии");
        } else if (products.getAmount() == 0) {
            System.out.println("Продукта нету в наличии");
        } else {
            ArrayList<Product> serviceProductListInBasket;
            if (user.getBasket().getProducts() != null) serviceProductListInBasket = user.getBasket().getProducts();
            else serviceProductListInBasket = new ArrayList<>();
            serviceProductListInBasket.add(products);
            user.getBasket().setProducts(serviceProductListInBasket);
            //Пересчет коризны
            BigDecimal bigDecimal = new BigDecimal(0);
            for (Product pr : user.getBasket().getProducts()) {
                bigDecimal = bigDecimal.add(pr.getPrice()).setScale(2, RoundingMode.HALF_UP);
            }
            user.getBasket().setTotalPrice(bigDecimal);
            ///
        }
    }

    @Override
    public void payForBasket(User user, ArrayList<Chapter> chapterArrayList) {
        if (user.getBasket().getProducts().isEmpty()) System.out.println("Корзина пуста");
        else {
            PriceService priceService = new PriceServiceImpl();
            String fromDecimal = priceService.calculateTotalBasketPrice(user);
            boolean isUserPay = false;
            while (!isUserPay) {
                System.out.println("\nДля оплаты введите слово \"Оплачиваю\" или \"1\" - Шаг назад");
                String userPay = answerUser();
                if ("Оплачиваю".equalsIgnoreCase(userPay)) {
                    try {
                        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss");
                        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter
                                (String.format("src/com/teachMeSkills/an15/SavitskyRoman/hw8/task2/receipt_%s.txt",
                                        simpleDateFormat.format(new Date()))));
                        StringBuilder toReceipt = new StringBuilder();
                        toReceipt.append(simpleDateFormat.format(new Date())).append("\n");
                        for (Product pr : user.getBasket().getProducts()) {
                            toReceipt.append("Продукт: ").append(pr.getName()).append("-------------Цена: ").
                                    append(pr.getPrice()).append("\n");
                        }
                        toReceipt.append(fromDecimal);
                        bufferedWriter.write(String.valueOf(toReceipt));
                        bufferedWriter.close();

                        for (Product productInBasket : user.getBasket().getProducts()) {
                            for (Chapter ch : chapterArrayList) {
                                for (Product productInChapter : ch.getProductArrayList()) {
                                    if (productInChapter.equals(productInBasket))
                                        productInChapter.setAmount(productInChapter.getAmount() - 1);
                                }
                            }
                        }

                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    user.setBasket(new Basket());
                    isUserPay = true;
                } else if ("1".equals(userPay)) {
                    isUserPay = true;
                } else System.out.println("Ошибка. Повторите ввод");
            }
        }
    }

    @Override
    public void deleteProductFromBasket(User user) {
        boolean isDeleteProduct = false;
        while (!isDeleteProduct) {
            try {
                if (user.getBasket().getProducts().size() == 0) {
                    System.out.println("Корзина пуста");
                    isDeleteProduct = true;
                    continue;
                }
                StringBuilder productInBasketString = new StringBuilder("Введите номер продукта, которого хотите удалить из корзины\n");
                for (int x = 0; x < user.getBasket().getProducts().size(); x++) {
                    productInBasketString.append(x + 1).append(" - ").append(user.getBasket().getProducts().get(x).getName()).append("\n");
                    if (x == user.getBasket().getProducts().size() - 1)
                        productInBasketString.append(x + 2).append(" - Шаг назад");
                }
                System.out.println(productInBasketString);
                int anw = Integer.parseInt(answerUser()) - 1;
                if (anw == user.getBasket().getProducts().size()) {
                    isDeleteProduct = true;
                    continue;
                }
                user.getBasket().getProducts().remove(anw);
                ///Пересчет корзины
                BigDecimal bigDecimal = new BigDecimal(0);
                for (Product pr : user.getBasket().getProducts()) {
                    bigDecimal = bigDecimal.add(pr.getPrice()).setScale(2, RoundingMode.HALF_UP);
                    ;
                }
                user.getBasket().setTotalPrice(bigDecimal);
                ////
                StringBuilder basketAfterDelete = new StringBuilder("В корзине:\n");
                for (int x = 0; x < user.getBasket().getProducts().size(); x++) {
                    basketAfterDelete.append(x + 1).append(" - ").append(user.getBasket().getProducts().get(x).getName());
                    if (x != user.getBasket().getProducts().size() - 1) basketAfterDelete.append("\n");
                }
                System.out.println(basketAfterDelete);

            } catch (NumberFormatException ex) {
                System.out.println("Ввод только числовой!!!");
            } catch (IndexOutOfBoundsException ex) {
                System.out.println("Такого номера продукта нету!!!");
            }
        }

    }

    @Override
    public void rateProduct(ArrayList<Product> products, Product product) {
        RateService rateService = new RateServiceImpl();
        for (Product pr : products) {
            if (product.equals(pr)) {
                isUserError = false;
                while (!isUserError) {
                    System.out.println("Поставьте оценку продукту");
                    int rateUser = answerUserInt();
                    pr.setAvgRate(rateService.calculateAvgRate(pr, rateUser));
                    pr.getRates().add(rateUser);

                }
            }
        }
    }

    @Override
    public void commentProduct(ArrayList<Product> products, Product product) {
        ArrayList<Product> serviceProductsList = products;
        for (Product pr : serviceProductsList) {
            if (product.equals(pr)) {
                System.out.println("Напешите комментарий к продукту");
                pr.setComment(answerUser());
            }
        }
    }

    @Override
    public ArrayList<Product> searchCarToName(ArrayList<Chapter> chapterArrayList) {

        ArrayList<Product> serviceProductList = new ArrayList<>();
        System.out.println("Введите название авто(\"VW\",\"Shcoda\",\"Audi\",\"Renault\")");
        String carName = answerUser();
        for (Chapter ch : chapterArrayList) {
            for (Product pr : ch.getProductArrayList()) {
                ArrayList<String> serviceCarNameList = new ArrayList<>(pr.getCarNames());
                for (String s : serviceCarNameList) {
                    if (s.equalsIgnoreCase(carName)) {
                        serviceProductList.add(pr);
                    }
                }
            }
        }
        if (serviceProductList.isEmpty()) {
            System.out.println("Увы, по названию авто: \"" + carName + "\" ничего не найдено");
        }
        return serviceProductList;
    }

    private int answerUserInt() {
        Scanner scanner = new Scanner(System.in);
        int answer = -1;
        boolean isAnswer = false;
        while (!isAnswer) {
            try {
                answer = scanner.nextInt();
                if (answer < 0 || answer > 5) {
                    System.out.println("Ошибка ввода. Введите от 0 до 5");
                    continue;
                }
                isUserError = true;
                isAnswer = true;
            } catch (NumberFormatException | InputMismatchException e) {
                System.out.println("Ошибка. Введите число!!!");
                isAnswer = true;
            }
        }
        return answer;
    }
}
