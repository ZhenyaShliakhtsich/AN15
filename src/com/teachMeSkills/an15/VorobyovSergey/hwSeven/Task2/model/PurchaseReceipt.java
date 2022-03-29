package com.teachMeSkills.an15.VorobyovSergey.hwSeven.Task2.model;

import java.io.Serializable;
import java.math.BigDecimal;

public class PurchaseReceipt implements Serializable {
    private String customerName;
    private Basket customerBasket;
    private int discount;
    private BigDecimal totalPrice;
    private BigDecimal price;

    public BigDecimal getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(BigDecimal totalPrice) {
        this.totalPrice = totalPrice;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public Basket getCustomerBasket() {
        return customerBasket;
    }

    public void setCustomerBasket(Basket customerBasket) {
        this.customerBasket = customerBasket;
    }

    public int getDiscount() {
        return discount;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }

    @Override
    public String toString() {
        return "PurchaseReceipt{" +
                "customerName='" + customerName + '\'' +
                ", customerBasket=" + customerBasket +
                ", discount=" + discount +
                '}';
    }
}
