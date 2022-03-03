package com.teachMeSkills.an15.AltievAli.hm4.Task4;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        Programmer programmer1 = new Programmer("Jonny Depp","23.07.1967","Senior",4000,375333669666L);
        Programmer programmer2 = new Programmer("Tomas Shelby","3.02.1977","Middle",2000,375291402909L);
        Programmer programmer3= new Programmer("Brad Pitt","20.04.1970","Junior",700,375333633666L);

        Programmer [] programmersArray  = {programmer1,programmer2,programmer3};

        System.out.println(Arrays.toString(programmersArray ) + "\n");





    }



}
