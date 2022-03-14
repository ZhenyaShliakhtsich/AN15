package com.teachMeSkills.an15.ShlyakhtichEvgeniy.hw6.task3.Service.Impl;

import com.teachMeSkills.an15.ShlyakhtichEvgeniy.hw6.task3.Service.ChooseProduct;
import com.teachMeSkills.an15.ShlyakhtichEvgeniy.hw6.task3.Shop.Basket;
import com.teachMeSkills.an15.ShlyakhtichEvgeniy.hw6.task3.Shop.Product;

import java.util.ArrayList;

public class ChooseProductImpl implements ChooseProduct {
    @Override
    public void chooseProduct(Basket basket, Product product) {

        basket.getProducts().add(product);
    }
}

