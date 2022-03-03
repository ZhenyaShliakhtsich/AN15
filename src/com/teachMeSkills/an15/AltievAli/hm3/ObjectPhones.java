package com.teachMeSkills.an15.AltievAli.hm3;

public class ObjectPhones {

    public static void main(String[] args) {


        Phone phoneDefaultConstructor = new Phone();
        System.out.println(phoneDefaultConstructor);


        Phone phoneWith2Parameters = new Phone(+375252567888L, "HTC");
        System.out.println(phoneWith2Parameters);


        Phone Apple = new Phone(375298624302L, "Apple", 325.50);
        System.out.println(Apple);
        Apple.ReceiveCall("Brother");
        Apple.ReceiveCall("Antony ", 3752596728L);
        System.out.println(Apple.getNumber());
      //  Apple.sendMessage(252555555L);


        Phone Samsung = new Phone(375333669666L, "Samsung", 390.25);
        System.out.println(Samsung);
        Samsung.ReceiveCall("Dad");
        System.out.println(Samsung.getNumber());


        Phone Xiaomi = new Phone(375291402909L, "Xiaomi", 250.0);
        System.out.println(Xiaomi);
        Xiaomi.ReceiveCall("Mam");
        System.out.println(Xiaomi.getNumber());


    }


}


