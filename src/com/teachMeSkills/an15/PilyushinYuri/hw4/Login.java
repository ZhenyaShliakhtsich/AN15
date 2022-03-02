package com.teachMeSkills.an15.PilyushinYuri.hw4;

import com.teachMeSkills.an15.PilyushinYuri.hw4.MyExeption.WrongLoginExeption;
import com.teachMeSkills.an15.PilyushinYuri.hw4.MyExeption.WrongPasswordExeption;
import java.util.Scanner;

public class Login {
    public static void main(String[] args) throws WrongLoginExeption, WrongPasswordExeption {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Введите логин: ");
            String login = scanner.next("[_a-zA-Z0-9]*");
            int lenghtLogin = login.length();
            if (lenghtLogin > 20) {
                throw new WrongLoginExeption("Недопустимая длина логина.");
            }
            System.out.println("Введите пароль: ");
            String password = scanner.next("[_a-zA-Z0-9]*");
            int lengthPassword = password.length();
            if (lengthPassword > 20) {
                throw new WrongPasswordExeption("Недопустимая длина пароля.");
            }
            System.out.println("Введите пароль: ");
            String confirmPassword = scanner.next("[_a-zA-Z0-9]*");
            int lengthPassword2 = confirmPassword.length();
            if (lengthPassword2 > 20) {
                throw new WrongPasswordExeption("Недопустимая длина пароля.");
            }
            if (!confirmPassword.equals(password)){
                System.out.println("Пароль не совпадает с проверочным!");
            } else {
                System.out.println("Добро пожаловать");
            }
        } catch (WrongLoginExeption | WrongPasswordExeption e) {
            System.out.println(e.getMessage());
        }
    }
}
