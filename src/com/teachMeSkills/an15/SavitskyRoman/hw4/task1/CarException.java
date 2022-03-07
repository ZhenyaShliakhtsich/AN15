package com.teachMeSkills.an15.SavitskyRoman.hw4.task1;

public class CarException extends Exception {

    private final int speed;
    private final String brand;

    public CarException(int speed, String brand) {
        this.speed = speed;
        this.brand = brand;
    }

    public void getE() {
        System.out.println("Гаи машину марки " + brand + " остановила по причине: чудит со скоросью " + speed);
    }
}
