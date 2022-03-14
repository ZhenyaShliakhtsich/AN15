package com.teachMeSkills.an15.PilyushinYuri.hw6;

import com.teachMeSkills.an15.PilyushinYuri.hw6.model.AirTransport.CivilAirTransport;
import com.teachMeSkills.an15.PilyushinYuri.hw6.model.AirTransport.MilitaryAirTransport;
import com.teachMeSkills.an15.PilyushinYuri.hw6.model.GroundTransport.*;
import com.teachMeSkills.an15.PilyushinYuri.hw6.service.*;
import com.teachMeSkills.an15.PilyushinYuri.hw6.service.impl.*;


public class MainTransport {
    public static void main(String[] args) {
        LightCarTransport lightCarTransport = new LightCarTransport();
        lightCarTransport.setName("Renault");
        lightCarTransport.setMaxSpeed(168);
        lightCarTransport.setAverageFuel(7);
        lightCarTransport.setPassengers(4);
        lightCarTransport.setHp(76);
        lightCarTransport.setType("mini");
        LightCarService lightCarService = new LightCarServiceImpl();
        lightCarService.onDisplay(4, lightCarTransport);

        CargoCarTransport cargoCarTransport = new CargoCarTransport();
        cargoCarTransport.setCargoWeight(10000);
        CargoTransportService cargoTransportService = new CargoTransportServiceImpl();
        cargoTransportService.isCanCarry(6000, cargoCarTransport);

        CivilAirTransport civilAirTransport = new CivilAirTransport();
        civilAirTransport.setPassenger(20);
        civilAirTransport.setBissnesClass(false);
        CivilAirService civilAirService = new CivilAirServiceImpl();
        civilAirService.toSeat(110, civilAirTransport);
        civilAirService.isBisnessClassPresent(civilAirTransport);

        MilitaryAirTransport militaryAirTransport = new MilitaryAirTransport();
        militaryAirTransport.setLaunch(60);
        militaryAirTransport.setCatapult(true);

        MilitaryAirService militaryAirService = new MilitaryAirServiceImpl();
        militaryAirService.toCatapult(militaryAirTransport);
        militaryAirService.toLaunchRockets(militaryAirTransport);
    }


}

