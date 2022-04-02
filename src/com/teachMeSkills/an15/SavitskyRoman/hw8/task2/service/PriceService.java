package com.teachMeSkills.an15.SavitskyRoman.hw8.task2.service;

import com.teachMeSkills.an15.SavitskyRoman.hw8.task2.model.User;

public interface PriceService {
    String calculateTotalBasketPrice(User user);

    int calculateDiscount();
}
