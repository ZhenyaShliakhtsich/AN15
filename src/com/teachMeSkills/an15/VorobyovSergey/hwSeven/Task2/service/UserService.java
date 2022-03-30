package com.teachMeSkills.an15.VorobyovSergey.hwSeven.Task2.service;

import com.teachMeSkills.an15.VorobyovSergey.hwSeven.Task2.model.Product;
import com.teachMeSkills.an15.VorobyovSergey.hwSeven.Task2.model.User;

import java.util.HashMap;
import java.util.HashSet;

public interface UserService {

    //Methods for Admin
    void addProduct(HashSet<Product> storage);

    void changeProduct(HashSet<Product> storage);

    void deleteProduct(HashSet<Product> storage);

    void showProducts (HashSet<Product> storage);

    //Methods for other Users
    User addProductToBasket(User user, HashSet<Product> storage);

    void payForBasket(User user);

    void deleteProductFromBasket(User user);

    void rateProduct(HashSet<Product> storage);

    void commentProduct(HashSet<Product> storage);

    boolean showBasket (User user);

    void showReceipts (User user);

    void showReceiptsInTxt (User user);
}
