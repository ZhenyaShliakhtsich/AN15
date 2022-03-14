package com.teachMeSkills.an15.VorobyovSergey.hwSix.Task3.models;

import java.util.ArrayList;

public class SvBasket {
    public ArrayList<SvProduct> productList;

    public SvBasket() {
        productList = new ArrayList<>();
    }

    public ArrayList<SvProduct> getProductList() {
        return productList;
    }

    public void setProductList(ArrayList<SvProduct> productList) {
        this.productList = productList;
    }

    public void addToBasket(SvProduct product) {
        this.productList.add(product);
    }

    public void removeFromBasket(SvProduct product) {
        this.productList.remove(product);
    }
}
