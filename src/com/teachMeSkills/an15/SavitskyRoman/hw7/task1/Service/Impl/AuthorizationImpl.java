package com.teachMeSkills.an15.SavitskyRoman.hw7.task1.Service.Impl;

import com.teachMeSkills.an15.SavitskyRoman.hw7.task1.Service.Authorization;
import com.teachMeSkills.an15.SavitskyRoman.hw7.task1.User;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.Scanner;

public class AuthorizationImpl implements Authorization {

    Scanner sc = new Scanner(System.in);
    int numberOfArray;
    boolean isAuthorization = false;

    @Override
    public void userAuthorization(User[] userArray) {
        /*getSaveAllUser(userArray);*/
        for (int y = 2; y >= 0; y--) {
            String confirmLogin = userWrittenLogin();
            String confirmPassword = userWrittenPassword();
            if (getSaveUser(userArray, confirmLogin, confirmPassword) != null) {
                System.out.println("Приветствую, " + confirmLogin);
                break;
            } else System.out.println("Не верно введен пароль.\nОставшееся количество попыток: " + y);
        }

    }

    public String userWrittenLogin() {
        System.out.println("Введите ваш логин");
        String userWrittenLogin = sc.nextLine();
        if (userWrittenLogin.length() == 0) {
            System.out.println("Вы не ввели login. Повторите ввод.");
            userWrittenLogin();
        }
        return userWrittenLogin;
    }

    public String userWrittenPassword() {
        System.out.println("Введите ваш пароль");
        String userWrittenPassword = sc.nextLine();
        if (userWrittenPassword.length() == 0) {
            System.out.println("Вы не ввели password. Повторите ввод.");
            userWrittenLogin();
        }
        return userWrittenPassword;
    }

    public User getSaveUser(User[] userArray, String confirmLogin, String confirmPassword) {
        try {
            ObjectInputStream os = new ObjectInputStream(new FileInputStream("user.ser"));

            for (int x = 0; x < userArray.length; x++) {
                userArray[x] = (User) os.readObject();
                if (userArray[x] != null) {
                    if (confirmLogin.equals(userArray[x].getLogin())
                            && confirmPassword.equals(userArray[x].getPassword())) {
                        numberOfArray = x;
                        isAuthorization = true;
                        return userArray[x];
                    }
                }
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return null;
    }
    public int getNumberOfArray(){
        return numberOfArray;
    }

    public boolean isAuthorization() {
        return isAuthorization;
    }
    /*public User[] getSaveAllUser(User[] userArray) {
        try {
            ObjectInputStream os = new ObjectInputStream(new FileInputStream("user.ser"));
            for (int x = 0; x < userArray.length; x++) {
                userArray[x] = (User) os.readObject();
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return userArray;
    }*/
}

