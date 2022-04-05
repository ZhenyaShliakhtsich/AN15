package com.teachMeSkills.an15.LashkevichGeorgy.hw7.Task2.service;



import com.teachMeSkills.an15.LashkevichGeorgy.hw7.Task2.models.User;

import java.util.HashMap;

public interface AuthService {
    User login(HashMap<User, User> users);
    void registration(HashMap<User, User> users);
}
