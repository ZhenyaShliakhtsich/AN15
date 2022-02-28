package com.teachMeSkills.an15.NovikovVadim.hw3;

public class UsePhone {
    public static void main(String[] args) {
        Phone phone = new Phone();
        phone.weight = 123;
        phone.number = "80172170000";
        phone.name = "Вадим Н.";
        System.out.println(phone);

        Phone phone2 = new Phone("80172253560", "Сергей К.");
        phone2.weight = 140;
        System.out.println(phone2);

        Phone phone3 = new Phone("80172253560", "Алексей Б.", 117.2f);
        System.out.println(phone3);

        //receiveCall
        phone.receiveCall(phone.name);
        phone2.receiveCall(phone2.name);
        phone3.receiveCall(phone3.name);
        phone.receiveCall(phone.name, phone.number);
        phone2.receiveCall(phone2.name, phone2.number);
        phone3.receiveCall(phone3.name, phone3.number);

        //getNumber
        System.out.println("номер - " + phone.getNumber());
        System.out.println("номер - " + phone2.getNumber());
        System.out.println("номер - " + phone3.getNumber());

        //send message
        String[] numbers = new String[3];
        numbers[0] = "802932323983";
        numbers[1] = "803332323983";
        numbers[2] = "801732323983";

        phone.sendMessage(numbers);
        phone2.sendMessage(phone.number);
        phone3.sendMessage(phone2.number);
    }
}
