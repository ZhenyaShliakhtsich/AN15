package com.teachMeSkills.an15.VorobyovSergey.hwSeven.Task2;

import com.teachMeSkills.an15.VorobyovSergey.hwSeven.Task2.model.Basket;
import com.teachMeSkills.an15.VorobyovSergey.hwSeven.Task2.model.Product;
import com.teachMeSkills.an15.VorobyovSergey.hwSeven.Task2.model.User;

import java.math.BigDecimal;
import java.util.HashSet;

public class DefaultDbCreator {
    static HashSet<User> initU() {
        //Create some users for example
        Basket basket = new Basket();
        User u1 = new User("l1", "p1", basket);
        User u2 = new User("l2", "p2", basket);
        User a1 = new User("a", "a", basket);
        a1.setHasAdminRole(true);
        //HashSet is something like database of users
        HashSet<User> database = new HashSet<>();
        database.add(u1);
        database.add(u2);
        database.add(a1);

        return database;
    }

    static HashSet<Product> initP() {
        //Create set of cars
        HashSet<String> set1 = new HashSet<>();
        set1.add("Car 1");
        set1.add("Car 2");
        set1.add("Car 3");
        HashSet<String> set2 = new HashSet<>();
        set1.add("Car 2");
        set1.add("Car 4");
        //Create some products
        Product p1 = new Product("Product 1", new BigDecimal(1000), 10, null, set1);
        Product p2 = new Product("Product 2", new BigDecimal(2000), 20, null, set1);
        Product p3 = new Product("Product 3", new BigDecimal(3000), 30, null, set2);
        Product p4 = new Product("Product 4", new BigDecimal(4000), 40, null, set2);
        HashSet<Product> storage = new HashSet<>();
        storage.add(p1);
        storage.add(p2);
        storage.add(p3);
        storage.add(p4);
        return storage;
    }
}
