package com.teachMeSkills.an15.LashkevichGeorgy.hw6.task3.classes;

import java.util.Arrays;

public class Category {
    protected String name;
    protected Product[] goods;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Product[] getGoods() {
        return goods;
    }

    public void setGoods(Product[] goods) {
        this.goods = goods;
    }

    @Override
    public String toString() {
        return "Category{" +
                "name='" + name + '\'' +
                ", goods=" + Arrays.toString(goods) +
                '}';
    }
}
