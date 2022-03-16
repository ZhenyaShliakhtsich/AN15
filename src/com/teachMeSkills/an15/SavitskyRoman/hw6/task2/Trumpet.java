package com.teachMeSkills.an15.SavitskyRoman.hw6.task2;

public class Trumpet extends Instrument {
    private String characteristic;
    private String name;

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    public String getCharacteristic() {
        return characteristic;
    }

    public void setCharacteristic(String characteristic) {
        this.characteristic = characteristic;
    }


}
