package com.teachMeSkills.an15.classes.class6.service.impl;

import com.teachMeSkills.an15.classes.class6.model.transport.groundTransport.LightGroundTransport;
import com.teachMeSkills.an15.classes.class6.service.LightTransportService;

public class LightTransportServiceImpl implements LightTransportService {

    @Override
    public double calculateDistance(int hours, LightGroundTransport lightGroundTransport) {
        return hours * lightGroundTransport.getMaxSpeed();
    }

    @Override
    public double calculateFuel(double calculatedDistance, LightGroundTransport lightGroundTransport) {
        return calculatedDistance * lightGroundTransport.getRashod() / 100;
    }

    @Override
    public void printCalculatingResult(int hours, LightGroundTransport lightGroundTransport) {
        double calculatedDistanceResult = calculateDistance(hours, lightGroundTransport);
        double calculatedFuelResult = calculateFuel(calculatedDistanceResult, lightGroundTransport);
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("За время ")
                .append(hours)
                .append(" ч, атомобиль ")
                .append(lightGroundTransport.getBrand())
                .append(" дивгаясь с максимальной скоростью ")
                .append(lightGroundTransport.getMaxSpeed())
                .append(" км/ч проедет ")
                .append(calculatedDistanceResult)
                .append(" км и израсходует ")
                .append(calculatedFuelResult)
                .append(" литров топлива");
        System.out.println(stringBuilder);
    }
}
