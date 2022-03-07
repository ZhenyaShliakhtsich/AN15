package com.teachMeSkills.an15.SavitskyRoman.hw5.task1;

public class PassengerCar extends GroundTransportation {
    private String body;
    private int quantityOfPassengers;
    private double time;

    public PassengerCar(double power, int speed, double weight, String brand, int wheels
            , double fuelConsumption, String body, int quantityOfPassengers) {
        super(power, speed, weight, brand, wheels, fuelConsumption);
        this.body = body;
        this.quantityOfPassengers = quantityOfPassengers;
    }


    private double calculationOfSpentFuel() {
        return (time * speed * fuelConsumption) / 100;
    }


    public void getCalculationOfSpentFuel(double time) {
        this.time = time;
        double kmAllHour = time * speed;
        System.out.println("За время " + time + " ч, автомобиль " + brand + ", двигаясь с максимальной скоростью " +
                speed + " км/ч, проедет " + kmAllHour + "км и израсходует " + calculationOfSpentFuel() + "л.");
    }

}
