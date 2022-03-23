package com.teachMeSkills.an15.MatveevArtyom.hw8.service.impl;

import com.teachMeSkills.an15.MatveevArtyom.hw8.model.Product;
import com.teachMeSkills.an15.MatveevArtyom.hw8.service.RateService;

public class RateServiceImpl implements RateService {
    @Override
    public double calculateAvgRate(Product product) {
        double sum = 0;
        for(Integer rate: product.getRates()){
            sum+=rate;
        }
        return sum/product.getRates().size();
    }
}
