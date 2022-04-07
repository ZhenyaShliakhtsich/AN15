package com.teachMeSkills.an15.ShlyakhtichEvgeniy.hw8.service;

import com.teachMeSkills.an15.ShlyakhtichEvgeniy.hw8.model.Product;
import com.teachMeSkills.an15.ShlyakhtichEvgeniy.hw8.model.User;
import java.util.ArrayList;
import java.util.HashMap;

public interface DataBaseService {
    Object loadUsersDataBase();

    Object loadProductsDataBase();

    void saveUsersDataBase(HashMap<String, User> users);

    void saveProductsDataBase(ArrayList<Product> products);
}
