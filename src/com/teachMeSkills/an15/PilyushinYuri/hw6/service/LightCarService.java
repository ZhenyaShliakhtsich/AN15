package com.teachMeSkills.an15.PilyushinYuri.hw6.service;

import com.teachMeSkills.an15.PilyushinYuri.hw6.model.GroundTransport.LightCarTransport;


public interface LightCarService {
    double calculateDistance(int hour, LightCarTransport lightCarTransport);
    double calculateFuel(double calculateDistance, LightCarTransport lightCarTransport);
    void onDisplay (int hour, LightCarTransport lightCarTransport);
}
