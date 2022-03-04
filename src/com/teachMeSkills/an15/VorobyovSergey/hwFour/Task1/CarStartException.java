package com.teachMeSkills.an15.VorobyovSergey.hwFour.Task1;

class CarStartException extends Exception {
    CarStartException() {
    }

    //void getErrorMessageи сюда сообщение !!!
    void getErrorMessage() {
        System.err.println("Тебе попалось четное число. Машина не заведется");
    }

    void getErrorMessage(String message) {
        System.err.println(message);
    }
}
