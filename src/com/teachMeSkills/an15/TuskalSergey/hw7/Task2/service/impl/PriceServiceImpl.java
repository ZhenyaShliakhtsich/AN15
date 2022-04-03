package com.teachMeSkills.an15.TuskalSergey.hw7.Task2.service.impl;

import com.teachMeSkills.an15.TuskalSergey.hw7.Task2.model.Product;
import com.teachMeSkills.an15.TuskalSergey.hw7.Task2.model.User;
import com.teachMeSkills.an15.TuskalSergey.hw7.Task2.service.PriceService;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class PriceServiceImpl implements PriceService {

    @Override
    public BigDecimal calculateTotalBasketPrice(User user) {
        BigDecimal totalPrice = new BigDecimal(0).setScale(2, RoundingMode.HALF_UP);
        try {
            if (user.getBasket().getProducts().size() != 0) {
                System.out.println("Товары в корзине:");
                for (Product p : user.getBasket().getProducts()) {
                    System.out.println(p.getName() + ", цена: " + p.getPrice());
                }
                for (Product p : user.getBasket().getProducts()) {
                    totalPrice = totalPrice.add(p.getPrice());
                }
                System.out.println("Общая стоимость всех товаров в корзине - " + totalPrice);
            } else System.out.println("В Вашей корзине нет товаров.");
        } catch (NullPointerException e) {
            System.out.println("В Вашей корзине нет товаров.");
        }
        return totalPrice;
    }


    @Override
    public int calculateDiscount() {
        int discount = (int) (Math.random() * 31);
        System.out.println("Ваша скидка - " + discount + "%.");
        return discount;
    }
}
