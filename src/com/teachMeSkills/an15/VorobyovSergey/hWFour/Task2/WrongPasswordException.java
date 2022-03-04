package com.teachMeSkills.an15.VorobyovSergey.hwFour.Task2;

public class WrongPasswordException extends Exception {
    WrongPasswordException() {
    }

    //а это было по условию задачи
    WrongPasswordException(String message) {
        super(message);
    }

    void getErrorMessage() {
        System.err.println("Wrong Password");
    }
}
