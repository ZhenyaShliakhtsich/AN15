package com.teachMeSkills.an15.AltievAli;

import java.util.Scanner;

public class hm3 {
    public static void main(String[] args) {

        //  Task Number 1 (Salary and 7 percent)
        System.out.println("Enter your salary.");
        Scanner scanner = new Scanner(System.in);
        int userSalary = scanner.nextInt();
        System.out.println("Enter month!");
        int month = scanner.nextInt();

        int percent = addSevenPercent(userSalary);

        System.out.println("Your final amount: " + (userSalary + percent * month) + " $");


//        // Task Number 1 (Salary and 7 percent solution with  WHILE loop)


        while (true) {

            Scanner scanner1 = new Scanner(System.in);
            System.out.println("Enter your salary");
            int userSalary1 = scanner1.nextInt();
            System.out.println("Enter month");
            int month1 = scanner1.nextInt();

            int percent1 = addSevenPercent(userSalary1);

            System.out.println("Your final amount: " + (userSalary1 + percent1 * month1) + " $");


        }


//
//
//        }


    }

    //Method to get percent

    public static int addSevenPercent(int a) {

        return a * 7 / 100;

    }

}



