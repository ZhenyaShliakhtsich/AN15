package com.teachMeSkills.an15.AltievAli.hm7.service.impl;

import com.teachMeSkills.an15.AltievAli.hm7.User;
import com.teachMeSkills.an15.AltievAli.hm7.service.UserService;

import java.util.ArrayList;
import java.util.Scanner;

public class UserServiceImpl extends User implements UserService {
    String createNewBlog;



    @Override
    public void createBlog() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter blog name");
        createNewBlog = scanner.nextLine();
        if (createNewBlog.length() < 1) {
            System.out.println("You not entered blog name.Try again.");
            createNewBlog = scanner.nextLine();
            createBlog();
        } else {
            addPost();
        }

    }


    @Override
    public void addPost() {
        ArrayList<String> postName = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter post name");
        String postNameScanner = scanner.nextLine();
        if (postNameScanner.length() > 1) {
            postName.add(postNameScanner);
            System.out.println("Post name is added successfully");
            System.out.println("Post Name:");
            for (String s : postName
            ) {
                System.out.println(s);
//completely
            }
            System.out.println("Enter post");
            String userPost = scanner.nextLine();
            if (userPost.length() < 1) {
                System.out.println("Not entered post.Try again");
            } else {
                posts.add(0,userPost);
                System.out.println("Post is added successfully");
                System.out.println("You post");
                for (Object s : posts) {
                    System.out.println(s);
                }
            }
        } else {
            System.out.println("Not entered post name.Try again");
            addPost();
        }


    }


}

