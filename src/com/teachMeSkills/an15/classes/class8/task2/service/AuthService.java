package com.teachMeSkills.an15.classes.class8.task2.service;

import com.teachMeSkills.an15.classes.class8.task2.model.User;

import java.util.HashMap;
import java.util.HashSet;

public interface AuthService {
    User login(HashMap<User, User> users);
    void registration(HashMap<User, User> users);
}
