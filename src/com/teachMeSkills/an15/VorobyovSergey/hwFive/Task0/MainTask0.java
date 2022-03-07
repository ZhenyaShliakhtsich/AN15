package com.teachMeSkills.an15.VorobyovSergey.hwFive.Task0;

class MainTask0 {
    public static void main(String[] args) {
        passengerTransportTest();
        freightTransportTest();
        civilPlainTest();
        militaryPlainTest();

    }

    private static void militaryPlainTest() {
        System.out.println("\nТестим военный самолет транспорт");
        MilitaryTransport jet = new MilitaryTransport();
        jet.rocketNumber = 3;
        jet.ejectionSystem = true;
        jet.ejectionSystemChecker();
        jet.rocketShot();
        jet.rocketShot();
        jet.rocketShot();
        jet.rocketShot();
        jet.rocketShot();
    }

    private static void civilPlainTest() {
        System.out.println("\nТестим гражданский самолет транспорт");
        CivilTransport plain = new CivilTransport();
        plain.passengersNumber = 100;
        plain.passengersCounter(100);
    }

    private static void freightTransportTest() {
        System.out.println("\nТестим грузовой транспорт");
        FreightTransport car = new FreightTransport();
        car.wheelNumber = 6;
        car.weight = 5000;
        car.horsPower = 630;
        car.maxSpeed = 110;
        car.brandName = "Man";
        car.fuelConsumption = 40;
        car.loadCapacity = 10000;
        System.out.println(car.showTransportCharacteristics());

        car.cargoCounter(10000);
    }

    static void passengerTransportTest() {
        System.out.println("\nТестим легковой транспорт");
        PassengerTransport car = new PassengerTransport();
        car.wheelNumber = 4;
        car.weight = 1500;
        car.horsPower = 200;
        car.maxSpeed = 230;
        car.brandName = "Bmw";
        car.fuelConsumption = 20;
        car.bodyType = "Convertable";
        System.out.println(car.showTransportCharacteristics());

        car.trekCounter(10);
    }
}
