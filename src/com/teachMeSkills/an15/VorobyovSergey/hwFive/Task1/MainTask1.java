package com.teachMeSkills.an15.VorobyovSergey.hwFive.Task1;

class MainTask1 {
    public static void main(String[] args) {
        passengerTransportTest();
        freightTransportTest();
        civilPlainTest();
        militaryPlainTest();

    }

    private static void militaryPlainTest() {
        System.out.println("\nТестим военный самолет транспорт");
        MilitaryTransport jet = new MilitaryTransport();
        jet.setRocketNumber(3);
        jet.setEjectionSystem(true);
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
        plain.setPassengersNumber(100);
        plain.passengersCounter(100);
    }

    private static void freightTransportTest() {
        System.out.println("\nТестим грузовой транспорт");
        FreightTransport car = new FreightTransport();
        car.setWheelNumber(6);
        car.setWeight(5000);
        car.setHorsPower(630);
        car.setMaxSpeed(110);
        car.setBrandName("Man");
        car.setFuelConsumption(40);
        car.setLoadCapacity(10000);
        System.out.println(car.showTransportCharacteristics());

        car.cargoCounter(10000);
    }

    static void passengerTransportTest() {
        System.out.println("\nТестим легковой транспорт");
        PassengerTransport car = new PassengerTransport();
        car.setWheelNumber(4);
        car.setWeight(1500);
        car.setHorsPower(200);
        car.setMaxSpeed(230);
        car.setBrandName("Bmw");
        car.setFuelConsumption(20);
        car.setBodyType("Convertable");
        System.out.println(car.showTransportCharacteristics());

        car.trekCounter(10);
    }
}
