package com.teachMeSkills.an15.LashkevichGeorgy.hw7.Task1;

import com.teachMeSkills.an15.LashkevichGeorgy.hw7.Task1.models.UserReg;

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
        createUser();



    }

    public static void createUser() {
        UserReg userReg1 = new UserReg();
        userReg1.setName("Ivan");
        userReg1.setSecondName("Titov");
        userReg1.setEmail("vanya@mail.ru");
        userReg1.setLogin("Van4o");
        userReg1.setPassword("2020327");
    }

    public void registrationUser(UserReg userReg) {
        dataImput();

    }

    public void dataImput() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ведите имя: ");
        String name = scanner.nextLine();
        System.out.println("Введите фамилию: ");
        String secondName = scanner.nextLine();
        System.out.println("Введите логин: ");
        String login = scanner.nextLine();
        System.out.println("Введите пароль: ");
        String pass = scanner.nextLine();
        System.out.println("Введите пароль повторно: ");
        String passCheck = scanner.nextLine();
    }

}
