package com.teachMeSkills.an15.MatveevArtyom.hw5.Inheritance;

public class WarTransport extends AirTransport {
    protected boolean isEjectionSystem;
    protected int countOfRockets;

    @Override
    public String toString() {
        return "WarTransport{" +
                "wingspan=" + wingspan +
                ", minLength=" + minLength +
                ", power=" + power +
                ", maxSpeed=" + maxSpeed +
                ", weight=" + weight +
                ", model='" + model + '\'' +
                ", countOfRockets=" + countOfRockets +
                ", power in kilowatts= " + power*0.74 +
                '}';
    }

    public void shot(){
        if(countOfRockets != 0){
            System.out.println("Ракета пошла!..");
        } else{
            System.out.println("Боеприпасы отсутствуют!");
        }
    }

    public void ejection(){
        if(isEjectionSystem){
            System.out.println("Катапультирование прошло успешно!");
        } else{
            System.out.println("У вас нет такой системы!");
        }
    }
}
