package com.teachMeSkills.an15.NovikovVadim.hw7.services;

import com.teachMeSkills.an15.NovikovVadim.hw7.User;

import java.util.ArrayList;

public interface Registration {
    void login(ArrayList<User> users, User user);

    void password(User user);
}
