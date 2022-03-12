package com.teachMeSkills.an15.MatveevArtyom.hw6.Inheritance.task1;

import com.teachMeSkills.an15.MatveevArtyom.hw6.Inheritance.task1.airTransport.CivilTransport;
import com.teachMeSkills.an15.MatveevArtyom.hw6.Inheritance.task1.airTransport.WarTransport;
import com.teachMeSkills.an15.MatveevArtyom.hw6.Inheritance.task1.groundTransport.PassengerCar;
import com.teachMeSkills.an15.MatveevArtyom.hw6.Inheritance.task1.groundTransport.Truck;
import com.teachMeSkills.an15.MatveevArtyom.hw6.Inheritance.task1.service.*;
import com.teachMeSkills.an15.MatveevArtyom.hw6.Inheritance.task1.service.impl.*;

public class MainTransport {
    public static void main(String[] args) {
        TransportMethods transportMethods = new TransportMethodsImpl();
        PassengerCar passengerCar = new PassengerCar();
        passengerCar.setMaxSpeed(240);
        passengerCar.setFuelConsumption(7.4);
        passengerCar.setPower(40);
        passengerCar.setModel("Audi");
        LightTransportMethods lightTransportMethods = new LightTransportMethodsImpl();
        lightTransportMethods.printCalculationResult(4, passengerCar);
        Truck truck = new Truck();
        truck.setWeight(4000);
        TruckMethods truckMethods = new TruckMethodsImpl();
        truckMethods.printResult(6000, truck);
        CivilTransport civilTransport = new CivilTransport();
        civilTransport.setCountOfPassengers(81);
        CivilTransportMethods civilTransportMethods = new CivilTransportMethodsImpl();
        civilTransportMethods.printResult(45, civilTransport);
        WarTransport warTransport = new WarTransport();
        warTransport.setEjectionSystem(true);
        warTransport.setCountOfRockets(0);
        WarTransportMethods warTransportMethods = new WarTransportMethodsImpl();
        warTransportMethods.printShot(warTransport);
        warTransportMethods.printEjection(warTransport);
    }
}
