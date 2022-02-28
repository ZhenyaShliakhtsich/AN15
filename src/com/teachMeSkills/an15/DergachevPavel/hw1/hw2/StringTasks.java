package com.company;

import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class StringTasks {

    public static void main(String[] args) throws IOException {
        //Задание1
        String string = "I like Java!!!";                           //1
        System.out.println(string.charAt(13));                  //2
        System.out.println(string.endsWith("!!!"));             //3
        System.out.println(string.startsWith("I like"));        //4
        System.out.println(string.contains("Java"));            //5
        System.out.println(string.indexOf("Java"));             //6         !
        System.out.println(string.replace("a", "o"));           //7  !
        System.out.println(string.toLowerCase(Locale.ROOT));    //8
        System.out.println(string.toUpperCase());               //9
        System.out.println(string.substring(7, 11));            //10        !
    }
}