package com.teachMeSkills.an15.NovikovVadim.hw8.service.impl;

import com.teachMeSkills.an15.NovikovVadim.hw8.model.User;
import com.teachMeSkills.an15.NovikovVadim.hw8.service.PriceService;

import java.math.BigDecimal;

public class PriceServiceImpl implements PriceService {
    @Override
    public BigDecimal calculateDiscount(User user, Integer discount) {
        BigDecimal price = user.getBasket().getTotalPrice();

        BigDecimal discountPrice = price.subtract(price.divide(new BigDecimal("100"))
                .multiply(new BigDecimal(Integer.toString(discount))));

        return discountPrice;
    }

    @Override
    public int calculateDiscount() {
        return 0;
    }
}
