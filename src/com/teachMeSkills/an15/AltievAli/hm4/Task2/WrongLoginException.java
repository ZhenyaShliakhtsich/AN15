package com.teachMeSkills.an15.AltievAli.hm4.Task2;

public class WrongLoginException extends Exception {


    public WrongLoginException(String message) {
        super(message);
    }


    public WrongLoginException() {
    }

    @Override
    public String toString() {
        return "WrongLoginException{}";
    }
}
