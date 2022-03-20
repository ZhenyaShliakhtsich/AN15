package com.teachMeSkills.an15.BuzukArtyom.hw7.zadacha1.service.blog;

import java.util.ArrayList;

public class Blog {
    private String name;
    private ArrayList<String> posts;

    public Blog(String name, ArrayList<String> posts) {
        this.name = name;
        this.posts = posts;
    }

    public Blog() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<String> getPosts() {
        return posts;
    }

    public void setPosts(ArrayList<String> posts) {
        this.posts = posts;
    }

    @Override
    public String toString() {
        return "Blog{" +
                "name='" + name + '\'' +
                ", posts=" + posts +
                '}';
    }
}
