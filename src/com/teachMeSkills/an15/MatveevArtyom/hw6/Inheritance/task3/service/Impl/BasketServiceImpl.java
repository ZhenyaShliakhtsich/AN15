package com.teachMeSkills.an15.MatveevArtyom.hw6.Inheritance.task3.service.Impl;

import com.teachMeSkills.an15.MatveevArtyom.hw6.Inheritance.task3.Basket;
import com.teachMeSkills.an15.MatveevArtyom.hw6.Inheritance.task3.Category;
import com.teachMeSkills.an15.MatveevArtyom.hw6.Inheritance.task3.Product;
import com.teachMeSkills.an15.MatveevArtyom.hw6.Inheritance.task3.service.BasketService;

import java.util.Scanner;

public class BasketServiceImpl implements BasketService {

    @Override
    public void selectInBasket(int count, Basket basket, Category category) {
        basket.setProduct(category.getProducts()[count]);
    }

    @Override
    public void byInBasket(Basket basket) {
        for (int i = 0; i < basket.getProducts().length; i++) {
            System.out.println("Вы купили - " + basket.getProducts()[i]);
        }
    }
}
