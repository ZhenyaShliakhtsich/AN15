package com.teachMeSkills.an15.MatveevArtyom.hw8.service;

import com.teachMeSkills.an15.MatveevArtyom.hw8.model.User;

public interface PriceService {
    void calculateTotalBasketPrice(User user);

    int calculateDiscount();
}
