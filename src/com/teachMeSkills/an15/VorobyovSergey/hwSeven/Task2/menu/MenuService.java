package com.teachMeSkills.an15.VorobyovSergey.hwSeven.Task2.menu;

import com.teachMeSkills.an15.VorobyovSergey.hwSeven.Task2.model.Product;
import com.teachMeSkills.an15.VorobyovSergey.hwSeven.Task2.model.User;

import java.util.HashSet;

public interface MenuService {
    void createMenu (User user, HashSet<Product> storage);
}
