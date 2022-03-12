package com.teachMeSkills.an15.MatveevArtyom.hw6.Inheritance.task2.service;

public class DrumInstrumentServiceImpl implements InstrumentService {
    private double size;

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    @Override
    public void play() {
        System.out.println("Играет барабан с размером " + this.size + " см квадратных");
    }
}
