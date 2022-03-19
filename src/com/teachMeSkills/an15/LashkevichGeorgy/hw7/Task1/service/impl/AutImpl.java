package com.teachMeSkills.an15.LashkevichGeorgy.hw7.Task1.service.impl;

import com.teachMeSkills.an15.LashkevichGeorgy.hw7.Task1.models.UserReg;
import com.teachMeSkills.an15.LashkevichGeorgy.hw7.Task1.models.UsersList;
import com.teachMeSkills.an15.LashkevichGeorgy.hw7.Task1.service.AutService;

import java.util.Scanner;

public class AutImpl implements AutService {
    boolean flag = false;

    @Override
    public UserReg authentication(UsersList usersList) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Авторизация пользователя. \n Введите логин: ");
        String login = scanner.nextLine();
        System.out.println("Введите пароль: ");
        String pass = scanner.nextLine();
        int count = 0;
        for (int i = 0; i < usersList.getUsers().size(); i++) {
            if (login.equals(usersList.getUsers().get(i).getLogin()) && pass.equals(usersList.getUsers().get(i)
                    .getPassword())) {
                flag = true;
                count = i;
                System.out.println("Вы авторизировались!");
                break;
            }
        }
        if (flag == false) {
            System.out.println("Вы не авторизировались! Введите корректные данные\n");
            authentication(usersList);
        }

        return usersList.getUsers().get(count);
    }
}
