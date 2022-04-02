package com.teachMeSkills.an15.TuskalSergey.hw7.Task2;

import com.teachMeSkills.an15.TuskalSergey.hw7.Task2.model.Basket;
import com.teachMeSkills.an15.TuskalSergey.hw7.Task2.model.Product;
import com.teachMeSkills.an15.TuskalSergey.hw7.Task2.model.User;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Database {
    public static HashMap<String, User> USERS = new HashMap<>() {
        {
            put("admin", new User("admin", "admin", true));
            put("user1", new User("user1", "user1", new Basket()));
        }
    };

    public static ArrayList<Product> PRODUCTS = new ArrayList<>() {{
        HashSet<String> carNames = new HashSet<>();
        carNames.add("фольксваген");
        carNames.add("тойота");

        Product product1 = new Product("глушитель",
                new BigDecimal(99.99).setScale(2, RoundingMode.HALF_UP),
                1, "оригинальный", carNames);
        Product product2 = new Product("сцепление",
                new BigDecimal(199.99).setScale(2, RoundingMode.HALF_UP),
                5, "оригинальное", carNames);
        add(product1);
        add(product2);
    }};

}
