package com.teachMeSkills.an15.ShlyakhtichEvgeniy.hw6.task1.service;

import com.teachMeSkills.an15.ShlyakhtichEvgeniy.hw6.task1.model.transport.groundTransport.LightGroundTransport;

public interface LightTransportService {
    double calculateDistance(int hours, LightGroundTransport lightGroundTransport);

    double calculateFuel(double calculatedDistance, LightGroundTransport lightGroundTransport);

    void printCalculatingResult(int hours, LightGroundTransport lightGroundTransport);

}
