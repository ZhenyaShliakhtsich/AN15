package com.teachMeSkills.an15.LashkevichGeorgy.hw7.Task1.models;

import java.util.ArrayList;

public class UserReg  {
    private String name;
    private String secondName;
    private String email;
    private String login;
    private String password;
    private String blogName;
    private ArrayList<String> blog;

    public ArrayList<String> getBlog() {
        return blog;
    }

    public void setBlog(ArrayList<String> blog) {
        this.blog = blog;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public String getBlogName() {
        return blogName;
    }

    public void setBlogName(String blogName) {
        this.blogName = blogName;
    }









    @Override
    public String toString() {
        return       "Пользователь: " +         "имя: " + name +
                ", фамилия: " + secondName +
                ", email: " + email +
                ", login:" + login +
                ", пароль: " + password +
                ", название блога: " + blogName;
    }
}
