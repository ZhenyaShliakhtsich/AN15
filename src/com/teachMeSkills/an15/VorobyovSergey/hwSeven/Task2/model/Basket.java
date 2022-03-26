package com.teachMeSkills.an15.VorobyovSergey.hwSeven.Task2.model;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Objects;

public class Basket {
    private HashSet<Product> products;
    private BigDecimal totalPrice;

    public HashSet<Product> getProducts() {
        return products;
    }

    public void setProducts(HashSet<Product> products) {
        this.products = products;
    }

    public BigDecimal getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(BigDecimal totalPrice) {
        this.totalPrice = totalPrice;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Basket basket = (Basket) o;
        return Objects.equals(products, basket.products) && Objects.equals(totalPrice, basket.totalPrice);
    }

    @Override
    public int hashCode() {
        return Objects.hash(products, totalPrice);
    }

    @Override
    public String toString() {
        return "Basket{" +
                "products=" + products +
                ", totalPrice=" + totalPrice +
                '}';
    }
}
