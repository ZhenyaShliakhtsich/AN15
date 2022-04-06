package com.teachMeSkills.an15.LashkevichGeorgy.hw7.Task2.service;



import com.teachMeSkills.an15.LashkevichGeorgy.hw7.Task2.models.User;

import java.math.BigDecimal;

public interface PriceService {
    BigDecimal calculateTotalBasketPrice(User user);
    int calculateDiscount();
}
