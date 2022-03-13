package com.teachMeSkills.an15.LashkevichGeorgy.hw6.task3;
//Создать класс Товар, имеющий переменные имя, цена, рейтинг.
//Создать класс Категория, имеющий переменные имя и массив товаров.
// Создать несколько объектов класса Категория.
//Создать класс Basket, содержащий массив купленных товаров.
//Создать класс User, содержащий логин, пароль и объект класса Basket.
// Создать объект класса User.
//
//Реализовать через интерфейсы:
//Аутентификация пользователя. Пользователь вводит логин и пароль с клавиатуры.  +
//Просмотр списка каталогов товаров.
//Просмотр списка товаров определенного каталога.
//Выбор товара в корзину.
//Покупка товаров, находящихся в корзине.
//Создаем перечисление содержащее значения для перечисленных операций.
// Можете добавить свои операции или изменить что-то на свой вкус.

import com.teachMeSkills.an15.LashkevichGeorgy.hw6.task3.classes.Basket;
import com.teachMeSkills.an15.LashkevichGeorgy.hw6.task3.classes.Category;
import com.teachMeSkills.an15.LashkevichGeorgy.hw6.task3.classes.Product;
import com.teachMeSkills.an15.LashkevichGeorgy.hw6.task3.classes.User;
import com.teachMeSkills.an15.LashkevichGeorgy.hw6.task3.service.Impl.AutenticationImpl;
import com.teachMeSkills.an15.LashkevichGeorgy.hw6.task3.service.AuthenticationService;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Basket basket = new Basket();

        Product product = new Product();
        Product product1 = new Product();
        Product product2 = new Product();
        product.setPrice(100);
        product.setRating(1);
        product.setName("Limon");
        product1.setPrice(200);
        product1.setRating(13);
        product1.setName("Orange");
        product2.setPrice(300);
        product2.setRating(7);
        product2.setName("Banana");

        Product[] products = new Product[]{product, product1, product2};
        System.out.println(Arrays.toString(products));

        User user = new User();

        user.setLogin("Ybivator");
        user.setPassword("ybiica007");
        user.setBasket(basket);
        AuthenticationService authenticationService = new AutenticationImpl();
        authenticationService.authentication(user);
        Category category = new Category();
        category.setName("Овощи");


    }
}
