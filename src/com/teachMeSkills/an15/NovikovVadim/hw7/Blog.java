package com.teachMeSkills.an15.NovikovVadim.hw7;

import java.util.ArrayList;

public class Blog {
    private ArrayList<Post> posts;
    private String name;
    final public int COUNTPOSTS = 25;

    public Blog() {
        this.posts = new ArrayList<Post>();
    }

    public Blog(ArrayList<Post> posts, String name) {
        this.posts = posts;
        this.name = name;
    }

    public ArrayList<Post> getPosts() {
        return posts;
    }

    public void setPosts(ArrayList<Post> posts) {
        this.posts = posts;
    }

    public void setPosts(Post post) {
        this.posts.add(post);
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
                '}';
    }
}
