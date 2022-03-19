package com.teachMeSkills.an15.ShlyakhtichEvgeniy.hw7.task1;

import com.teachMeSkills.an15.ShlyakhtichEvgeniy.hw7.task1.classes.User;
import com.teachMeSkills.an15.ShlyakhtichEvgeniy.hw7.task1.service.impl.BlogServiceImpl;
import com.teachMeSkills.an15.ShlyakhtichEvgeniy.hw7.task1.service.impl.UserServiceImpl;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<User> users = new ArrayList<>();
        UserServiceImpl userService = new UserServiceImpl();
        BlogServiceImpl blogService = new BlogServiceImpl();
        User admin = new User("admin","admin","admin","admin","asdf");
        users.add(admin);
        User currentUser;

        currentUser = userService.logIn(users);

        blogService.createBlog(currentUser);
        blogService.createPost(currentUser);
        blogService.changePost(currentUser);
        blogService.showBlog(currentUser);
        blogService.showPost(currentUser);

        userService.showInfo(currentUser);
        userService.changeInfo(currentUser);

    }
}


