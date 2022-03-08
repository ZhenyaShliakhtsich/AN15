package com.teachMeSkills.an15.ShlyakhtichEvgeniy.hw5.task1;

import java.util.Objects;

public class Civil extends Air {
    int passengerAmount;
    boolean isBusinessClass;

    public Civil(int power, int speed, int mass, String model, int wingspan, int airstripLength, int passengerAmount, boolean isBusinessClass) {
        super(power, speed, mass, model, wingspan, airstripLength);
        this.passengerAmount = passengerAmount;
        this.isBusinessClass = isBusinessClass;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Civil civil = (Civil) o;
        return passengerAmount == civil.passengerAmount && isBusinessClass == civil.isBusinessClass;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), passengerAmount, isBusinessClass);
    }

    @Override
    public String toString() {
        return "Civil{" +
                "wingspan=" + wingspan +
                ", airstripLength=" + airstripLength +
                ", passengerAmount=" + passengerAmount +
                ", isBusinessClass=" + isBusinessClass +
                ", power=" + power +
                ", speed=" + speed +
                ", mass=" + mass +
                ", model='" + model + '\'' +
                '}';
    }

    public String despription() {
        StringBuilder st = new StringBuilder("Самолёт марки " + model +
                " имеет массу" + mass +
                " т.,мощность " + power +
                " л.с., размах крыла - " + wingspan +
                " метров.Максимальная скорость - " + speed +
                " км/ч.Для взлёта требуется " + airstripLength +
                " метров.Может вместить " + passengerAmount +
                " пассажиров.");
        if (isBusinessClass) {
            st.append("Есть бизнесс-класс");
        } else {
            st.append("Бизнесс-класса нету");
        }
        return st.toString();
    }
    public String load(int load){
        if (load > passengerAmount) {
            return "Вам нужен самолёт побольше";
        } else {
            return "Самолёт загружен";
        }
    }
}

