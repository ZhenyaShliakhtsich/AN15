package com.teachMeSkills.an15.NovikovVadim.hw6.store.impl;


import com.teachMeSkills.an15.NovikovVadim.hw6.store.Authentication;
import com.teachMeSkills.an15.NovikovVadim.hw6.store.User;

import java.util.Scanner;

public class AuthenticationImpl implements Authentication {
    @Override
    public void login(User user) {
        System.out.println("Введите логин");
        Scanner scanner = new Scanner(System.in);
        user.setLogin(scanner.next("[\\w]*"));
    }

    @Override
    public void password(User user) {
        System.out.println("Введите пароль");
        Scanner scanner = new Scanner(System.in);
        user.setPassword(scanner.next("[\\w]*"));
    }
}
