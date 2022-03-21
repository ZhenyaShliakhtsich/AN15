package com.teachMeSkills.an15.SavitskyRoman.hw7.task1.Service;

import com.teachMeSkills.an15.SavitskyRoman.hw7.task1.Post;
import com.teachMeSkills.an15.SavitskyRoman.hw7.task1.User;

public interface Start {
    public void start(Registration registration, Authorization authorization, BlogPost blogPost, User[] userArray, /*Blog blog, */Post[] post);
}
