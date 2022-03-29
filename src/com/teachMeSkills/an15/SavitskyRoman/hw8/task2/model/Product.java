package com.teachMeSkills.an15.SavitskyRoman.hw8.task2.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Objects;

public class Product {
    private String name;
    private BigDecimal price;
    private double avgRate;
    private int amount;
    private String comment;
    private HashSet<String> carNames = new HashSet<>();
    private ArrayList<Integer> rates;

    public Product(String name, BigDecimal price, int amount, String comment, String...carNames) {
        this.name = name;
        this.price = price;
        this.amount = amount;
        this.comment = comment;
        for(int x = 0; x < carNames.length; x++){
            this.carNames.add(carNames[x]);
        }
    }

   /* public Product(String name, BigDecimal price, int amount, String comment, HashSet<String> carNames) {
        this.name = name;
        this.price = price;
        this.amount = amount;
        this.comment = comment;
        this.carNames = carNames;
    }*/

    public Product() {
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
        this.carNames = carNames;
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
        return Double.compare(product.avgRate, avgRate) == 0 && amount == product.amount && Objects.equals(name, product.name) && Objects.equals(price, product.price) && Objects.equals(comment, product.comment) && Objects.equals(carNames, product.carNames) && Objects.equals(rates, product.rates);
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
