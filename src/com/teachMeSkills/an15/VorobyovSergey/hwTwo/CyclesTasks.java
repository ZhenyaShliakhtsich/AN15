package com.teachMeSkills.an15.VorobyovSergey.hwTwo;

import java.util.Random;

class CyclesTasks {
    void numberSequence (){
        StringBuilder strBuilder = new StringBuilder();
        for (int i = 5; i <= 100; i += 5){
            strBuilder.append(i + " ");
        }
        System.out.println(strBuilder);
    }

    void randomeCoin () {
        Random random = new Random();
        int myBound = 30;
        int luckyCoin = random.nextInt(myBound);
        for (int i = 0; i <= myBound; i++){
            if (i != luckyCoin){
                System.out.println("«надеюсь следующая будет счастливая " + i + "»");
            } else {
                System.out.println("«счастливая монета номер " + i +  " найдена»");
                break;
            }
        }
    }

    void zeroTenCycles (){
        System.out.println("From 1 to 10");
        for (int i = 1; i <= 10; i++){
            System.out.print(i + " ");
        }
        System.out.println("\nFrom 10 to 0");
        for (int i = 10; i >= 0; i--){
            System.out.print(i + " ");
        }
        System.out.println();
    }

    void fromOneToTenNumberSevenMultiplication (){
        System.out.println("7 multiplication table:");
        for (int i = 1; i <= 10; i++){
            System.out.println("7 * " + i + " = " + 7*i);
        }
    }


}
