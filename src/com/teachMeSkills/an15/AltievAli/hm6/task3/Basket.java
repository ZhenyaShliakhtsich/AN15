package com.teachMeSkills.an15.AltievAli.hm6.task3;

import com.teachMeSkills.an15.AltievAli.hm6.task3.service.BasketService;

public class Basket implements BasketService {
    private Product[] purchasedGoods;
    private int size = 0;

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public Product[] getPurchasedGoods() {
        return purchasedGoods;
    }

    public void setPurchasedGoods(Product[] purchasedGoods) {
        this.purchasedGoods = purchasedGoods;
    }


    @Override
    public boolean addProduct(Product product) { //Not working!

        if (size < purchasedGoods.length) {
            purchasedGoods[size] = product;
            size++;
            System.out.println(product.productName + " was added to basket");
            return true;
        } else {
            System.out.println(product.productName + " could not be added to basket");
            return false;
        }
    }
}