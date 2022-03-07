package com.teachMeSkills.an15.LashkevichGeorgy.hw5.Task1;

public class HeavyGround extends Ground {
    double gruzopodemnost;

    public HeavyGround(int power, int maxSpeed, int weight, String mark, int numbOfWheel, int rashod) {
        super(power, maxSpeed, weight, mark, numbOfWheel, rashod);
    }

    public HeavyGround() {
    }

    private double HosrePower() {
        double horse = power * 0.74;
        return horse;
    }

    public void isGruzopodemnostEnough(double massaGruza) {
        if (massaGruza < 0) {
            System.out.println("Такого груза не существует");
        } else if (massaGruza <= gruzopodemnost) {
            System.out.println("Грузовик загружен");
        } else System.out.println("Вам нужен грузовик побольше");
    }

    @Override
    public String toString() {
        return "HeavyGround{" +
                "numbOfWheel=" + numbOfWheel +
                ", rashod=" + rashod +
                ", gruzopodemnost=" + gruzopodemnost +
                ", power=" + power +
                ", maxSpeed=" + maxSpeed +
                ", weight=" + weight +
                ", mark='" + mark + '\'' +
                '}' + " количество лошадиных сил: " + HosrePower();
    }
}
