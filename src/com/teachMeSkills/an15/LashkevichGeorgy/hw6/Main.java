//package com.teachMeSkills.an15.LashkevichGeorgy.hw6;
//
//import com.teachMeSkills.an15.LashkevichGeorgy.hw6.model.transport.airTransport.MilitaryAirTransport;
//import com.teachMeSkills.an15.LashkevichGeorgy.hw6.service.LightTransportService;
//import com.teachMeSkills.an15.LashkevichGeorgy.hw6.service.TransportService;
//import com.teachMeSkills.an15.LashkevichGeorgy.hw6.service.impl.TransportServiceImpl;
//import com.teachMeSkills.an15.LashkevichGeorgy.hw6.model.transport.groundTransport.LightGroundTransport;
//import com.teachMeSkills.an15.LashkevichGeorgy.hw6.service.impl.LightTransportServiceImpl;
//
//public class Main {
//    public static void main(String[] args) {
//        MilitaryAirTransport militaryAirTransport = new MilitaryAirTransport();
//        militaryAirTransport.setPower(14);
//
//        TransportService transportService = new TransportServiceImpl();
//
//        LightGroundTransport lightGroundTransport = new LightGroundTransport();
//        lightGroundTransport.setMaxSpeed(18);
//        lightGroundTransport.setRashod(7.5);
//        lightGroundTransport.setPower(5);
//        lightGroundTransport.setBrand("Audi");
//
//        LightTransportService lightTransportService = new LightTransportServiceImpl();
//        lightTransportService.printCalculatingResult(4, lightGroundTransport);
//
//        transportService.printCalculatedPower(lightGroundTransport);
//    }
//}
