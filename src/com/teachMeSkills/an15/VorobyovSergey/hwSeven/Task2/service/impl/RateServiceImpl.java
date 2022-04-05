package com.teachMeSkills.an15.VorobyovSergey.hwSeven.Task2.service.impl;

import com.teachMeSkills.an15.VorobyovSergey.hwSeven.Task1.services.readers.implementations.OnlyOneNumberReaderServiceImpl;
import com.teachMeSkills.an15.VorobyovSergey.hwSeven.Task2.model.Product;
import com.teachMeSkills.an15.VorobyovSergey.hwSeven.Task2.service.RateService;

import java.util.ArrayList;

public class RateServiceImpl implements RateService {
    @Override
    public double calculateAvgRate(Product product) {
        ArrayList<Integer> list;
        //Check for null
        if (product.getRates() != null) {
            list = product.getRates();
        } else {
            list = new ArrayList<>();
        }

        //Make new rate
        list.add(new OnlyOneNumberReaderServiceImpl().readNumberFromConsole());
        product.setRates(list);
        double summ = 0;
        for (Integer i : list) {
            summ += i;
        }
        System.out.println("list size is - " + list.size());
        System.out.println("summ of rates is - " + summ);
        //убрать
        return summ / list.size();
    }
}
