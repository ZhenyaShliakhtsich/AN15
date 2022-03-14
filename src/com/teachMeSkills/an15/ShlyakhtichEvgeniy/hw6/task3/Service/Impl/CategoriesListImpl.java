package com.teachMeSkills.an15.ShlyakhtichEvgeniy.hw6.task3.Service.Impl;

import com.teachMeSkills.an15.ShlyakhtichEvgeniy.hw6.task3.Service.CategoriesList;
import com.teachMeSkills.an15.ShlyakhtichEvgeniy.hw6.task3.Shop.Category;

public class CategoriesListImpl implements CategoriesList {
    @Override
    public void categoriesList(Category[] categories) {
        for (int i = 0; i < categories.length; i++) {
            System.out.println(i + 1 + "." + categories[i].getName());
        }
    }
}
