package com.teachMeSkills.an15.AltievAli.hm6.task3;

import com.teachMeSkills.an15.AltievAli.hm6.task3.service.UserAuthorization;

import java.util.Objects;
import java.util.Scanner;

public class User implements UserAuthorization {

    Basket basket = new Basket();

    @Override
    public boolean checkLogin(String Ali, String AN15) {
        Scanner scanner  = new Scanner(System.in);
        System.out.println("Enter login please");
        String UserLogin  =  scanner.nextLine();
        System.out.println("Enter password please");
        String userPassword = scanner.nextLine();
        if (Objects.equals(Ali, UserLogin)&&Objects.equals(AN15,userPassword)){
            System.out.println("Authentication is correct");
            return true;
        }else System.out.println("Authentication is not correct, we cannot find you in our system");
        return false;
    }

    }
