package com.teachMeSkills.an15.TuskalSergey.hw6.Task1.service;

import com.teachMeSkills.an15.TuskalSergey.hw6.Task1.transport.groundTransport.LightGroundTransport;

public interface LightTransportService {
    double calculateDistance(int hours, LightGroundTransport lightGroundTransport);
    double calculateFuel(double calculatedDistance, LightGroundTransport lightGroundTransport);
    void printCalculatingResult(int hours, LightGroundTransport lightGroundTransport);

}
