package com.teachMeSkills.an15.PilyushinYuri.hw7.service;

import com.teachMeSkills.an15.PilyushinYuri.hw7.model.Blog;
import com.teachMeSkills.an15.PilyushinYuri.hw7.model.Post;
import com.teachMeSkills.an15.PilyushinYuri.hw7.model.User;

import java.util.ArrayList;

public interface BlogService {
    Blog newBlog(User user);
    void showBlog(User user);
    Post newPost(User user);
    void showPost(User user);
    void changePost(User user);
}
