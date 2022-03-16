package com.teachMeSkills.an15.LashkevichGeorgy.hw7.Task1.service.impl;

import com.teachMeSkills.an15.LashkevichGeorgy.hw7.Task1.models.UsersList;
import com.teachMeSkills.an15.LashkevichGeorgy.hw7.Task1.service.AutService;

import java.util.Scanner;

public class AutImpl implements AutService {

    @Override
    public void authentication(UsersList usersList) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Авторизируйте пользователя! \n Введите логин: ");
        String login = scanner.nextLine();
        System.out.println("Введите пароль: ");
        String pass = scanner.nextLine();

        boolean flag = false;
        while (flag == false) {
            for (int i = 0; i < usersList.getUsers().size(); i++) {
                if (flag == true){
                    System.out.println("Вы авторизировались!");
                    break;
                }
                if (login.equals(usersList.getUsers().get(i).getLogin()) && pass.equals(usersList.getUsers().get(i)
                        .getPassword())) {
                    flag = true;



                } else System.out.println("Вы не авторизировались! Введите корректные данные\n" );
                authentication(usersList);


            }

        }
    }
}