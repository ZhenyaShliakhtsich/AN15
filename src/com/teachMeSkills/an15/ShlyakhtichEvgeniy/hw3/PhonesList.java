package com.teachMeSkills.an15.ShlyakhtichEvgeniy.hw3;

public class PhonesList {
    public static void main(String[] args) {
        Phone phone1 = new Phone(336082764, "iPhone 13", 0.17);
        Phone phone2 = new Phone(295200084, "Galaxy Z Flip3");
        Phone phone3 = new Phone(292265936, "Mi 11 Lite ");
        System.out.println(phone1);
        System.out.println(phone2);
        System.out.println(phone3);
        System.out.println(phone1.recieveCall(phone3.model));
        System.out.println(phone2.recieveCall(phone1.model));
        System.out.println(phone3.recieveCall(phone2.number, phone2.model));
        System.out.println(phone1.sendMessage(phone2.number, phone3.number));
        System.out.println(phone1.getNumber());
        System.out.println(phone2.getNumber());
        System.out.println(phone3.getNumber());
    }
}
