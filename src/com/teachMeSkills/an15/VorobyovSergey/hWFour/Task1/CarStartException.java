package com.teachMeSkills.an15.VorobyovSergey.hWFour.Task1;

class CarStartException extends Exception {
    CarStartException() {
        System.err.println("Тебе попалось четное число. Машина не заведется");
    }

    CarStartException(int number) {
        System.err.printf("Тебе попалось четное число %d. Машина не заведется\n", number);
    }

    CarStartException(String message) {
        System.err.println(message);
    }
}
