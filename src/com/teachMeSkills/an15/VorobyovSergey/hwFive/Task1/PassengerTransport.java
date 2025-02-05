package com.teachMeSkills.an15.VorobyovSergey.hwFive.Task1;

class PassengerTransport extends GroundTransport {
    private String bodyType;
    private int passengersNumber;

    @Override
    String showTransportCharacteristics() {
        return super.showTransportCharacteristics() +
                "\n   bodyType = " + bodyType +
                "\n   passengersNumber = " + passengersNumber;
    }

    //потому что только выводит в консоль, больше от него ничего не хотели
    void trekCounter(int hoursOfTrip) {
        double trip = this.maxSpeed * hoursOfTrip;
        double fuel = fuelConsumptionCounter(trip);

        StringBuilder builder = new StringBuilder();
        builder.append("За время ").append(hoursOfTrip).append(" ч, автомобиль ")
                .append(this.brandName).append(" двигаясь с максимальной скоростью ")
                .append(this.maxSpeed).append(" км/ч проедет ").append(trip)
                .append(" км и израсходует ").append(fuel).append(" литров топлива.");

        System.out.println(builder);
    }

    private double fuelConsumptionCounter(double trip) {
        return this.fuelConsumption * trip / 100;
    }

    public String getBodyType() {
        return bodyType;
    }

    public void setBodyType(String bodyType) {
        this.bodyType = bodyType;
    }

    public int getPassengersNumber() {
        return passengersNumber;
    }

    public void setPassengersNumber(int passengersNumber) {
        this.passengersNumber = passengersNumber;
    }
}
