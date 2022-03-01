package com.teachMeSkills.an15.classes.class4;

public class MyException extends Exception {

    int code;


    MyException() {
        System.out.println("Возникли неполадки!");
    }

    MyException(String errorMessage) {
        System.out.println(errorMessage);
    }

    MyException(String errorMessage, int code) {
        this.code = code;
        System.out.println(errorMessage);

    }

    int getCode() {
        return code;
    }

}
