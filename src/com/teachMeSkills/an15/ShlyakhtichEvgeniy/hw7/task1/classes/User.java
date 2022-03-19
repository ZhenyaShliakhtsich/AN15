package com.teachMeSkills.an15.ShlyakhtichEvgeniy.hw7.task1.classes;

import java.util.Objects;

public class User {
    private String login;
    private String password;
    private String firstName;
    private String secondName;
    private String eMail;
    private Blog blog;

    public User() {
    }

    public User(String login, String password, String firstName, String secondName, String eMail) {
        this.login = login;
        this.password = password;
        this.firstName = firstName;
        this.secondName = secondName;
        this.eMail = eMail;
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

    public String getFirstName() {
        return firstName;
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

    public String geteMail() {
        return eMail;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail;
    }

    public Blog getBlog() {
        return blog;
    }

    public void setBlog(Blog blog) {
        this.blog = blog;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(login, user.login) && Objects.equals(password, user.password) && Objects.equals(firstName, user.firstName) && Objects.equals(secondName, user.secondName) && Objects.equals(eMail, user.eMail) && Objects.equals(blog, user.blog);
    }

    @Override
    public int hashCode() {
        return Objects.hash(login, password, firstName, secondName, eMail, blog);
    }

    @Override
    public String toString() {
        return "Логин: " + login +
                "Имя: " + firstName +
                "Фамилия:" + secondName +
                "E-mail:" + eMail;
    }
}
