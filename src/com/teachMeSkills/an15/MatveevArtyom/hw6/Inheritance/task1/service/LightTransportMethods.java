package com.teachMeSkills.an15.MatveevArtyom.hw6.Inheritance.task1.service;

import com.teachMeSkills.an15.MatveevArtyom.hw6.Inheritance.task1.groundTransport.PassengerCar;

public interface LightTransportMethods {
    double calculateDistance(int hours, PassengerCar passengerCar);
    double calculateFuel(double calculatedDistance, PassengerCar passengerCar);
    void printCalculationResult(int hours, PassengerCar passengerCar);
}
