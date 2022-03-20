package com.teachMeSkills.an15.ShlyakhtichEvgeniy.hw7.task1.service;

import com.teachMeSkills.an15.ShlyakhtichEvgeniy.hw7.task1.classes.User;

import java.util.ArrayList;

public interface UserService {
    public User logIn(ArrayList<User> users);
    public void registration(ArrayList<User> users);
    public void showInfo(User user);
}
