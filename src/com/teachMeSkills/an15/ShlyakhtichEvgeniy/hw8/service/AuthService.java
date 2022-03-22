package com.teachMeSkills.an15.ShlyakhtichEvgeniy.hw8.service;

import com.teachMeSkills.an15.ShlyakhtichEvgeniy.hw8.model.User;

import java.util.HashMap;

public interface AuthService {
    User login(HashMap<String, User> users);

    void registration(HashMap<String, User> users);
}
