package com.teachMeSkills.an15.ShlyakhtichEvgeniy.hw5.task1;

import com.teachMeSkills.an15.SavitskyRoman.hw5.task1.CargoTransport;

import java.util.Objects;

public class Cargo extends Land {
    double loadCapacity;

    public Cargo(int power, int speed, int mass, String model, int wheels, double loadCapacity) {
        super(power, speed, mass, model, wheels);
        this.loadCapacity = loadCapacity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Cargo cargo = (Cargo) o;
        return Double.compare(cargo.loadCapacity, loadCapacity) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), loadCapacity);
    }

    @Override
    public String toString() {
        return "Cargo{" +
                "loadCapacity=" + loadCapacity +
                ", wheels=" + wheels +
                ", power=" + power +
                ", speed=" + speed +
                ", mass=" + mass +
                ", model='" + model + '\'' +
                '}';
    }

    public String despription() { //Не ошибка, но ошибка в слове:))
        return "Грузовой автомобиль марки" + model +
                " имеет мощность" + power +
                "л.с., массу " + mass +
                " т, грузоподъёмность " + loadCapacity +
                " т, " + wheels +
                " колеса, максимальная скорость - " + speed +
                " км/ч. Мощность в киловаттах - " + powerKVt(power) +
                "кВт";
    }

    public String load(double load) {
        if (load > loadCapacity) {
            return "Вам нужен грузовик побольше";
        } else return "Грузовик загружен";
    }

    //Не нажал ctr + alt + L
}
