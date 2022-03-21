package com.teachMeSkills.an15.ShlyakhtichEvgeniy.hw7.task1.service.impl;

import com.teachMeSkills.an15.ShlyakhtichEvgeniy.hw7.task1.classes.User;
import com.teachMeSkills.an15.ShlyakhtichEvgeniy.hw7.task1.service.UserService;

import java.util.ArrayList;
import java.util.Scanner;

public class UserServiceImpl implements UserService {
    @Override
    public void logIn(ArrayList<User> users) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите логин или e-mail");
        String login = scanner.nextLine();
        System.out.println("Введите пароль");
        String password = scanner.nextLine();
        for (int i = 0; i < users.size();i++) {
            if (login.equals(users.get(i).getLogin()) || login.equals(users.get(i).geteMail())
                    && password.equals(users.get(i).getPassword())) {
                System.out.println("Вы успешно вошли в аккаунт");
                MenuServiceImpl menu = new MenuServiceImpl();
                menu.menu(users.get(i));
                break;
            } else {
                System.out.println("Неправильные данные.Попробуйте снова");
                logIn(users);
                break;
            }


        }
    }

    @Override
    public void registration(ArrayList<User> users) {
        User newUser = new User();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Регистрация\nВведите логин");
        newUser.setLogin(scanner.nextLine());
        System.out.println("Введите пароль");
        newUser.setPassword(scanner.nextLine());
        System.out.println("Повторите пароль");
        String passwordRepeat = scanner.nextLine();
        if (!passwordRepeat.equals(newUser.getPassword())) {
            System.out.println("Пароли не совпадают.Введите данные заново");
            registration(users);

        }
        System.out.println("Введите имя");
        newUser.setFirstName(scanner.nextLine());
        System.out.println("Введите фамилию");
        newUser.setSecondName(scanner.nextLine());
        System.out.println("Введите ваш e-mail");
        String regex = "^(.+)@(.+)$";
        String mail = scanner.nextLine();
        while (!mail.matches(regex)) {
            System.out.println("Введите e-mail правильно");
            mail = scanner.nextLine();
        }
        newUser.seteMail(mail);
        users.add(newUser);//не понимаю,почему не добавляется новый пользователь
        System.out.println("Регистрация прошла успешна.Войдите в аккаунт");
        logIn(users);
    }

    @Override
    public void showInfo(User user) {
        System.out.println("Информация о вас:");
        System.out.println(user.toString());
        MenuServiceImpl menuService = new MenuServiceImpl();
        menuService.menuUser(user);
    }

    public void changeInfo(User user) {
        System.out.println("Какую информацию вы хотите поменять?(Имя/Фамилия/Логин/Пароль/e-mail)");
        Scanner scanner = new Scanner(System.in);
        MenuServiceImpl menuService = new MenuServiceImpl();
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
        menuService.menuUser(user);
    }
}

