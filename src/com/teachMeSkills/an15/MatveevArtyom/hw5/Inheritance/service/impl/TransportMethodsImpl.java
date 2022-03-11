package com.teachMeSkills.an15.MatveevArtyom.hw5.Inheritance.service.impl;

import com.teachMeSkills.an15.MatveevArtyom.hw5.Inheritance.Transport;
import com.teachMeSkills.an15.MatveevArtyom.hw5.Inheritance.service.TransportMethods;

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
