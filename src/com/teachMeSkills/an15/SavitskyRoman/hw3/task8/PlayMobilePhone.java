package com.teachMeSkills.an15.SavitskyRoman.hw3.task8;

public class PlayMobilePhone {
    public static void main(String[] args) {
        Phone phoneOne = new Phone(1111111, "Xiaomi", 110.11);
        Phone phoneTwo = new Phone(2222222, "Apple", 100500);
        Phone phoneThree = new Phone(3333333, "Звонилка");
        System.out.println(phoneOne + "\n" + phoneTwo + "\n" + phoneThree);



        phoneOne.receiveCall("NoName " + phoneOne.getNumber());
        //or
        phoneOne.receiveCall(phoneOne.model + " " + phoneOne.getNumber());

        phoneTwo.receiveCall("Alex " + phoneTwo.getNumber());
        phoneThree.receiveCall("Tom " + phoneThree.getNumber());

        phoneOne.receiveCall("NoName", 4444444);
        phoneTwo.receiveCall("Alex", 5555555);
        phoneThree.receiveCall("Tom", 6666666);

        phoneOne.sendMessage(phoneTwo.getNumber(), phoneThree.getNumber());
    }
}
