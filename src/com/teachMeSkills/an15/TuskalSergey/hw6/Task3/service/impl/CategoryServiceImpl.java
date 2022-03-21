package com.teachMeSkills.an15.TuskalSergey.hw6.Task3.service.impl;

import com.teachMeSkills.an15.TuskalSergey.hw6.Task3.Item;
import com.teachMeSkills.an15.TuskalSergey.hw6.Task3.service.CategoryService;

public class CategoryServiceImpl implements CategoryService {

    @Override
    public void viewCategory(Item[] items) {
        int id = 0;
        for (int i = 0; i < 3; i++) {
            System.out.println(++id + " - " + items[i].toString());
        }
    }

    @Override
    public void addItemToBasket(Item item) {
        System.out.println("Товар " + item.getName() + " добавлен в корзину");
}



    @Override
    public void buyItem(Item item) {
        System.out.println("Покупка товара " + item.getName() + " завершена");
    }
}
