package com.teachMeSkills.an15.ShlyakhtichEvgeniy.hw7.task1.classes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

public class Blog {
    private String blogName;
    private ArrayList<Post> posts;

    public String getBlogName() {
        return blogName;
    }

    public void setBlogName(String blogName) {
        this.blogName = blogName;
    }

    public ArrayList<Post> getPosts() {
        return posts;
    }

    public void setPosts(ArrayList<Post> posts) {
        this.posts = posts;
    }

    @Override
    public String toString() {
        return  blogName +
                "\n" + posts;
    }
}
