package com.teachMeSkills.an15.VorobyovSergey.hwSeven.Task2.service.impl;

import com.teachMeSkills.an15.VorobyovSergey.hwSeven.Task2.model.Product;
import com.teachMeSkills.an15.VorobyovSergey.hwSeven.Task2.model.User;
import com.teachMeSkills.an15.VorobyovSergey.hwSeven.Task2.service.DatabaseService;

import java.util.HashSet;

public class DatabaseServiceImpl implements DatabaseService {

    @Override
    public HashSet<User> loadUsersFromDB() {
        return null;
    }

    @Override
    public boolean saveUsersInDB(HashSet<User> users) {
        return false;
    }

    @Override
    public HashSet<Product> loadProductsFromDB() {
        return null;
    }

    @Override
    public boolean saveProductsInDB(HashSet<Product> products) {
        return false;
    }

    @Override
    public boolean dbChecker() {
        return false;
    }
}
