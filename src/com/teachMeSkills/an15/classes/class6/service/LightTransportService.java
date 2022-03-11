package com.teachMeSkills.an15.classes.class6.service;

import com.teachMeSkills.an15.classes.class6.model.transport.groundTransport.LightGroundTransport;

public interface LightTransportService {
    double calculateDistance(int hours, LightGroundTransport lightGroundTransport);
    double calculateFuel(double calculatedDistance, LightGroundTransport lightGroundTransport);
    void printCalculatingResult(int hours, LightGroundTransport lightGroundTransport);

}
