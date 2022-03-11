package com.teachMeSkills.an15.MatveevArtyom.hw5.Inheritance.groundTransport;

public class PassengerCar extends GroundTransport {
    private String bodyType;
    private int countOfPassengers;

    public String getBodyType() {
        return bodyType;
    }

    public void setBodyType(String bodyType) {
        this.bodyType = bodyType;
    }

    public int getCountOfPassengers() {
        return countOfPassengers;
    }

    public void setCountOfPassengers(int countOfPassengers) {
        this.countOfPassengers = countOfPassengers;
    }

    //    private double litres(double time) {
//        return ((time * maxSpeed) / 100) * fuelConsumption;
//    }
//
//    public void calculation(double time) {
//        System.out.println("За время " + time + " ч, автомобиль " + model + " двигаясь с максимальной скоростью " +
//                maxSpeed + " км/ч проедет " + time * maxSpeed + " км и израсходует " + litres(time) + " литров топлива");
//    }
}
