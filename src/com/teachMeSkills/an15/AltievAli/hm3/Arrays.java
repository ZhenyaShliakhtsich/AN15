package com.teachMeSkills.an15.AltievAli.hm3;


public class Arrays {
    public static void main(String[] args) {

        int[] arr = new int[100];
        for (int i=1; i<100; i+=2){
            arr[i]=i;
            System.out.print(arr[i]+" ");}//Error



        System.out.println(); //error
        for (int i=99; i>0; i-=2){
            arr[i]=i;
            System.out.print(arr[i]+" ");
        }



    }


}



