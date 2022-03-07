package com.teachMeSkills.an15.MatveevArtyom.hw5.Inheritance;

public class MainTransport {
    public static void main(String[] args) {
        PassengerCar passengerCar = new PassengerCar();
        passengerCar.fuelConsumption = 7;
        passengerCar.maxSpeed = 240;
        passengerCar.model = "Audi";
        passengerCar.calculation(3);
        Truck truck = new Truck();
        truck.maxSpeed = 180;
        truck.loadCapacity = 3;
        truck.howMuch(2);
        WarTransport warTransport = new WarTransport();
        warTransport.isEjectionSystem = true;
        warTransport.countOfRockets = 4;
        warTransport.shot();
        warTransport.ejection();
        CivilTransport civilTransport = new CivilTransport();
        civilTransport.countOfPassengers = 4;
        civilTransport.howMuch(5);
    }
}
