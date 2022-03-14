package com.teachMeSkills.an15.VorobyovSergey.hwSix.Task3.models;

import com.teachMeSkills.an15.VorobyovSergey.hwSix.Task3.enums.ProductCategory;
import com.teachMeSkills.an15.VorobyovSergey.hwSix.Task3.enums.ProductRank;

public class SvProduct {
    //Так целесообразнее. Категории не перепутаются.
    //В дальнейшем можно сделать списком, если товар относится к нескольким категориям.
    //Для простоты пока-что у товара 1 категория
    private ProductCategory productCategory;
    private String productName;
    private int productPrice;
    private ProductRank productRank;

    public SvProduct(ProductCategory productCategory, String productName, int productPrice, ProductRank productRank) {
        this.productCategory = productCategory;
        this.productName = productName;
        this.productPrice = productPrice;
        this.productRank = productRank;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(int productPrice) {
        this.productPrice = productPrice;
    }

    public ProductRank getProductRank() {
        return productRank;
    }

    public void setProductRank(ProductRank productRank) {
        this.productRank = productRank;
    }

    public ProductCategory getProductCategory() {
        return productCategory;
    }

    public void setProductCategory(ProductCategory productCategory) {
        this.productCategory = productCategory;
    }

    @Override
    public String toString() {
        return "SvProduct{" +
                "productName='" + productName + '\'' +
                ", productPrice=" + productPrice +
                ", productRank=" + productRank +
                ", productCategory=" + productCategory +
                '}';
    }
}
