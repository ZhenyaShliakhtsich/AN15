package com.teachMeSkills.an15.MatveevArtyom.hw6.Inheritance.task3.service.Impl;

import com.teachMeSkills.an15.MatveevArtyom.hw6.Inheritance.task3.User;
import com.teachMeSkills.an15.MatveevArtyom.hw6.Inheritance.task3.service.AuthenticationService;

import java.util.Scanner;

public class UserAuthenticationServiceImpl implements AuthenticationService {
    @Override
    public void doLoginAndPassword(User user) {
        System.out.println("Введите логин: ");
        String login = new Scanner(System.in).nextLine();
        System.out.println("Введите пароль: ");
        int password = new Scanner(System.in).nextInt();
        if (password == user.getPassword() && login.equals(user.getLogin())) {
            System.out.println("Аутентификация прошла успешно!");
        } else System.out.println("Аутентификация прошла неуспешно! Вы ввели чё-то не так!!!");
    }

   /* @Override
    public void printCatalog(Category category) {
        System.out.println(Arrays.toString(category.getProducts()));
    }

    @Override
    public void printThisCatalog(Category category) {
        System.out.println("Выберите категорию: 1 - Крупы, 2 - Молочка, 3 - Булки");
        int counter = new Scanner(System.in).nextInt();
        if(counter == 1 && category.getName().equals("Крупы")){
            System.out.println(Arrays.toString(category.getProducts()));
        }else if(counter == 2 && category.getName().equals("Молочка")){
            System.out.println(Arrays.toString(category.getProducts()));
        }else if(counter == 3 && category.getName().equals("Булки")){
            System.out.println(Arrays.toString(category.getProducts()));
        }else System.out.println("Что-то неправильно! дурак, чё сказать!");
    }

    @Override
    public void choice(Basket basket) {
        System.out.println("Выберите какой товар вы хотите купить: \n" +
                "1 - Гречка, 2 - Нут, 3 - Пшено, 4 - Молоко, 5 - Кефир, 6 - Сметана" +
                " 7 -Пирожок с мясом, 8 - Булочка с маком, 9 - Сметанник");
        int k = new Scanner(System.in).nextInt();
        switch (k){
            case 1:
                System.out.println();
        }
    }

    @Override
    public void byInBasket(Basket basket) {

    }*/
}
