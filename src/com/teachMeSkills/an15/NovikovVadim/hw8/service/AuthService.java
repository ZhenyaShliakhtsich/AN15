package com.teachMeSkills.an15.NovikovVadim.hw8.service;

import com.teachMeSkills.an15.NovikovVadim.hw8.model.User;

import java.util.HashMap;

public interface AuthService {

    User authlogin(HashMap<String, User> users, String slogin, boolean isAdmin);
    User registration(HashMap<String, User> users, String slogin, boolean isAdmin);
}
