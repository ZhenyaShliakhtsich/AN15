package com.teachMeSkills.an15.VorobyovSergey.hwSix.Task3.models;

public class SvUser {
    //Менять пароль и логин мы пока не хотим, чтобы не создавать бардак.
    private final String userLogin;
    private final String userPassword;
    private SvBasket userBasket;

    public SvUser(String userLogin, String userPassword) {
        this.userLogin = userLogin;
        this.userPassword = userPassword;
        this.userBasket = new SvBasket();
    }

    public SvBasket getUserBasket() {
        return userBasket;
    }

    public void setUserBasket(SvBasket userBasket) {
        this.userBasket = userBasket;
    }

    public String getUserLogin() {
        return userLogin;
    }

    public String getUserPassword() {
        return userPassword;
    }
}
