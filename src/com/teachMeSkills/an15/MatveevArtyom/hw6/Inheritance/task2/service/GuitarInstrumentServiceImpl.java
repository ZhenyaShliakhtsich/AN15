package com.teachMeSkills.an15.MatveevArtyom.hw6.Inheritance.task2.service;

public class GuitarInstrumentServiceImpl implements InstrumentService {
    private int countOfStrings;

    public int getCountOfStrings() {
        return countOfStrings;
    }

    public void setCountOfStrings(int countOfStrings) {
        this.countOfStrings = countOfStrings;
    }

    @Override
    public void play() {
        System.out.println("Играет гитара с количеством струн, равным " + this.countOfStrings);
    }
}
