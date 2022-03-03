package com.teachMeSkills.an15.BuzukArtyom.hw4.Zadacha1;

public class StartException extends Exception {
    StartException() {
        System.out.print("Возникли неполадки! ");
    }

    StartException(String errorMessage) {
        System.out.println(errorMessage);
    }
}
