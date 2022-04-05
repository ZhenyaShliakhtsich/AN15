package com.teachMeSkills.an15.VorobyovSergey.hwSeven.Task2.service.impl;

import com.teachMeSkills.an15.VorobyovSergey.hwSeven.Task2.ConstVal;
import com.teachMeSkills.an15.VorobyovSergey.hwSeven.Task2.model.Product;
import com.teachMeSkills.an15.VorobyovSergey.hwSeven.Task2.model.User;
import com.teachMeSkills.an15.VorobyovSergey.hwSeven.Task2.service.DatabaseService;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.HashSet;

public class DatabaseServiceImpl implements DatabaseService {

    @Override
    public HashSet<User> loadUsersFromDB() {
        return null;
    }

    @Override
    public boolean saveUsersInDB(HashSet<User> users) {
        String fileSource = ConstVal.PATH_TO_USERS_DB;
        String fileName = ConstVal.USERS_DB_FILE_NAME;

        try (ObjectOutputStream oos = new ObjectOutputStream(
                new FileOutputStream(fileSource + fileName))) {
            oos.writeObject(users);
            return true;
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public HashSet<Product> loadProductsFromDB() {
        return null;
    }

    @Override
    public boolean saveProductsInDB(HashSet<Product> products) {
        String fileSource = ConstVal.PATH_TO_PRODUCTS_DB;
        String fileName = ConstVal.PRODUCTS_DB_FILE_NAME;

        try (ObjectOutputStream oos = new ObjectOutputStream(
                new FileOutputStream(fileSource + fileName))) {
            oos.writeObject(products);
            return true;
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public boolean dbChecker() {
        return false;
    }
}
