package com.teachMeSkills.an15.ShlyakhtichEvgeniy.hw6.task1.service.impl;

import com.teachMeSkills.an15.ShlyakhtichEvgeniy.hw6.task1.service.TransportService;
import com.teachMeSkills.an15.ShlyakhtichEvgeniy.hw6.task1.model.transport.Transport;

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
