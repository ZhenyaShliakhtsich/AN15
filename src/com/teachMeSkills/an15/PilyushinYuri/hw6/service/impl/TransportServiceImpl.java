package com.teachMeSkills.an15.PilyushinYuri.hw6.service.impl;

import com.teachMeSkills.an15.PilyushinYuri.hw6.model.Transport;
import com.teachMeSkills.an15.PilyushinYuri.hw6.service.TransportService;

public class TransportServiceImpl implements TransportService   {
    @Override
    public double calculatePower(Transport  transport){
        return  transport.getHp() * 0.74;
    }

    @Override
    public void printCalculatedPower(Transport transport) {
        System.out.println("Мощность в кВт= " + calculatePower(transport));
    }
}
