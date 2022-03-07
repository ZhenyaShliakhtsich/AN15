package com.teachMeSkills.an15.MatveevArtyom.hw5.Inheritance;

public class CivilTransport extends AirTransport {
    protected int countOfPassengers;
    protected boolean isBusinessClass;

    @Override
    public String toString() {
        return "CivilTransport{" +
                "wingspan=" + wingspan +
                ", minLength=" + minLength +
                ", isBusinessClass=" + isBusinessClass +
                ", power=" + power +
                ", maxSpeed=" + maxSpeed +
                ", weight=" + weight +
                ", model='" + model + '\'' +
                ", power in kilowatts= " + power * 0.74 +
                '}';
    }

    public void howMuch(int somePeople) {
        if (somePeople <= countOfPassengers) {
            System.out.println("Пассажиры загружены");
        } else {
            System.out.println("Вам нужен самолёт побольше");
        }
    }
}
