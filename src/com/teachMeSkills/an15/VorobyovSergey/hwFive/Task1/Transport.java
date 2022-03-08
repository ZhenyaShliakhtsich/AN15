package com.teachMeSkills.an15.VorobyovSergey.hwFive.Task1;

//в задании не сказано что класс что-то делает, значит будет абстрактным
public abstract class Transport {
    protected double horsPower;
    protected int maxSpeed;
    protected int weight;
    protected String brandName;

    String showTransportCharacteristics() {
        return "TransportCharacteristics: " +
                "\n   horsPower = " + horsPower +
                "\n   kwPower = " + powerConverter() +
                "\n   maxSpeed = " + maxSpeed +
                "\n   weight = " + weight +
                "\n   brandName = " + brandName;
    }

    double powerConverter() {
        return horsPower * 0.74;
    }

    public double getHorsPower() {
        return horsPower;
    }

    public void setHorsPower(double horsPower) {
        this.horsPower = horsPower;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }
}
