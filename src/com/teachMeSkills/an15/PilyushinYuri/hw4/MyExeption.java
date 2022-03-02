package com.teachMeSkills.an15.PilyushinYuri.hw4;

public class MyExeption extends Exception{
    MyExeption (String errorMessage){

        System.out.println(errorMessage);

    }
    public static class WrongLoginExeption extends Exception{
        WrongLoginExeption(String errorMessage) {
            System.out.println(errorMessage);
        }
    }
    public static class WrongPasswordExeption extends Exception{
        WrongPasswordExeption(String errorMessage) {
            System.out.println(errorMessage);
        }
    }
}
