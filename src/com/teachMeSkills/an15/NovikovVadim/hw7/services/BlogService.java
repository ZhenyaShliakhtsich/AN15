package com.teachMeSkills.an15.NovikovVadim.hw7.services;

import com.teachMeSkills.an15.NovikovVadim.hw7.Blog;
import com.teachMeSkills.an15.NovikovVadim.hw7.User;

public interface BlogService {
    Blog enterBlog(User user);

    void showBlogs(User user);
}
