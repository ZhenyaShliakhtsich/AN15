package com.teachMeSkills.an15.PilyushinYuri.hw6.service.impl;


import com.teachMeSkills.an15.PilyushinYuri.hw6.model.GroundTransport.LightCarTransport;
import com.teachMeSkills.an15.PilyushinYuri.hw6.service.LightCarService;


public class LightCarServiceImpl implements LightCarService {
    public void onDisplay(int hour, LightCarTransport lightCarTransport) {
        double calculatedDistanceResult = calculateDistance(hour, lightCarTransport);
        double calculatedFuelResult = calculateFuel(calculatedDistanceResult, lightCarTransport);
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("За время ")
                .append(hour)
                .append(" ч, атомобиль ")
                .append(lightCarTransport.getName())
                .append(" дивгаясь с максимальной скоростью ")
                .append(lightCarTransport.getMaxSpeed())
                .append(" км/ч проедет ")
                .append(calculatedDistanceResult)
                .append(" км и израсходует ")
                .append(calculatedFuelResult)
                .append(" литров топлива");
        System.out.println(stringBuilder);
    }

    @Override
    public double calculateDistance(int hour, LightCarTransport lightCarTransport) {
        return hour * lightCarTransport.getMaxSpeed();
    }

    @Override
    public double calculateFuel(double calculateDistance, LightCarTransport lightCarTransport) {
        return calculateDistance * lightCarTransport.getAverageFuel() / 100;
    }


}
