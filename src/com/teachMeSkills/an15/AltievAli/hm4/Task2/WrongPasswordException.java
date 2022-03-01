package com.teachMeSkills.an15.AltievAli.hm4.Task2;

public class WrongPasswordException extends Exception {

    public WrongPasswordException(String message) {
        super(message);
    }

    public WrongPasswordException() {
    }


    @Override
    public String toString() {
        return "WrongPasswordException{}";
    }
}
