package com.teachMeSkills.an15.BuzukArtyom.hw8.service;

import com.teachMeSkills.an15.BuzukArtyom.hw8.model.User;

import java.math.BigDecimal;

public interface PriceService {
    BigDecimal calculateTotalBasketPrice(User user);
    int calculateDiscount();
}
