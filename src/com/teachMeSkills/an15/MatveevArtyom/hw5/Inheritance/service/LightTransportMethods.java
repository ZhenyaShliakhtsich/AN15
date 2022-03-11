package com.teachMeSkills.an15.MatveevArtyom.hw5.Inheritance.service;

import com.teachMeSkills.an15.MatveevArtyom.hw5.Inheritance.groundTransport.PassengerCar;

public interface LightTransportMethods {
    double calculateDistance(int hours, PassengerCar passengerCar);
    double calculateFuel(double calculatedDistance, PassengerCar passengerCar);
    void printCalculationResult(int hours, PassengerCar passengerCar);
}
