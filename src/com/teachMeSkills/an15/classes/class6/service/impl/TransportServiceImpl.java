package com.teachMeSkills.an15.classes.class6.service.impl;

import com.teachMeSkills.an15.classes.class6.model.transport.Transport;
import com.teachMeSkills.an15.classes.class6.service.TransportService;

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
