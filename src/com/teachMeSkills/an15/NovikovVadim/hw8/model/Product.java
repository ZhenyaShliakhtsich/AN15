package com.teachMeSkills.an15.NovikovVadim.hw8.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;

public class Product implements Serializable {
    private String name;
    private BigDecimal price;
    private double avgRate;
    private int amount;
    private String comment;
    private HashSet<String> carNames;
    private ArrayList<Integer> rates;

    public Product(String name, BigDecimal price, int amount, String comment, HashSet<String> carNames) {
        this.name = name;
        this.price = price;
        this.amount = amount;
        this.comment = comment;

        this.carNames.clear();
        Iterator<String> iter = carNames.iterator();
        while (iter.hasNext()) {
            String str = iter.next().toUpperCase();
            this.carNames.add(str);
        }

    }

    public Product() {
        this.carNames = new HashSet<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public double getAvgRate() {
        return avgRate;
    }

    public void setAvgRate(double avgRate) {
        this.avgRate = avgRate;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public HashSet<String> getCarNames() {
        return carNames;
    }

    public void setCarNames(HashSet<String> carNames) {

        this.carNames.clear();
        Iterator<String> iter = carNames.iterator();
        while (iter.hasNext()) {
            String str = iter.next().toUpperCase();
            this.carNames.add(str);
        }
    }

    public ArrayList<Integer> getRates() {
        return rates;
    }

    public void setRates(ArrayList<Integer> rates) {
        this.rates = rates;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Objects.equals(name, product.name) && Objects.equals(price, product.price);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, price, avgRate, amount, comment, carNames, rates);
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", avgRate=" + avgRate +
                ", amount=" + amount +
                ", comment='" + comment + '\'' +
                ", carNames=" + carNames +
                ", rates=" + rates +
                '}';
    }
}
