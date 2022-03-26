package com.teachMeSkills.an15.MatveevArtyom.hw8.service;

import com.teachMeSkills.an15.MatveevArtyom.hw8.model.Product;
import com.teachMeSkills.an15.MatveevArtyom.hw8.model.User;

import java.util.ArrayList;
import java.util.HashMap;

public interface Menu {
    void menuAuth(User user, HashMap<String, User> users, Product product, ArrayList<Product> products);

    void menuAdmin(User user, HashMap<String, User> users, Product product, ArrayList<Product> products);

    void menuUser(User user, HashMap<String, User> users, Product product, ArrayList<Product> products);
}
