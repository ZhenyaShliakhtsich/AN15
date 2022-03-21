package com.teachMeSkills.an15.SavitskyRoman.hw7.task1;

import java.io.Serializable;
import java.util.Objects;

public class User implements Serializable {
    private String name;
    private String surname;
    private String email;
    private String login;
    private String password;
    private Blog blog;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getEmail() {
        return email;
    }

    public Blog getBlog() {
        return blog;
    }

    public void setBlog(Blog blog) {
        this.blog = blog;
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


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(name, user.name) && Objects.equals(surname, user.surname)
                && Objects.equals(email, user.email) && Objects.equals(login, user.login)
                && Objects.equals(password, user.password) && Objects.equals(blog, user.blog);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, email, login, password, blog);
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", email='" + email + '\'' +
                ", login='" + login + '\'' +
                ", password='" + password + '\'' +
                ", blog=" + blog +
                '}';
    }
}
