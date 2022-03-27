package com.teachMeSkills.an15.PilyushinYuri.hw8.task2.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Objects;

public class Receipt implements Serializable {
    private String name;
    private BigDecimal total;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getTotal() {
        return total;
    }

    public void setTotal(BigDecimal total) {
        this.total = total;
    }

    @Override
    public String toString() {
        return "Receipt{" +
                "name='" + name + '\'' +
                ", total=" + total +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Receipt receipt = (Receipt) o;
        return Objects.equals(name, receipt.name) && Objects.equals(total, receipt.total);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, total);
    }
}
