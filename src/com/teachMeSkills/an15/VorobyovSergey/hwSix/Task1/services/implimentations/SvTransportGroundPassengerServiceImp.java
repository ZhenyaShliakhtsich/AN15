package com.teachMeSkills.an15.VorobyovSergey.hwSix.Task1.services.implimentations;

import com.teachMeSkills.an15.VorobyovSergey.hwSix.Task1.models.TransportGround.SvTransportGround;
import com.teachMeSkills.an15.VorobyovSergey.hwSix.Task1.services.SvTransportGroundPassengerService;

public class SvTransportGroundPassengerServiceImp implements SvTransportGroundPassengerService {

    @Override
    public void showCalculatedTrek(SvTransportGround transport, int hoursOfTrip) {
        double trip = transport.getMaxSpeed() * hoursOfTrip;
        double fuel = transport.getFuelConsumption() * trip / 100;

        StringBuilder builder = new StringBuilder();
        builder.append("За время ").append(hoursOfTrip).append(" ч, автомобиль ")
                .append(transport.getBrandName()).append(" двигаясь с максимальной скоростью ")
                .append(transport.getMaxSpeed()).append(" км/ч проедет ").append(trip)
                .append(" км и израсходует ").append(fuel).append(" литров топлива.");

        System.out.println(builder);
    }
}
