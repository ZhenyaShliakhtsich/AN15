package com.teachMeSkills.an15.MatveevArtyom.hw6.Inheritance.task1.service.impl;

import com.teachMeSkills.an15.MatveevArtyom.hw6.Inheritance.task1.groundTransport.PassengerCar;
import com.teachMeSkills.an15.MatveevArtyom.hw6.Inheritance.task1.service.LightTransportMethods;

public class LightTransportMethodsImpl implements LightTransportMethods {
    @Override
    public double calculateDistance(int hours, PassengerCar passengerCar) {
        return hours * passengerCar.getMaxSpeed();
    }

    @Override
    public double calculateFuel(double calculatedDistance, PassengerCar passengerCar) {
        return calculatedDistance * passengerCar.getFuelConsumption() / 100;
    }

    @Override
    public void printCalculationResult(int hours, PassengerCar passengerCar) {
        double calculatedDistanceResult = calculateDistance(hours, passengerCar);
        double calculatedFuelResult = calculateFuel(calculatedDistanceResult, passengerCar);
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("За время ")
                .append(hours)
                .append(" ч, атомобиль ")
                .append(passengerCar.getModel())
                .append(" дивгаясь с максимальной скоростью ")
                .append(passengerCar.getMaxSpeed())
                .append(" км/ч проедет ")
                .append(calculatedDistanceResult)
                .append(" км и израсходует ")
                .append(calculatedFuelResult)
                .append(" литров топлива");
        System.out.println(stringBuilder);
    }
}
