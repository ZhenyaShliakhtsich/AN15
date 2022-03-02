package com.teachMeSkills.an15.VorobyovSergey.hWFour.Task2;

public class WrongPasswordException extends Exception {
    WrongPasswordException() {
        System.err.println("Wrong Password");
    }

    WrongPasswordException(String message) {
        super(message);
    }
}
