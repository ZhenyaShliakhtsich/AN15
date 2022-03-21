package com.teachMeSkills.an15.ShlyakhtichEvgeniy.hw7.task1.classes;

import java.util.Objects;

public class Post {
    private String title;
    private String post;

    public Post() {
    }

    public Post(String title, String post) {
        this.title = title;
        this.post = post;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Post post1 = (Post) o;
        return Objects.equals(title, post1.title) && Objects.equals(post, post1.post);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, post);
    }

    @Override
    public String toString() {
        return title +
                "\n" + post;
    }
}
