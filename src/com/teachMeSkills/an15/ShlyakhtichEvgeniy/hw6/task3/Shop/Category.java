package com.teachMeSkills.an15.ShlyakhtichEvgeniy.hw6.task3.Shop;

import java.util.Arrays;

public class Category {
    private String name;
    private Product[] product;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Product[] getProduct() {
        return product;
    }

    public void setProduct(Product[] product) {
        this.product = product;
    }

    public Category(String name, Product[] product) {
        this.name = name;
        this.product = product;
    }

    @Override
    public String toString() {
        return "Продукты кадегории " + name +
                " : " + Arrays.toString(product) ;
    }
}
