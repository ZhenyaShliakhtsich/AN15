package com.teachMeSkills.an15.AltievAli.hm7;

import java.util.ArrayList;
import java.util.Objects;

public class User {
    protected String blogName;
    protected ArrayList<String> posts = new ArrayList<>();


    public User (){

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(blogName, user.blogName) && Objects.equals(posts, user.posts);
    }

    @Override
    public int hashCode() {
        return Objects.hash(blogName, posts);
    }

    @Override
    public String toString() {
        return "Blog name " + blogName + " Posts " + posts;
    }
}


