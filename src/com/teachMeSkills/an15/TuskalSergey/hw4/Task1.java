package com.teachMeSkills.an15.TuskalSergey.hw4;

public class Task1 {

    public static void main(String[] args) {
        Car car1 = new Car("Volkswagen Polo", 100, 10000);
        Car car2 = new Car("Volkswagen Jetta", 150, 15000);

        try { car1.start();
            System.out.println("Машина " + car1.model + " завелась");
        } catch (Exception e) {
            System.out.println("Машина " + car1.model + " не завелась");
        }


    }
}
