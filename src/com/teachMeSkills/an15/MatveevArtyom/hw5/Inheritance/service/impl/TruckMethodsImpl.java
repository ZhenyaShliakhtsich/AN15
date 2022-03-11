package com.teachMeSkills.an15.MatveevArtyom.hw5.Inheritance.service.impl;

import com.teachMeSkills.an15.MatveevArtyom.hw5.Inheritance.groundTransport.Truck;
import com.teachMeSkills.an15.MatveevArtyom.hw5.Inheritance.service.TruckMethods;

public class TruckMethodsImpl implements TruckMethods {
    @Override
    public void printResult(double someWeight, Truck truck) {
        if (someWeight >= truck.getWeight()) {
            System.out.println("Вам нужен грузовик побольше!");
        } else System.out.println("Грузовик загружен!");
    }
}
