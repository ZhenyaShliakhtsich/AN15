package com.teachMeSkills.an15.AltievAli.hm5.task1;

import javax.xml.transform.Transformer;

public abstract class Transport {
    protected double powerOfCar;
    protected double speedOfCar;
    protected String brandOfCar;

    public double getPowerOfCar() {
        return powerOfCar;
    }

    public void setPowerOfCar(double powerOfCar) {
        this.powerOfCar = powerOfCar;
    }

    public double getSpeedOfCar() {
        return speedOfCar;
    }

    public void setSpeedOfCar(double speedOfCar) {
        this.speedOfCar = speedOfCar;
    }

    public String getBrandOfCar() {
        return brandOfCar;
    }

    public void setBrandOfCar(String brandOfCar) {
        this.brandOfCar = brandOfCar;
    }

    public Transport(double powerOfCar, double speedOfCar, String brandOfCar) {

        this.powerOfCar = powerOfCar;
        this.speedOfCar = speedOfCar;
        this.brandOfCar = brandOfCar;
    }

    public Transport() {

    }


    //Method HorsePowerOfCor
//    public double getHorsePower(int powerOfCar1) {
//        return powerOfCar / 0.735;
//    }


    protected double getHorsePower(double powerOfCar) {
        return powerOfCar * 0.74;
    }
    ///Formula liter/km*100


    public static void main(String[] args) {
        //Легковая машина
        PassengerCar passengerCar = new PassengerCar();
        passengerCar.setBrandOfCar("BMW");
        passengerCar.setSpeedOfCar(260);
        passengerCar.setNumberOfPassengers(4);
        passengerCar.setBodyType("Sport Car(hybrid)");
        System.out.println(passengerCar.toString());


        //Truck
        Truck truck = new Truck();
        truck.setBrandOfCar("BelAZ 75-71 / 2013");
        truck.setSpeedOfCar(180);
        truck.setLoadCapacityOfCar(450);
        truck.setPowerOfCar(5000);
        System.out.println(truck.toString());


     MilitaryCar militaryCar = new MilitaryCar();

        militaryCar.setBrandOfCar("AK-444");
        militaryCar.setSpeedOfCar(160);
        militaryCar.setNumberOfMissilesOnBoard(2);
        militaryCar.setEjectionSystems(true);
        System.out.println(militaryCar.toString());



       CivilCar  civilCar = new CivilCar();

        civilCar.setBrandOfCar("Toyota");
        civilCar.setBusinessCar(false);
        civilCar.setSpeedOfCar(280);
        civilCar.setNumberOfPassenger(4);
        System.out.println(civilCar.toString());


    }

}





