package com.teachMeSkills.an15.TuskalSergey.hw6.Task1;

import com.teachMeSkills.an15.TuskalSergey.hw6.Task1.service.*;
import com.teachMeSkills.an15.TuskalSergey.hw6.Task1.service.impl.*;
import com.teachMeSkills.an15.TuskalSergey.hw6.Task1.transport.airTransport.CivilAirTransport;
import com.teachMeSkills.an15.TuskalSergey.hw6.Task1.transport.airTransport.MilitaryAirTransport;
import com.teachMeSkills.an15.TuskalSergey.hw6.Task1.transport.groundTransport.LightGroundTransport;
import com.teachMeSkills.an15.TuskalSergey.hw6.Task1.transport.groundTransport.TrackGroundTransport;

public class Main {
    public static void main(String[] args) {
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
        trackGroundTransport.setCapacity(2500);

        TrackTransportService trackTransportService = new TrackTransportServiceImpl();
        trackTransportService.isTransportLoaded(2500, trackGroundTransport);

        CivilAirTransport civilAirTransport = new CivilAirTransport();
        civilAirTransport.setCountPassengers(50);

        CivilAirTransportService civilAirTransportService = new CivialAirTransportServiceImpl();
        civilAirTransportService.isTransportLoaded(51, civilAirTransport);

        MilitaryAirTransport militaryAirTransport = new MilitaryAirTransport();
        militaryAirTransport.setCountRockets(5);
        militaryAirTransport.setCatapultSystemExists(false);

        MilitaryAirTransportService militaryAirTransportService = new MilitaryAirTransportServiceImpl();
        militaryAirTransportService.shoot(6, militaryAirTransport);
        militaryAirTransportService.isCatapultOk(militaryAirTransport);


    }
}
