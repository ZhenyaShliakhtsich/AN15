package com.teachMeSkills.an15.ShlyakhtichEvgeniy.hw5.task1;

import java.util.Objects;

public class Passenger extends Land{
    String carBody;
    int passengerAmount;

    public Passenger(int power, int speed, int mass, String model, int wheels, String carBody, int passengerAmount) {
        super(power, speed, mass, model, wheels);
        this.carBody = carBody;
        this.passengerAmount = passengerAmount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Passenger passenger = (Passenger) o;
        return passengerAmount == passenger.passengerAmount && Objects.equals(carBody, passenger.carBody);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), carBody, passengerAmount);
    }

    @Override
    public String toString() {
        return "Passenger{" +
                "wheels=" + wheels +
                ", carBody='" + carBody + '\'' +
                ", passengerAmount=" + passengerAmount +
                ", power=" + power +
                ", speed=" + speed +
                ", mass=" + mass +
                ", model='" + model + '\'' +
                '}';
    }
    public String despription(){
        return "Легковой автомобиль марки" + model +
                " c " + carBody +
                " типом кузова имеет мощность" + power +
                "л.с., массу " + mass +
                " т, " + wheels +
                " колеса, максимальная скорость - " + speed +
                " км/ч. Максимальное количество пассажиров - " + passengerAmount +
                ". Мощность в киловаттах - " + powerKVt(power) +
                "кВт";
    }
    private double fuelConsuption(double time ){
        return 9.5 * (time * speed)/100;
    }//Что такое 9.5???
    //Скорее всего надо было использовать поле "Расход топлива" в классе Land
    public String range(double time){
        return "За время" + time +
                " ч, автомобиль марки "+ model +
                " двигаясь со скоростью " + speed +
                " км/ч проедет " +speed * time +
                " км и израсходует "+ fuelConsuption(time) +
                " литров бензина.";
    }
    //Не нажал ctr + alt + L
    }

