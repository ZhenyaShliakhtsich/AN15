package com.teachMeSkills.an15.SavitskyRoman.hw8.task2;

import com.teachMeSkills.an15.SavitskyRoman.hw8.task2.model.Chapter;
import com.teachMeSkills.an15.SavitskyRoman.hw8.task2.model.Product;
import com.teachMeSkills.an15.SavitskyRoman.hw8.task2.model.User;
import com.teachMeSkills.an15.SavitskyRoman.hw8.task2.service.AuthService;
import com.teachMeSkills.an15.SavitskyRoman.hw8.task2.service.UserService;
import com.teachMeSkills.an15.SavitskyRoman.hw8.task2.service.impl.AuthServiceImpl;
import com.teachMeSkills.an15.SavitskyRoman.hw8.task2.service.impl.UserServiceImpl;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Scanner;

//Разработать консольное приложение при запуске которого просят авторизировать пользователя.
//Если залогиниться как админ, то можно добавлять, удалять, изменять информацию об автозапчасти.
//Если логиниться как пользователь, то появляется доступ поиска по названию его машины
//Запчасть содержит в себе название, цену, отзыв, среднюю оценку, количество и машины, к которым она подходит.
//Пользователь может написать отзыв к детали и поставить оценку. Оценка должна калькулироваться средняя.
// Пользователь может получить скидку до 30 процентов. Размер скидки рассчитать рандомом.
// Пользователь может добавлять товар в корзину и удалять, оплатить всю корзину целиков посредством ввода в консоль «Оплачиваю».
// После оплаты количество деталей должно уменьшиться.

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    static boolean isAnswer = false;
    static boolean isStepDownOne;
    static boolean isStepDownTwo = false;
    static boolean isStepDownThree;
    static boolean isStepDownForth;

    public static void main(String[] args) {
        HashMap<User, User> users = new HashMap<>();
        AuthService authService = new AuthServiceImpl();
        UserService userService = new UserServiceImpl();
        Chapter[] chapterArray = new Chapter[3];
        chapterArray[0] = new Chapter();
        chapterArray[0].setName("Двигатель");
        Product productOne = new Product("Oil", new BigDecimal(240), 20,
                null, "VW polo", "Shcoda rapid", "Audi A4");
        chapterArray[0].setProduct(productOne);
        Product productTwo = new Product("Oil filter", new BigDecimal(24), 35,
                null, "VW polo", "Shcoda rapid", "Audi A4", "Renault logan");
        chapterArray[0].setProduct(productTwo);
        Product productThree = new Product("Cylinder head gasket", new BigDecimal(12), 14,
                null, "VW polo", "Shcoda rapid");
        chapterArray[0].setProduct(productThree);

        chapterArray[1] = new Chapter();
        chapterArray[1].setName("Подвеска");
        Product productOneOne = new Product("Knuckle", new BigDecimal(27), 3, null, "Opel vectra");
        chapterArray[1].setProduct(productOneOne);
        Product productOneTwo = new Product("Ball joints", new BigDecimal(67), 7, null,
                "VW polo", "Scoda rapid");
        chapterArray[1].setProduct(productOneTwo);
        Product productOneThree = new Product("Bushes", new BigDecimal(48), 2, null, "Hyundai accent");
        chapterArray[1].setProduct(productOneThree);

        chapterArray[2] = new Chapter();
        chapterArray[2].setName("Салон");
        Product productTwoOne = new Product("Cиденье", new BigDecimal(260), 1, null, "Hyundai accent");
        chapterArray[2].setProduct(productTwoOne);
        Product productTwoTwo = new Product("Коврики", new BigDecimal(15), 5, null, "Opel vectra", "Shcoda rapid", "Audi A4", "Renault logan");
        chapterArray[2].setProduct(productTwoTwo);
        Product productTwoThree = new Product("Ремень безопасности", new BigDecimal(390), 1, null, "VW polo", "Scoda rapid");
        chapterArray[2].setProduct(productTwoThree);
        while (!isAnswer) {
            System.out.println("Выберите:\n1 - Регистрация\n2 - Авторизация\n3 - Выход из программы");
            String userChoice = answerUser();

            if (userChoice.equals("1")) {
                authService.registration(users);
            } else if (userChoice.equals("2")) {
                User user = authService.login(users);
                isStepDownOne = false;
                while (!isStepDownOne) {
                    if (user.isHasAdminRole()) {
                        adminMenu(chapterArray, userService);
                    } else {

                        System.out.println("Good day, " + user.getLogin());
                        userMenu(chapterArray, userService, user);
                        isStepDownOne = true;
                    }
                }
            } else if (userChoice.equals("3")) isAnswer = true;
            else {
                System.out.println("Ошибка ввода");

            }

        }
        scanner.close();
    }

    private static String answerUser() {
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

    private static void adminMenu(Chapter[] chapterArray, UserService userService) {
        isStepDownTwo = false;
        while (!isStepDownTwo) {
            StringBuilder chapterString = new StringBuilder("Выберите раздел:\n");
            for (int x = 0; x < chapterArray.length; x++) {
                chapterString.append(x + 1).append(" - ").append(chapterArray[x].getName()).append("\n");
                if (x == chapterArray.length - 1) chapterString.append(x + 2).append(" - Шаг назад\n").
                        append(x + 3).append(" - Выход из программы");
            }
            System.out.println(chapterString);
            String userChoiceTwo = answerUser();
            if (userChoiceTwo.equals("1")) {
                inMenuAdmin(chapterArray, userService, 0);
            } else if (userChoiceTwo.equals("2")) {
                inMenuAdmin(chapterArray, userService, 1);
            } else if (userChoiceTwo.equals("3")) {
                inMenuAdmin(chapterArray, userService, 2);
            } else if (userChoiceTwo.equals("4")) {
                isStepDownTwo = true;
                isStepDownOne = true;
            } else if (userChoiceTwo.equals("5")) {
                isStepDownTwo = true;
                isStepDownOne = true;
                isAnswer = true;
            } else {
                System.out.println("Ошибка ввода");

            }
        }

    }

    public static void inMenuAdmin(Chapter[] chapterArray, UserService userService, int numberOfChapterArray) {
        isStepDownThree = false;
        while (!isStepDownThree) {
            System.out.println("Выберите:\n1 - Для просмотра информации о продуктах\n" +
                    "2 - Для добавления нового продукта\n" +
                    "3 - Для удаления продукта\n4 - Для изменения информации о продукте\n" +
                    "5 - Шаг назад\n6 - Выход из программы");
            String userChoiceThree = answerUser();
            if (userChoiceThree.equals("1"))
                System.out.println(chapterArray[numberOfChapterArray].getProductArrayList());
            else if (userChoiceThree.equals("2")) {
                System.out.println(chapterArray[numberOfChapterArray].getProductArrayList());
                userService.addProduct(chapterArray[numberOfChapterArray].getProductArrayList());
                System.out.println(chapterArray[numberOfChapterArray].getProductArrayList());
            } else if (userChoiceThree.equals("3")) {
                System.out.println(chapterArray[numberOfChapterArray].getProductArrayList());
                if (!chapterArray[numberOfChapterArray].getProductArrayList().isEmpty()) {
                    userService.deleteProduct(chapterArray[numberOfChapterArray].getProductArrayList());
                } else System.out.println("Список продуктов пуст");
                System.out.println(chapterArray[numberOfChapterArray].getProductArrayList());
            } else if (userChoiceThree.equals("4")) {
                userService.changeProduct(chapterArray[numberOfChapterArray].getProductArrayList());
            } else if (userChoiceThree.equals("5")) {
                isStepDownThree = true;
                isStepDownTwo = true;
            } else if (userChoiceThree.equals("6")) {
                isStepDownThree = true;
                isStepDownTwo = true;
                isStepDownOne = true;
                isAnswer = true;
            } else {
                System.out.println("Ошибка ввода");
            }
        }
    }

    public static void userMenu(Chapter[] chapterArray, UserService userService, User user) {
        isStepDownTwo = false;
        while (!isStepDownTwo) {
            StringBuilder chapterString = new StringBuilder("Выберите раздел:\n");
            for (int x = 0; x < chapterArray.length; x++) {
                chapterString.append(x + 1).append(" - ").append(chapterArray[x].getName()).append("\n");
                if (x == chapterArray.length - 1) chapterString.append(x + 2).append(" - Поиск по названию авто\n").
                        append(x + 3).append(" - Шаг назад\n").
                        append(x + 4).append(" - Выход из программы");
            }
            System.out.println(chapterString);
            String userChoiceTwo = answerUser();
            if (userChoiceTwo.equals("1")) {
                inUserMenu(chapterArray, userService, 0, productListForUser(chapterArray, 0), user);
            } else if (userChoiceTwo.equals("2")) {
                inUserMenu(chapterArray, userService, 1, productListForUser(chapterArray, 1), user);
                ;
            } else if (userChoiceTwo.equals("3")) {
                inUserMenu(chapterArray, userService, 2, productListForUser(chapterArray, 2), user);


            } else if (userChoiceTwo.equals("4")) {


                continue;
                //TODO: create search to carName
            } else if (userChoiceTwo.equals("5")) {
                isStepDownForth = true;
                isStepDownTwo = true;
                isStepDownOne = true;
            } else if (userChoiceTwo.equals("6")) {
                isStepDownForth = true;
                isStepDownTwo = true;
                isStepDownOne = true;
                isAnswer = true;
            } else {
                System.out.println("Ошибка ввода");

            }
        }

    }

    public static void inUserMenu(Chapter[] chapterArray, UserService userService,
                                  int numberOfChapterArray, int numberOfProductArray, User user) {
        isStepDownThree = false;
        while (!isStepDownThree) {
            if (user.getBasket().getProducts() == null || user.getBasket().getProducts().isEmpty()) System.out.println("Ваша корзина пуста");
            else {
                StringBuilder inBasketNow = new StringBuilder("\nВ корзине:\n");
                for (Product pr : user.getBasket().getProducts()) {
                    inBasketNow.append(pr.getName()).append("\n");
                }
                System.out.println(inBasketNow);
            }
            System.out.println("Выберите:\n1 - Добавить продукт в корзину\n" +
                    "2 - Написать отзыв о продукте\n" +
                    "3 - Удлаить продукт из корзины\n" +
                    "4 - Шаг назад\n5 - Выход из программы");
            String userChoiceThree = answerUser();
            if (userChoiceThree.equals("1"))
                userService.addProductToBasket(user, chapterArray[numberOfChapterArray].getProductArrayList().get(numberOfProductArray));
            else if (userChoiceThree.equals("2")) {
                /*
                System.out.println(chapterArray[numberOfChapterArray].getProductArrayList());
                userService.addProduct(chapterArray[numberOfChapterArray].getProductArrayList());
                System.out.println(chapterArray[numberOfChapterArray].getProductArrayList());*/
                continue;
            } else if (userChoiceThree.equals("3")) {/*
                System.out.println(chapterArray[numberOfChapterArray].getProductArrayList());
                if (!chapterArray[numberOfChapterArray].getProductArrayList().isEmpty()) {
                    userService.deleteProduct(chapterArray[numberOfChapterArray].getProductArrayList());
                } else System.out.println("Список продуктов пуст");
                System.out.println(chapterArray[numberOfChapterArray].getProductArrayList());*/
                continue;

            } else if (userChoiceThree.equals("4")) {
                isStepDownThree = true;
                // isStepDownTwo = true;
            } else if (userChoiceThree.equals("5")) {
                isStepDownThree = true;
                isStepDownTwo = true;
                isStepDownOne = true;
                isAnswer = true;
            } else {
                System.out.println("Ошибка ввода");
            }


        }
    }

    public static int productListForUser(Chapter[] chapterArray, int numberOfArray) {
        DecimalFormat df = new DecimalFormat("#,###.00");
        StringBuilder productArrayString = new StringBuilder("В разделе \"" + chapterArray[numberOfArray].getName() +
                "\" находятся следующие элементы:\n");
        for (int x = 0; x < chapterArray[numberOfArray].getProductArrayList().size(); x++) {
            productArrayString.append("Номер продукта: ").append(x + 1).append("\n").
                    append("Название продукта: ").append(chapterArray[numberOfArray].getProductArrayList().get(x).getName()).append("\n").
                    append("Цена: ").append(df.format(chapterArray[numberOfArray].getProductArrayList().get(x).getPrice())).append("\n").
                    append("Количество в наличии: ").append(chapterArray[numberOfArray].getProductArrayList().get(x).getAmount()).append("\n").
                    append("Рейтинг: ").append(chapterArray[numberOfArray].getProductArrayList().get(x).getAvgRate()).append("\n").
                    append("Подходит к авто: ").append(chapterArray[numberOfArray].getProductArrayList().get(x).getCarNames()).append("\n").
                    append("Комментарий: ").append(chapterArray[numberOfArray].getProductArrayList().get(x).getComment()).append("\n");
            if (x != chapterArray[numberOfArray].getProductArrayList().size() - 1) productArrayString.append("\n");
        }
        System.out.println(productArrayString);
        isStepDownForth = false;
        while (!isStepDownForth) {
            try {
                System.out.println("Введите номер продукта");
                int anw = Integer.parseInt(answerUser()) - 1;
                System.out.println("Вы выбрали - " + chapterArray[numberOfArray].getProductArrayList().get(anw).getName());
                isStepDownForth = true;
                return anw;


            } catch (NumberFormatException ex) {
                System.out.println("Ввод только числовой!!!");
            } catch (IndexOutOfBoundsException ex) {
                System.out.println("Такого номера продукта нету!!!");
            }
        }
        return 0;
    }
}


