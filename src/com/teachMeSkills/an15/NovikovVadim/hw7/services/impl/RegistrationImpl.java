package com.teachMeSkills.an15.NovikovVadim.hw7.services.impl;

import com.teachMeSkills.an15.NovikovVadim.hw7.User;
import com.teachMeSkills.an15.NovikovVadim.hw7.WrongLoginException;
import com.teachMeSkills.an15.NovikovVadim.hw7.services.Registration;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegistrationImpl implements Registration {
    String PATTERN = "[^А-Яа-яA-Za-z0-9]";

    @Override
    public void login(ArrayList<User> users, User user) {
        String login = checkInputData("login", PATTERN);

        boolean isFreeLogin = true;
        for (User iteruser : users) {
            if (iteruser.getLogin().equals(login)) {
                System.out.println("Такой пользователь в базе уже есть: ");
                isFreeLogin = false;
                break;
            }
        }

        if (isFreeLogin) {
            user.setLogin(login);
        } else {
            login(users, user);
        }
    }

    @Override
    public void password(User user) {

        String password = "";
        String confirmPassword = "";
        do {
            password = checkInputData("password", PATTERN);
            System.out.println("Повторите пароль:");
            confirmPassword = checkInputData("confirm password", PATTERN);
        } while (!checkPassword(password, confirmPassword));

        user.setPassword(password);
    }

    private boolean checkPassword(String password, String confirmPassword) {
        if (password.equals(confirmPassword)) {
            return true;
        } else {
            System.out.println("Пароли не совпадают, повторите еще раз");
            return false;
        }
    }

    private String checkInputData(String nameOperation, String pattern) {
        System.out.format("Введите %s, состоящий из символов латинского алфавита, цифр и _\n", nameOperation);

        try {
            Scanner scanner = new Scanner(System.in);
            String text = scanner.next();

            if (!checkPattern(text, pattern)) {
                throw new WrongLoginException(String.format("Некорректно ввели %s, повторите ещё раз\n", nameOperation));
            }
            return text;

        } catch (WrongLoginException e) {
            return checkInputData(nameOperation, pattern);
        }
    }

    private static boolean checkPattern(String text, String pattern) {
        Matcher matcher = Pattern.compile(pattern).matcher(text);
        return !matcher.find();
    }

}
