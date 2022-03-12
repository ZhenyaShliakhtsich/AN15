package com.teachMeSkills.an15.MatveevArtyom.hw6.Inheritance.task2.service;

import com.teachMeSkills.an15.MatveevArtyom.hw6.Inheritance.task2.service.InstrumentService;

public class TrumpetInstrumentServiceImpl implements InstrumentService {
private double diameter;

    public double getDiameter() {
        return diameter;
    }

    public void setDiameter(double diameter) {
        this.diameter = diameter;
    }

    @Override
    public void play() {
        System.out.println("Играет труба с диаметром, равным " + this.diameter + " см");
    }
}
