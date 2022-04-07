package com.teachMeSkills.an15.ShlyakhtichEvgeniy.hw8.model;

import java.io.Serializable;
import java.util.ArrayList;

public class ProductsDataBase implements Serializable {
    private ArrayList<Product> products;

    public ArrayList<Product> getProducts() {
        return products;
    }

    public void setProducts(ArrayList<Product> products) {
        this.products = products;
    }
}
