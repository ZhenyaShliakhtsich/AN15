package com.teachMeSkills.an15.MatveevArtyom.hw4;

public class WrongPasswordException extends Throwable {
    String string;

    public WrongPasswordException(String string) {
        this.string = string;
    }
}
