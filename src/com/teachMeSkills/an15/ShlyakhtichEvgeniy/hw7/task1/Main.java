package com.teachMeSkills.an15.ShlyakhtichEvgeniy.hw7.task1;

import com.teachMeSkills.an15.ShlyakhtichEvgeniy.hw7.task1.classes.Blog;
import com.teachMeSkills.an15.ShlyakhtichEvgeniy.hw7.task1.classes.Post;
import com.teachMeSkills.an15.ShlyakhtichEvgeniy.hw7.task1.classes.User;
import com.teachMeSkills.an15.ShlyakhtichEvgeniy.hw7.task1.service.impl.UserServiceImpl;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<User> users = new ArrayList<>();
        ArrayList<Post> posts = new ArrayList<>();
        UserServiceImpl userService = new UserServiceImpl();
        User admin = new User("admin","admin","admin","admin","asdf");
        users.add(admin);
        Post post1 = new Post("1","one");
        Post post2 = new Post("2","two");
        Post post3 = new Post("3","three");
        Post post4 = new Post("4","four");
        Post post5 = new Post("5","five");
        posts.add(post1);
        posts.add(post2);
        posts.add(post3);
        posts.add(post4);
        posts.add(post5);
        Blog blog = new Blog("dsa",posts);
        admin.setBlog(blog);
        userService.registration(users);

    }
}


