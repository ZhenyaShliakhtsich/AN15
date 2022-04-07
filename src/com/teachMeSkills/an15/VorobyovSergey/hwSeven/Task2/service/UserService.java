package com.teachMeSkills.an15.VorobyovSergey.hwSeven.Task2.service;

import com.teachMeSkills.an15.VorobyovSergey.hwSeven.Task2.model.Product;
import com.teachMeSkills.an15.VorobyovSergey.hwSeven.Task2.model.User;

import java.util.HashMap;
import java.util.HashSet;

public interface UserService {

    //Methods for Admin
    void addProduct();

    void changeProduct();

    void deleteProduct();

    void showProducts ();

    //Methods for other Users
    User addProductToBasket(User user);

    void payForBasket(User user);

    void deleteProductFromBasket(User user);

    void rateProduct();

    void commentProduct();

    boolean showBasket (User user);

    void showReceipts (User user);

    void showReceiptsInTxt (User user);
}
