package com.teachMeSkills.an15.ShlyakhtichEvgeniy.hw8.service;

import com.teachMeSkills.an15.ShlyakhtichEvgeniy.hw8.model.User;

import java.math.BigDecimal;

public interface PriceService {
    BigDecimal calculateTotalBasketPriceWithDiscount(User user);

    void calculateTotalBasketPrice(User user);

    BigDecimal calculateDiscountPrice(User user);

    int calculateDiscount();

}
