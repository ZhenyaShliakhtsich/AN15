package com.teachMeSkills.an15.NovikovVadim.hw6.store;

import java.util.Objects;

public class Product {
    private String name;
    private float cost;
    private int rank;

    public Product() {
    }

    public Product(String name, float cost, int rank) {
        this.name = name;
        this.cost = cost;
        this.rank = rank;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getCost() {
        return cost;
    }

    public void setCost(float cost) {
        this.cost = cost;
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", cost=" + cost +
                ", rank=" + rank +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Float.compare(product.cost, cost) == 0 && rank == product.rank && Objects.equals(name, product.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, cost, rank);
    }
}
