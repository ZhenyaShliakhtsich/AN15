package com.teachMeSkills.an15.ShlyakhtichEvgeniy.hw7.task1.service;

import com.teachMeSkills.an15.ShlyakhtichEvgeniy.hw7.task1.classes.User;

public interface BlogService {
     void createBlog(User user);
     void createPost(User user);
     void changePost(User user);
     void showBlog(User user);
     void showPost(User user);

}
