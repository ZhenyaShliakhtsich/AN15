package com.teachMeSkills.an15.LashkevichGeorgy.hw6.task1.service;

import com.teachMeSkills.an15.LashkevichGeorgy.hw6.task1.transport.groundTransport.LightGroundTransport;

public interface LightTransportService {
    double calculateDistance(int hours, LightGroundTransport lightGroundTransport);
    double calculateFuel(double calculatedDistance, LightGroundTransport lightGroundTransport);
    void printCalculatingResult(int hours, LightGroundTransport lightGroundTransport);

}
