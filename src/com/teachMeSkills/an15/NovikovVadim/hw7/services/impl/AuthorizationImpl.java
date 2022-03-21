package com.teachMeSkills.an15.NovikovVadim.hw7.services.impl;

import com.teachMeSkills.an15.NovikovVadim.hw7.User;
import com.teachMeSkills.an15.NovikovVadim.hw7.WrongLoginException;
import com.teachMeSkills.an15.NovikovVadim.hw7.services.Authorization;
import com.teachMeSkills.an15.NovikovVadim.hw7.services.Registration;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AuthorizationImpl implements Authorization {
    String PATTERN = "[^А-Яа-яA-Za-z0-9]";

    @Override
    public User login(ArrayList<User> users) {
        String login = checkInputData("login", PATTERN);

        for (User user : users) {
            if (user.getLogin().equals(login)) {
                return user;
            }
        }
        System.out.println("Не найден пользователь, необходимо зарегистрироваться");

        Registration registration = new RegistrationImpl();
        User user = new User();
        user.setLogin(login);
        //registration.login(user);
        registration.password(user);
        users.add(user);
        return user;

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
