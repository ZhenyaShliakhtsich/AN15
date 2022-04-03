package com.teachMeSkills.an15.ShlyakhtichEvgeniy.hw8;

import com.teachMeSkills.an15.ShlyakhtichEvgeniy.hw8.model.Basket;
import com.teachMeSkills.an15.ShlyakhtichEvgeniy.hw8.model.Product;
import com.teachMeSkills.an15.ShlyakhtichEvgeniy.hw8.model.User;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class DataBase {
    public static ArrayList<Product> PRODUCTS = new ArrayList<>(){{
        BigDecimal priceOil = new BigDecimal(12);
        BigDecimal priceEngine = new BigDecimal(12);
        BigDecimal priceCarRadio = new BigDecimal(12);
        ArrayList<Integer> ratesOil = new ArrayList<>();
        ratesOil.add(2);
        ratesOil.add(5);
        ratesOil.add(3);
        ArrayList<Integer> ratesEngine = new ArrayList<>();
        ratesEngine.add(1);
        ratesEngine.add(3);
        ratesEngine.add(5);
        ArrayList<Integer> ratesCarRadio = new ArrayList<>();
        ratesCarRadio.add(2);
        ratesCarRadio.add(5);
        HashSet<String> carsOil = new HashSet<>();
        carsOil.add("BMW");
        carsOil.add("Audi");
        HashSet<String> carsEngine = new HashSet<>();
        carsEngine.add("BMW");
        carsEngine.add("Renault");
        HashSet<String> carsCarRadio = new HashSet<>();
        carsCarRadio.add("Renault");
        carsCarRadio.add("Ford");
        ArrayList<String> commentsOil = new ArrayList<>();
        commentsOil.add("Клёво");
        ArrayList<String> commentsEngine = new ArrayList<>();
        ArrayList<String> commentsCarRadio = new ArrayList<>();
        ArrayList<Product> products = new ArrayList<>();
        Product oil = new Product("Масло",priceOil,3,commentsOil,carsOil,ratesOil);
        Product engine = new Product("Двигатель",priceEngine,5,commentsEngine,carsEngine,ratesEngine);
        Product carRadio = new Product("Магнитола",priceCarRadio,3,commentsCarRadio,carsCarRadio,ratesCarRadio);
        add(oil);
        add(engine);
        add(carRadio);
    }};
    public static HashMap<String, User> USERS = new HashMap<>(){{
        User admin = new User("admin", "admin", new Basket());
        admin.setHasAdminRole(true);
        User user = new User("login", "password", new Basket());
        ArrayList<Product> productsBasket = new ArrayList<>();
        user.getBasket().setProducts(productsBasket);
        put(admin.getLogin(), admin);
        put(user.getLogin(), user);
    }};
}
