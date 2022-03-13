package com.teachMeSkills.an15.BuzukArtyom.hw6.Zadacha1.service.impl;

import com.teachMeSkills.an15.BuzukArtyom.hw6.Zadacha1.modelTransport.Transport;
import com.teachMeSkills.an15.BuzukArtyom.hw6.Zadacha1.service.TransportService;

public class TransportServiceImpl implements TransportService {
    @Override
    public double calculatePower(Transport transport) {

        return transport.getPower() * 0.74;
    }

    @Override
    public void printCalculatedPower(Transport transport) {
        System.out.println("Мощность в кв/ч = " + calculatePower(transport));
    }
}
