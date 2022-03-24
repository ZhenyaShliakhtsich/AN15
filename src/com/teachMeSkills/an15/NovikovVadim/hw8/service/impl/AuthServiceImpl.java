package com.teachMeSkills.an15.NovikovVadim.hw8.service.impl;

import com.teachMeSkills.an15.NovikovVadim.hw8.EnumMenu;
import com.teachMeSkills.an15.NovikovVadim.hw8.model.User;
import com.teachMeSkills.an15.NovikovVadim.hw8.service.AuthService;

import java.util.HashMap;
import java.util.Scanner;

public class AuthServiceImpl implements AuthService {

    private User enterPassword(String login, HashMap<String, User> users, boolean isAdmin) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите пароль:");
        String password = scanner.nextLine();
        User user = users.get(login);
        if (user.getPassword().equals(password)) {
            System.out.println("Вы авторизовались!");
            users.put(login, user);
            return user;
        } else {
            boolean flagCheckCommand = false;

            do {
                System.out.println("Не верный пароль. Выберите действие, выберите номер команды: " +
                        "\n 1. Повторить ввод пароля" +
                        "\n 2. Ввести другой логин" +
                        "\n 3. Выйти из программы");

                int command = getCommand();
                switch (command) {
                    case 1:
                        flagCheckCommand = true;
                        return enterPassword(login, users, isAdmin);
                    case 2:
                        flagCheckCommand = true;
                        return authlogin(users, "", isAdmin);
                    case 3:
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

    private int getCommand(){
        Scanner scanner = new Scanner(System.in);
        try{
            int result = scanner.nextInt();
            return result;
        }catch (Exception e){
            System.out.println("Некорректная команда, повторите ввод");
            return getCommand();
        }
    }

    @Override
    public User authlogin(HashMap<String, User> users, String slogin, boolean isAdmin) {

        Scanner scanner = new Scanner(System.in);
        String login;
        if (slogin == "") {
            System.out.println("Авторизация, " + EnumMenu.Sign_Login);
            login = scanner.nextLine();
        } else {
            login = slogin;
        }

        if (users.containsKey(login)) {
            return enterPassword(login, users, isAdmin);
        } else {
            System.out.println("Нет такого пользователя:");
            System.out.println("1. " + EnumMenu.Sign_Login);
            System.out.println("2. " + EnumMenu.Sign_Reg);
            System.out.println("3. " + EnumMenu.Menu_Exit);

            int command = getCommand();

            switch (command) {
                case 1:
                    return authlogin(users, "", isAdmin);
                case 2:
                    return registration(users, login, isAdmin);
                case 3:
                    return null;
                default:
                    System.out.println("Неверная операция:");
                    authlogin(users, "", isAdmin);
            }
        }
        return null;
    }

    @Override
    public User registration(HashMap<String, User> users, String slogin, boolean isAdmin) {

        Scanner scanner = new Scanner(System.in);
        String login;
        if (slogin == "") {
            System.out.println("Регистрация, " + EnumMenu.Sign_Login);
            login = scanner.nextLine();
        } else {
            login = slogin;
        }

        if (users.containsKey(login)) {
            System.out.println("Пользователь с таким логином уже есть:");

            System.out.println("1. " + EnumMenu.Sign_OtherLogin);
            System.out.println("2. " + EnumMenu.Sign_Auth);
            System.out.println("3. " + EnumMenu.Menu_Exit);

            int command = getCommand();

            switch (command) {
                case 1:
                    return registration(users, "", isAdmin);
                case 2:
                    return authlogin(users, login, isAdmin);
                case 3:
                    return null;
                default:
                    System.out.println("Неверная операция:");
                    registration(users, "", isAdmin);
            }
        } else {
            System.out.println("Регистрация, " + EnumMenu.Sign_Pass);
            String password = scanner.nextLine();

            User User = new User(login, password);
            User.setHasAdminRole(isAdmin);
            return User;

        }
        return null;
    }
}