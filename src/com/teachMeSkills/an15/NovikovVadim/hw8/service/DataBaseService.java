package com.teachMeSkills.an15.NovikovVadim.hw8.service;

import com.teachMeSkills.an15.NovikovVadim.hw8.model.Product;
import com.teachMeSkills.an15.NovikovVadim.hw8.model.User;

import java.util.ArrayList;
import java.util.HashMap;

public interface DataBaseService {

    Object[] loadDB();

    boolean saveDB(HashMap<String, User> users, ArrayList<Product> products);

}
