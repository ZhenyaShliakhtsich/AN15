package com.teachMeSkills.an15.ShlyakhtichEvgeniy.hw8.service;

import com.teachMeSkills.an15.ShlyakhtichEvgeniy.hw8.model.Product;
import com.teachMeSkills.an15.ShlyakhtichEvgeniy.hw8.model.User;

import java.util.ArrayList;

public interface UserService {

    void addProduct(ArrayList<Product> products);

    void changeProduct(ArrayList<Product> products);

    void deleteProduct(ArrayList<Product> products);

    void addProductToBasket(User user, Product product);

    void payForBasket(User user,ArrayList<Product> products);

    void deleteProductFromBasket(User user);

    void rateProduct(Product product);

    void commentProduct(Product product);

    void searchForProducts(ArrayList<Product> products);
}
