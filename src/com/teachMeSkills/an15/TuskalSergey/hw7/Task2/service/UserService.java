package com.teachMeSkills.an15.TuskalSergey.hw7.Task2.service;

import com.teachMeSkills.an15.TuskalSergey.hw7.Task2.model.Product;
import com.teachMeSkills.an15.TuskalSergey.hw7.Task2.model.User;

import java.util.ArrayList;

public interface UserService {

    void addProduct(ArrayList<Product> products);

    void changeProduct(ArrayList<Product> products);

    void deleteProduct(ArrayList<Product> products);

    void addProductToBasket(User user, ArrayList<Product> products);

    void payForBasket(User user, ArrayList<Product> products);

    void deleteProductFromBasket(User user);

    void searchProductByCarName(ArrayList<Product> products);

    void rateProduct(User user, ArrayList<Product> prodcuts);

    void commentProduct(User user, ArrayList<Product> porducts);

}
