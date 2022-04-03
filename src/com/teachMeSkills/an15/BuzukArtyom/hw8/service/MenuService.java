package com.teachMeSkills.an15.BuzukArtyom.hw8.service;

import com.teachMeSkills.an15.BuzukArtyom.hw8.model.Product;
import com.teachMeSkills.an15.BuzukArtyom.hw8.model.User;

import java.util.ArrayList;
import java.util.HashMap;

public interface MenuService {
    void menuAuth();

    void menuAdmin();

    void menuUser(User user);
}
