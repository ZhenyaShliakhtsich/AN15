package com.teachMeSkills.an15.NovikovVadim.hw7.services.impl;

import com.teachMeSkills.an15.NovikovVadim.hw7.OtherConst;
import com.teachMeSkills.an15.NovikovVadim.hw7.User;
import com.teachMeSkills.an15.NovikovVadim.hw7.services.Registration;
import com.teachMeSkills.an15.NovikovVadim.hw7.services.UserService;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserServiceImpl implements UserService {
    @Override
    public OtherConst chooseAnAuthorizationMethod() {
        System.out.println("Выберите способ авторизации: \n\tВход\n\tРегистрация");
        String str = new Scanner(System.in).next();
        if (str.equalsIgnoreCase("вход")) {
            return OtherConst.ВХОД;
        } else if (str.equalsIgnoreCase("регистрация")) {
            return OtherConst.РЕГИСТРАЦИЯ;
        } else {
            System.out.println("Неверная команда:");
            return chooseAnAuthorizationMethod();
        }
    }

    @Override
    public OtherConst chooseAnInformation() {
        System.out.println("Желаете просмотреть/изменить личную информацию:\n\tДа\n\tНет");
        String str = new Scanner(System.in).next();
        if (str.equalsIgnoreCase("да")) {
            return OtherConst.ДА;
        } else if (str.equalsIgnoreCase("нет")) {
            return OtherConst.НЕТ;
        } else {
            System.out.println("Неверная команда:");
            return chooseAnInformation();
        }
    }

    @Override
    public void changeEmail(User user) {
        System.out.println("Введите email");
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        //https://tproger.ru/translations/validating-email-right/
        String pattern = "(?:[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*|\"(?:[\\x01-\\x08\\x0b\\x0c\\x0e-\\x1f\\x21\\x23-\\x5b\\x5d-\\x7f]|\\\\[\\x01-\\x09\\x0b\\x0c\\x0e-\\x7f])*\")@(?:(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?|\\[(?:(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.){3}(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?|[a-z0-9-]*[a-z0-9]:(?:[\\x01-\\x08\\x0b\\x0c\\x0e-\\x1f\\x21-\\x5a\\x53-\\x7f]|\\\\[\\x01-\\x09\\x0b\\x0c\\x0e-\\x7f])+)\\])";

        Matcher matcher = Pattern.compile(pattern).matcher(str);
        if (matcher.find()) {
            user.setEmail(str);
        } else {
            System.out.println("Некорректный email: ");
            changeEmail(user);
        }
    }

    @Override
    public void showInformation(User user) {
        StringBuilder sb = new StringBuilder();
        sb.append("Информация:").append("\n")
                .append("Логин: " + user.getLogin()).append("\n")
                .append("Пароль: " + user.getPassword()).append("\n")
                .append("email: " + user.getEmail()).append("\n")
                .append("Имя: " + user.getFirstName()).append("\n")
                .append("Фамилия: " + user.getSecondName());

        System.out.println(sb);
    }

    @Override
    public void changeInformation(ArrayList<User> users, User user) {
        do {
            System.out.println("Введите номер операции для редактирования, либо введите Выход:");
            StringBuilder sb = new StringBuilder();
            sb.append("1. Логин изменить").append("\n")
                    .append("2. Пароль изменить").append("\n")
                    .append("3. email изменить").append("\n")
                    .append("4. имя изменить").append("\n")
                    .append("5. фамилию изменить").append("\n")
                    .append("6. Выход");
            System.out.println(sb);
        } while (changeInformationAction(users, user));

    }

    //возвращает true, если ввели команду на редактирование, false- значит прекратить
    private boolean changeInformationAction(ArrayList<User> users, User user) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        switch (str.toLowerCase()) {
            case "1": {
                Registration registration = new RegistrationImpl();
                registration.login(users, user);
                break;
            }
            case "2": {
                Registration registration = new RegistrationImpl();
                registration.password(user);
                break;
            }
            case "3": {
                UserService userService = new UserServiceImpl();
                userService.changeEmail(user);
                break;
            }
            case "4": {
                System.out.println("Введите имя: ");
                user.setFirstName(scanner.next());
                break;
            }
            case "5": {
                System.out.println("Введите фамилию: ");
                user.setSecondName(scanner.next());
                break;
            }
            case "выход":
            case "6": {
                return false;
            }
            default: {
                scanner.close();
            }
        }
        return true;
    }

}
