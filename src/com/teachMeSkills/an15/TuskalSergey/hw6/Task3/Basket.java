package com.teachMeSkills.an15.TuskalSergey.hw6.Task3;

public class Basket extends Item{
    public Basket() {
    }

    public Basket(String name, double price, double rating) {
        super(name, price, rating);
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }

    @Override
    public double getPrice() {
        return super.getPrice();
    }

    @Override
    public void setPrice(double price) {
        super.setPrice(price);
    }

    @Override
    public double getRating() {
        return super.getRating();
    }

    @Override
    public void setRating(double rating) {
        super.setRating(rating);
    }
}
