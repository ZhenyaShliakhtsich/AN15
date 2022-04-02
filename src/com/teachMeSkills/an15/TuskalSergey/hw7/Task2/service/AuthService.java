package com.teachMeSkills.an15.TuskalSergey.hw7.Task2.service;

import com.teachMeSkills.an15.TuskalSergey.hw7.Task2.model.User;

import java.util.HashMap;

public interface AuthService {
    User login();

    void registration(HashMap<String, User> users);
}
