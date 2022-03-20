package com.teachMeSkills.an15.PilyushinYuri.hw7.model;

import java.util.ArrayList;
import java.util.Arrays;

public class Blog {
    private String name;
    private ArrayList<Post> posts;

    public ArrayList<Post> getPost() {
        return posts;
    }

    public void setPosts(ArrayList<Post> posts) {
        this.posts = posts;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Blog{" +
                "name='" + name + '\'' +
                ", post=" + posts +
                '}';
    }
}
