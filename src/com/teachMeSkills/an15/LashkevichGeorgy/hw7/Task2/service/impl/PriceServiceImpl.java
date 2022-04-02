package com.teachMeSkills.an15.LashkevichGeorgy.hw7.Task2.service.impl;


import com.teachMeSkills.an15.LashkevichGeorgy.hw7.Task2.models.User;
import com.teachMeSkills.an15.LashkevichGeorgy.hw7.Task2.service.PriceService;

import java.math.BigDecimal;

public class PriceServiceImpl implements PriceService {

    @Override
    public BigDecimal calculateTotalBasketPrice(User user) {
        if (user.getBasket().getTotalPrice() == null) user.getBasket().setTotalPrice(new BigDecimal(0));
        BigDecimal bigDecimal = new BigDecimal(0); // user.getBasket().getTotalPrice();
        for (int i = 0; i < user.getBasket().getProducts().size(); i++) {
            bigDecimal = bigDecimal.add(user.getBasket().getProducts().get(i).getPrice());
        }
        user.getBasket().setTotalPrice(bigDecimal);
        BigDecimal bigDecimalWithDisc = bigDecimal.subtract(bigDecimal.multiply(new BigDecimal(calculateDiscount() / 100)));
        return bigDecimalWithDisc;
    }

    @Override
    public int calculateDiscount() {
        int discount = (int) (Math.random() * 30);
        return discount;
    }
}
