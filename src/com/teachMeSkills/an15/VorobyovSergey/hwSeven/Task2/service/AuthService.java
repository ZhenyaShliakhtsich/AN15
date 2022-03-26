package com.teachMeSkills.an15.VorobyovSergey.hwSeven.Task2.service;

import com.teachMeSkills.an15.VorobyovSergey.hwSeven.Task2.model.Product;
import com.teachMeSkills.an15.VorobyovSergey.hwSeven.Task2.model.User;

import java.util.HashMap;
import java.util.HashSet;

public interface AuthService {
    void login(HashSet<User> database, HashSet<Product> storage);

    void registration(HashSet<User> database, HashSet<Product> storage);
}
