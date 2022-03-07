package com.teachMeSkills.an15.SavitskyRoman.hw4.task1;

public class CarPark {
    public static void main(String[] args) {
        Car[] car = new Car[3];
        car[0] = new Car("BMW", 210, 67.900);
        car[1] = new Car("VW", 170, 17.500);
        car[2] = new Car("Audi", 250, 87.800);

        for (Car value : car) {
            try {
                value.start();
            } catch (CarException e) {
                e.getE();
            }
        }

    }
}
