package com.teachMeSkills.an15.ShlyakhtichEvgeniy.hw6.task3.Service.Impl;

import com.teachMeSkills.an15.ShlyakhtichEvgeniy.hw6.task3.Service.CategoryProducts;
import com.teachMeSkills.an15.ShlyakhtichEvgeniy.hw6.task3.Shop.Category;

public class CategoryProductsImpl implements CategoryProducts {
    @Override
    public void categoryProducts(Category category) {
        System.out.println(category.getName() + " :");
        for (int i = 0; i < category.getProduct().length; i++) {
            System.out.println(i + 1 + "." + category.getProduct()[i].toString());
        }
    }
}
