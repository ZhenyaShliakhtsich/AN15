package com.teachMeSkills.an15.MatveevArtyom.hw8.service;

import com.teachMeSkills.an15.MatveevArtyom.hw8.model.User;

import java.util.HashMap;

public interface AuthService {
    User login();

    void registration(HashMap<String, User> users);
}
