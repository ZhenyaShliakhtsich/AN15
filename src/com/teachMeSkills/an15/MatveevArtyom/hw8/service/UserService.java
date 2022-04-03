package com.teachMeSkills.an15.MatveevArtyom.hw8.service;

import com.teachMeSkills.an15.MatveevArtyom.hw8.model.Product;
import com.teachMeSkills.an15.MatveevArtyom.hw8.model.User;

import java.util.ArrayList;

public interface UserService {
    void addProduct(ArrayList<Product> products);

    void changeProduct(ArrayList<Product> products);

    void deleteProduct(ArrayList<Product> products);

    void addProductToBasket(User user, ArrayList<Product> products);

    void payForBasket(User user, ArrayList<Product> products);

    void deleteProductFromBasket(User user);

    void rateProduct(ArrayList<Product> products);

    void commentProduct(ArrayList<Product> products);

    void search(Product product);
}
