package com.teachMeSkills.an15.VorobyovSergey.hwSix.Task3.models;

import java.util.ArrayList;

public class SvCatalog {
    private ArrayList<SvProduct> catalogList;

    public SvCatalog() {
        catalogList = new ArrayList<>();
    }

    public void addProduct(SvProduct product) {
        catalogList.add(product);
    }

    public ArrayList<SvProduct> getCatalogList() {
        return catalogList;
    }
}
