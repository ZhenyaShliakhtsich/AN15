package com.teachMeSkills.an15.BuzukArtyom.hw6.Zadacha3;

import java.util.Scanner;

public class User {
    private String userName;
    private String password;
    Basket basket;

    public User(String userName, String password, Basket basket) {
        this.userName = userName;
        this.password = password;
        this.basket = basket;


    }

    public String getUserName() {
        return userName;
    }

    @Override
    public String toString() {
        return userName;
    }

    public boolean checkUserNameAndPassword(Scanner scanner) {
        int count = 3;
        while (count > 0) {
            System.out.println("Введите логин: ");
            String userName = scanner.nextLine();
            System.out.println("Введите пароль: ");
            String password = scanner.nextLine();
            if (this.userName.equalsIgnoreCase(userName) && this.password.equals(password)) {
                return true;
            } else {
                count--;
                System.out.println("Ошибка, неверный логин или пароль \n Попробуй ещё раз!!! ");
            }
        }
        scanner.close();
        return false;
    }
}
