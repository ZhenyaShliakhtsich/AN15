package com.teachMeSkills.an15.AltievAli.hm6.task3;

import java.util.Arrays;

public class Category {
    private String name;
    private Product[] products;

    public Category(String name, Product[] products) {
        this.name = name;
        this.products = products;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Product[] getProducts() {
        return products;
    }

    public void setProducts(Product[] products) {
        this.products = products;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        return stringBuilder.append("Category: ")
                .append(name)
                .append(Arrays.toString(products)).toString();
    }
}

