package com.teachMeSkills.an15.NovikovVadim.hw8.model;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Objects;

public class Receipt {
    private BigDecimal price;
    private BigDecimal discount;
    private String name;
    private transient HashMap<Product, Integer> products;

    public Receipt(BigDecimal price) {
        this.price = price;
        this.price = new BigDecimal("0");
    }

    public Receipt(BigDecimal price, String name) {
        this.price = price;
        this.name = name;
        this.discount = new BigDecimal("0");
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Receipt receipt = (Receipt) o;
        return receipt.price.compareTo(price) == 0 && Objects.equals(name, receipt.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(price, name);
    }

    @Override
    public String toString() {
        return "Receipt{" +
                "price=" + price +
                ", name='" + name + '\'' +
                '}';
    }

    public BigDecimal getDiscount() {
        return discount;
    }

    public void setDiscount(BigDecimal discount) {
        this.discount = discount;
    }
}
