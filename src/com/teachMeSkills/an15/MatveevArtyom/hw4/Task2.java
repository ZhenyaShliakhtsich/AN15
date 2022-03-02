package com.teachMeSkills.an15.MatveevArtyom.hw4;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        //2. Создать статический метод который принимает на вход три параметра:login, password и confirmPassword.
        //Login должен содержать только латинские буквы, цифры и знак подчеркивания.
        //Длина login должна быть меньше 20 символов. Если login не соответствует этим требованиям,
        //необходимо выбросить WrongLoginException.
        //Password должен содержать только латинские буквы, цифры и знак подчеркивания.
        //Длина password должна быть меньше 20 символов. Также password и confirmPassword должны быть равны.
        //Если password не соответствует этим требованиям, необходимо выбросить WrongPasswordException.
        //WrongPasswordException и WrongLoginException - пользовательские классы исключения с двумя конструкторами – один по умолчанию,
        //второй принимает сообщение исключения и передает его в конструктор класса Exception.
        //Обработка исключений проводится внутри метода.
        //Используем multi-catch block.
        //Метод возвращает true, если значения верны или false в другом случае.
    }

    static void data(String login, int password, int confirmPassword) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите логин!");

        }
    }