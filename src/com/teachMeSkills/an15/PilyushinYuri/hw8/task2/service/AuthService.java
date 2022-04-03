package com.teachMeSkills.an15.PilyushinYuri.hw8.task2.service;

import com.teachMeSkills.an15.PilyushinYuri.hw8.task2.model.Product;
import com.teachMeSkills.an15.PilyushinYuri.hw8.task2.model.User;

import java.util.ArrayList;
import java.util.HashMap;

public interface AuthService {
    User login(HashMap<String, User> users, ArrayList<Product> products);
    void registration(HashMap<String, User> users,ArrayList<Product> products);
}
