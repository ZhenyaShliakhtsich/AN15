package com.teachMeSkills.an15.ShlyakhtichEvgeniy.hw5.task2;

import java.util.GregorianCalendar;

public class Main {
    public static void main(String[] args) {
        GregorianCalendar date = new GregorianCalendar(1930, 01, 13);
        Wine wine1 = new Wine("SAd","da","ddenmark",date,"dsad");
        System.out.println(wine1.wineAging());
    }
}
