package com.teachMeSkills.an15.ShlyakhtichEvgeniy.hw8.service;

import com.teachMeSkills.an15.ShlyakhtichEvgeniy.hw8.model.User;

import java.math.BigDecimal;

public interface PriceService {
    BigDecimal calculateTotalBasketPrice(User user);

    int calculateDiscount();
}
