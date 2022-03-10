package com.teachMeSkills.an15.ShlyakhtichEvgeniy.hw5.task1;

import java.util.Objects;

public class Transport {
    int power;
    int speed;
    int mass;
    String model;

    public Transport(int power, int speed, int mass, String model) {
        this.power = power;
        this.speed = speed;
        this.mass = mass;
        this.model = model;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Transport transport = (Transport) o;
        return power == transport.power && speed == transport.speed && mass == transport.mass && Objects.equals(model, transport.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(power, speed, mass, model);
    }

    @Override
    public String toString() {
        return "Transport{" +
                "power=" + power +
                ", speed=" + speed +
                ", mass=" + mass +
                ", model='" + model + '\'' +
                '}';
    }
    public double powerKVt(int power){
        //Этот метод нужно было сделать в конечных классах, а не в начальном
        //Также в классе Civil и Military этот метод не используется
      double kVt = power * 0.74; //Зачем создавать kVt, можно сразу всё в return написать
      return kVt;
    }
    //Не нажал ctr + alt + L
}
