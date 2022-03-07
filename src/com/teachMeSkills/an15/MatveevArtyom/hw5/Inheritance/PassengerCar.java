package com.teachMeSkills.an15.MatveevArtyom.hw5.Inheritance;

public class PassengerCar extends GroundTransport{
    protected String bodyType;
    protected int countOfPassengers;

    @Override
    public String toString() {
        return "PassengerCar{" +
                "bodyType='" + bodyType + '\'' +
                ", countOfPassengers=" + countOfPassengers +
                ", power=" + power +
                ", maxSpeed=" + maxSpeed +
                ", weight=" + weight +
                ", model='" + model + '\'' +
                ", power in kilowatts= " + power*0.74 +
                '}';
    }

    private double litres(double time){
        return ((time * maxSpeed) / 100) * fuelConsumption;
    }

    public void calculation(double time){
        System.out.println("За время " + time + " ч, автомобиль " + model + " двигаясь с максимальной скоростью " +
                maxSpeed + " км/ч проедет " + time * maxSpeed + " км и израсходует " + litres(time) + " литров топлива");
    }
}
