package com.teachMeSkills.an15.VorobyovSergey.hwSeven.Task2.model;

import java.io.Serializable;

public class PurchaseReceipt implements Serializable {
    private String customerName;
    private Basket customerBasket;
    private int discount;

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
