package com.teachMeSkills.an15.PilyushinYuri.hw8.task2.service.impl;


import com.teachMeSkills.an15.PilyushinYuri.hw8.task2.model.User;
import com.teachMeSkills.an15.PilyushinYuri.hw8.task2.service.MenuService;


import java.util.Scanner;

public class MenuServiceImpl implements MenuService {


    @Override
    public void userMenu(User user) {
        UserServiceImpl userService = new UserServiceImpl();
        AuthServiceImpl authService = new AuthServiceImpl();
        Scanner scanner = new Scanner(System.in);
        StringBuilder stringBuilder = new StringBuilder("выберите действие:");
        stringBuilder.append("\n1.добавить продукт");
        stringBuilder.append("\n2.оплатить покупки");
        stringBuilder.append("\n3.удалить продукт");
        stringBuilder.append("\n4.оценить продукт");
        stringBuilder.append("\n5.коментировать продукт");
        stringBuilder.append("\n6.вернуться к авторизации");
        System.out.println(stringBuilder);
        String choise = scanner.nextLine();
        if (choise.contains("1") || choise.contains("добавить")) {
            userService.addProductToBasket(user);
            userMenu(user);
        } else if (choise.contains("2") || choise.contains("оплатить")) {
            userService.payForBasket(user);
            userMenu(user);
        } else if (choise.contains("3") || choise.contains("удалить")) {
            userService.deleteProductFromBasket(user);
            userMenu(user);
        } else if (choise.contains("4") || choise.contains("оценить")) {
            userService.rateProduct(user);
            userMenu(user);
        } else if (choise.contains("5") || choise.contains("коментировать")) {
            userService.deleteProductFromBasket(user);
            userMenu(user);
        } else if (choise.contains("6") || choise.contains("вернуться")) {
            authService.login();
        } else {
            System.out.println("Неправильный выбор. Повторите ввод.");
            userMenu(user);
        }

    }

    @Override
    public void adminMenu() {
        UserServiceImpl userService = new UserServiceImpl();
        AuthServiceImpl authService = new AuthServiceImpl();
        Scanner scanner = new Scanner(System.in);
        StringBuilder stringBuilder = new StringBuilder("выберите действие:");
        stringBuilder.append("\n1.добавить продукт");
        stringBuilder.append("\n2.изменить продукт");
        stringBuilder.append("\n3.удалить продукт");
        stringBuilder.append("\n4.вернуться к авторизации");
        System.out.println(stringBuilder);
        String choise = scanner.nextLine();
        if (choise.contains("1") || choise.contains("добавить")) {
            userService.addProduct();
            adminMenu();
        } else if (choise.contains("2") || choise.contains("изменить")) {
            userService.changeProduct();
            adminMenu();
        } else if (choise.contains("3") || choise.contains("удалить")) {
            userService.deleteProduct();
            adminMenu();
        } else if (choise.contains("4") || choise.contains("вернуться")) {
            authService.login();
        } else {
            System.out.println("Неправильный выбор. Повторите ввод.");
            adminMenu();
        }
    }

    @Override
    public void authMenu() {
        AuthServiceImpl authService = new AuthServiceImpl();
        Scanner scanner = new Scanner(System.in);
        System.out.println("выберите  действие:\n 1.регистрация\n2.авторизация");
        String choice = scanner.nextLine();
        if (choice.equalsIgnoreCase("1") || choice.equals("регистрация")) {
            authService.registration();
        }
        if (choice.equalsIgnoreCase("2") || choice.equals("авторизация")) {
            authService.login();

        }
    }
}
