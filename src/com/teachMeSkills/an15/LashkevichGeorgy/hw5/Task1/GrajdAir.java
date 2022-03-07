package com.teachMeSkills.an15.LashkevichGeorgy.hw5.Task1;

public class GrajdAir extends Air {
    int kolichPassajirov;
    boolean isBusiness;

    public GrajdAir() {
    }

    private double HosrePower() {
        double horse = power * 0.74;
        return horse;
    }

    public void isVmestimostEnough(int kolichestvo) {
        if (kolichestvo <= kolichPassajirov) {
            System.out.println("Самолет загружен");
        } else System.out.println("Вам нужен самолет побольше");
    }

    @Override
    public String toString() {
        return "GrajdAir{" +
                "razmahKil=" + razmahKil +
                ", minDlinnaPolosi=" + minDlinnaPolosi +
                ", isBusiness=" + isBusiness +
                ", power=" + power +
                ", maxSpeed=" + maxSpeed +
                ", weight=" + weight +
                ", mark='" + mark + '\'' +
                '}' + " количество лошадиных сил : " + HosrePower();
    }

    public GrajdAir(int power, int maxSpeed, int weight, String mark, int razmahKil, int minDlinnaPolosi, int kolichPassajirov, boolean isBusiness) {
        super(power, maxSpeed, weight, mark, razmahKil, minDlinnaPolosi);
        this.kolichPassajirov = kolichPassajirov;
        this.isBusiness = isBusiness;
    }
}
