package com.teachMeSkills.an15.VorobyovSergey.hw1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MyConsoleReader {

    public int readPleas (String message){
        int number = 0;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        //While loop. Check for Integer in console, or ask try again
        while (true) {
            try {
                System.out.println(message);
                number = Integer.valueOf(reader.readLine());//try to get integer value
                return number;
            } catch (NumberFormatException | IOException e) {
                System.out.println("Все-таки попробуй ввести целое число");

            }
        }
    }

}

// очень сложно и откуда-то взято. Что такое баффер ридер? инпут стрим ридер? почему не примитив int a Integer?
// что такое NumberFormatException и IOException