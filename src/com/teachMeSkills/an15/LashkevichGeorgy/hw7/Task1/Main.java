package com.teachMeSkills.an15.LashkevichGeorgy.hw7.Task1;

import com.teachMeSkills.an15.LashkevichGeorgy.hw7.Task1.models.UserReg;
import com.teachMeSkills.an15.ShlyakhtichEvgeniy.hw6.task3.Shop.User;

import java.util.Scanner;

//Создать приложение, в котором при входе нужно зарегистрировать пользователя
//
//для регистрации необходимы поля: имя, фамилия, имеил, логин, пароль
//при вводе пароля пользователем, попросить его повторить пароль
//если пароли не совпадают, оповестить его об этом и дать возможность заново ввести все данные
//после регистрации попросить его авторизироваться
//после авторизации пользователь может посмотреть личную информацию и изменить ее
//у каждого пользователя есть блог, который содержит название блога и массив постов
//пользователь должен иметь возможность создания блога и добавления в него постов
//максимальное количество постов - 25
//если пользователь ввел больше постов, чем 25, то выдать об этом уведомление и спросить какой пост можно заменить
//должна быть возможность выбора поста и его печать
//выбор блога и его печать со всеми постами
//пост может иметь 1000 символом
//если пользователь создает пост с кол-вом символов больше 1000 выдать уведомление, что пост был обрезан до 1000 символа
//пользователь должен иметь возможность редактировать посты
//
//Создать 1 юзера у него 1 блог и 5 постов
//При запуске main должно быть видно все функциональности
//Класс Main должен состоять из 30 строк максимум
public class Main {
    public static void main(String[] args) {
        registrationUser();
    }

    public static void registrationUser() {
        System.out.println("Регистрация нового пользователя");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ведите имя: ");
        String name = scanner.nextLine();
        System.out.println("Введите фамилию: ");
        String secondName = scanner.nextLine();
        System.out.println("Введите логин: ");
        String login = scanner.nextLine();
        System.out.println("Введите email: ");
        String email = scanner.nextLine();
        System.out.println("Введите пароль: ");
        String pass = scanner.nextLine();
        System.out.println("Введите пароль повторно: ");
        String passCheck = scanner.nextLine();
        if (name != null && login != null && pass.equals(passCheck)) {
            System.out.println("Регистрация прошла успешно!");
            UserReg userReg = new UserReg();
            userReg.setLogin(login);
            userReg.setPassword(pass);
            userReg.setName(name);
            userReg.setSecondName(secondName);
            userReg.setEmail(email);
        } else {
            System.out.println("Введены некорректные данные. Попробуйте зарегестрироваться заново.");
            registrationUser();
        }


    }



}
