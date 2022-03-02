package com.teachMeSkills.an15.NovikovVadim.hw4;

public class WrongPasswordException extends Exception {
    public WrongPasswordException(String message) {
        System.out.print(message);
    }

    public WrongPasswordException() {
    }
}
