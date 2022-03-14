package com.teachMeSkills.an15.PilyushinYuri.hw5.Transport.transport;

import java.util.Objects;

public class CargoTruck extends Ground {
    int cargoWeight;

    public CargoTruck(int hp, int maxSpeed, int weight, String name, int wheel, int averageFuel, int cargoWeight) {
        super(hp, maxSpeed, weight, name, wheel, averageFuel);
        this.cargoWeight = cargoWeight;
    }

    public int getCargoWeight() {
        return cargoWeight;
    }

    public void setCargoWeight(int cargoWeight) {
        this.cargoWeight = cargoWeight;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        CargoTruck that = (CargoTruck) o;
        return cargoWeight == that.cargoWeight;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), cargoWeight);
    }

    @Override
    public String toString() {
        return "CargoTruck{" +
                "cargoWeight=" + cargoWeight +
                ", wheel=" + wheel +
                ", averageFuel=" + averageFuel +
                ", hp=" + hp +
                ", maxSpeed=" + maxSpeed +
                ", weight=" + weight +
                ", name='" + name + '\'' +
                '}';
    }

    public String toDicplay() {
        return (toString() + "KiloWatt= " + KiloWatt());
    }

    void toCanCarry(int cargo) {
        if (cargo < getCargoWeight()) {
            System.out.println("Грузовик загружен.");
        } else {
            System.out.println("Вам нужен другой грузовик.");
        }
    }


}
