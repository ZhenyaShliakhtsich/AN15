package com.teachMeSkills.an15.VorobyovSergey.hwSix.Task1.models;

public abstract class SvTransport {
    protected int horsPower;
    protected int maxSpeed;
    protected int weight;
    protected String brandName;

    public int getHorsPower() {
        return horsPower;
    }

    public void setHorsPower(int horsPower) {
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

    @Override
    public String toString() {
        return "Transport{" +
                "horsPower=" + horsPower +
                ", maxSpeed=" + maxSpeed +
                ", weight=" + weight +
                ", brandName='" + brandName + '\'' +
                '}';
    }
}
