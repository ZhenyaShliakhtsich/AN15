package com.teachMeSkills.an15.SavitskyRoman.hw7.task1;

import java.io.Serializable;

public class Post implements Serializable {
    private String name;
    private String post;


    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Post{" +
                "name='" + name + '\'' +
                ", post='" + post + '\'' +
                '}';
    }
}
