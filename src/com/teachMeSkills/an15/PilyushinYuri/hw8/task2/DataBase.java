package com.teachMeSkills.an15.PilyushinYuri.hw8.task2;


import com.teachMeSkills.an15.PilyushinYuri.hw8.task2.model.Basket;
import com.teachMeSkills.an15.PilyushinYuri.hw8.task2.model.Product;
import com.teachMeSkills.an15.PilyushinYuri.hw8.task2.model.User;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class DataBase {
    public static ArrayList<Product> PRODUCTS = new ArrayList<>() {
        {
            Product product1 = new Product("масло", new BigDecimal(50.08), 25, "", new HashSet<String>());
            Product product2 = new Product("свечи", new BigDecimal(16.96), 150, "", new HashSet<String>());
            Product product3 = new Product("фильтр", new BigDecimal(29.11), 30, "", new HashSet<String>());
            HashSet<String> carNames = new HashSet<>();
            carNames.add("Renault");
            carNames.add("Audi");
            carNames.add("Mersedes");
            product1.setCarNames(carNames);
            HashSet<String> carNames2= new HashSet<>();
            carNames2.add("BMW");
            carNames2.add("Ford");
            product2.setCarNames(carNames2);
            HashSet<String> carNames3 = new HashSet<>();
            carNames3.add("Ford");
            carNames3.add("Opel");
            product3.setCarNames(carNames3);
            add(product1);
            add(product2);
            add(product3);
        }
    };
    public static HashMap<String, User> USERS = new HashMap<String, User>(){
        {
           User admin = new User("admin","adminPass");
           admin.setHasAdminRole(true);
           put("admin", admin);
           put("login1", new User("login1","pass1", new Basket()));


        }
    };


}

