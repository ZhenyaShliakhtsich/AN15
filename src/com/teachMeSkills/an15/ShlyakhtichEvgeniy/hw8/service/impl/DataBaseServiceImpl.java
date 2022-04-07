package com.teachMeSkills.an15.ShlyakhtichEvgeniy.hw8.service.impl;

import com.teachMeSkills.an15.ShlyakhtichEvgeniy.hw8.model.Product;
import com.teachMeSkills.an15.ShlyakhtichEvgeniy.hw8.model.ProductsDataBase;
import com.teachMeSkills.an15.ShlyakhtichEvgeniy.hw8.model.User;
import com.teachMeSkills.an15.ShlyakhtichEvgeniy.hw8.model.UsersDataBase;
import com.teachMeSkills.an15.ShlyakhtichEvgeniy.hw8.service.DataBaseService;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;

public class DataBaseServiceImpl implements DataBaseService {
    File usersDB = new File("src/com/teachMeSkills/an15/ShlyakhtichEvgeniy/hw8/dataBase/usersDB.txt");
    File productsDB = new File("src/com/teachMeSkills/an15/ShlyakhtichEvgeniy/hw8/dataBase/productsDB.txt");

    @Override
    public Object loadUsersDataBase() {
        HashMap<String, User> users = new HashMap<>();

        try {
            ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(usersDB));
            UsersDataBase usersDataBase = (UsersDataBase) objectInputStream.readObject();
            users = usersDataBase.getUsers();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
            System.out.println("Ошибка в чтении базы данных");
        }
        return users;
    }

    @Override
    public Object loadProductsDataBase() {
        ArrayList<Product> products = new ArrayList<>();

        try {
            ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(productsDB));
            ProductsDataBase productsDataBase = (ProductsDataBase) objectInputStream.readObject();
            products = productsDataBase.getProducts();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
            System.out.println("Ошибка в чтении базы данных");
        }
        return products;
    }

    @Override
    public void saveUsersDataBase(HashMap<String, User> users) {
        UsersDataBase usersDataBase = new UsersDataBase();
        usersDataBase.setUsers(users);
        try {
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(usersDB));
            objectOutputStream.writeObject(usersDataBase);
            objectOutputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Ошибка в создании базы данных");
        }

    }

    @Override
    public void saveProductsDataBase(ArrayList<Product> products) {
        ProductsDataBase productsDataBase = new ProductsDataBase();
        productsDataBase.setProducts(products);
        try {
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(productsDB));
            objectOutputStream.writeObject(productsDataBase);
            objectOutputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Ошибка в создании базы данных");
        }

    }
}
