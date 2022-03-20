package com.teachMeSkills.an15.LashkevichGeorgy.hw7.Task1;

import com.teachMeSkills.an15.LashkevichGeorgy.hw7.Task1.models.UserReg;
import com.teachMeSkills.an15.LashkevichGeorgy.hw7.Task1.models.UsersList;
import com.teachMeSkills.an15.LashkevichGeorgy.hw7.Task1.service.AutService;
import com.teachMeSkills.an15.LashkevichGeorgy.hw7.Task1.service.BlogService;
import com.teachMeSkills.an15.LashkevichGeorgy.hw7.Task1.service.ChangeInfoService;
import com.teachMeSkills.an15.LashkevichGeorgy.hw7.Task1.service.RegService;
import com.teachMeSkills.an15.LashkevichGeorgy.hw7.Task1.service.impl.AutImpl;
import com.teachMeSkills.an15.LashkevichGeorgy.hw7.Task1.service.impl.BlogImpl;
import com.teachMeSkills.an15.LashkevichGeorgy.hw7.Task1.service.impl.ChangeInfoImpl;
import com.teachMeSkills.an15.LashkevichGeorgy.hw7.Task1.service.impl.RegImpl;


import java.util.ArrayList;
import java.util.Scanner;
import java.util.SortedMap;

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
        Menu();
        /*ArrayList<UserReg> usersList = new ArrayList<>();
        UsersList usersList1 = new UsersList();
        creatUsersList(usersList);
        usersList1.setUsers(usersList);
        AutService autService = new AutImpl();
        UserReg authorized = autService.authentication(usersList1);
        ChangeInfoService changeInfoService = new ChangeInfoImpl();
        UserReg changedUser = changeInfoService.changeInfo(authorized);
        changeInfoService.showInfo(authorized);

        BlogService blogService = new BlogImpl();
        blogService.createBlog(changedUser);
        blogService.addPost(changedUser);
        blogService.addPost(changedUser);
        blogService.showAllPosts(changedUser);
        blogService.editPost(changedUser);
*/
    }

    public static void Menu() {
        ArrayList<UserReg> usersList = new ArrayList<>();
        UsersList usersList1 = new UsersList();
        UserReg authorised = new UserReg();
        Scanner scanner = new Scanner(System.in);
        boolean whileFlag = true;
        while (whileFlag) {
            System.out.println("1. Регистрация пользователей\n2. Авторизация пользователя\n3." +
                    " Внести изменения в личные данные пользователя\n" +
                    "4. Задать название блогу\n5. Добавить пост в блог\n6. Показать все посты блога\n" +
                    "7. Внести изменение в пост" +
                    "\n10. Выход из программы.");
            System.out.println("Что делаем? Введите число от 1 до 7 для работы или 10 для выхода.");
            String chooseString = scanner.nextLine();
            int choose = 0;
            if (new Scanner(chooseString).hasNextInt()) {
                choose = Integer.parseInt(chooseString);
            } else System.out.println("Введите число от 1 до 7 для работы или 10 для выхода");

            switch (choose) {
                case 1:
                    createUsersList(usersList);
                    usersList1.setUsers(usersList);
                    break;
                case 2:
                    if (usersList1.getUsers() == null) {
                        System.out.println("Для авторизации требуется создать пользователя");
                        break;
                    } else {
                        AutService autService = new AutImpl();
                        authorised = autService.authentication(usersList1);
                    }
                    break;
                case 3:
                    if (authorised.getName() == null) {
                        System.out.println("Для смены данных пользователя требуется создать" +
                                " и авторизовать пользователя");
                        break;
                    } else {
                        ChangeInfoService changeInfoService = new ChangeInfoImpl();
                        changeInfoService.changeInfo(usersList1, authorised);
                    }
                    break;
                case 4:
                    if (authorised.getName() == null) {
                        System.out.println("Для создания блога требуется регистрация и авторизация пользователя");
                    } else {
                        BlogService blogService = new BlogImpl();
                        blogService.createBlog(authorised);
                    }
                    break;
                case 5:
                    if (authorised.getBlogName() == null) {
                        System.out.println("Для добавления поста в блог " +
                                "требуется добавление названия блога," +
                                " регистрация и авторизация пользователя ");
                    } else {
                        BlogService blogService1 = new BlogImpl();
                        blogService1.addPost(authorised);
                    }
                    break;
                case 6:
                    if (authorised.getBlog() == null) {
                        System.out.println("Для того, чтобы показать все посты блога" +
                                " требуется добавить посты в блог, регистрация и авторизация пользователя");

                    } else {
                        BlogService blogService2 = new BlogImpl();
                        blogService2.showAllPosts(authorised);
                    }
                    break;
                case 7:
                    if (authorised.getBlog() == null || authorised.getBlogName() == null) {
                        System.out.println("Для редактирования поста в блоге требуется создать блог, пост, пройти" +
                                " регистрацию и авторизацию пользователя");
                    } else {
                        BlogService blogService3 = new BlogImpl();
                        blogService3.editPost(authorised);
                    }
                    break;
                case 10:
                    whileFlag = false;
                    System.out.println("Спасибо, что выбрали нас!");

            }
        }

    }


    public static void createUsersList(ArrayList<UserReg> usersList) {
        RegService regService = new RegImpl();
        System.out.println("Введите количество новых пользователей: ");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        for (int i = 0; i < a; i++) {
            usersList.add(regService.newUser());
        }

    }
}






