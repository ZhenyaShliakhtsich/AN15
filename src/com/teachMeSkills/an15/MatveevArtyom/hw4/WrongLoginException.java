package com.teachMeSkills.an15.MatveevArtyom.hw4;

public class WrongLoginException extends Exception{
    String string;
    public WrongLoginException(){

    }

    public WrongLoginException(String string){
        this.string = string;
    }
}
