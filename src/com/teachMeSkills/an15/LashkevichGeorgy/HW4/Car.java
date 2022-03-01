package com.teachMeSkills.an15.LashkevichGeorgy.HW4;



public class Car {
    static String mark;
    int speed;
    int price;

    public Car(String mark, int speed, int price) {
        this.mark = mark;
        this.speed = speed;
        this.price = price;
    }


    public Car() {
    }

    class MyExcep extends Exception {
        public String toString() {
            return "Автомобиль марки " + mark + " не завелся";
        }
    }

    public void start() {
        int num = (int) (Math.random() * 21);
        try {
            if (num % 2 == 0) {
                throw new MyExcep();
            } else System.out.println("Автомобиль марки " + mark + " завелся");
        } catch (MyExcep e) {
            System.out.println(e.toString());
        }
    }


    public static void main(String[] args) {
        Car car1 = new Car("Raketa", 120, 100000);
        car1.start();
        Car car2 = new Car("Pulya", 130, 200000);
        car2.start();
        Car car3 = new Car("Super", 140, 300000);
        car3.start();


    }
}
