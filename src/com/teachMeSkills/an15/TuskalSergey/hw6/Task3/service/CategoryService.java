package com.teachMeSkills.an15.TuskalSergey.hw6.Task3.service;

import com.teachMeSkills.an15.TuskalSergey.hw6.Task3.Item;

public interface CategoryService {
    void viewCategory(Item[] items);
    void addItemToBasket(Item item);
    void buyItem(Item item);
}
