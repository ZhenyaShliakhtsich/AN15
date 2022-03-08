package com.teachMeSkills.an15.ShlyakhtichEvgeniy.hw5.task1;

import java.util.Objects;

public class Military extends  Air{
    boolean isCatapult;
    int rocketsAmount;

    public Military(int power, int speed, int mass, String model, int wingspan, int airstripLength, boolean isCatapult, int rocketsAmount) {
        super(power, speed, mass, model, wingspan, airstripLength);
        this.isCatapult = isCatapult;
        this.rocketsAmount = rocketsAmount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Military military = (Military) o;
        return isCatapult == military.isCatapult && rocketsAmount == military.rocketsAmount;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), isCatapult, rocketsAmount);
    }

    @Override
    public String toString() {
        return "Military{" +
                "wingspan=" + wingspan +
                ", airstripLength=" + airstripLength +
                ", isCatapult=" + isCatapult +
                ", rocketsAmount=" + rocketsAmount +
                ", power=" + power +
                ", speed=" + speed +
                ", mass=" + mass +
                ", model='" + model + '\'' +
                '}';
    }
    public String despription(){
        StringBuilder st = new StringBuilder("Военный самолёт марки " + model +
                " имеет массу" + mass +
                " т.,мощность " + power +
                " л.с., размах крыла - " + wingspan +
                " метров.Максимальная скорость - " + speed +
                " км/ч.Для взлёта требуется " + airstripLength +
                " метров.Имеется " + rocketsAmount +
                " ракет.");
        if (isCatapult) {
            st.append("Есть система катапультирования");
        } else {
            st.append("Системы катапультирования нету");
        }
        return st.toString();
    }
    public String fire(){
        if (rocketsAmount != 0) {
            return "Ракета пошла...";
        }else {
            return "Боеприпасы отсутствуют";
        }
    }
    public String catapult(){
        if (isCatapult) {
            return "Катапультирование проло успешно";
        } else {
            return "У вас нет такой системы";
        }
    }
}
