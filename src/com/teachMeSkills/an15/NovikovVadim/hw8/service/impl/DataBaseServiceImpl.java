package com.teachMeSkills.an15.NovikovVadim.hw8.service.impl;

import com.teachMeSkills.an15.NovikovVadim.hw8.EnumCars;
import com.teachMeSkills.an15.NovikovVadim.hw8.model.Basket;
import com.teachMeSkills.an15.NovikovVadim.hw8.model.DataBase;
import com.teachMeSkills.an15.NovikovVadim.hw8.model.Product;
import com.teachMeSkills.an15.NovikovVadim.hw8.model.User;
import com.teachMeSkills.an15.NovikovVadim.hw8.service.DataBaseService;

import java.io.*;
import java.math.BigDecimal;
import java.util.*;

public class DataBaseServiceImpl implements DataBaseService {

    public boolean saveDB(HashMap<String, User> users, ArrayList<Product> products) {
        try {
            DataBase db = new DataBase();
            db.setProducts(products);
            db.setUsers(users);

            ObjectOutputStream objectOutputStream = null;
            objectOutputStream = new ObjectOutputStream(new FileOutputStream("src/com/teachMeSkills/an15/NovikovVadim/hw8/db.txt"));
            objectOutputStream.writeObject(db);
            objectOutputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Ошибка создания базы данных");
            return false;
        }
        return true;
    }

    @Override
    public Object[] loadDB() {
        HashMap<String, User> users = new HashMap<>();
        ArrayList<Product> products = new ArrayList<Product>();

        try {
            ObjectInputStream objectInputStream = null;
            objectInputStream = new ObjectInputStream(new FileInputStream("src/com/teachMeSkills/an15/NovikovVadim/hw8/db.txt"));
            DataBase db = (DataBase) objectInputStream.readObject();

            users = db.getUsers();
            for (Map.Entry<String, User> iter : users.entrySet()) {
                User user = iter.getValue();
                user.setBasket(new Basket());
            }

            products = db.getProducts();

        } catch (Exception e) {
            //в случае, если нет файла базы данных, заполним простым набором
            User user1 = new User("Вадим", "123");
            user1.setHasAdminRole(true);
            User user2 = new User("Вадим2", "123");
            user2.setHasAdminRole(false);
            users.put(user1.getLogin(), user1);
            users.put(user2.getLogin(), user2);

            HashSet<String> carNames = new HashSet<>();
            carNames.add(EnumCars.AUID.getTitle());
            carNames.add(EnumCars.BMW.getTitle());
            carNames.add(EnumCars.VW.getTitle());
            Product product = new Product();
            product.setName("Руль");
            product.setPrice(new BigDecimal("100"));
            product.setCarNames(carNames);
            product.setAvgRate(10);
            product.setAmount(20);
            products.add(product);

            HashSet<String> carNames1 = new HashSet<>();
            carNames1.add(EnumCars.Skoda.getTitle());
            carNames1.add("SKOda");
            carNames1.add(EnumCars.AUID.getTitle());
            carNames1.add(EnumCars.VW.getTitle());
            Product product1 = new Product();
            product1.setName("DSG");
            product1.setPrice(new BigDecimal("2000"));
            product1.setCarNames(carNames1);
            product1.setAvgRate(10);
            product1.setAmount(20);
            products.add(product1);

            System.out.println(Arrays.toString(product1.getCarNames().toArray()));
        }

        Object[] objects = new Object[2];
        objects[0] = users;
        objects[1] = products;
        return objects;

    }
}
