package com.teachMeSkills.an15.ShlyakhtichEvgeniy.hw3;

import java.util.Objects;

public class Phone {
    int number;
    String model;
    double weight;


    public Phone(int number, String model, double weight) {
        this(number,model);
        this.weight = weight;
    }

    public Phone() {
    }

    public Phone(int number, String model) {
        this.number = number;
        this.model = model;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Phone phone = (Phone) o;
        return number == phone.number && Double.compare(phone.weight, weight) == 0 && Objects.equals(model, phone.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(number, model, weight);
    }
    public  int getNumber(){
        return this.number;
    }
    public String recieveCall(String model){
        return "Звонит " + model;
    }
    public String recieveCall(int number,String model){
        return "Звонит " + model;
    }
    public StringBuilder sendMessage(int... number){
        StringBuilder st = new StringBuilder();
        for (int i = 0; i < number.length;i++)
        st.append(number[i]).append(" ");
        return  st;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "number=" + number +
                ", model='" + model + '\'' +
                ", weight=" + weight +
                '}';
    }
}
