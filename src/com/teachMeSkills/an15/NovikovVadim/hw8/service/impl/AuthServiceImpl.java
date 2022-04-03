package com.teachMeSkills.an15.NovikovVadim.hw8.service.impl;

import com.teachMeSkills.an15.NovikovVadim.hw8.EnumMenu;
import com.teachMeSkills.an15.NovikovVadim.hw8.model.MyScanner;
import com.teachMeSkills.an15.NovikovVadim.hw8.model.User;
import com.teachMeSkills.an15.NovikovVadim.hw8.service.AuthService;

import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AuthServiceImpl extends MyScanner implements AuthService {
    String PATTERN = "[^А-Яа-яA-Za-z0-9]";

    private String checkPassword() {
        String password = getTextFromScanner("Введите пароль, состоящий только из букв и/или цифр:");
        Matcher matcher = Pattern.compile(PATTERN).matcher(password);
        if (matcher.find()) {
            System.out.println("Некорректный пароль, повторите ввод.");
            return checkPassword();
        }
        return password;
    }

    private User inputPassword(String login, HashMap<String, User> users, boolean isAdmin) {

        String password = checkPassword();

        User user = users.get(login);
        if (user.getPassword().equals(password)) {
            System.out.println("Вы авторизовались!");
            users.put(login, user);
            return user;
        } else {
            boolean flagCheckCommand = false;

            int iter = 1;
            StringBuilder isNotCorrectPassword = new StringBuilder();
            isNotCorrectPassword.append("Не верный пароль. Выберите действие, выберите номер команды: ")
                    .append("\n").append(String.format("%o. %s", iter++, EnumMenu.Sign_Pass))
                    .append("\n").append(String.format("%o. %s", iter++, EnumMenu.Sign_OtherLogin))
                    .append("\n").append(String.format("%o. %s", iter++, EnumMenu.Menu_Exit));
            do {
                System.out.println(isNotCorrectPassword);

                int command = getIntFromScanner();
                switch (command) {
                    case 1:
                        flagCheckCommand = true;
                        return inputPassword(login, users, isAdmin);
                    case 2:
                        flagCheckCommand = true;
                        return authorization(users, "", isAdmin);
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

    @Override
    public User authorization(HashMap<String, User> users, String slogin, boolean isAdmin) {

        String login;
        if (slogin == "") {
            login = getTextFromScanner("Авторизация, " + EnumMenu.Sign_Login);
        } else {
            login = slogin;
        }

        if (users.containsKey(login)) {
            return inputPassword(login, users, isAdmin);
        } else {
            System.out.println("****************************");
            System.out.println("Нет такого пользователя:");
            System.out.println("1. " + EnumMenu.Sign_Login);
            System.out.println("2. " + EnumMenu.Sign_Reg);
            System.out.println("3. " + EnumMenu.Menu_Exit);
            System.out.println("****************************");

            int command = getIntFromScanner();

            switch (command) {
                case 1:
                    return authorization(users, "", isAdmin);
                case 2:
                    return registration(users, login, isAdmin);
                case 3:
                    return null;
                default:
                    System.out.println("Неверная операция:");
                    authorization(users, "", isAdmin);
            }
        }
        return null;
    }

    @Override
    public User registration(HashMap<String, User> users, String slogin, boolean isAdmin) {

        String login;
        if (slogin == "") {
            login = getTextFromScanner("Регистрация, " + EnumMenu.Sign_Login);
        } else {
            login = slogin;
        }

        if (users.containsKey(login)) {
            System.out.println("****************************");
            System.out.println("Пользователь с таким логином уже есть:");
            System.out.println("1. " + EnumMenu.Sign_OtherLogin);
            System.out.println("2. " + EnumMenu.Sign_Auth);
            System.out.println("3. " + EnumMenu.Menu_Exit);
            System.out.println("****************************");

            int command = getIntFromScanner();

            switch (command) {
                case 1:
                    return registration(users, "", isAdmin);
                case 2:
                    return authorization(users, login, isAdmin);
                case 3:
                    return null;
                default:
                    System.out.println("Неверная операция:");
                    registration(users, "", isAdmin);
            }
        } else {
            String password = checkPassword();

            User user = new User(login, password);
            user.setHasAdminRole(isAdmin);

            users.put(login, user);
            return user;

        }
        return null;
    }
}