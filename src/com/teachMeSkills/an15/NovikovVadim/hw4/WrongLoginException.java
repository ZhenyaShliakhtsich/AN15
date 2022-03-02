package com.teachMeSkills.an15.NovikovVadim.hw4;

public class WrongLoginException extends Exception {
    public WrongLoginException(String message) {
        System.out.print(message);
    }

    public WrongLoginException() {
    }
}
