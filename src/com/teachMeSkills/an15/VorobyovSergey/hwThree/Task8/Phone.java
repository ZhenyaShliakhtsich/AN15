package com.teachMeSkills.an15.VorobyovSergey.hwThree.Task8;

class Phone {
    private int number;
    private String model;
    private double weight;

    public Phone() {
    }

    public Phone(int number, String model) {
        this.number = number;
        this.model = model;
    }

    public Phone(int number, String model, double weight) {
//        this.number = number;
//        this.model = model;
        this(number, model);
        this.weight = weight;
    }

    void receiveCall (String name){
        System.out.printf("Звонит {%s}, номер абонента - %s\n",name, getNumber());
    }

    void receiveCall (String name, int number){
        System.out.printf("Reloaded: Звонит {%s}, номер абонента - %s\n",name, number);
    }

    void sendMessage (int ... args){
        for (int number: args) {
            System.out.println(number);
        }
    }

    public int getNumber() {
        return number;
    }

    public String getModel() {
        return model;
    }

    public double getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return "Phone: " + "model=" + model +
                ", number=" + number +
                ", weight=" + weight;
    }
}
