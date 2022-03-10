package com.teachMeSkills.an15.ShlyakhtichEvgeniy.hw5.task1;

public class Main {
    public static void main(String[] args) {
        Cargo cargo = new Cargo(323,47,3,"Transit",4,3.1);
        Passenger passenger = new Passenger(270,57,2,"Focus",4,"Sedan",5);
        Civil civil = new Civil(1030,460,7,"Boeing",13,937,132,true);
        Military military = new Military(1313,890,4,"Air",5,560,true,6);
        cargo.load(3.0);
        passenger.despription();
        passenger.range(3.1);
        civil.load(95);
        civil.despription();
        military.catapult();
        military.fire();

    }
    //Не нажал ctr + alt + L
}
