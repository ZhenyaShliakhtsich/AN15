package com.teachMeSkills.an15.AltievAli.hm5.task1;


public class PassengerCar extends Transport {
    protected String bodyType;
    protected int numberOfPassengers;



    public String getBodyType() {
        return bodyType;
    }

    public void setBodyType(String bodyType) {
        this.bodyType = bodyType;
    }

    public int getNumberOfPassengers() {
        return numberOfPassengers;
    }

    public void setNumberOfPassengers(int numberOfPassengers) {
        this.numberOfPassengers = numberOfPassengers;
    }


    public String toString() {
        return "Brand of car: " + getBrandOfCar() +
                "| Speed of Car:" + getSpeedOfCar() +
                "| Number of Passengers:" + getNumberOfPassengers() +
                "| Body type of Car: " + getBodyType() + "| Horse Power of Car "+ getHorsePower((200)) + " hs";


    }
}
