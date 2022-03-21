package com.teachMeSkills.an15.ShlyakhtichEvgeniy.hw7.task1.service.impl;

import com.teachMeSkills.an15.ShlyakhtichEvgeniy.hw7.task1.classes.User;
import com.teachMeSkills.an15.ShlyakhtichEvgeniy.hw7.task1.service.MenuService;

import java.util.Scanner;

public class MenuServiceImpl implements MenuService {
    @Override
    public void menu(User user) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1.Меню пользователя\n2.Меню блога\n3.Завершить программу");
        int choice = scanner.nextInt();
        switch (choice) {
            case 1:
                menuUser(user);
                break;
            case 2:
                menuBlog(user);
                break;
            case 3:
            break;
            default:
                menu(user);
        }
    }

    @Override
    public void menuBlog(User user) {
        BlogServiceImpl blogService = new BlogServiceImpl();
        Scanner scanner = new Scanner(System.in);
        System.out.println("1.Создать блог\n2.Создать пост\n3.Изменить пост\n4.Показать блог\n5.Показать пост\n6.Назад");
        int choice = scanner.nextInt();
        switch (choice) {
            case 1:
                blogService.createBlog(user);
                break;
            case 2:
                blogService.createPost(user);
                break;
            case 3:
                blogService.changePost(user);
                break;
            case 4:
                blogService.showBlog(user);
                break;
            case 5:
                blogService.showPost(user);
                break;
            case 6:
                menu(user);
                break;
            default:
                menuBlog(user);

        }

    }

    @Override
    public void menuUser(User user) {
        Scanner scanner = new Scanner(System.in);
        UserServiceImpl userService = new UserServiceImpl();
        System.out.println("1.Показать информацию\n2.Изменить информацию\n3.Назад");
        int choice = scanner.nextInt();
        switch (choice) {
            case 1:
                userService.showInfo(user);
                break;
            case 2:
                userService.changeInfo(user);
                break;
            case 3:
                menu(user);
                break;
            default:
                menuUser(user);
        }

    }
}
