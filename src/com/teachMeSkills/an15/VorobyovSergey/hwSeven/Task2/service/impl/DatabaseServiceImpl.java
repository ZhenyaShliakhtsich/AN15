package com.teachMeSkills.an15.VorobyovSergey.hwSeven.Task2.service.impl;

import com.teachMeSkills.an15.VorobyovSergey.hwSeven.Task2.ConstVal;
import com.teachMeSkills.an15.VorobyovSergey.hwSeven.Task2.model.Product;
import com.teachMeSkills.an15.VorobyovSergey.hwSeven.Task2.model.User;
import com.teachMeSkills.an15.VorobyovSergey.hwSeven.Task2.service.DatabaseService;

import java.io.*;
import java.util.HashSet;

public class DatabaseServiceImpl implements DatabaseService {

    @Override
    public HashSet<User> loadUsersFromDB() {
        String fileSource = ConstVal.PATH_TO_USERS_DB;
        String fileName = ConstVal.USERS_DB_FILE_NAME;
        try (ObjectInputStream ois = new ObjectInputStream(
                new FileInputStream(fileSource + fileName))) {
            HashSet<User> hs = (HashSet<User>) ois.readObject();
            return hs;
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
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
        String fileSource = ConstVal.PATH_TO_PRODUCTS_DB;
        String fileName = ConstVal.PRODUCTS_DB_FILE_NAME;
        try (ObjectInputStream ois = new ObjectInputStream(
                new FileInputStream(fileSource + fileName))) {
            HashSet<Product> hs = (HashSet<Product>) ois.readObject();
            return hs;
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
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
