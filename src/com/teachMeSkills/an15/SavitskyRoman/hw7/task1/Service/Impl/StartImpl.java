package com.teachMeSkills.an15.SavitskyRoman.hw7.task1.Service.Impl;

import com.teachMeSkills.an15.SavitskyRoman.hw7.task1.Post;
import com.teachMeSkills.an15.SavitskyRoman.hw7.task1.Service.Authorization;
import com.teachMeSkills.an15.SavitskyRoman.hw7.task1.Service.BlogPost;
import com.teachMeSkills.an15.SavitskyRoman.hw7.task1.Service.Registration;
import com.teachMeSkills.an15.SavitskyRoman.hw7.task1.Service.Start;
import com.teachMeSkills.an15.SavitskyRoman.hw7.task1.User;

import java.io.File;
import java.util.Scanner;

public class StartImpl implements Start {
    Scanner sc = new Scanner(System.in);
    File file = new File("user.ser");

    @Override
    public void start(Registration registration, Authorization authorization, BlogPost blogPost,
                      User[] userArray, /*Blog blog,*/ Post[] post) {

        System.out.println("Для регистрации введите 1\nДля авторизации введите 2");
        String x;
        for (int y = 2; y >= 0; y--) {
            x = sc.nextLine();
            if (x.equals("1")) {
                registration.registration(userArray);
                System.out.println("\nПройдите авторизацию");
                authorization.userAuthorization(userArray);
                break;
            }
            if (x.equals("2")) {
                if (!file.isFile()) {
                    System.out.println("Данные по авторизированным пользователям отсутсвуют. " +
                            "Пройдите регистрацию\nОставшееся количество попыток: " + y);
                    continue;
                }
                authorization.userAuthorization(userArray);
                break;
            }
            System.out.println("Вы не ввели ни 1, ни 2. Оставшееся количество попыток: " + y);
        }

       if(authorization.isAuthorization()) blogPost.writeBlog(userArray, authorization.getNumberOfArray(), /*blog,*/ post);
        registration.setSaveUser(userArray);
        sc.close();
    }
}
