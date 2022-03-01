package com.teachMeSkills.an15.AltievAli.hm4.Task1;

public class ObjectsOfCar {

    public static void main(String[] args) throws CreatedException {

        //  я тут объявлял Unchecked exception и обработал exception

        Car Mercedes = new Car("Mercedes", 30.000, 240);
        try {
            Mercedes.startCar();
        } catch (CreatedException e) {

            System.out.println("Автомобиль  не завелась");
        }


         Car Samara15 = new Car("Samara",5.000,180);
        Samara15.startCar();




    }


}
