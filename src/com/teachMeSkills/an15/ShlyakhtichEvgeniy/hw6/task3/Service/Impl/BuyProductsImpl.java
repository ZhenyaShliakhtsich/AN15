package com.teachMeSkills.an15.ShlyakhtichEvgeniy.hw6.task3.Service.Impl;

import com.teachMeSkills.an15.ShlyakhtichEvgeniy.hw6.task3.Service.BuyProducts;
import com.teachMeSkills.an15.ShlyakhtichEvgeniy.hw6.task3.Shop.Basket;

public class BuyProductsImpl implements BuyProducts {
    @Override
    public void buyProducts(Basket basket) {
        double sum = 0;
        for (int i = 0;i< basket.getProducts().size();i++){
            sum = sum +basket.getProducts().get(i).getPrice();
        }
        System.out.println("Сумма к оплате - "+ sum + " рублей");
        System.out.println("Карта или наличные?");
    }
}
