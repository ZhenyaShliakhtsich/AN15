package com.teachMeSkills.an15.SavitskyRoman.hw8.task2.service;

import com.teachMeSkills.an15.SavitskyRoman.hw8.task2.model.User;

import java.math.BigDecimal;

public interface PriceService {
    BigDecimal calculateTotalBasketPrice(User user);
    int calculateDiscount();
}
