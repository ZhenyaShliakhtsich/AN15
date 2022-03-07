package com.teachMeSkills.an15.LashkevichGeorgy.hw5.Task1;

public class LightGround extends Ground {
    String typeKuzov;
    int kolichPasajirov;

    public LightGround(int power, int maxSpeed, int weight, String mark, int numbOfWheel, int rashod, String typeKuzov, int kolichPasajirov) {
        super(power, maxSpeed, weight, mark, numbOfWheel, rashod);
        this.typeKuzov = typeKuzov;
        this.kolichPasajirov = kolichPasajirov;
    }

    private double HosrePower() {
        double horse = power * 0.74;
        return horse;
    }

    // не реализовал private
    public void WayAndRashod(double time) {
        double way = maxSpeed * time;
        double rashodWay = way / 100 * rashod;
        System.out.println("За время " + time + " ч, автомобиль " + mark
                + " двигаясь с максимальной сторостью " + maxSpeed + " км/ч проедет " + way
                + " км и израсходует " + rashodWay + " литров топлива.");
    }

    @Override
    public String toString() {
        return "Lihtround{" +
                "numbOfWheel=" + numbOfWheel +
                ", rashod=" + rashod +
                ", typeKuzov='" + typeKuzov + '\'' +
                ", kolichPasajirov=" + kolichPasajirov +
                ", power=" + power +
                ", maxSpeed=" + maxSpeed +
                ", weight=" + weight +
                ", mark='" + mark + '\'' +
                '}' + " количество лошадиных сил " + HosrePower();
    }

    public LightGround() {
    }
}
