package com.teachMeSkills.an15.ShlyakhtichEvgeniy.hw6.task3.Service.Impl;

import com.teachMeSkills.an15.ShlyakhtichEvgeniy.hw6.task3.Service.Authentication;
import com.teachMeSkills.an15.ShlyakhtichEvgeniy.hw6.task3.Shop.User;

public class AuthenticationImpl implements Authentication {
    @Override
    public void authentication(User user, String login, String password) {
        if (user.getLogin().equals(login) || user.getPassword().equals(password)) {
        } else {
            System.out.println("Неправильный логин или пароль");
        }
    }
}
