package com.teachMeSkills.an15.VorobyovSergey.hwSeven.models;

import java.util.ArrayList;

public class Blog {
    private String blogName;
    private ArrayList<Post> postsList;

    public Blog() {
        postsList = new ArrayList<>();
    }

    public String getBlogName() {
        return blogName;
    }

    public void setBlogName(String blogName) {
        this.blogName = blogName;
    }

    public ArrayList<Post> getPostsList() {
        return postsList;
    }

    public void setPostsList(ArrayList<Post> postsList) {
        this.postsList = postsList;
    }

    @Override
    public String toString() {
        return "Blog{" +
                "blogName='" + blogName + '\'' +
                '}';
    }
}
