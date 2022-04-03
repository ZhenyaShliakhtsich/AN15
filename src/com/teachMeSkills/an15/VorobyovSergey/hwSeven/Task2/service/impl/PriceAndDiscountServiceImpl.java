package com.teachMeSkills.an15.VorobyovSergey.hwSeven.Task2.service.impl;

import com.teachMeSkills.an15.VorobyovSergey.hwSeven.Task2.model.Product;
import com.teachMeSkills.an15.VorobyovSergey.hwSeven.Task2.model.PurchaseReceipt;
import com.teachMeSkills.an15.VorobyovSergey.hwSeven.Task2.model.User;
import com.teachMeSkills.an15.VorobyovSergey.hwSeven.Task2.service.PriceServiceAndDiscount;

import java.math.BigDecimal;
import java.util.Random;

public class PriceAndDiscountServiceImpl implements PriceServiceAndDiscount {
    @Override
    public PurchaseReceipt calculateTotalBasketPrice(User user) {
        BigDecimal price = new BigDecimal(0);
        BigDecimal totalPrice = new BigDecimal(0);

        //Accumulate all basket prices;
        for (Product p : user.getBasket().getProducts()) {
            //Бывало что сюда прилетал null продукт
            if (p != null) {
                price = price.add(p.getPrice());
            }
        }
        System.out.println("Your price is: " + price);

        int discount = calculateDiscount();
        System.out.println("Your discout is: "
                + discount + "%");

        totalPrice = price.multiply(BigDecimal.valueOf(100 - discount)).multiply(BigDecimal.valueOf(0.01));
        System.out.println("Your total price is:" + totalPrice);

        //Create purchase receipt
        PurchaseReceipt receipt = new PurchaseReceipt();
        receipt.setDiscount(discount);
        receipt.setCustomerBasket(user.getBasket());
        receipt.setCustomerName(user.getLogin());
        receipt.setPrice(price);
        receipt.setTotalPrice(totalPrice);
        return receipt;
    }

    @Override
    public int calculateDiscount() {
        Random random = new Random();
        return random.nextInt(31);
    }
}
