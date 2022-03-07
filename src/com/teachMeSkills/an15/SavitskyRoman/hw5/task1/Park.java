package com.teachMeSkills.an15.SavitskyRoman.hw5.task1;

public class Park {
    public static void main(String[] args) {
        CargoTransport lory = new CargoTransport(160, 120, 3200,
                "Kamaz", 6, 30, 35);
        System.out.println(lory);
        lory.capacity(36);

        PassengerCar polo = new PassengerCar(110, 170, 1100, "VW", 4,
                7.3, "sedan", 5);
        polo.getCalculationOfSpentFuel(3.5);

        CivilPlane airbus = new CivilPlane(1000, 800, 6000, "Аэрофлот", 15,
                2000, 180, true);
        airbus.capacity(200);

        MilitaryPlane stealth = new MilitaryPlane(3000, 3600, 2000, "Stealth",
                13, 2000, true, 20);
        stealth.shot();
        stealth.shot();
        stealth.setQuantityOfMissiles(5);
        stealth.shot();
        stealth.ejection();
    }
}
