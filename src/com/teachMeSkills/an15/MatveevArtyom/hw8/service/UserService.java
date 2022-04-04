package com.teachMeSkills.an15.MatveevArtyom.hw8.service;

import com.teachMeSkills.an15.MatveevArtyom.hw8.model.User;

public interface UserService {
    void addProduct();

    void changeProduct();

    void deleteProduct();

    void addProductToBasket(User user);

    void payForBasket(User user);

    void deleteProductFromBasket(User user);

    void rateProduct();

    void commentProduct();

    void searchByProduct();
}
