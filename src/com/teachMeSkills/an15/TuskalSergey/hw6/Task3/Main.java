package com.teachMeSkills.an15.TuskalSergey.hw6.Task3;

import Task3.service.AuthenticationService;
import Task3.service.CategoryService;
import Task3.service.impl.AuthenticationServiceImpl;
import Task3.service.impl.CategoryServiceImpl;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        User user = new User();
        user.setLogin("login");
        user.setPassword("password");

        Category fruits = new Category();
        fruits.setName("Фрукты");
        Category beverages = new Category();
        beverages.setName("Напитки");
        Category chocolate = new Category();
        chocolate.setName("Шоколад");
        Category[] categories = {fruits, beverages, chocolate};

        Item[] fruitItems = new Item[3];
        fruitItems[0] = new Item("яблоко", 3.5, 4.5);
        fruitItems[1] = new Item("апельсин", 4.1, 5.0);
        fruitItems[2] = new Item("банан", 3.8, 4.8);
        fruits.setItems(fruitItems);

        Item[] beverageItems = new Item[3];
        beverageItems[0] = new Item("Кока-кола", 6, 5.0);
        beverageItems[1] = new Item("Пепси-кола", 5.8, 4.9);
        beverageItems[2] = new Item("Бела-кола", 5.5, 4.8);
        beverages.setItems(beverageItems);

        Item[] chocolateItems = new Item[3];
        chocolateItems[0] = new Item("Альпен Голд", 2.5, 4.9);
        chocolateItems[1] = new Item("Нестле", 2.4, 4.7);
        chocolateItems[2] = new Item("Аленка", 2.3, 4.8);
        chocolate.setItems(chocolateItems);

        AuthenticationService authenticationService = new AuthenticationServiceImpl();
        authenticationService.userAuthentication(user);

        int id = 0;
        System.out.println("Каталоги товаров:");
        for (Category category : categories) {
            System.out.println(++id + " - " + category.getName());
        }

        Basket[] basket = new Basket[1];
        basket[0] = new Basket("товар", 1, 1);
        CategoryService categoryService = new CategoryServiceImpl();

        Scanner scanner = new Scanner(System.in);
        System.out.print("Выберите каталог для просмотра: ");
        int categoryChoice = scanner.nextInt();
        switch (categoryChoice) {
            case 1:
                categoryService.viewCategory(fruitItems);

                break;
            case 2:
                categoryService.viewCategory(beverageItems);
                break;
            case 3:
                categoryService.viewCategory(chocolateItems);
                break;
            default:
                System.out.println("Неверный номер каталога!!!");
        }
        categoryChoice--;
        System.out.print("Выберите товар для добавления в корзину: ");
        int itemChoice = scanner.nextInt();
        switch (itemChoice) {
            case 1:
                categoryService.addItemToBasket(categories[categoryChoice].getItems()[0]);
                break;
            case 2:
                categoryService.addItemToBasket(categories[categoryChoice].getItems()[1]);
                break;
            case 3:
                categoryService.addItemToBasket(categories[categoryChoice].getItems()[2]);
                break;
            default:
                System.out.println("Неверно указан номер товара!!!");
        }
        itemChoice--;
        System.out.println("Желаете купить товар, находящийся в корзине (1 - да, 2 - нет)?");
        int finishPurchase = scanner.nextInt();
        switch (finishPurchase) {
            case 1:
                categoryService.buyItem(categories[categoryChoice].getItems()[itemChoice]);
                break;
            default:
                System.out.println("Вы ничего не купили");
        }


    }
}

