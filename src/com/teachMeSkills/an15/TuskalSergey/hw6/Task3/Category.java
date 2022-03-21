package com.teachMeSkills.an15.TuskalSergey.hw6.Task3;

import java.util.Arrays;
import java.util.Objects;

public class Category {
    String name;
    Item[] items;

    public Category() {
    }

    public Category(String name, Item[] items) {
        this.name = name;
        this.items = items;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Item[] getItems() {
        return items;
    }

    public void setItems(Item[] items) {
        this.items = items;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Category category = (Category) o;
        return Objects.equals(name, category.name) && Arrays.equals(items, category.items);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(name);
        result = 31 * result + Arrays.hashCode(items);
        return result;
    }

    @Override
    public String toString() {
        return "Category{" +
                "name='" + name + '\'' +
                ", items=" + Arrays.toString(items) +
                '}';
    }

    public void add(Item item) {
    }
}
