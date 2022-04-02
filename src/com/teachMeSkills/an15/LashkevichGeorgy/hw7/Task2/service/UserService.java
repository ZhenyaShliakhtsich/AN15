package com.teachMeSkills.an15.LashkevichGeorgy.hw7.Task2.service;

import com.teachMeSkills.an15.LashkevichGeorgy.hw7.Task2.models.Product;
import com.teachMeSkills.an15.LashkevichGeorgy.hw7.Task2.models.User;


import java.util.ArrayList;
import java.util.HashMap;

public interface UserService {

    void addProduct(ArrayList<Product> products);

    void changeProduct(ArrayList<Product> products);

    void deleteProduct(ArrayList<Product> products);

    void addProductToBasket(User user, ArrayList<Product> products);


    void payForBasket(User user, ArrayList<Product> products);

    void deleteProductFromBasket(User user);

    void rateProduct(ArrayList<Product> products);

    void commentProduct(ArrayList<Product> products);

    void showProducts(ArrayList<Product> products);
}
