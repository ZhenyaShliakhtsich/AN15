package com.teachMeSkills.an15.TuskalSergey.hw4;

import java.util.Scanner;
import java.util.regex.Pattern;

import static com.teachMeSkills.an15.TuskalSergey.hw4.WrongLoginException.wrongLoginMessage;
import static com.teachMeSkills.an15.TuskalSergey.hw4.WrongPasswordException.wrongPasswordMessage;

public abstract class Task2 {
    //2. Создать статический метод который принимает на вход три параметра:
    // login, password и confirmPassword.
    //Login должен содержать только латинские буквы, цифры и знак подчеркивания.
    //Длина login должна быть меньше 20 символов. Если login не соответствует этим требованиям,
    // необходимо выбросить WrongLoginException.
    //Password должен содержать только латинские буквы, цифры и знак подчеркивания.
    // Длина password должна быть меньше 20 символов. Также password и confirmPassword должны быть равны.
    // Если password не соответствует этим требованиям, необходимо выбросить WrongPasswordException.
    //WrongPasswordException и WrongLoginException - пользовательские классы исключения с двумя
    // конструкторами – один по умолчанию, второй принимает сообщение исключения и передает его в
    // конструктор класса Exception.
    //Обработка исключений проводится внутри метода.
    //Используем multi-catch block.
    //Метод возвращает true, если значения верны или false в другом случае.
    public static void inputLoginAndPassword() {
        String regEx = "[a-zA-Z_0-9]*"; //только латинские буквы, цифры и знак подчеркивания
        StringBuilder StringBuilder = new StringBuilder();
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i <= 0; ) {
            System.out.print("Введите логин: ");
            String login = scanner.next();
            boolean loginMatchesPattern = Pattern.matches(regEx, login);
            try {
                if (loginMatchesPattern == true && login.length() < 20) {
                    i++;
                    StringBuilder.append("Логин - ");
                    StringBuilder.append(login);
                } else {
                    int a = 10 / i;
                }
            } catch (Exception WrongLoginException) {
                wrongLoginMessage();
            }
        }
        for (int i1 = 0; i1 <= 0; ) {
            System.out.print("Введите пароль: ");
            String password = scanner.next();
            boolean passwordMatchesPattern = Pattern.matches(regEx, password);
            try {
                if (passwordMatchesPattern == true && password.length() < 20) {
                    i1++;
                    for (int i2 = 0; i2 <= 0; ) {
                        System.out.print("Подтвердите пароль: ");
                        String confirmPassword = scanner.next();
                        boolean confirmedPassword = confirmPassword.equals(password);
                        if (confirmedPassword == true) {
                            i2++;
                            StringBuilder.append(", пароль - ");
                            StringBuilder.append(password);
                            System.out.println(StringBuilder);
                        } else System.out.println("Пароль должен совпадать с введеным ранее.");
                    }
                } else {
                    int a = 10 / i1;
                }
            } catch (Exception WrongPasswordException) {
                wrongPasswordMessage();
            }
        }
    }


    public static void main(String[] args) {
        inputLoginAndPassword();
    }

}





