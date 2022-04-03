package com.teachMeSkills.an15.SavitskyRoman.hw8.task2.service.impl;

import com.teachMeSkills.an15.SavitskyRoman.hw8.task2.model.Product;
import com.teachMeSkills.an15.SavitskyRoman.hw8.task2.service.RateService;

import java.util.ArrayList;

public class RateServiceImpl implements RateService {
    @Override
    public double calculateAvgRate(Product product, int rateUser) {
        double newRate = 5;
        if (product.getRates() == null) {
            product.setRates(new ArrayList<>());
            newRate = (product.getAvgRate() * product.getRates().size() + rateUser)
                    / (product.getRates().size() + 1);
        } else {
            newRate = (product.getAvgRate() * product.getRates().size() + rateUser)
                    / (product.getRates().size() + 1);
        }
        return newRate;
    }


}
