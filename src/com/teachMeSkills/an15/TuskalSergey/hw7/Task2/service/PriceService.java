package com.teachMeSkills.an15.TuskalSergey.hw7.Task2.service;

import com.teachMeSkills.an15.TuskalSergey.hw7.Task2.model.User;

import java.math.BigDecimal;

public interface PriceService {
    BigDecimal calculateTotalBasketPrice(User user);
    int calculateDiscount();
}
