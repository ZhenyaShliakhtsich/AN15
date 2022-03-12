package com.teachMeSkills.an15.ShlyakhtichEvgeniy.hw6.task1;

import com.teachMeSkills.an15.ShlyakhtichEvgeniy.hw6.task1.model.transport.airTransport.CivilAirTransport;
import com.teachMeSkills.an15.ShlyakhtichEvgeniy.hw6.task1.model.transport.groundTransport.TrackGroundTransport;
import com.teachMeSkills.an15.ShlyakhtichEvgeniy.hw6.task1.service.*;
import com.teachMeSkills.an15.ShlyakhtichEvgeniy.hw6.task1.service.impl.*;
import com.teachMeSkills.an15.ShlyakhtichEvgeniy.hw6.task1.model.transport.airTransport.MilitaryAirTransport;
import com.teachMeSkills.an15.ShlyakhtichEvgeniy.hw6.task1.model.transport.groundTransport.LightGroundTransport;

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
        militaryAirTransport.setCountRockets(8);
        militaryAirTransport.setCatapultSystemExists(true);

        MilitaryAirTransportService militaryAirTransportService = new MilitaryAirTransportServiceImpl();
        militaryAirTransportService.fire(militaryAirTransport);
        militaryAirTransportService.catapult(militaryAirTransport);

        TrackGroundTransport trackGroundTransport = new TrackGroundTransport();
        trackGroundTransport.setCapacity(3093);
        TrackGroundTransportService trackGroundTransportService = new TrackGroundTransportServiceImpl();

        trackGroundTransportService.load(trackGroundTransport, 3082);

        CivilAirTransport civilAirTransport = new CivilAirTransport();
        civilAirTransport.setCountPassengers(130);
        civilAirTransport.setBusinessClassExists(false);
        CivilAirTransportService civilAirTransportService = new CivilAirTransportServiceImpl();
        civilAirTransportService.civilLoad(civilAirTransport, 140);
    }
}
