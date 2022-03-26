package com.teachMeSkills.an15.PilyushinYuri.hw8.task2.service.impl;

import com.teachMeSkills.an15.PilyushinYuri.hw8.task2.model.User;
import com.teachMeSkills.an15.PilyushinYuri.hw8.task2.service.PriceService;

import java.math.BigDecimal;
import java.util.Random;

public class PriceServiceImpl implements PriceService {
    @Override
    public BigDecimal calculateTotalBasketPrice(User user) {
        for (int i = 0; i < user.getBasket().getProducts().size(); i++) {
            BigDecimal totalCount = new BigDecimal(0);
            totalCount.add(user.getBasket().getProducts().get(i).getPrice());
            BigDecimal discount = new BigDecimal(calculateDiscount()/100);
            BigDecimal dicountedPrice;
            dicountedPrice =totalCount.subtract(totalCount.multiply(discount));
            return dicountedPrice;
        }
        return null;
    }

    @Override
    public int calculateDiscount() {
        Random random = new Random();
        int discount = random.nextInt(31);
        return discount;
    }
}
