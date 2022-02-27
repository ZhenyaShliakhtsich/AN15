package com.teachMeSkills.an15.AltievAli.hm3;

public class Phone {

    Long number;
    String model;
    double weight;

    public Phone() {
    }

    public Phone(Long number, String model) {
        this.number = number;
        this.model = model;
    }

    public Phone(Long number, String model, double weight) {
        this.number = number;
        this.model = model;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return
                "number= " + number + "    model= " + model + "     weight= " + weight;


    }

    void ReceiveCall(String Name) {
        System.out.println("Calling: " + Name);

    }
    void ReceiveCall(String Name,Long number) {
        System.out.println("Calling: " + Name + " Number:  " + number);

    }

    void sendMessage (Long Number){
        System.out.println("Message was sent from this number: " + Number + " to this " + this.number);

    }



    Long getNumber() {
        return number;
    }


}
