package com.teachMeSkills.an15.SavitskyRoman.hw7.task1;

import com.teachMeSkills.an15.SavitskyRoman.hw7.task1.Service.Authorization;
import com.teachMeSkills.an15.SavitskyRoman.hw7.task1.Service.BlogPost;
import com.teachMeSkills.an15.SavitskyRoman.hw7.task1.Service.Impl.AuthorizationImpl;
import com.teachMeSkills.an15.SavitskyRoman.hw7.task1.Service.Impl.BlogPostImpl;
import com.teachMeSkills.an15.SavitskyRoman.hw7.task1.Service.Impl.RegistrationImpl;
import com.teachMeSkills.an15.SavitskyRoman.hw7.task1.Service.Impl.StartImpl;
import com.teachMeSkills.an15.SavitskyRoman.hw7.task1.Service.Registration;
import com.teachMeSkills.an15.SavitskyRoman.hw7.task1.Service.Start;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
       User[] userArray = new User[4];
        //Blog blog = new Blog();
        Post[] post = new Post[2];

        Registration registration = new RegistrationImpl();
        Authorization authorization = new AuthorizationImpl();
        BlogPost blogPost = new BlogPostImpl();

        Start start = new StartImpl();
        start.start(registration, authorization, blogPost, userArray, /*blog,*/ post);
        System.out.println(Arrays.toString(userArray));
    }
}
