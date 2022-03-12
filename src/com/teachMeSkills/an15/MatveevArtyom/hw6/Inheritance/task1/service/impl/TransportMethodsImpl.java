package com.teachMeSkills.an15.MatveevArtyom.hw6.Inheritance.task1.service.impl;

import com.teachMeSkills.an15.MatveevArtyom.hw6.Inheritance.task1.Transport;
import com.teachMeSkills.an15.MatveevArtyom.hw6.Inheritance.task1.service.TransportMethods;

public class TransportMethodsImpl implements TransportMethods {

    @Override
    public double calculatePower(Transport transport) {
        return transport.getPower() * 0.74;
    }

    @Override
    public void printCalculatePower(Transport transport) {
        System.out.println("Мощность в кв/ч = " + calculatePower(transport));
    }
}
