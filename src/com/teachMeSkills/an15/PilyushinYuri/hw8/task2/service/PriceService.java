package com.teachMeSkills.an15.PilyushinYuri.hw8.task2.service;

import com.teachMeSkills.an15.PilyushinYuri.hw8.task2.model.User;

import java.io.File;
import java.io.IOException;
import java.math.BigDecimal;

public interface PriceService {
    BigDecimal calculateTotalBasketPrice(User user) throws IOException;
    int calculateDiscount();
    void receipt(User user) throws IOException;
}
