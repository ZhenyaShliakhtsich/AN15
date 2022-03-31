package com.teachMeSkills.an15.TuskalSergey.hw7.Task2.service;

import Task2.model.Product;
import Task2.model.User;

import java.util.ArrayList;
import java.util.HashMap;

public interface MenuService {
    void authMenu(User user, HashMap<String, User> users, HashMap<String, User> currentUser,
                  ArrayList<Product> products);

    void adminMenu(User user, HashMap<String, User> users, HashMap<String, User> currentUser,
                   ArrayList<Product> products);

    void userMenu(User user, HashMap<String, User> users, HashMap<String, User> currentUser ,
                  ArrayList<Product> products);
}
