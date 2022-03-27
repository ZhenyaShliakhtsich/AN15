package com.teachMeSkills.an15.LashkevichGeorgy.hw7.Task2.service.impl;

import com.teachMeSkills.an15.LashkevichGeorgy.hw7.Task2.models.User;
import com.teachMeSkills.an15.LashkevichGeorgy.hw7.Task2.service.PriceService;

import java.math.BigDecimal;

public class PriceServiceImpl implements PriceService {

    @Override
    public BigDecimal calculateTotalBasketPrice(User user) {
        if (user.getBasket().getTotalPrice() == null) user.getBasket().setTotalPrice(new BigDecimal(0));
        for (int i = 0; i < user.getBasket().getProducts().size(); i++) {
            user.getBasket().getTotalPrice().add(user.getBasket().getProducts().get(i).getPrice());
        }
        System.out.println(user.getBasket().getTotalPrice().toString());
        return user.getBasket().getTotalPrice();
    }

    @Override
    public int calculateDiscount() {
        return 0;
    }
}
