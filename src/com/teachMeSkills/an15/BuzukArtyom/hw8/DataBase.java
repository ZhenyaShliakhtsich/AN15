package com.teachMeSkills.an15.BuzukArtyom.hw8;

import com.teachMeSkills.an15.BuzukArtyom.hw8.model.Basket;
import com.teachMeSkills.an15.BuzukArtyom.hw8.model.Product;
import com.teachMeSkills.an15.BuzukArtyom.hw8.model.User;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class DataBase {
    public static HashMap<String, User> USERS = new HashMap<>() {
        {
            put("admin", new User("admin", "admin", true));
            put("login", new User("login", "password", new Basket()));
        }
    };
    public static ArrayList<Product> PRODUCTS = new ArrayList<>() {{
        HashSet<String> oilCarNames = new HashSet<>();
        oilCarNames.add("BMW");
        oilCarNames.add("Audi");


        Product oil = new Product("Maslo", new BigDecimal(100), 3, "Дорогое масло", oilCarNames);
        HashSet<String> cdChangerCarNames = new HashSet<>();
        cdChangerCarNames.add("Lada");
        BigDecimal bigDecimal1 = new BigDecimal(210);
        Product cdChanger = new Product("Magnitola", bigDecimal1, 5, "Магнитола топовая", cdChangerCarNames);
        add(oil);
        add(cdChanger);
    }};

}
