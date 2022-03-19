package com.teachMeSkills.an15.MatveevArtyom.hw7.Task1.service.Impl;

import com.teachMeSkills.an15.MatveevArtyom.hw7.Task1.RegistrationAndAuthorisation;
import com.teachMeSkills.an15.MatveevArtyom.hw7.Task1.service.RegistrationService;

import java.util.Scanner;

public class RegistrationServiceImpl implements RegistrationService {
    @Override
    public RegistrationAndAuthorisation registration(RegistrationAndAuthorisation registration) {
        System.out.println("Введите ваше имя: ");
        registration.setFirstName(new Scanner(System.in).nextLine());
        System.out.println("Введите вашу фамилию: ");
        registration.setSecondName(new Scanner(System.in).nextLine());
        System.out.println("Введите логин: ");
        registration.setLogin(new Scanner(System.in).nextLine());
        System.out.println("Введите имеил: ");
        registration.setEMail(new Scanner(System.in).nextLine());
        System.out.println("Введите пароль!");
        String thisPassword1 = new Scanner(System.in).nextLine();
        System.out.println("Введите пароль ещё раз!");
        String thisPassword2 = new Scanner(System.in).nextLine();
        if (thisPassword1.equalsIgnoreCase(thisPassword2)) {
            registration.setPassword(thisPassword2);
        } else {
            System.out.println("Вы ввели неправильно! Повторите попытку ещё раз!");
            registration(registration);
        }
        return registration;
    }

    @Override
    public RegistrationAndAuthorisation authorisation(RegistrationAndAuthorisation registration,
                                                      RegistrationAndAuthorisation authorisation) {
        System.out.println("Вы зарегистрировались!");
        System.out.println("Введите ваш логин: ");
        String authorisationLogin = new Scanner(System.in).nextLine();
        if (registration.getLogin().equalsIgnoreCase(authorisationLogin)) {
            authorisation.setLogin(authorisationLogin);
        } else {
            System.out.println("Вы ввели неправильно логин, повторите попытку!");
            authorisation(registration, authorisation);
        }
        System.out.println("Введите пароль: ");
        String authorisationPassword = new Scanner(System.in).nextLine();
        if (registration.getPassword().equalsIgnoreCase(authorisationPassword)) {
            authorisation.setPassword(authorisationPassword);
        } else {
            authorisation(registration, authorisation);
        }
        System.out.println("Вы успешно авторизировались!");
        authorisation.setEMail(registration.getEMail());
        authorisation.setFirstName(registration.getFirstName());
        authorisation.setSecondName(registration.getSecondName());
        return authorisation;
    }

    @Override
    public RegistrationAndAuthorisation showAndChangeData(RegistrationAndAuthorisation authorisation) {
        boolean flag = true;
        while (flag) {
            System.out.println("Выберите что вы хотите сделать: \n" +
                    "1 - посмотреть всю информацию о себе \n" +
                    "2 - изменить имя \n" +
                    "3 - изменить фамилию \n" +
                    "4 - изменить имейл \n" +
                    "5 - изменить логин \n" +
                    "6 - изменить пароль \n" +
                    "7 - выйти из меню(либо любой другой символ) ");
            int choose = new Scanner(System.in).nextInt();
            switch (choose) {
                case 1:
                    System.out.println(authorisation.toString());
                    break;
                case 2:
                    System.out.println("Введите новое имя: ");
                    authorisation.setFirstName(new Scanner(System.in).nextLine());
                    System.out.println("Вы изменили имя на " + authorisation.getFirstName());
                    break;
                case 3:
                    System.out.println("Введите новую фамилию: ");
                    authorisation.setSecondName(new Scanner(System.in).nextLine());
                    System.out.println("Вы изменили фамилию на " + authorisation.getSecondName());
                    break;
                case 4:
                    System.out.println("Введите новый емеил: ");
                    authorisation.setEMail(new Scanner(System.in).nextLine());
                    System.out.println("Вы изменили емеил на " + authorisation.getEMail());
                    break;
                case 5:
                    System.out.println("Введите новый логин: ");
                    authorisation.setLogin(new Scanner(System.in).nextLine());
                    System.out.println("Вы изменили логин на " + authorisation.getLogin());
                    break;
                case 6:
                    System.out.println("Введите новый пароль: ");
                    authorisation.setPassword(new Scanner(System.in).nextLine());
                    System.out.println("Вы изменили пароль на " + authorisation.getPassword());
                    break;
                default:
                    System.out.println("Вы успешно вышли из меню!");
                    flag = false;
            }
        }
        return authorisation;
    }
}
