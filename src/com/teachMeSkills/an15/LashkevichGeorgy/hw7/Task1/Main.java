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
        ArrayList<UserReg> usersList = new ArrayList<UserReg>();
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


    }

    public static ArrayList<UserReg> creatUsersList(ArrayList<UserReg> usersList) {
        RegService regService = new RegImpl();
        System.out.println("Введите количество новых пользователей: ");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        for (int i = 0; i < a; i++) {
            usersList.add(regService.newUser());
        }
        return usersList;
    }
}






