package com.teachMeSkills.an15.NovikovVadim.hw8.service;

import com.teachMeSkills.an15.NovikovVadim.hw8.model.Product;
import com.teachMeSkills.an15.NovikovVadim.hw8.model.User;

import java.util.ArrayList;

public interface UserService {

    void addProduct(ArrayList<Product> products);

    void changeProduct(ArrayList<Product> products);

    void deleteProduct(ArrayList<Product> products);

    void addProductToBasket(User user, ArrayList<Product> products);

    void payForBasket(User user);

    void deleteProductFromBasket(User user);

    boolean showProducts(ArrayList<Product> products, boolean isQuantity);

    void searchCarName(User user, ArrayList<Product> products);

    void searchName(User user, ArrayList<Product> products);

    void setCommentProduct(User user, ArrayList<Product> products);

    void setRateProduct(User user, ArrayList<Product> products);

    void showBasket(User user);
}
