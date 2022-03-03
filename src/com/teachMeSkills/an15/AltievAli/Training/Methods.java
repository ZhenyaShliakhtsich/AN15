package com.teachMeSkills.an15.AltievAli.Training;


public class Methods {


    public static void main(String[] args) {

        Methods methods = new Methods();
        methods.refillBalance(77);
        methods.withdrawalBalance(188);

    }


    int id = 10;
    String string = "Jake";
    double balance = 1000;


    void refillBalance(double refill) {
        System.out.println("Client of Bank " + string + " " + "ID " + id);
        System.out.println("Here is your balance  " + balance);
        System.out.println("How much you wanna refill " + refill);
        balance += refill;
        System.out.println("You balance refilled " + balance);
        System.out.println();

    }

    void withdrawalBalance(double withdrawal) {

        System.out.println("Here is your balance  " + balance);
        System.out.println("How much you wanna withdrawal " + withdrawal);
        balance -= withdrawal;
        System.out.println("You balance withdrawal " + balance);
        System.out.println();


    }


}
