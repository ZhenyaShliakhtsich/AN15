package com.teachMeSkills.an15.ShlyakhtichEvgeniy.hw6.task3;

import com.teachMeSkills.an15.ShlyakhtichEvgeniy.hw6.task3.Service.Impl.*;
import com.teachMeSkills.an15.ShlyakhtichEvgeniy.hw6.task3.Shop.Basket;
import com.teachMeSkills.an15.ShlyakhtichEvgeniy.hw6.task3.Shop.Category;
import com.teachMeSkills.an15.ShlyakhtichEvgeniy.hw6.task3.Shop.Product;
import com.teachMeSkills.an15.ShlyakhtichEvgeniy.hw6.task3.Shop.User;

import java.awt.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Product apple = new Product("Apple", 4.1, 4.3);
        Product lemon = new Product("Lemon", 1.2, 3.3);
        Product potato = new Product("Potato", 1.3, 4.9);
        Product onion = new Product("Onion", 1.7, 3.3);
        Product mayo = new Product("Mayo", 3.9, 3.7);
        Product milk = new Product("Milk", 2.4, 4.2);
        Product[] milks = new Product[2];
        Product[] fruits = new Product[2];
        Product[] vegetables = new Product[2];
        milks[0] = milk;
        milks[1] = mayo;
        fruits[0] = apple;
        fruits[1] = lemon;
        vegetables[0] = potato;
        vegetables[1] = onion;
        Category milksCat = new Category("Молочные и майонез", milks);
        Category fruitsCat = new Category("Фрукты", fruits);
        Category vegetablesCat = new Category("Овощи", vegetables);
        Category[] categories = new Category[3];
        categories[0]=milksCat;
        categories[1]=fruitsCat;
        categories[2]=vegetablesCat;
        User user = new User("Login", "Password");//Login Password
        Basket basket = new Basket();
        ArrayList<Product> products = new ArrayList<>();
        basket.setProducts(products);
        Scanner scanner = new Scanner(System.in);//тут аутентификация работает нормально
        System.out.println("Введите логин");
        String login = scanner.nextLine();
        System.out.println("Введите пароль");
        String password = scanner.nextLine();
        AuthenticationImpl authentication = new AuthenticationImpl();
        authentication.authentication(user, login, password);
        Menu(user,categories,basket);

    }
    public static void Menu(User user,Category[] categories,Basket basket) {
        System.out.println("1. Авторизация\n2.Выбрать категорию\n3.Оплатить товары\n4.Выход");
        Scanner scanner = new Scanner(System.in);
        int choose = scanner.nextInt();
        switch (choose){
            case 1:
                auto(user);
                Menu(user, categories, basket);
                break;
            case 2:
                CategoriesMenu(user, categories, basket);
                break;
            case 3:
                BuyProductsImpl buyProducts = new BuyProductsImpl();
                buyProducts.buyProducts(basket);
                break;
            case 4:
                break;
            default:
                Menu(user, categories, basket);
        }

    }

    public static void CategoriesMenu(User user,Category[] categories,Basket basket){
        CategoriesListImpl categoriesList = new CategoriesListImpl();
        System.out.println("Выберите категорию");
        categoriesList.categoriesList(categories);
        CategoryProductsImpl categoryProducts = new CategoryProductsImpl();
        System.out.println("4.Назад");
        Scanner scanner = new Scanner(System.in);
        int choose = scanner.nextInt();
        switch (choose){
            case 1 :
                ChooseProduct(choose-1,user,categories,basket);
                break;
            case 2:
                ChooseProduct(choose-1,user,categories,basket);
                break;
            case 3:
                ChooseProduct(choose-1,user,categories,basket);
                break;
            case 4:
                Menu(user,categories,basket);
                break;
            default:
                CategoriesMenu(user, categories, basket);
                break;
        }
    }

    public static void ChooseProduct(int i, User user,Category[] categories,Basket basket){
        Scanner scanner = new Scanner(System.in);
        CategoryProductsImpl categoryProducts = new CategoryProductsImpl();
        categoryProducts.categoryProducts(categories[i]);
        System.out.println("\n4.Назад");
        ChooseProductImpl chooseProduct = new ChooseProductImpl();
        int choose = scanner.nextInt();
        switch (choose){
            case 1:
                chooseProduct.chooseProduct(basket,categories[i].getProduct()[0]);
                ChooseProduct(i, user, categories, basket);
                break;
            case 2:
                chooseProduct.chooseProduct(basket,categories[i].getProduct()[1]);
                ChooseProduct(i, user, categories, basket);
                break;
            case 4:
                CategoriesMenu(user, categories, basket);
                break;
            default:
                ChooseProduct(i, user, categories, basket);
                break;
        }
    }
    public static void auto(User user){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите логин");//хз почему тут не работает
        String login = scanner.nextLine();
        System.out.println("Введите пароль");
        String password = scanner.nextLine();
        AuthenticationImpl authentication = new AuthenticationImpl();
        authentication.authentication(user, login, password);
    }
}
