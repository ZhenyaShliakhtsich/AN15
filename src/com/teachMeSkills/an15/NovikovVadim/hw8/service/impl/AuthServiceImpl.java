package com.teachMeSkills.an15.NovikovVadim.hw8.service.impl;

import com.teachMeSkills.an15.NovikovVadim.hw8.model.User;
import com.teachMeSkills.an15.NovikovVadim.hw8.service.AuthService;

import java.util.HashMap;
import java.util.Scanner;

public class AuthServiceImpl implements AuthService {

    private User enterPassword(String login, HashMap<String, User> users) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите пароль:");
        String password = scanner.nextLine();
        User user = users.get(login);
        if (user.getPassword().equals(password)) {
            System.out.println("Вы авторизовались!");
            return user;
        } else {
            boolean flagCheckCommand = false;

            do {
                System.out.println("Не верный пароль. Выберите действие, выберите номер команды: " +
                        "\n\t 1. Повторить ввод пароля" +
                        "\n\t 2. Ввести другой логин" +
                        "\n\t 3. Выйти из программы");
                String command = scanner.nextLine();
                switch (command) {
                    case "1":
                        flagCheckCommand = true;
                        return enterPassword(login, users);
                    case "2":
                        flagCheckCommand = true;
                        return authlogin(users, "");
                    case "3":
                        flagCheckCommand = true;
                        return null;
                    default:
                        if (!flagCheckCommand) {
                            System.out.println("Некорректная команда, повторите ввод");
                        }
                }
            } while (!flagCheckCommand);
        }
        return null;
    }

    @Override
    public User authlogin(HashMap<String, User> users, String login) {
        Scanner scanner = new Scanner(System.in);
        if (login == "") {
            System.out.println("Авторизация, введите логин:");
            login = scanner.nextLine();
        }

        if (users.containsKey(login)) {

            return enterPassword(login, users);

        } else {
            boolean flag = true;
            while (flag) {
                System.out.println("Неверный логин. Выберите действие, введите номер команды: " +
                        "\n\t 1. Авторизация " +
                        "\n\t 2. Регистрация " +
                        "\n\t 3. Выйти из программы");
                String command = scanner.nextLine();
                switch (command) {
                    case "1":
                        flag = false;
                        authlogin(users, "");
                        break;
                    case "2":
                        flag = false;
                        return registration(users);
                    case "3":
                        flag = false;
                        return null;
                    default:
                        if (flag) {
                            System.out.println("Неверная команда, повторите ввод");
                        }
                }
            }

        }
        return null;
    }

    @Override
    public User registration(HashMap<String, User> users) {

        System.out.println("Регистрация, введите логин:");
        Scanner scanner = new Scanner(System.in);
        String login = scanner.nextLine();

        if (users.containsKey(login)) {
            boolean flag = true;
            while (flag) {

                System.out.println("Такой пользователь уже зарегистрирован. Выберите действие:" +
                        "\n\t 1. Ввести другой логин" +
                        "\n\t 2. Авторизоваться" +
                        "\n\t 3. Выйти из программы");
                String command = scanner.nextLine();
                switch (command) {
                    case "1":
                        flag = false;
                        return registration(users);
                    case "2":
                        flag = false;
                        return authlogin(users, login);
                    case "3":
                        flag = false;
                        return null;
                    default:
                        if (flag) {
                            System.out.println("Неверная команда, повторите ввод");
                        }
                }
            }

        } else {

            System.out.println("Введите пароль:");
            String password = scanner.nextLine();

            return new User(login, password);
        }
        return null;
    }

}
