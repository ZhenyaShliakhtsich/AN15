package com.teachMeSkills.an15.ShlyakhtichEvgeniy.hw7.task1.service;

import com.teachMeSkills.an15.ShlyakhtichEvgeniy.hw7.task1.classes.User;

public interface BlogService {
    public void createBlog(User user);
    public void createPost(User user);
    public void changePost(User user);
    public void showBlog(User user);
    public void showPost(User user);

}
