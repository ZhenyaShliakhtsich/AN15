package com.teachMeSkills.an15.PilyushinYuri.hw8.task2.service;


import com.teachMeSkills.an15.PilyushinYuri.hw8.task2.model.User;


public interface UserService {

    void addProduct();

    void changeProduct();

    void deleteProduct();

    void addProductToBasket(User user);

    void payForBasket(User user);

    void deleteProductFromBasket(User user);

    void rateProduct(User user);

    void commentProduct(User user);
}
