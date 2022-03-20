package com.teachMeSkills.an15.TuskalSergey.hw6.Task3;

import java.util.Objects;

public class Item {
String name;
double price;
double rating;

    public Item() {
    }

    public Item(String name, double price, double rating) {
        this.name = name;
        this.price = price;
        this.rating = rating;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = this.name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Item item = (Item) o;
        return price == item.price && Double.compare(item.rating, rating) == 0 && Objects.equals(name, item.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, price, rating);
    }

    @Override
    public String toString() {
        return "Товар - " + name +
                ", цена - " + price +
                ", рейтинг - " + rating;
    }
}
