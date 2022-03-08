package com.teachMeSkills.an15.PilyushinYuri.hw5.Transport.transport;


import java.util.Scanner;

public class Main extends Transport {
    public  static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        LightCar car1 = new LightCar(250, 320, 2, "Audi", 4, 19, "SUV",
                4);
        System.out.println("введите время в пути: ");
        double time = scanner.nextDouble();
        System.out.println(car1.resultTime(time));
        System.out.println(car1.toDicplay());
        CargoTruck truck1= new CargoTruck(300,110,6, "MAZ", 6, 50, 10);
        System.out.println("Введите вес груза: ");
        int cargo = scanner.nextInt();
        truck1.toCanCarry(cargo);
        CivilAir air1 = new CivilAir(5000,800, 70, "Boeing", 40, 1500,
                240, true);
        System.out.println("Укажите количество имеющихся пасажиров: ");
        int passenger1 = scanner.nextInt();
        air1.toSeat(passenger1);
        MilitaryAir air = new MilitaryAir(900,420, 7, "mi-8", 9, 0,
                true, 40);
        air.toLaunch();
        air.toCatapult();
    }



}
