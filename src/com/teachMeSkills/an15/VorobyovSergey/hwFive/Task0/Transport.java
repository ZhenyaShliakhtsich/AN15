package com.teachMeSkills.an15.VorobyovSergey.hwFive.Task0;

//в задании не сказано что класс что-то делает, значит будет абстрактным
abstract class Transport {
    double horsPower;
    int maxSpeed;
    int weight;
    String brandName;

    String showTransportCharacteristics() {
        return "TransportCharacteristics: " +
                "\n   horsPower = " + horsPower +
                "\n   kwPower = " + powerConverter() +
                "\n   maxSpeed = " + maxSpeed +
                "\n   weight = " + weight +
                "\n   brandName = " + brandName;
    }

    double powerConverter() {
        return horsPower * 0.74;
    }
}
