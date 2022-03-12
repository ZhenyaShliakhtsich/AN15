package com.teachMeSkills.an15.VorobyovSergey.hwSix;

import com.teachMeSkills.an15.VorobyovSergey.hwSix.Task1.models.TransportAir.SvTransportAirCivil;
import com.teachMeSkills.an15.VorobyovSergey.hwSix.Task1.models.TransportAir.SvTransportAirMilitary;
import com.teachMeSkills.an15.VorobyovSergey.hwSix.Task1.models.TransportGround.SvTransportGroundFreight;
import com.teachMeSkills.an15.VorobyovSergey.hwSix.Task1.models.TransportGround.SvTransportGroundPassenger;
import com.teachMeSkills.an15.VorobyovSergey.hwSix.Task1.services.*;
import com.teachMeSkills.an15.VorobyovSergey.hwSix.Task1.services.implimentations.*;

public class MainTask1 {
    public static void main(String[] args) {
        System.out.println("Test ToString Test");
        SvTransportAirCivil civil = new SvTransportAirCivil();
        System.out.println(civil);

        serviceTransportTesting();
        serviceTransportGroundPassenger();
        serviceTransportFreightFreight();
        serviceTransportAirMilitary();
        serviceTransportAirCivil ();
    }

    static void serviceTransportTesting() {
        SvTransportGroundFreight freight = new SvTransportGroundFreight();
        freight.setHorsPower(1000);
        //Testing
        System.out.println("\nTest TransportService");
        SvTransportService service = new SvTransportServiceImp();
        double power = service.convertPower(freight);
        System.out.println(power);
        service.showCalculatedPower(freight);
    }

    static void serviceTransportGroundPassenger() {
        SvTransportGroundPassenger passenger = new SvTransportGroundPassenger();
        passenger.setFuelConsumption(20);
        passenger.setMaxSpeed(200);
        passenger.setBrandName("Zepor");
        //Testing
        System.out.println("\nTest TransportGroundPassengerService");
        SvTransportGroundPassengerService service = new SvTransportGroundPassengerServiceImp();
        service.showCalculatedTrek(passenger, 10);
    }

    static void serviceTransportFreightFreight() {
        SvTransportGroundFreight freight = new SvTransportGroundFreight();
        freight.setLoadCapacity(1000);
        //Testing
        System.out.println("\nTest TransportGroundFreightService");
        SvTransportGroundFreightService service = new SvTransportGroundFreightServiceImp();
        service.showCalculatedCargo(freight, 1001);
    }

    static void serviceTransportAirMilitary() {
        SvTransportAirMilitary military = new SvTransportAirMilitary();
        military.setRocketNumber(3);
        military.setEjectionSystem(true);
        //Testing
        System.out.println("\nTest TransportAirMilitaryService");
        SvTransportAirMilitaryService service = new SvTransportAirMilitaryServiceImp();
        service.makeRocketShot(military);
        service.makeRocketShot(military);
        System.out.println("Is ejection system exists - " + service.isEjectionSystemExists(military));
    }

    static void serviceTransportAirCivil() {
        SvTransportAirCivil civil = new SvTransportAirCivil();
        civil.setPassengersNumber(100);
        //Testing
        System.out.println("\nTest TransportAirCivilService");
        SvTransportAirCivilService service = new SvTransportAirCivilServiceImp();
        service.showCalculatedPassengers(civil, 101);
    }
}
