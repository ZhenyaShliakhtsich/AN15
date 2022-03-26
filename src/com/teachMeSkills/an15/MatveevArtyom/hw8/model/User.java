package com.teachMeSkills.an15.MatveevArtyom.hw8.model;

import java.util.Objects;

public class User {
    private String login;
    private String password;
    private boolean isHasAdminRole;
    private Basket basket;

    public User(String login, String password, Basket basket) {
        this.login = login;
        this.password = password;
        this.isHasAdminRole = false;
        this.basket = basket;
    }

    public User() {
    }

    public User(String login, String password) {
        this.login = login;
        this.password = password;
        this.isHasAdminRole = false;
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

    public boolean isHasAdminRole() {
        return isHasAdminRole;
    }

    public void setHasAdminRole(boolean hasAdminRole) {
        isHasAdminRole = hasAdminRole;
    }

    public Basket getBasket() {
        return basket;
    }

    public void setBasket(Basket basket) {
        this.basket = basket;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return isHasAdminRole == user.isHasAdminRole && Objects.equals(login, user.login) && Objects.equals(password, user.password) && Objects.equals(basket, user.basket);
    }

    @Override
    public int hashCode() {
        return Objects.hash(login, password, isHasAdminRole, basket);
    }

    @Override
    public String toString() {
        return "User{" +
                "login='" + login + '\'' +
                ", password='" + password + '\'' +
                ", isHasAdminRole=" + isHasAdminRole +
                ", basket=" + basket +
                '}';
    }
}



