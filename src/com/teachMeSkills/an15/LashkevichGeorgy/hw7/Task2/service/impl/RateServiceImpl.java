package com.teachMeSkills.an15.LashkevichGeorgy.hw7.Task2.service.impl;

import com.teachMeSkills.an15.LashkevichGeorgy.hw7.Task2.models.Product;
import com.teachMeSkills.an15.LashkevichGeorgy.hw7.Task2.service.RateService;

public class RateServiceImpl implements RateService {
    @Override
    public double calculateAvgRate(Product product) {
        double calc = 0.0;
        for (int i = 0; i < product.getProducts().size(); i++) {
            calc += product.getRates().get(i);
        }
        return calc;
    }
}
