package com.teachMeSkills.an15.VorobyovSergey.hWFour.Task2;

public class WrongLoginException extends Exception {
    WrongLoginException() {
        System.err.println("Wrong Login");
    }

    WrongLoginException(String message) {
        super(message);
    }
}
