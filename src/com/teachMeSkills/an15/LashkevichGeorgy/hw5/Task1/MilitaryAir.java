package com.teachMeSkills.an15.LashkevichGeorgy.hw5.Task1;

public class MilitaryAir extends Air {
    boolean isKaputul;
    int kolichRaket;

    @Override
    public String toString() {
        return "militaryAir{" +
                "razmahKil=" + razmahKil +
                ", minDlinnaPolosi=" + minDlinnaPolosi +
                ", power=" + power +
                ", maxSpeed=" + maxSpeed +
                ", weight=" + weight +
                ", mark='" + mark + '\'' +
                ", isKaputul=" + isKaputul +
                ", kolichRaket=" + kolichRaket +
                '}' + " количество лошадиных сил: " + HosrePower();
    }

    private double HosrePower() {
        double horse = power * 0.74;
        return horse;
    }

    public MilitaryAir(int power, int maxSpeed, int weight, String mark, int razmahKil, int minDlinnaPolosi, boolean isKaputul, int kolichRaket) {
        super(power, maxSpeed, weight, mark, razmahKil, minDlinnaPolosi);
        this.isKaputul = isKaputul;
        this.kolichRaket = kolichRaket;
    }

    public void isShoot() {
        if (kolichRaket > 0) {
            System.out.println("Ракета пошла...");
        } else if (kolichRaket == 0) {
            System.out.println("Боериасы отсутствуют");
        }
    }

    public void caputilirovanie() {
        if (isKaputul == true) {
            System.out.println("Капитулирование произошло успешно");
        } else if (isKaputul == false) {
            System.out.println("У вас нет такой системы");
        }
    }

    public MilitaryAir() {
    }


}
