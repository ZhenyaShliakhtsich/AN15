package com.teachMeSkills.an15.VorobyovSergey.hwSeven.Task2.service.impl;

import com.teachMeSkills.an15.VorobyovSergey.hwSeven.Task2.model.Product;
import com.teachMeSkills.an15.VorobyovSergey.hwSeven.Task2.model.User;
import com.teachMeSkills.an15.VorobyovSergey.hwSeven.Task2.service.PriceServiceAndDiscount;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;

public class PriceAndDiscountServiceImpl implements PriceServiceAndDiscount {
    @Override
    public BigDecimal calculateTotalBasketPrice(User user) {
        BigDecimal totalPrice = new BigDecimal(0);

        //Accumulate all basket prices;
        for (Product p: user.getBasket().getProducts()){
            totalPrice = totalPrice.add(p.getPrice());
        }
        System.out.println("Your total price is: " + totalPrice);

        int discount = calculateDiscount();
        System.out.println("Your discout is: "
                + discount + "%");

        totalPrice = totalPrice.multiply(BigDecimal.valueOf(100-discount)).multiply(BigDecimal.valueOf(0.01));
        System.out.println("Your final price is:" + totalPrice);

//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Введи ОПЛАЧИВАЮ если хочешь оплатить корзину");
//        if (scanner.nextLine().equalsIgnoreCase("ОПЛАЧИВАЮ")){
//            System.out.println("Оплачено!!!");
//            user.getBasket().getProducts().removeAll(user.getBasket().getProducts());
//        }
        return totalPrice;
    }

    @Override
    public int calculateDiscount() {
        Random random = new Random();
        return random.nextInt(30);
    }
}
