package com.teachMeSkills.an15.PilyushinYuri.hw5.Transport.transport;

import java.util.Objects;

public abstract class Transport {
   protected double hp;
    int maxSpeed;
    int weight;
    String name;

    public Transport (double hp, int maxSpeed, int weight, String name){
        this.hp = hp;
        this.maxSpeed = maxSpeed;
        this.weight = weight;
        this.name = name;
    }

    public Transport() {
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Transport transport = (Transport) o;
        return hp == transport.hp && maxSpeed == transport.maxSpeed && weight == transport.weight && Objects.equals(name, transport.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(hp, maxSpeed, weight, name);
    }

    @Override
    public String toString() {
        return "Transport{" +
                "hp=" + hp +
                ", maxSpeed=" + maxSpeed +
                ", weight=" + weight +
                ", name='" + name + '\'' +
                '}';
    }

    public double getHp() {
        return hp;
    }

    public void setHp(double hp) {
        this.hp = hp;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double KiloWatt(){
       double kW = 0.84 * (double) getHp();
        System.out.println("KiloWatt= " + kW);
       return kW;
    }
}
