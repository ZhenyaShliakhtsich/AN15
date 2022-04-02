package com.teachMeSkills.an15.TuskalSergey.hw7.Task2.service;

import com.teachMeSkills.an15.TuskalSergey.hw7.Task2.model.Product;
import com.teachMeSkills.an15.TuskalSergey.hw7.Task2.model.User;

import java.util.ArrayList;
import java.util.HashMap;

public interface MenuService {
    void authMenu();

    void adminMenu();

    void userMenu(User user);
}
