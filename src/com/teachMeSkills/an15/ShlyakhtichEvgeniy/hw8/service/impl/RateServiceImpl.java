package com.teachMeSkills.an15.ShlyakhtichEvgeniy.hw8.service.impl;

import com.teachMeSkills.an15.ShlyakhtichEvgeniy.hw8.model.Product;
import com.teachMeSkills.an15.ShlyakhtichEvgeniy.hw8.service.RateService;

public class RateServiceImpl implements RateService {
    @Override
    public double calculateAvgRate(Product product) {
        int rateSum = 0;
        for (int rate : product.getRates()) {
            rateSum =rateSum + rate;
        }
        double avgRate = rateSum / product.getRates().size();
        return avgRate;
    }
}
