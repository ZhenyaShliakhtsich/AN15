package com.teachMeSkills.an15.MatveevArtyom.hw8.service.impl;

import com.teachMeSkills.an15.MatveevArtyom.hw8.model.Product;
import com.teachMeSkills.an15.MatveevArtyom.hw8.model.User;
import com.teachMeSkills.an15.MatveevArtyom.hw8.service.PriceService;

import java.math.BigDecimal;
import java.util.Random;

public class PriceServiceImpl implements PriceService {
    @Override
    public BigDecimal calculateTotalBasketPrice(User user) {
        BigDecimal total = new BigDecimal(0);
        for(Product product : user.getBasket().getProducts()){
            total=total.add(product.getPrice());
        }
        return total;
    }

    @Override
    public int calculateDiscount() {
        Random random = new Random();
        return random.nextInt(31);
    }
}
