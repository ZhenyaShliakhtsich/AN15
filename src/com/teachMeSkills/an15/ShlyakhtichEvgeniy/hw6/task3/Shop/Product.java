package com.teachMeSkills.an15.ShlyakhtichEvgeniy.hw6.task3.Shop;

public class Product {
    private String name;
    private double price;
    private double rate;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public Product(String name, double price, double rate) {
        this.name = name;
        this.price = price;
        this.rate = rate;
    }


    public void setPrice(double price) {
        this.price = price;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    @Override
    public String toString() {
        return  "Название : " + name +
                ", цена : " + price +
                " руб., рейтинг :" + rate;
    }
}
