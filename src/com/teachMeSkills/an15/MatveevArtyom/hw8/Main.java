package com.teachMeSkills.an15.MatveevArtyom.hw8;

import com.teachMeSkills.an15.MatveevArtyom.hw8.model.Product;
import com.teachMeSkills.an15.MatveevArtyom.hw8.model.User;
import com.teachMeSkills.an15.MatveevArtyom.hw8.service.*;
import com.teachMeSkills.an15.MatveevArtyom.hw8.service.impl.*;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        Menu menu = new MenuServiceImpl();
        User user = new User("admin", "admin");
        HashMap<String, User> users = new HashMap<>();
        users.put("admin", user);
        ArrayList<Product> products = new ArrayList<>();
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
        products.add(product);
        products.add(product1);
        menu.menuAuth(user, users, product, products);
    }
}
