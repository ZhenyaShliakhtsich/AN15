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
        BigDecimal discount = new BigDecimal(calculateDiscount() / 100);
        BigDecimal discountPrice;
        discountPrice = totalPrice.multiply(discount);
        BigDecimal totalPriceWithDiscount;
        totalPriceWithDiscount = totalPrice.subtract(discountPrice);
        return totalPriceWithDiscount;
    }

    @Override
    public int calculateDiscount() {
        Random random = new Random();
        return random.nextInt(31);
    }
}
