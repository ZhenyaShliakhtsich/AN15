package com.teachMeSkills.an15.LashkevichGeorgy.hw7.Task2.service.impl;

import com.teachMeSkills.an15.LashkevichGeorgy.hw7.Task2.models.Product;
import com.teachMeSkills.an15.LashkevichGeorgy.hw7.Task2.service.RateService;

import java.util.ArrayList;


public class RateServiceImpl implements RateService {
    @Override
    public void calculateAvgRate(ArrayList<Product> products) {

        double calc;
        for (int i = 0; i < products.size(); i++) {

            if (products.isEmpty() && products.get(i).getRates() == null) {
                continue;
            } else {
                calc = 0.0;
                for (int j = 0; j < products.get(i).getRates().size(); j++) {
                    calc += products.get(i).getRates().get(j);
                    products.get(i).setAvgRate(calc);
                }


            }
        }
    }

}