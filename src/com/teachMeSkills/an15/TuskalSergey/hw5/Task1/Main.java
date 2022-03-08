package com.teachMeSkills.an15.TuskalSergey.hw5.Task1;

public class Main {

    public static void main(String[] args) {
        powerInKilowatts();

        PassengerTransport pt1 = new PassengerTransport(150, 200, 2000, "Volvo",
                "hatchback", 4, 4, 10.5);
        System.out.println(pt1);

        passengerTransportMethod(pt1, 2.5);

        FreightTransport fr1 = new FreightTransport(300, 150, 5000, "Volvo", 4,
                15, 3000);
        System.out.println(fr1);

        FreightTransport fr2 = new FreightTransport(300, 150, 5000, "Volvo", 4,
                15, 2500);
        System.out.println(fr2);

        freightTransportMethod(fr1, 2700);
        freightTransportMethod(fr2, 2700);

        CivilTransport ct1 = new CivilTransport(1000, 1000, 20000, "Airbus", 100,
                500, 50, true);
        System.out.println(ct1);

        CivilTransport ct2 = new CivilTransport(1000, 1000, 20000, "Airbus", 100,
                500, 60, true);
        System.out.println(ct2);

        civilTransportMethod(ct1, 55);
        civilTransportMethod(ct2, 55);

        MilitaryTransport mt1 = new MilitaryTransport(1000, 1000, 10000,
                "A-10C Thunderbolt II", 70, 1000, true, 2);
        System.out.println(mt1);
        MilitaryTransport mt2 = new MilitaryTransport(1000, 1000, 10000,
                "A-10C Thunderbolt II", 70, 1000, false, 4);
        System.out.println(mt2);

        militaryTransportMethod(mt1, 4);
        militaryTransportMethod(mt2, 4);

        bailOutSystemMethod(mt1);
        bailOutSystemMethod(mt2);


    }

    public static double powerInKilowatts() {
        double p = 0.74 * Transport.power;
        return p;
    }

    private static double calculateFuelCounsumpion(double time) {
        double a = (PassengerTransport.fuelConsumption * PassengerTransport.maxSpeed * time) / 100;
        return a;
    }

    public static void passengerTransportMethod(PassengerTransport PassengerTransport, double time) {
        double b = PassengerTransport.maxSpeed * time;
        double c = calculateFuelCounsumpion(time);
        System.out.println("За время " + time + " ч автомобиль " + PassengerTransport.model
                + ", двигаясь с максимальной скоростью " + PassengerTransport.maxSpeed + " км/ч, проедет " + b
                + " км и израсходует " + c + " литров топлива.");
    }

    public static void freightTransportMethod(FreightTransport FreightTransport, int cargoWeight) {
        if (cargoWeight < FreightTransport.loadCapacity) {
            System.out.println("Грузовик загружен");
        } else System.out.println("Вам нужен грузовик побольше");
    }

    public static void civilTransportMethod(CivilTransport CivilTransport, int numberOfPassengers) {
        if (numberOfPassengers < CivilTransport.numberOfPassengers) {
            System.out.println("Самолет загружен");
        } else System.out.println("Вам нужен самолет побольше");
    }

    public static void militaryTransportMethod(MilitaryTransport MilitaryTransport, int numberOfShots) {
        for (int i = 1; i <= numberOfShots; i++) {
            if (MilitaryTransport.numberOfRockets > 0) {
                System.out.println(i + "-я ракета пошла");
                MilitaryTransport.numberOfRockets--;
            } else {
                System.out.println("Боеприпасы отсутствуют");
                break;
            }
        }
    }

    public static void bailOutSystemMethod(MilitaryTransport MilitaryTransport) {
        if (MilitaryTransport.bailoutSystem == true) {
            System.out.println("Катапультирование прошло успешно");
        } else System.out.println("У вас нет такой системы");
    }
}
