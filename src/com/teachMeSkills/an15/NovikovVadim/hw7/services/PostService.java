package com.teachMeSkills.an15.NovikovVadim.hw7.services;

import com.teachMeSkills.an15.NovikovVadim.hw7.Blog;
import com.teachMeSkills.an15.NovikovVadim.hw7.Post;

public interface PostService {
    void showPosts(Blog blog);

    Post enterPost(Blog blog);

    void enterText(Post post);
}
