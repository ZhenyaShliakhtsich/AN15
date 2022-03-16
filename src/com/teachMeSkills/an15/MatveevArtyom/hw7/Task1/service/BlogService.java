package com.teachMeSkills.an15.MatveevArtyom.hw7.Task1.service;

import com.teachMeSkills.an15.MatveevArtyom.hw7.Task1.Blog;

import java.util.ArrayList;

public interface BlogService {
    Blog createBlogAndAddPosts(Blog blog);

    ArrayList<String> addPosts(Blog blog);

    Blog printBlog(Blog blog);

    Blog changePost(Blog blog);
}
