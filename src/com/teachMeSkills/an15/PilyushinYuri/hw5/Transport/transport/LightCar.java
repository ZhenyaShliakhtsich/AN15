package com.teachMeSkills.an15.PilyushinYuri.hw5.Transport.transport;

import java.util.Objects;

public class LightCar extends Ground {
    String type;
    int passengers;

    public LightCar(int hp, int maxSpeed, int weight, String name, int wheel, int averageFuel, String type, int passengers) {
        super(hp, maxSpeed, weight, name, wheel, averageFuel);
        this.type = type;
        this.passengers = passengers;
    }




    public LightCar(int wheel, int averageFuel) {
        super(wheel, averageFuel);
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getPassengers() {
        return passengers;
    }

    public void setPassengers(int passengers) {
        this.passengers = passengers;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        LightCar lightCar = (LightCar) o;
        return passengers == lightCar.passengers && Objects.equals(type, lightCar.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), type, passengers);
    }

    @Override
    public String toString() {
        return "LightCar{" +
                "wheel=" + wheel +
                ", averageFuel=" + averageFuel +
                ", type='" + type + '\'' +
                ", passengers=" + passengers +
                ", hp=" + hp +
                ", maxSpeed=" + maxSpeed +
                ", weight=" + weight +
                ", name='" + name + '\'' +
                '}';
    }
    public String toDicplay (){
      return (toString() + "KiloWatt= " +  KiloWatt());
    }
    String resultTime(double time){
        double way = time * (double) getMaxSpeed();
        double fuel = way/100 * (double) getAverageFuel();
        String result = "За время " + time + " ч, автомобиль " + getName() + " двигаясь с максимальной скоростью "
                + getMaxSpeed() + " км/ч проедет " + way + " км и израсходует " + fuel + " литров топлива.";
        return result;
    }

}
