package com.teachMeSkills.an15.VorobyovSergey.hwSeven.Task2.service;

import com.teachMeSkills.an15.VorobyovSergey.hwSeven.Task2.model.PurchaseReceipt;
import com.teachMeSkills.an15.VorobyovSergey.hwSeven.Task2.model.User;

import java.math.BigDecimal;

public interface PriceServiceAndDiscount {
    PurchaseReceipt calculateTotalBasketPrice(User user);
    int calculateDiscount();
}
