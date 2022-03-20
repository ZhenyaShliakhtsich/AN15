package com.teachMeSkills.an15.PilyushinYuri.hw7.service.impl;

import com.teachMeSkills.an15.PilyushinYuri.hw7.model.User;
import com.teachMeSkills.an15.PilyushinYuri.hw7.service.RegistrationService;


import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class RegistraionServiceImpl implements RegistrationService {
    User user = new User();

    @Override
    public void newUserRegistration(ArrayList<User> users) throws RuntimeException {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите имя:");
            user.setFirstName(scanner.nextLine());
            System.out.println("Введите фамилию: ");
            user.setSecondName(scanner.nextLine());
            System.out.println("Введите логин:");
            user.setLogin(scanner.nextLine());
            System.out.println("Введите пароль (может содержать только a-z, A-Z, _ , 0-9");
            user.setPassword(scanner.next("[a-zA-Z0-9_]*"));
            System.out.println("Подтвердите пароль:");
            String confirmPassword = scanner.next("[a-zA-Z0-9_]*");
            checkRegistrationData(user, confirmPassword);

        } catch (RuntimeException e) {
            e.printStackTrace();
            newUserRegistration(users);
        }
        users.add(user);
        toTextData(users);

    }

    @Override
    public User userAuthentication(ArrayList<User> users) {
        try {
            System.out.println("Вход в аккаунт");
            Scanner scanner2 = new Scanner(System.in);
            System.out.println("Введите логин:");
            String login = scanner2.nextLine();
            System.out.println("Введите пароль:");
            String password = scanner2.nextLine();
            toCheckAuthentication(users, login, password);
        } catch (RuntimeException e) {
            e.printStackTrace();
            userAuthentication(users);
        }
        return null;
    }


    private void checkRegistrationData(User user, String confirmPassword) {
        boolean b = user.getFirstName() == null || user.getSecondName() == null || user.getLogin() == null
                || user.getPassword() == null;
        if (b) {
            throw new RuntimeException("Не введены данные, попробуйте еще раз.");
        }
        if (confirmPassword.equalsIgnoreCase(user.getPassword())) {
            System.out.println("Регистрация прошла успешно!");
        } else {
            throw new RuntimeException("Введеные пароли не совпадают");
        }
    }


    private void toCheckAuthentication(ArrayList<User> users, String login, String password) {
        for (User user : users) {
            if (login.equalsIgnoreCase(user.getLogin())) {
                System.out.println("Логин принят");
            } else {
                throw new RuntimeException("Неверный логин.");
            }
            if (password.equalsIgnoreCase(user.getPassword())) {
                System.out.println("Пароль принят.");
            } else {
                throw new RuntimeException("Неверный пароль.");
            }
        }
    }



    static void toTextData(ArrayList<User> users) {
        final String MYFILEPATH = "src/com/teachMeSkills/an15/PilyushinYuri/hw7/DataUser.txt";
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(MYFILEPATH))) {
            for (User user : users) {
                writer.write(user + "\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}