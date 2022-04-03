package com.teachMeSkills.an15.classes.class9;

import java.io.Serializable;
import java.util.Objects;

public class Receipt implements Serializable {
    private transient int price;
    private transient String name;

    public Receipt(int price) {
        this.price = price;
    }

    public Receipt(int price, String name) {
        this.price = price;
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(int price) {
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
        return Double.compare(receipt.price, price) == 0 && Objects.equals(name, receipt.name);
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
}
