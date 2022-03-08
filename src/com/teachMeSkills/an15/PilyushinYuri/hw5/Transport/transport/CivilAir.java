package com.teachMeSkills.an15.PilyushinYuri.hw5.Transport.transport;

import java.util.Objects;

public class CivilAir extends Air {
    int passenger;
    boolean bissnesClass;
    public CivilAir(int hp, int maxSpeed, int weight, String name, int wingspan, int minRunway, int passenger, boolean
                    bissnesClass) {
        super(hp, maxSpeed, weight, name, wingspan, minRunway);
        this.passenger = passenger;
        this.bissnesClass = bissnesClass;
    }

    public int getPassenger() {
        return passenger;
    }

    public void setPassenger(int passenger) {
        this.passenger = passenger;
    }

    public boolean isBissnesClass() {
        return bissnesClass;
    }

    public void setBissnesClass(boolean bissnesClass) {
        this.bissnesClass = bissnesClass;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        CivilAir civilAir = (CivilAir) o;
        return passenger == civilAir.passenger && bissnesClass == civilAir.bissnesClass;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), passenger, bissnesClass);
    }

    @Override
    public String toString() {
        return "CivilAir{" +
                "wingspan=" + wingspan +
                ", minRunway=" + minRunway +
                ", passenger=" + passenger +
                ", bissnesClass=" + bissnesClass +
                ", hp=" + hp +
                ", maxSpeed=" + maxSpeed +
                ", weight=" + weight +
                ", name='" + name + '\'' +
                '}';
    }
    public String toDicplay (){
        return (toString() +"KiloWatt= " + KiloWatt());
    }
    void toSeat(int passenger1) {
        if (passenger1 < getPassenger()){
            System.out.println("Самолет загружен.");
        } else {
            System.out.println("Нужен самолет побольше.");
        }
    }
}
