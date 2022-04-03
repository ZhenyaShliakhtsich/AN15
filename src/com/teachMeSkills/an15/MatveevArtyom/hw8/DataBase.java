package com.teachMeSkills.an15.MatveevArtyom.hw8;

import com.teachMeSkills.an15.MatveevArtyom.hw8.model.Product;
import com.teachMeSkills.an15.MatveevArtyom.hw8.model.User;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class DataBase {

    public static HashMap<String, User> USERS = new HashMap<String, User>() {
        {
            put("admin", new User("admin", "admin", true));
        }
    };

    public static ArrayList<Product> PRODUCTS = new ArrayList<Product>() {{
        HashSet<String> carNames = new HashSet<>();
        carNames.add("Audi");
        carNames.add("Mers");
        carNames.add("BMW");
        carNames.add("Ford");
        carNames.add("Ferrari");
        BigDecimal bigDecimal = new BigDecimal("5.5");
        Product product = new Product("Подвеска", bigDecimal, 9, "Хз", carNames);
        HashSet<String> carNames2 = new HashSet<>();
        carNames2.add("Lamba");
        carNames2.add("Bugatti");
        BigDecimal bigDecimal1 = new BigDecimal("10");
        Product product1 = new Product("Турбо двигатель", bigDecimal1, 3, "Агонь", carNames2);
        add(product);
        add(product1);
    }};
}
