package com.teachMeSkills.an15.TuskalSergey.hw4;

public class Task1 {

    public static void main(String[] args) {
        Car car1 = new Car("Volkswagen Polo", 100, 10000);
        Car car2 = new Car("Volkswagen Jetta", 150, 15000);
        Car[] cars = {car1, car2};

        for (int i = 0; i < cars.length; i++) {
            try {
                cars[i].start();
                if (cars[i].start() == false) {
                    throw new Exception();
                }
                System.out.println("Машина " + cars[i].model + " завелась");
            } catch (Exception f) {
                System.out.println("Машина " + cars[i].model + " не завелась");
            }
        }


    }
}
