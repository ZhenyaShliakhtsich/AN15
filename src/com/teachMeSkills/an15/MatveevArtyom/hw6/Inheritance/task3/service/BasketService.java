package com.teachMeSkills.an15.MatveevArtyom.hw6.Inheritance.task3.service;

import com.teachMeSkills.an15.MatveevArtyom.hw6.Inheritance.task3.Basket;
import com.teachMeSkills.an15.MatveevArtyom.hw6.Inheritance.task3.Category;
import com.teachMeSkills.an15.MatveevArtyom.hw6.Inheritance.task3.Product;

public interface BasketService {
    void selectInBasket(int count, Basket basket, Category category);
    void byInBasket(Basket basket);
}
