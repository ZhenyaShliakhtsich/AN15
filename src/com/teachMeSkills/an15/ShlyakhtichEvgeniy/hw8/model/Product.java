package com.teachMeSkills.an15.ShlyakhtichEvgeniy.hw8.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Objects;

public class Product {
    private String name;
    private BigDecimal price;
    private double avgRate;
    private int amount;
    private ArrayList<String> comments;
    private HashSet<String> carNames;
    private ArrayList<Integer> rates;

    public Product(String name, BigDecimal price, int amount, ArrayList<String> comments, HashSet<String> carNames, ArrayList<Integer> rates) {
        this.name = name;
        this.price = price;
        this.amount = amount;
        this.comments = comments;
        this.carNames = carNames;
        this.rates = rates;
    }

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

    public ArrayList<String> getComments() {
        return comments;
    }

    public void setComments(ArrayList<String> comments) {
        this.comments = comments;
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
    public String toString() {
        return
                 name +
                "\nЦена :" + price +
                "\nКоличество : " + amount +
                "\nОтзывы : " + comments +
                "\nМашины,к которым подходит : " + carNames;
    }
}


