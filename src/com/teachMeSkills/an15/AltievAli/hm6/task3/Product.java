package com.teachMeSkills.an15.AltievAli.hm6.task3;

public class Product {
    String productName;
    int price;
    int rating;

    public Product(String productName, int price, int rating) {
        this.productName = productName;
        this.price = price;
        this.rating = rating;
    }


    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();

        return stringBuilder.append("Product Name: ")
                .append(productName).append("| Price: ")
                .append(price).append("| Rating: ").append(rating).toString();
    }
}
