package com.teachMeSkills.an15.LashkevichGeorgy.hw7.Task1.service.impl;

import com.teachMeSkills.an15.LashkevichGeorgy.hw7.Task1.models.UserReg;
import com.teachMeSkills.an15.LashkevichGeorgy.hw7.Task1.models.UsersList;
import com.teachMeSkills.an15.LashkevichGeorgy.hw7.Task1.service.ChangeInfoService;

import java.util.Scanner;

public class ChangeInfoImpl implements ChangeInfoService {
    @Override
    public void showInfo(UserReg userReg) {
        System.out.println("Информация авторизированного пользователя: \n" + userReg);
    }

    @Override
    public void changeInfo(UsersList usersList, UserReg userReg) {

        Scanner scanner = new Scanner(System.in);
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder
                .append("Для изменения фамилии введите \"Фамилия\"\n")
                .append("Для изменения имени введите \"Имя\"\n")
                .append("Для изменения email введите \"email\"\n")
                .append("Для изменения логина введите \"Логин\"\n")
                .append("Для изменения пароля введите \"Пароль\"\n");
        System.out.println(stringBuilder);
        System.out.println("Ввести изменяемый параметр");
        String change = scanner.nextLine();
        try {
            if (change.equalsIgnoreCase("фамилия")) {
                System.out.println("Введите новую фамилию:");
                userReg.setSecondName(scanner.nextLine());
            } else if (change.equalsIgnoreCase("имя")) {
                System.out.println("Введите новое имя:");
                userReg.setName(scanner.nextLine());
            } else if (change.equalsIgnoreCase("email")) {
                System.out.println("Введите новый email:");
                userReg.setEmail(scanner.nextLine());
            } else if (change.equalsIgnoreCase("логин")) {
                System.out.println("Введите новый логин:");
                userReg.setLogin(scanner.nextLine());
            } else if (change.equalsIgnoreCase("пароль")) {
                System.out.println("Введите новый пароль:");
                userReg.setPassword(scanner.nextLine());
            }
            System.out.println("Обновленная информация авторизированного пользователя: \n" + userReg);
        } catch (Exception e) {
            System.out.println("Нужно ввести \"Фамилия\" или \"Имя\" или \"email\" или \"Логин\" или \"Пароль\"");
            changeInfo(usersList, userReg);
        }

    }
}
