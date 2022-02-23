package com.teachMeSkills.an15.AltievAli.hm2;

public class Task1 {

    public static void main(String[] args) {


        String String1 = "I like Java!!!";
        ///Method .charAt(index)
        char charAt = String1.charAt(13);
        System.out.println("10-ый символ строки - " + charAt);

        ///Method .endsWith() and .startsWith
        boolean endsWith, startsWith;
        endsWith = String1.endsWith(String1);
        System.out.println(endsWith);
        startsWith = String1.startsWith("I like");
        System.out.println(startsWith);

        ///Method .Contains
        boolean contains = String1.contains("Java");
        System.out.println(contains);

        /// Method .indexOf
        System.out.println(String1.indexOf("Java"));

        ///Method .replace
        System.out.println(String1.replace("a", "o"));

        ///Method .toUpperCase
        System.out.println(String1.toUpperCase());

        ///Method .toLowerCase
        System.out.println(String1.toLowerCase());

        ///Method .substring
        System.out.println(String1.substring(7, 11));






    }


}

