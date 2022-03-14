package com.teachMeSkills.an15.MatveevArtyom.hw6.Inheritance.task3.service;

import com.teachMeSkills.an15.MatveevArtyom.hw6.Inheritance.task3.Basket;
import com.teachMeSkills.an15.MatveevArtyom.hw6.Inheritance.task3.Category;
import com.teachMeSkills.an15.MatveevArtyom.hw6.Inheritance.task3.Product;
import com.teachMeSkills.an15.MatveevArtyom.hw6.Inheritance.task3.User;

public interface CategoryService {
    void printCatalog(Category category);
    void printDefiniteCatalog(Category category);
    void selectInBasket(int count, Basket basket, Category category);
    void byInBasket(User user, Product product);
}
