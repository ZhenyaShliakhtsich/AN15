package com.teachMeSkills.an15.LashkevichGeorgy.hw5.Task1;

public class Main {

    public static void main(String[] args) {
        MilitaryAir militaryAir = new MilitaryAir(34534, 456, 678, "audi", 20,
                500, true, 18);
        militaryAir.isShoot();
        militaryAir.caputilirovanie();
        LightGround lightGround = new LightGround(159, 569, 123, "Audi", 8, 14, "sedan", 18);
        lightGround.WayAndRashod(1.5);
        HeavyGround heavyGround = new HeavyGround(423, 400, 123123, "Volvo", 4, 11);
        heavyGround.isGruzopodemnostEnough(444);
        GrajdAir grajdAir = new GrajdAir(9800, 1000, 12345, "Boeng", 11, 87, 100, true);
        grajdAir.isVmestimostEnough(100);
    }
}
