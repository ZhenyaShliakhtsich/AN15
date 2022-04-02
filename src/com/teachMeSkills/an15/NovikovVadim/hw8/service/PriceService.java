package com.teachMeSkills.an15.NovikovVadim.hw8.service;

import com.teachMeSkills.an15.NovikovVadim.hw8.model.User;

import java.math.BigDecimal;

public interface PriceService {
    BigDecimal calculateDiscount(User user, Integer discount);

    int calculateDiscount();
}
