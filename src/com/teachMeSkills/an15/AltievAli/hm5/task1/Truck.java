package com.teachMeSkills.an15.AltievAli.hm5.task1;

import java.util.function.IntFunction;

public class Truck extends Transport {
    protected int loadCapacityOfCar;

    public Truck(double powerOfCar, double speedOfCar, String brandOfCar, int loadCapacityOfCar) {
        super(powerOfCar, speedOfCar, brandOfCar);
        this.loadCapacityOfCar = loadCapacityOfCar;
    }

    public Truck (){

    }

    public Truck(int loadCapacityOfCar) {
        this.loadCapacityOfCar = loadCapacityOfCar;
    }

    public int getLoadCapacityOfCar() {

        return loadCapacityOfCar;
    }

    public void setLoadCapacityOfCar(int loadCapacityOfCar) {
        if (loadCapacityOfCar <= 0) {
            System.out.println("Incorrect Load");
        }else
        this.loadCapacityOfCar = loadCapacityOfCar;
    }


    @Override
    public String toString() {
        return "Brand of Car: " + brandOfCar + "| Speed of Car" + speedOfCar + "| Load capacity of Car: "  + loadCapacityOfCar
        + "| Power of Car: " + powerOfCar;
    }
}

