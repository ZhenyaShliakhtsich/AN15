package com.teachMeSkills.an15.ShlyakhtichEvgeniy.hw7.task1.service.impl;

import com.teachMeSkills.an15.ShlyakhtichEvgeniy.hw7.task1.classes.User;
import com.teachMeSkills.an15.ShlyakhtichEvgeniy.hw7.task1.service.UserService;

import java.util.ArrayList;
import java.util.Scanner;

public class UserServiceImpl implements UserService {
    @Override
    public User logIn(ArrayList<User> users) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите логин или e-mail");
        String login = scanner.nextLine();
        System.out.println("Введите пароль");
        String password = scanner.nextLine();
        for (User user : users) {
            if (login.equals(user.getLogin()) || login.equals(user.geteMail()) && password.equals(user.getPassword())) {
                System.out.println("Вы успешно вошли в аккаунт");
                return user;
            } else {
                System.out.println("Неправильные данные.Попробуйте снова");
                logIn(users);
                break;
            }


        }
        scanner.close();
        return null;
    }

    @Override
    public void registration(ArrayList<User> users) {
        User user = new User();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите логин");
        user.setLogin(scanner.nextLine());
        System.out.println("Введите пароль");
        user.setPassword(scanner.nextLine());
        System.out.println("Повторите пароль");
        String passwordRepeat = scanner.nextLine();
        if (!passwordRepeat.equals(user.getPassword())) {
            System.out.println("Пароли не совпадают.Введите данные заново");
            registration(users);

        }
        System.out.println("Введите имя");
        user.setFirstName(scanner.nextLine());
        System.out.println("Введите фамилию");
        user.setSecondName(scanner.nextLine());
        System.out.println("Введите ваш e-mail");
        String regex = "^(.+)@(.+)$";
        String mail = scanner.nextLine();
        while (!mail.matches(regex)){
            mail = scanner.nextLine();
        }
        user.seteMail(mail);
        System.out.println("Регистрация прошла успешна.Войдите в аккаунт");
        users.add(user);
        scanner.close();
        logIn(users);
    }

    @Override
    public void showInfo(User user) {
        System.out.println("Информация о вас:");
        user.toString();
    }

    public void changeInfo(User user) {
        System.out.println("Какую информацию вы хотите поменять?");
        Scanner scanner = new Scanner(System.in);
        String choice = scanner.nextLine();
        if (choice.equalsIgnoreCase("Имя")) {
            System.out.println("Введите новое имя");
            user.setFirstName(scanner.nextLine());
        } else if (choice.equalsIgnoreCase("Фамилия")) {
            System.out.println("Введите новую фамилию");
            user.setSecondName(scanner.nextLine());
        } else if (choice.equalsIgnoreCase("e-mail")) {
            System.out.println("Введите новую почту");
            user.seteMail(scanner.nextLine());
        } else if (choice.equalsIgnoreCase("Логин")) {
            System.out.println("Введите новый логин");
            user.setLogin(scanner.nextLine());
        } else if (choice.equalsIgnoreCase("Пароль")) {
            System.out.println("Введите старый пароль");
            String password = scanner.nextLine();
            if (password.equals(user.getPassword())) {
                System.out.println("Введите новый пароль");
                user.setPassword(scanner.nextLine());
            } else {
                System.out.println("Неправильный пароль");
                changeInfo(user);
            }
        }
        scanner.close();

    }
}

