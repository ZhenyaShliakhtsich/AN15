package com.teachMeSkills.an15.NovikovVadim.hw8.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;

public class DataBase implements Serializable {
    private HashMap<String, User> users;
    private ArrayList<Product> products;

    public HashMap<String, User> getUsers() {
        return users;
    }

    public void setUsers(HashMap<String, User> users) {
        this.users = users;
    }

    public ArrayList<Product> getProducts() {
        return products;
    }

    public void setProducts(ArrayList<Product> products) {
        this.products = products;
    }
}
