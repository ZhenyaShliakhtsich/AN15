package com.teachMeSkills.an15.MatveevArtyom.hw8;

import com.teachMeSkills.an15.MatveevArtyom.hw8.model.Product;
import com.teachMeSkills.an15.MatveevArtyom.hw8.model.User;
import com.teachMeSkills.an15.MatveevArtyom.hw8.service.*;
import com.teachMeSkills.an15.MatveevArtyom.hw8.service.impl.*;

import java.math.BigDecimal;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        Menu menu = new MenuServiceImpl();
        User user = new User("admin", "admin");
        HashSet<String> carNames = new HashSet<>();
        carNames.add("Audi");
        carNames.add("Mers");
        carNames.add("BMW");
        carNames.add("Ford");
        carNames.add("Ferrari");
        BigDecimal bigDecimal = new BigDecimal("5.5");
        Product product = new Product("Подвеска", bigDecimal, 9, "Хз", carNames);
        menu.menuAuth(user, product);
    }
}
