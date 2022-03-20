package com.teachMeSkills.an15.BuzukArtyom.hw7.zadacha1.service.blog;

import com.teachMeSkills.an15.BuzukArtyom.hw7.zadacha1.service.Impl.RegistrationServiceImpl;
import com.teachMeSkills.an15.BuzukArtyom.hw7.zadacha1.service.RegistrationService;

import java.io.IOException;
import java.util.Scanner;

public class Menu {
    {
        boolean flag = true;
        while (flag) {
            System.out.println("""
                    Меню:\s
                    1.Войти
                    2.Зарегистрироваться
                    Для выхода нажмите любую кнопку...
                    Выберите действие:\s""");
            Scanner scanner = new Scanner(System.in);
            int choose = scanner.nextInt();
            User user = new User();
            RegistrationService registrationService = new RegistrationServiceImpl();
            switch (choose) {
                case 1:
                    Registration authorization = new Registration();
                    user.setAuthorization(registrationService.authorization(authorization));
                case 2:

                    Registration registration = new Registration();
                    try {
                        user.setRegistration(registrationService.registration(registration));
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    break;
                case 3:
                    changeOfParametrs();
                default:
                    flag = false;

            }
        }
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