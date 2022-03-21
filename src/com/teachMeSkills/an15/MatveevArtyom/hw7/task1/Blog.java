package com.teachMeSkills.an15.MatveevArtyom.hw7.task1;

import java.util.ArrayList;
import java.util.Arrays;

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
