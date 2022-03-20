package com.teachMeSkills.an15.BuzukArtyom.hw7.zadacha1.service.Impl;

import com.teachMeSkills.an15.BuzukArtyom.hw7.zadacha1.service.RegistrationService;
import com.teachMeSkills.an15.BuzukArtyom.hw7.zadacha1.service.blog.Registration;

import java.io.*;
import java.util.Scanner;

public class RegistrationServiceImpl implements RegistrationService {


    @Override
    public Registration registration(Registration registration) throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите ваше имя: ");
        registration.setFirstName(scanner.nextLine());
        System.out.print("Введите вашу фамилию: ");
        registration.setSecondName(scanner.nextLine());
        System.out.print("Введите вашу электронную почту: ");
        registration.setEmail(scanner.nextLine());
        System.out.print("Введите ваш логин: ");
        registration.setLogin(scanner.nextLine());
        equalsPassword(registration);
        writer(registration);
        return registration;
    }

    @Override
    public Registration equalsPassword(Registration registration) {
        Scanner scanner1 = new Scanner(System.in);
        System.out.print("Введите ваш пароль: ");
        String password1 = scanner1.nextLine();
        System.out.print("Повторите пароль: ");
        String password2 = scanner1.nextLine();
        if (!password1.equals(password2)) {
            System.out.println("Пароли не совпадают!!! \n Введите ещё раз");
            return equalsPassword(registration);
        } else registration.setPassword(password2);
        System.out.println("Регистрация прошла успешно!!!");
        System.out.println(registration);
        System.out.println("Для входа\nВаш логин: " + registration.getLogin());
        System.out.println("Ваш пароль: " + registration.getPassword());
        return registration;
    }

    @Override
    public void writer(Registration registration) {
        String outputFileName = registration.getFirstName() + ".txt";
        String[] array = {registration.toString()};

        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(outputFileName))) {
            for (String value : array) {
                bufferedWriter.write(value + "\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

    @Override
    public Registration authorization(Registration authorization) {
        Scanner scanner = new Scanner(System.in);
        Registration registration = new Registration();
        System.out.println("Войдите в систему: ");
        System.out.println("login " + registration.getLogin());
        System.out.println("Ведите логин: ");
        authorization.setLogin(scanner.nextLine());
        System.out.println("Веддите пароль: ");
        authorization.setPassword(scanner.nextLine());
        if (!authorization.getLogin().equals(registration.getLogin())) {
            if (!registration.getPassword().equals(authorization.getPassword())) {
                System.out.println("Логин и пароль не подходит либо не зарегистрирован!!!");
                return authorization;
            } else System.out.println("Вы вошли успешно!!!");
        } else {
            System.out.println("Вы вошли успешно!!!");
        }
        changeOfParametrs();
        return null;
    }

    private void changeOfParametrs() {
        while (true) {
            System.out.println("""
                    Какие данные хотите изменить?
                    1.Изменить имя
                    2.Изменить фамилию
                    3.Изменить электронную почту
                    4.Изменить логин
                    5.Изменить пароль""");
            Scanner scanner = new Scanner(System.in);
            int choose = scanner.nextInt();
            Registration registration = new Registration();
            switch (choose) {
                case 1 -> {
                    System.out.println("Введите новое имя:");
                    registration.setFirstName(new Scanner(System.in).nextLine());
                    System.out.println(registration);
                }
                case 2 -> {
                    System.out.println("Введите новую фамилию:");
                    registration.setSecondName(new Scanner(System.in).nextLine());
                    System.out.println(registration);
                }
                case 3 -> {
                    System.out.println("Введите новую электронную почту: ");
                    registration.setEmail(new Scanner(System.in).nextLine());
                    System.out.println(registration);
                }
                case 4 -> {
                    System.out.println("Введите новый логин: ");
                    registration.setLogin(new Scanner(System.in).nextLine());
                    System.out.println(registration);
                }
                case 5 -> {
                    System.out.println("Введите новый пароль: ");
                    registration.setPassword(new Scanner(System.in).nextLine());
                    System.out.println(registration);
                }
                default -> {
                    return;
                }
            }
        }

    }

}



