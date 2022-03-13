package com.teachMeSkills.an15.LashkevichGeorgy.hw6.task1;

import com.teachMeSkills.an15.LashkevichGeorgy.hw6.task1.service.CivilAirService;
import com.teachMeSkills.an15.LashkevichGeorgy.hw6.task1.service.LightTransportService;
import com.teachMeSkills.an15.LashkevichGeorgy.hw6.task1.service.MilitaryAirService;
import com.teachMeSkills.an15.LashkevichGeorgy.hw6.task1.service.TransportService;
import com.teachMeSkills.an15.LashkevichGeorgy.hw6.task1.service.impl.CivilAirImpl;
import com.teachMeSkills.an15.LashkevichGeorgy.hw6.task1.service.impl.LightTransportServiceImpl;
import com.teachMeSkills.an15.LashkevichGeorgy.hw6.task1.service.impl.MilitaryAirImpl;
import com.teachMeSkills.an15.LashkevichGeorgy.hw6.task1.service.impl.TransportServiceImpl;
import com.teachMeSkills.an15.LashkevichGeorgy.hw6.task1.transport.airTransport.CivilAirTransport;
import com.teachMeSkills.an15.LashkevichGeorgy.hw6.task1.transport.airTransport.MilitaryAirTransport;
import com.teachMeSkills.an15.LashkevichGeorgy.hw6.task1.transport.groundTransport.LightGroundTransport;

public class Main {
    public static void main(String[] args) {
        MilitaryAirTransport militaryAirTransport = new MilitaryAirTransport();
        militaryAirTransport.setPower(14);
        militaryAirTransport.setCountRockets(5);
        militaryAirTransport.setWeight(125);
        MilitaryAirService militaryAirService = new MilitaryAirImpl();
        militaryAirService.capitul(militaryAirTransport);
        militaryAirService.rocketShoot(militaryAirTransport);

        TransportService transportService = new TransportServiceImpl();

        LightGroundTransport lightGroundTransport = new LightGroundTransport();
        lightGroundTransport.setMaxSpeed(18);
        lightGroundTransport.setRashod(7.5);
        lightGroundTransport.setPower(5);
        lightGroundTransport.setBrand("Audi");

        LightTransportService lightTransportService = new LightTransportServiceImpl();
        lightTransportService.printCalculatingResult(4, lightGroundTransport);

        transportService.printCalculatedPower(lightGroundTransport);

        CivilAirTransport civilAirTransport = new CivilAirTransport();
        civilAirTransport.setCountPassengers(11);
        civilAirTransport.setBusinessClassExists(false);
        CivilAirService civilAirService = new CivilAirImpl();
        civilAirService.civilAirService(78, civilAirTransport);




    }
}
