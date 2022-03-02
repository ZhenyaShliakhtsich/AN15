package com.teachMeSkills.an15.PilyushinYuri.hw4;


import java.lang.reflect.Array;

public class Auto {

    public static void main(String[] args) throws MyExeption {
        Car car1 = new Car("Volvo", 150, 2000);
        Car car2 = new Car("BMW",200,10000);
        Car car3 = new Car("Renault", 250, 25000);

        try {
            car1.toStartCar();
            System.out.println("Машина " + car1.model + " заведена");
        } catch (MyExeption e) {
            e.printStackTrace();
        }
        try {
            car2.toStartCar();
            System.out.println("Машина " + car2.model + " заведена");
        } catch (MyExeption e) {
            e.printStackTrace();
        }
        try {
            car3.toStartCar();
            System.out.println("Машина " + car3.model + " заведена");
        } catch (MyExeption e) {
            e.printStackTrace();
        }
    }
}