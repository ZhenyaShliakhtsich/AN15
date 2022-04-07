package com.teachMeSkills.an15.ShlyakhtichEvgeniy.hw8.service;

import com.teachMeSkills.an15.ShlyakhtichEvgeniy.hw8.model.Product;
import com.teachMeSkills.an15.ShlyakhtichEvgeniy.hw8.model.User;

import java.util.ArrayList;
import java.util.HashMap;

public interface MenuService {
    void adminMenu();
    void authMenu();
    void userMenu(User user);
    void basketMenu(User user);
    void productMenu(User user, Product product);


}
