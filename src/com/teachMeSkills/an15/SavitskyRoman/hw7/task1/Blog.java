package com.teachMeSkills.an15.SavitskyRoman.hw7.task1;

import java.io.Serializable;
import java.util.Arrays;

public class Blog implements Serializable {
    private String blogName;
    private Post[] post;

    public String getBlogName() {
        return blogName;
    }

    public void setBlogName(String blogName) {
        this.blogName = blogName;
    }

    public Post[] getPost() {
        return post;
    }

    public void setPost(Post[] post) {
        this.post = post;
    }

    @Override
    public String toString() {
        return "Blog{" +
                "blogName='" + blogName + '\'' +
                ", post=" + Arrays.toString(post) +
                '}';
    }
}
