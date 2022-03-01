package com.teachMeSkills.an15.ShlyakhtichEvgeniy.hw4;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("Lada Granta", 50,1390);
        Car car2 = new Car("Lada Calina", 40, 1000);
        Car car3 = new Car("Lada Vesta", 60, 1500);

        try {
            car1.start();
            System.out.println(car1.start());
        } catch(CarException e){
            System.out.println("Машина марки "+ car1.model + " не завеелась");
        }
        try {
            car2.start();
            System.out.println(car2.start());
        } catch(CarException e){
            System.out.println("Машина марки "+ car2.model + " не завеелась");
        }
        try {
            car3.start();
            System.out.println(car3.start());
        } catch(CarException e){
            System.out.println("Машина марки "+ car3.model + " не завеелась");
        }
    }
}
