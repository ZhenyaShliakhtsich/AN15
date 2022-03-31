package com.teachMeSkills.an15.TuskalSergey.hw7.Task2.service.impl;

import com.teachMeSkills.an15.TuskalSergey.hw7.Task2.model.Product;
import com.teachMeSkills.an15.TuskalSergey.hw7.Task2.service.RateService;

public class RateServiceImpl implements RateService {
    @Override
    public double calculateAvgRate(Product product) {
        double totalRate = 0;
        for (Integer rate : product.getRates()) {
            totalRate = totalRate + rate;
        }
        double avgRate = totalRate / product.getRates().size();
        product.setAvgRate(avgRate);
        return avgRate;
    }
}


