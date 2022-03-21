package com.teachMeSkills.an15.ShlyakhtichEvgeniy.hw7.task1.service;

import com.teachMeSkills.an15.ShlyakhtichEvgeniy.hw7.task1.classes.User;

import java.util.ArrayList;

public interface UserService {
     void logIn(ArrayList<User> users);
     void registration(ArrayList<User> users);
     void showInfo(User user);
}
