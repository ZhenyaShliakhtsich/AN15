package com.teachMeSkills.an15.AltievAli.hm5.task1;

public class CivilCar extends Transport {
    private int NumberOfPassenger;
    private boolean isBusinessCar;

    public CivilCar(double powerOfCar, double speedOfCar, String brandOfCar, int numberOfPassenger, boolean isBusinessCar) {
        super(powerOfCar, speedOfCar, brandOfCar);
        NumberOfPassenger = numberOfPassenger;
        this.isBusinessCar = isBusinessCar;
    }



    public CivilCar() {

    }

    public int getNumberOfPassenger() {
        return NumberOfPassenger;
    }

    public void setNumberOfPassenger(int numberOfPassenger) {
        NumberOfPassenger = numberOfPassenger;
    }

    public boolean isBusinessCar() {
        return isBusinessCar;
    }

    public void setBusinessCar(boolean businessCar) {
        isBusinessCar = businessCar;
    }


    @Override
    public String toString() {
        return "Brand of Car: " + getBrandOfCar()
                + " |Speed of Car: " + getBrandOfCar()
                + "|Business Car " + isBusinessCar()
                + "|Quantity of Passengers " + getNumberOfPassenger();
    }
}

