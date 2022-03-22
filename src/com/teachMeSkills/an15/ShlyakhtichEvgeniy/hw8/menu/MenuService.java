package com.teachMeSkills.an15.ShlyakhtichEvgeniy.hw8.menu;

import com.teachMeSkills.an15.ShlyakhtichEvgeniy.hw8.model.Product;
import com.teachMeSkills.an15.ShlyakhtichEvgeniy.hw8.model.User;

import java.util.ArrayList;
import java.util.HashMap;

public interface MenuService {
    void adminMenu(User user,ArrayList<Product> products, HashMap<String, User> users);
    void authMenu(User user,ArrayList<Product> products, HashMap<String, User> users);
    void userMenu(User user, HashMap<String, User> users, ArrayList<Product> products);
    void basketMenu(User user, HashMap<String, User> users, ArrayList<Product> products);
    void productMenu(User user, HashMap<String, User> users, ArrayList<Product> products, Product product);


}
