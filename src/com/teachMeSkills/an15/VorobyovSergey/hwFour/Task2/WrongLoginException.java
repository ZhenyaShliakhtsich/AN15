package com.teachMeSkills.an15.VorobyovSergey.hwFour.Task2;

public class WrongLoginException extends Exception {
    WrongLoginException() {
    }

    //а это было по условию задачи
    WrongLoginException(String message) {
        super(message);
    }

    void getErrorMessage() {
        System.err.println("Wrong Login");
    }
}
