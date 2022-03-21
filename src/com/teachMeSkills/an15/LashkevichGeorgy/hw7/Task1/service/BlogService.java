package com.teachMeSkills.an15.LashkevichGeorgy.hw7.Task1.service;

import com.teachMeSkills.an15.LashkevichGeorgy.hw7.Task1.models.UserReg;

public interface BlogService {
    void createBlog(UserReg userReg);

    void showAllPosts(UserReg userReg);

    void showPost(UserReg userReg);

    void addPost(UserReg userReg);

    void editPost(UserReg userReg);
}
