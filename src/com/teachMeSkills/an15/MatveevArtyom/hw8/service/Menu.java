package com.teachMeSkills.an15.MatveevArtyom.hw8.service;

import com.teachMeSkills.an15.MatveevArtyom.hw8.model.Product;
import com.teachMeSkills.an15.MatveevArtyom.hw8.model.User;

import java.util.ArrayList;
import java.util.HashMap;

public interface Menu {
    void menuAuth(User user, Product product);

    void menuAdmin();

    void menuUser(User user, Product product);
}
