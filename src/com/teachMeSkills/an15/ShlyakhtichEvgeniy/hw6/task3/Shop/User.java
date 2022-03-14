package com.teachMeSkills.an15.ShlyakhtichEvgeniy.hw6.task3.Shop;

import com.teachMeSkills.an15.ShlyakhtichEvgeniy.hw6.task3.Shop.Basket;

public class User {
    private String login;
    private String password;
    private Basket basket;

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

    public User(String login, String password) {
        this.login = login;
        this.password = password;
    }

    public Basket getBasket() {
        return basket;
    }

    public void setBasket(Basket basket) {
        this.basket = basket;
    }
}
