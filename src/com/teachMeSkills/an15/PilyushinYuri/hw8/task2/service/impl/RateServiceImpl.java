package com.teachMeSkills.an15.PilyushinYuri.hw8.task2.service.impl;

import com.teachMeSkills.an15.PilyushinYuri.hw8.task2.model.Product;
import com.teachMeSkills.an15.PilyushinYuri.hw8.task2.service.RateService;

public class RateServiceImpl implements RateService {
    @Override
    public double calculateAvgRate(Product product) {
        if (product.getRates().isEmpty()) {
            return 0;
        } else {
            int rateSum = 0;
            for (int rate : product.getRates()) {
                rateSum = rateSum + rate;
            }
            double avgRate = rateSum / product.getRates().size();
            return avgRate;
        }
    }
}

