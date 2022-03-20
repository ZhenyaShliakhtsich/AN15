package com.teachMeSkills.an15.PilyushinYuri.hw7;


import com.teachMeSkills.an15.PilyushinYuri.hw7.model.Post;
import com.teachMeSkills.an15.PilyushinYuri.hw7.model.User;
import com.teachMeSkills.an15.PilyushinYuri.hw7.service.impl.BlogServiceImpl;
import com.teachMeSkills.an15.PilyushinYuri.hw7.service.impl.RegistraionServiceImpl;

import java.io.IOException;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws IOException {

        RegistraionServiceImpl registraionService = new RegistraionServiceImpl();
        ArrayList<User> users = new ArrayList<>();
        registraionService.newUserRegistration(users);
        User currentUser = registraionService.userAuthentication(users);
        BlogServiceImpl blogService = new BlogServiceImpl();
        blogService.newBlog(currentUser);
        blogService.newPost(currentUser);
        blogService.showPost(currentUser);
        blogService.changePost(currentUser);
        blogService.showBlog(currentUser);








    }
}
//    Создать приложение, в котором при входе нужно зарегистрировать пользователя
//
//    для регистрации необходимы поля: имя, фамилия, имеил, логин, пароль
//        при вводе пароля пользователем, попросить его повторить пароль
//        если пароли не совпадают, оповестить его об этом и дать возможность заново ввести все данные
//        после регистрации попросить его авторизироваться
//        после авторизации пользователь может посмотреть личную информацию и изменить ее
//        у каждого пользователя есть блог, который содержит название блога и массив постов
//        пользователь должен иметь возможность создания блога и добавления в него постов
//        максимальное количество постов - 25
//        если пользователь ввел больше постов, чем 25, то выдать об этом уведомление и спросить какой пост можно заменить
//        должна быть возможность выбора поста и его печать
//        выбор блога и его печать со всеми постами
//        пост может иметь 1000 символом
//        если пользователь создает пост с кол-вом символов больше 1000 выдать уведомление, что пост был обрезан до 1000 символа
//        пользователь должен иметь возможность редактировать посты
//
//        Создать 1 юзера у него 1 блог и 5 постов
//        При запуске main должно быть видно все функциональности
//        Класс Main должен состоять из 30 строк максимум