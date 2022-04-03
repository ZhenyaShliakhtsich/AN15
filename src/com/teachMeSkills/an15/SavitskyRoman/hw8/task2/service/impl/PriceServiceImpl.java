package com.teachMeSkills.an15.SavitskyRoman.hw8.task2.service.impl;

import com.teachMeSkills.an15.SavitskyRoman.hw8.task2.model.User;
import com.teachMeSkills.an15.SavitskyRoman.hw8.task2.service.PriceService;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Random;

public class PriceServiceImpl implements PriceService {
    @Override
    public String calculateTotalBasketPrice(User user) {
        int discount = calculateDiscount();
        double x = (double) (100 - discount) / 100;
        BigDecimal bigDecimal = user.getBasket().getTotalPrice().multiply(BigDecimal.valueOf(x)).
                setScale(2, RoundingMode.HALF_UP);
        System.out.println("Цена за товары: " + user.getBasket().getTotalPrice() + "\nВаша скидка: "
                + discount + "%\nИтоговая сумма со скидкой: " + bigDecimal);
        String s = "Цена за товары: " + user.getBasket().getTotalPrice() + "\nВаша скидка: "
                + discount + "%\nИтоговая сумма со скидкой: " + bigDecimal;
        return s;
    }

    @Override
    public int calculateDiscount() {
        Random random = new Random();
        return random.nextInt(30) + 1;
    }
}
