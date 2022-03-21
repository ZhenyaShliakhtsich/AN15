package com.teachMeSkills.an15.NovikovVadim.hw7;

import java.util.ArrayList;
import java.util.Arrays;

public class User {
    private String firstName;
    private String secondName;
    private String email;
    private String login;
    private String password;
    private ArrayList<Blog> blogs;

    public User() {
        this.blogs = new ArrayList<Blog>();
    }

    public ArrayList<Blog> getBlogs() {
        return blogs;
    }

    public void setBlogs(ArrayList<Blog> blogs) {
        this.blogs = blogs;
    }

    public void setBlogs(Blog blog) {
        this.blogs.add(blog);
    }

    public String getFirstName() {
        return firstName;
    }

    @Override
    public String toString() {
        return "User{" +
                "firstName='" + firstName + '\'' +
                ", secondName='" + secondName + '\'' +
                ", email='" + email + '\'' +
                ", login='" + login + '\'' +
                ", password='" + password + '\'' +
                ", blogs=" + Arrays.toString(new ArrayList[]{blogs}) +
                '}';
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
