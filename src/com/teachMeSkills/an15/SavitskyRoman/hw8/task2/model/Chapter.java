package com.teachMeSkills.an15.SavitskyRoman.hw8.task2.model;

import java.util.ArrayList;

public class Chapter {
    private String name;
    private ArrayList<Product> productArrayList = new ArrayList<>();

    public void setProduct(Product product){
        productArrayList.add(product);
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public ArrayList<Product> getProductArrayList() {
        return productArrayList;
    }

    public void setProductArrayList(ArrayList<Product> productArrayList) {
        this.productArrayList = productArrayList;
    }

    @Override
    public String toString() {
        return "Chapter{" +
                "name='" + name + '\'' +
                ", productArrayList=" + productArrayList +
                '}';
    }
}
