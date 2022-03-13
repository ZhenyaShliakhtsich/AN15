package com.teachMeSkills.an15.BuzukArtyom.hw6.Zadacha1;

import com.teachMeSkills.an15.BuzukArtyom.hw6.Zadacha1.modelTransport.airTransport.CivilAirTransport;
import com.teachMeSkills.an15.BuzukArtyom.hw6.Zadacha1.modelTransport.airTransport.MilitaryAirTransport;
import com.teachMeSkills.an15.BuzukArtyom.hw6.Zadacha1.modelTransport.groundTransport.LightGroundTransport;
import com.teachMeSkills.an15.BuzukArtyom.hw6.Zadacha1.modelTransport.groundTransport.TrackGroundTransport;
import com.teachMeSkills.an15.BuzukArtyom.hw6.Zadacha1.service.*;
import com.teachMeSkills.an15.BuzukArtyom.hw6.Zadacha1.service.impl.*;

public class Main {
    public static void main(String[] args) {
        MilitaryAirTransport militaryAirTransport = new MilitaryAirTransport();
        militaryAirTransport.setPower(14);

        TransportService transportService = new TransportServiceImpl();

        LightGroundTransport lightGroundTransport = new LightGroundTransport();
        lightGroundTransport.setMaxSpeed(18);
        lightGroundTransport.setRashod(7.5);
        lightGroundTransport.setPower(5);
        lightGroundTransport.setBrand("Audi");

        LightTransportService lightTransportService = new LightTransportServiceImpl();
        lightTransportService.printCalculatingResult(4, lightGroundTransport);

        transportService.printCalculatedPower(lightGroundTransport);


        TrackGroundTransport trackGroundTransport = new TrackGroundTransport();
        trackGroundTransport.setCapacity(3000);
        TrackTransportService trackTransportService = new TrackTransportServiceImpl();
        trackTransportService.calculateGruz(2500, trackGroundTransport);

        CivilAirTransport civilAirTransport = new CivilAirTransport();
        civilAirTransport.setCountPassengers(85);
        CivilAirTransportService civilAirTransportService = new CivilTransportImpl();
        civilAirTransportService.calculateCountPassengers(80, civilAirTransport);

        MilitaryAirTransportService militaryAirTransportService = new MilitaryAirTransportImpl();
        militaryAirTransportService.isCountRockets(10, militaryAirTransport);
        militaryAirTransportService.isCatapultSystemExists(true, militaryAirTransport);

    }
}
