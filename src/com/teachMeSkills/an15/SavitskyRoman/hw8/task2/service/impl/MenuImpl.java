package com.teachMeSkills.an15.SavitskyRoman.hw8.task2.service.impl;

import com.teachMeSkills.an15.SavitskyRoman.hw8.task2.model.Basket;
import com.teachMeSkills.an15.SavitskyRoman.hw8.task2.model.Chapter;
import com.teachMeSkills.an15.SavitskyRoman.hw8.task2.model.Product;
import com.teachMeSkills.an15.SavitskyRoman.hw8.task2.model.User;
import com.teachMeSkills.an15.SavitskyRoman.hw8.task2.service.AuthService;
import com.teachMeSkills.an15.SavitskyRoman.hw8.task2.service.Menu;
import com.teachMeSkills.an15.SavitskyRoman.hw8.task2.service.UserService;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class MenuImpl implements Menu {
    boolean isStepDownOne;//general menu
    boolean isStepDownTwo;//first admin menu
    boolean isStepDownThree;//second admin menu
    boolean isStepDownFour;//first user menu
    boolean isStepDownFive;//second user menu
    boolean isStepDownSix;//product list for user

    @Override
    public void firstStage(AuthService authService, HashMap<User, User> users, UserService userService) {
        isStepDownOne = false;
        while (!isStepDownOne) {
            System.out.println("Выберите:\n1 - Регистрация\n2 - Авторизация\n3 - Выход из программы");
            String userChoice = answerUser();
            switch (userChoice) {
                case "1":
                    authService.registration(users);
                    break;
                case "2": {
                    User user = authService.login(users);
                    ArrayList<Chapter> chapterArrayList = defaultChapter();
                    if (user.isHasAdminRole()) {
                        StringBuilder adminFirstStageStringBuilder = adminFirstStageStringBuilder(chapterArrayList);
                        adminFirstStage(adminFirstStageStringBuilder, chapterArrayList, userService);
                    } else {
                        menuSplitTop("Good day, " + user.getLogin());

                        userFirstStage(user, chapterArrayList, userService);

                    }
                }
                case "3":
                    isStepDownOne = true;
                    continue;
                default:
                    System.out.println("Нету такого номера. Повторите ввод");
            }
        }
    }

    @Override
    public void adminFirstStage(StringBuilder adminFirstStageStringBuilder,
                                ArrayList<Chapter> chapterArrayList, UserService userService) {
        isStepDownTwo = false;
        while (!isStepDownTwo) {
            System.out.println(adminFirstStageStringBuilder);
            String userChoice = answerUser();
            switch (userChoice) {
                case "1":
                    adminSecondStage(chapterArrayList.get(0).getProductArrayList(), userService);
                    break;
                case "2":
                    adminSecondStage(chapterArrayList.get(1).getProductArrayList(), userService);
                    break;
                case "3":
                    adminSecondStage(chapterArrayList.get(2).getProductArrayList(), userService);
                    break;
                case "4":
                    isStepDownTwo = true;
                    break;
                case "5":
                    isStepDownTwo = true;
                    isStepDownOne = true;
                    break;
                default:
                    System.out.println("Нету такого номера. Повторите ввод");
            }
        }
    }

    private StringBuilder adminFirstStageStringBuilder(ArrayList<Chapter> chapterArrayList) {
        StringBuilder chapterString = new StringBuilder("Выберите раздел:\n");
        for (int x = 0; x < chapterArrayList.size(); x++) {
            chapterString.append(x + 1).append(" - ").append(chapterArrayList.get(x).getName()).append("\n");
            if (x == chapterArrayList.size() - 1) chapterString.append(x + 2).append(" - Шаг назад\n").
                    append(x + 3).append(" - Выход из программы");
        }
        return chapterString;
    }

    @Override
    public void adminSecondStage(ArrayList<Product> productArrayList, UserService userService) {
        isStepDownThree = false;
        while (!isStepDownThree) {
            System.out.println("Выберите:\n" +
                    "1 - Для просмотра информации о продуктах\n" +
                    "2 - Для добавления нового продукта\n" +
                    "3 - Для удаления продукта\n" +
                    "4 - Для изменения информации о продукте\n" +
                    "5 - Шаг назад\n" +
                    "6 - Выход из программы");
            String userChoice = answerUser();
            switch (userChoice) {
                case "1": {
                    System.out.println(productArrayList);
                    break;
                }
                case "2": {
                    userService.addProduct(productArrayList);
                    break;
                }
                case "3": {
                    System.out.println(productArrayList);
                    if (!productArrayList.isEmpty()) userService.deleteProduct(productArrayList);
                    else System.out.println("Список продуктов пуст");
                    System.out.println(productArrayList);
                    break;
                }
                case "4": {
                    StringBuilder adminStageFirstOfProductChange = adminStageFirstOfProductChange(productArrayList);
                    userService.changeProduct(productArrayList, adminStageFirstOfProductChange);
                    System.out.println(productArrayList);
                    break;
                }
                case "5":
                    isStepDownThree = true;
                    break;
                case "6":
                    isStepDownThree = true;
                    isStepDownTwo = true;
                    isStepDownOne = true;
                    break;
                default:
                    System.out.println("Нету такого номера. Повторите ввод");
            }
        }

    }

    private StringBuilder adminStageFirstOfProductChange(ArrayList<Product> products) {
        StringBuilder productsListName = new StringBuilder("Введите номер продукта, который хотите изменить:\n");
        for (int v = 0; v < products.size(); v++) {
            productsListName.append(v + 1).append(" - ").append(products.get(v).
                    getName()).append("\n");
            if (v == products.size() - 1)
                productsListName.append(products.size() + 1).append(" - Шаг назад\n").
                        append(products.size() + 2).append(" - Выход из программы");
        }
        return productsListName;
    }


    @Override
    public void userFirstStage(User user,
                               ArrayList<Chapter> chapterArrayList, UserService userService) {
        isStepDownFour = false;
        while (!isStepDownFour) {
            userFirstStageStringBuilder(chapterArrayList, user.getBasket());
            String userChoice = answerUser();
            switch (userChoice) {
                case "1":
                    userSecondStage(userService, user.getBasket(),
                            userChoiceProductToBasket(chapterArrayList.get(0).getProductArrayList(),
                                    chapterArrayList.get(0).getName()), user, chapterArrayList.get(0).getProductArrayList());
                    break;
                case "2":
                    userSecondStage(userService, user.getBasket(),
                            userChoiceProductToBasket(chapterArrayList.get(1).getProductArrayList(),
                                    chapterArrayList.get(1).getName()), user, chapterArrayList.get(0).getProductArrayList());
                    break;
                case "3":
                    userSecondStage(userService, user.getBasket(),
                            userChoiceProductToBasket(chapterArrayList.get(2).getProductArrayList(),
                                    chapterArrayList.get(2).getName()), user, chapterArrayList.get(0).getProductArrayList());
                    break;
                case "4":
                    userSecondStage(userService, user.getBasket(),
                            userChoiceProductToBasket(userService.searchCarToName(chapterArrayList),
                                    "Поиск по названию авто"), user,
                            chapterArrayList.get(0).getProductArrayList());
                    break;
                case "5":
                    userService.deleteProductFromBasket(user);
                    break;
                case "6":
                    userService.payForBasket(user, chapterArrayList);
                    break;
                case "7":
                    isStepDownFour = true;
                    break;
                case "8":
                    isStepDownFour = true;
                    isStepDownOne = true;
                    break;
                default:
                    System.out.println("Нету такого номера. Повторите ввод");
            }
        }
    }

    private void userFirstStageStringBuilder(ArrayList<Chapter> chapterArrayList, Basket basket) {
        inBasketNow(basket);
        menuSplitTop("Выберите раздел:");
        StringBuilder chapterString = new StringBuilder();
        for (int x = 0; x < chapterArrayList.size(); x++) {
            chapterString.append(x + 1).append(" - ").append(chapterArrayList.get(x).getName()).append("\n");
            if (x == chapterArrayList.size() - 1) chapterString.append(x + 2).append(" - Поиск по названию авто\n").
                    append(x + 3).append(" - Удалить продукт из корзины\n").
                    append(x + 4).append(" - Оплатить корзину\n").
                    append(x + 5).append(" - Шаг назад\n").
                    append(x + 6).append(" - Выход из программы");
        }
        System.out.println(chapterString);
    }

    public void menuSplit(String menuStringForSplit) {
        StringBuilder menuSplit = new StringBuilder();
        for (int z = 0; z < menuStringForSplit.length(); z++) {
            menuSplit.append("-");
        }
        System.out.println(menuSplit);
        System.out.println(menuStringForSplit);
        System.out.println(menuSplit);
    }

    public void menuSplitTop(String menuStringForSplit) {
        StringBuilder menuSplit = new StringBuilder();
        for (int z = 0; z < menuStringForSplit.length(); z++) {
            menuSplit.append("-");
        }
        System.out.println(menuSplit);
        System.out.println(menuStringForSplit);
    }

    public void inBasketNow(Basket basket) {
        if (basket.getProducts() == null ||
                basket.getProducts().isEmpty()) {
            menuSplitTop("Ваша корзина пуста");
        } else {
            menuSplitTop("В корзине:");
            StringBuilder inBasketNow = new StringBuilder();
            for (int x = 0; x < basket.getProducts().size(); x++) {
                inBasketNow.append(basket.getProducts().get(x).getName()).append("; ");
                if (x == basket.getProducts().size() - 1) inBasketNow.append("\nТоваров на сумму: ").
                        append(basket.getTotalPrice());
            }
            System.out.println(inBasketNow);
        }
    }

    @Override
    public void userSecondStage(UserService userService, Basket basket, Product productToBasket, User user,
                                ArrayList<Product> productArrayList) {
        if (productToBasket != null) {
            isStepDownFive = false;
            while (!isStepDownFive) {
                inBasketNow(basket);
                menuSplitTop("Выберите:");
                System.out.println("1 - Добавить продукт в корзину\n" +
                        "2 - Написать отзыв о продукте\n" +
                        "3 - Оценить продукт\n" +
                        "4 - Удалить продукт из корзины\n" +
                        "5 - Шаг назад\n" +
                        "6 - Выход из программы");
                String userChoice = answerUser();
                switch (userChoice) {
                    case "1": {
                        userService.addProductToBasket(user, productToBasket);
                        isStepDownFive = true;
                        break;
                    }
                    case "2":
                        userService.commentProduct(productArrayList, productToBasket);
                        isStepDownFive = true;
                        break;
                    case "3":
                        userService.rateProduct(productArrayList, productToBasket);
                        isStepDownFive = true;
                        break;
                    case "4":
                        userService.deleteProductFromBasket(user);
                        isStepDownFive = true;
                        break;
                    case "5":
                        isStepDownFive = true;
                        break;
                    case "6":
                        isStepDownFive = true;
                        isStepDownFour = true;
                        isStepDownOne = true;
                        break;
                    default:
                        System.out.println("Нету такого номера. Повторите ввод");
                }
            }
        }
    }

    public Product userChoiceProductToBasket(ArrayList<Product> productArrayList, String nameChapter) {
        if (productArrayList == null || productArrayList.isEmpty()) {
            return null;
        } else {
            DecimalFormat df = new DecimalFormat("#,###.00");
            menuSplit("В разделе \"" + nameChapter +
                    "\" находятся следующие продукты:");
            StringBuilder productArrayString = new StringBuilder();
            for (int x = 0; x < productArrayList.size(); x++) {
                productArrayString.append("Номер продукта: ").append(x + 1).append("\n").
                        append("Название продукта: ").append(productArrayList.get(x).getName()).append("\n").
                        append("Цена: ").append(df.format(productArrayList.get(x).getPrice())).append("\n").
                        append("Количество в наличии: ").append(productArrayList.get(x).getAmount()).append("\n").
                        append("Рейтинг: ").append(String.format("%.2f", (productArrayList.get(x).getAvgRate()))).append("\n").
                        append("Подходит к авто: ").append(productArrayList.get(x).getCarNames()).append("\n").
                        append("Комментарий: ").append(productArrayList.get(x).getComment()).append("\n");
                if (x != productArrayList.size() - 1) productArrayString.append("\n");
            }
            System.out.println(productArrayString);
            isStepDownSix = false;
            while (!isStepDownSix) {
                try {
                    System.out.println("Введите номер продукта");
                    int anw = Integer.parseInt(answerUser()) - 1;
                    System.out.println("Вы выбрали - " + productArrayList.get(anw).getName());
                    isStepDownSix = true;
                    return productArrayList.get(anw);


                } catch (NumberFormatException ex) {
                    System.out.println("Ввод только числовой!!!");
                } catch (IndexOutOfBoundsException ex) {
                    System.out.println("Такого номера продукта нету!!!");
                }
            }
        }
        return null;
    }


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

    private ArrayList<Chapter> defaultChapter() {
        ArrayList<Chapter> chapterArrayList = new ArrayList<>();
        //Chapter 1
        Chapter chapterOne = new Chapter();
        ArrayList<Product> productArrayList = new ArrayList<>();
        chapterOne.setName("Двигатель");
        HashSet<String> carNamesOne = new HashSet<>();
        carNamesOne.add("VW");
        carNamesOne.add("Shcoda");
        carNamesOne.add("Audi");
        Product productOne = new Product("Oil", new BigDecimal(240), 20,
                null, carNamesOne);

        HashSet<String> carNamesTwo = new HashSet<>();
        carNamesTwo.add("Renault");
        carNamesTwo.add("Shcoda");
        carNamesTwo.add("Audi");
        Product productTwo = new Product("Oil filter", new BigDecimal(24), 35,
                null, carNamesTwo);

        HashSet<String> carNamesThree = new HashSet<>();
        carNamesThree.add("VW");
        carNamesThree.add("Shcoda");
        carNamesThree.add("Audi");
        Product productThree = new Product("Cylinder head gasket", new BigDecimal(12), 14,
                null, carNamesThree);
        productArrayList.add(productOne);
        productArrayList.add(productTwo);
        productArrayList.add(productThree);
        chapterOne.setProductArrayList(productArrayList);

        //Chapter2
        Chapter chapterTwo = new Chapter();
        ArrayList<Product> productArrayListTwo = new ArrayList<>();
        chapterTwo.setName("Подвеска");
        HashSet<String> carNamesTwoOne = new HashSet<>();
        carNamesTwoOne.add("VW");
        carNamesTwoOne.add("Shcoda");
        carNamesTwoOne.add("Audi");
        Product productTwoOne = new Product("Knuckle", new BigDecimal(27),
                3, null, carNamesTwoOne);

        HashSet<String> carNamesTwoTwo = new HashSet<>();
        carNamesTwoTwo.add("Renault");
        carNamesTwoTwo.add("Shcoda");
        carNamesTwoTwo.add("Audi");
        Product productTwoTwo = new Product("Ball joints", new BigDecimal(67), 7, null,
                carNamesTwoTwo);

        HashSet<String> carNamesTwoThree = new HashSet<>();
        carNamesTwoThree.add("VW");
        carNamesTwoThree.add("Shcoda");
        carNamesTwoThree.add("Audi");
        Product productTwoThree = new Product("Bushes", new BigDecimal(48), 2, null,
                carNamesTwoThree);
        productArrayListTwo.add(productTwoOne);
        productArrayListTwo.add(productTwoTwo);
        productArrayListTwo.add(productTwoThree);
        chapterTwo.setProductArrayList(productArrayListTwo);

        //Chapter3
        Chapter chapterThree = new Chapter();
        ArrayList<Product> productArrayListThree = new ArrayList<>();
        chapterThree.setName("Салон");
        HashSet<String> carNamesThreeOne = new HashSet<>();
        carNamesThreeOne.add("VW");
        carNamesThreeOne.add("Shcoda");
        carNamesThreeOne.add("Audi");
        Product productThreeOne = new Product("Cиденье", new BigDecimal(240), 20,
                null, carNamesThreeOne);

        HashSet<String> carNamesThreeTwo = new HashSet<>();
        carNamesThreeTwo.add("Renault");
        carNamesThreeTwo.add("Shcoda");
        carNamesThreeTwo.add("Audi");
        Product productThreeTwo = new Product("Коврики", new BigDecimal(24), 35,
                null, carNamesThreeTwo);

        HashSet<String> carNamesThreeThree = new HashSet<>();
        carNamesThreeThree.add("VW");
        carNamesThreeThree.add("Shcoda");
        carNamesThreeThree.add("Audi");
        Product productThreeThree = new Product("Ремень безопасности", new BigDecimal(12), 7,
                null, carNamesThreeThree);
        productArrayListThree.add(productThreeOne);
        productArrayListThree.add(productThreeTwo);
        productArrayListThree.add(productThreeThree);
        chapterThree.setProductArrayList(productArrayListThree);

        chapterArrayList.add(chapterOne);
        chapterArrayList.add(chapterTwo);
        chapterArrayList.add(chapterThree);
        return chapterArrayList;
    }
}
