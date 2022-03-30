package com.teachMeSkills.an15.ShlyakhtichEvgeniy.hw8.service.impl;

import com.teachMeSkills.an15.ShlyakhtichEvgeniy.hw8.model.Product;
import com.teachMeSkills.an15.ShlyakhtichEvgeniy.hw8.model.User;
import com.teachMeSkills.an15.ShlyakhtichEvgeniy.hw8.service.PriceService;

import java.math.BigDecimal;
import java.util.Random;

public class PriceServiceImpl implements PriceService {
    @Override
    public BigDecimal calculateTotalBasketPrice(User user) {
        BigDecimal totalPrice = new BigDecimal(0);
        for (Product product : user.getBasket().getProducts()) {
            totalPrice = totalPrice.add(product.getPrice());
        }
        return totalPrice;
    }

    @Override
    public int calculateDiscount() {
        Random random = new Random();
        return random.nextInt(31);
    }

    @Override
    public BigDecimal calculateTotalBasketPriceWithDiscount(User user) {
        BigDecimal totalPriceWithDiscount = calculateTotalBasketPrice(user).subtract(calculateDiscountPrice(user));
        return totalPriceWithDiscount;
    }

    @Override
    public BigDecimal calculateDiscountPrice(User user) {
        BigDecimal discount = BigDecimal.valueOf( (double)calculateDiscount() / 100);
        BigDecimal discountPrice = calculateTotalBasketPrice(user).multiply(discount);
        return discountPrice;
    }
}
