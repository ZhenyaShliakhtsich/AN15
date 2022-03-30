package com.teachMeSkills.an15.SavitskyRoman.hw8.task2.service.impl;

import com.teachMeSkills.an15.SavitskyRoman.hw8.task2.model.Product;
import com.teachMeSkills.an15.SavitskyRoman.hw8.task2.model.User;
import com.teachMeSkills.an15.SavitskyRoman.hw8.task2.service.UserService;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class UserServiceImpl implements UserService {

    private Scanner scanner = new Scanner(System.in);

    private String answerUser() {
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
            if (answerUserString.equals("1")) isCarName = true;
            else if (answerUserString.equals("2")) continue;
            else System.out.println("Ошибка ввода");
        }
        product.setCarNames(carNames);
        products.add(product);

    }

    @Override
    public void changeProduct(ArrayList<Product> products) {
        int x = 0;
        boolean isStepDown = false;
        while (!isStepDown) {
            StringBuilder productsListName = new StringBuilder("Введите номер продукта, который хотите изменить:\n");
            for (int v = 0; v < products.size(); v++) {
                productsListName.append(v + 1).append(" - ").append(products.get(v).
                        getName()).append("\n");
                if (v == products.size() - 1) productsListName.append(products.size()+1).append(" - Шаг назад");
            }
            try {
                System.out.println(productsListName);
                x = Integer.parseInt(answerUser()) - 1;
                if (x == products.size()) {isStepDown=true;
                continue;}
            } catch (NumberFormatException ex) {
                System.out.println("Ввод только числовой!!!");
                continue;
            }
            boolean isName = false;
            while (!isName) {
                try {
                    StringBuilder productString = new StringBuilder("Выберите номер пункта, который хотите изменить:\n");
                    productString.append("1 - Имя продукта: ").append(products.get(x).getName()).append("\n").
                            append("2 - Цена продукта:  ").append(products.get(x).getPrice()).append("\n").
                            append("3 - Количество в наличии продукта: ").append(products.get(x).getAmount()).append("\n").
                            append("4 - Марки авто, к которым подходит запчасть: ").append(products.get(x).getCarNames()).append("\n").
                            append("5 - Шаг назад");
                    System.out.println(productString);
                    String userChoice = answerUser();
                    if (userChoice.equals("1")) {
                        System.out.println("Введите новое имя продукта");
                        products.get(x).setName(answerUser());
                    } else if (userChoice.equals("2")) {
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
                    } else if (userChoice.equals("3")) {
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
                    } else if (userChoice.equals("4")) {
                        System.out.println("Введите:\n1 - Для добавления марки авто, к которой подходит продукт\n" +
                                "2 - Для удаления марки авто");
                        boolean isCarName = false;

                        String carUserChoice = answerUser();
                        if (carUserChoice.equals("1")) {
                            while (!isCarName) {
                                System.out.println("Введите марку авто, к которой подходит запчасть");
                                products.get(x).getCarNames().add(answerUser());
                                System.out.println("Еще подходит к дургой марке?\n1 - Нет\n2 - Да, продолжить ввод марки авто");
                                String answerUserString = answerUser();
                                if (answerUserString.equals("1")) isCarName = true;
                                else if (answerUserString.equals("2")) continue;
                                else System.out.println("Ошибка ввода");
                            }
                        } else if (carUserChoice.equals("2")) {
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
                    } else if (userChoice.equals("5")) {
                        isName = true;
                    } else {
                        System.out.println("Ошибка ввода.");
                    }
                } catch (NumberFormatException ex) {
                    System.out.println("Ввод только числовой!!!");
                } catch (IndexOutOfBoundsException ex) {
                    System.out.println("Такого номера продукта нету!!!");
                    isName = true;
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
        user.getBasket().setAddToProductArray(products);
    }

    @Override
    public void payForBasket(User user) {

    }

    @Override
    public void deleteProductFromBasket(User user) {

    }

    @Override
    public void rateProduct(ArrayList<Product> products) {

    }

    @Override
    public void commentProduct(ArrayList<Product> products) {

    }
}
