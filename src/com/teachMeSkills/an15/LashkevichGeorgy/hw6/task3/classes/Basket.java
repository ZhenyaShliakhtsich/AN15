package com.teachMeSkills.an15.LashkevichGeorgy.hw6.task3.classes;

import java.util.Arrays;

public class Basket {
    private Product[] bought;

    @Override
    public String toString() {
        return "Basket{" +
                "bought=" + Arrays.toString(bought) +
                '}';
    }
}
