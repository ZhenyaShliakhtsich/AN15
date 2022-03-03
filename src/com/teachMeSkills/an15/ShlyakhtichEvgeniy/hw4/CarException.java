package com.teachMeSkills.an15.ShlyakhtichEvgeniy.hw4;

public class CarException extends  Exception {
    int start;

    public CarException(int start) {
        this.start = start;
    }
    // Можно было создать метод, в которой мы бы передавали марку машины и тогда конструктор не нужен
}
