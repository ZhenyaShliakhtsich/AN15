package com.teachMeSkills.an15.ShlyakhtichEvgeniy.hw8.service.impl;

import com.teachMeSkills.an15.ShlyakhtichEvgeniy.hw8.model.Product;
import com.teachMeSkills.an15.ShlyakhtichEvgeniy.hw8.model.User;
import com.teachMeSkills.an15.ShlyakhtichEvgeniy.hw8.service.PriceService;

import java.math.BigDecimal;
import java.util.Random;

public class PriceServiceImpl implements PriceService {
    @Override
    public void calculateTotalBasketPrice(User user) {
        BigDecimal totalPrice = new BigDecimal(0);
        for (Product product : user.getBasket().getProducts()) {
            totalPrice = totalPrice.add(product.getPrice());
        }
        user.getBasket().setTotalPrice(totalPrice);
    }

    @Override
    public int calculateDiscount() {
        Random random = new Random();
        return random.nextInt(31);
    }

    @Override
    public BigDecimal calculateTotalBasketPriceWithDiscount(User user) {
        return user.getBasket().getTotalPrice().subtract(calculateDiscountPrice(user));
    }

    @Override
    public BigDecimal calculateDiscountPrice(User user) {
        BigDecimal discount = BigDecimal.valueOf( (double)calculateDiscount() / 100);
        return user.getBasket().getTotalPrice().multiply(discount);
    }
}
