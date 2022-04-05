package com.teachMeSkills.an15.VorobyovSergey.hwSeven.Task2.service;

import com.teachMeSkills.an15.VorobyovSergey.hwSeven.Task2.model.Product;
import com.teachMeSkills.an15.VorobyovSergey.hwSeven.Task2.model.User;

import java.util.HashSet;

public interface DatabaseService {
    HashSet<User> loadUsersFromDB ();
    boolean  saveUsersInDB (HashSet<User> users);
    HashSet<Product> loadProductsFromDB ();
    boolean saveProductsInDB (HashSet<Product> products);
    boolean dbChecker ();
}
