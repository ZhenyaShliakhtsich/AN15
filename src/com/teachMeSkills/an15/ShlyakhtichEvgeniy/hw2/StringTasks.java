package com.teachMeSkills.an15.ShlyakhtichEvgeniy.hw2;

public class StringTasks {
    public static void main(String[] args){
        String string = "I like Java!!!";
        System.out.println(string.charAt(13));
        System.out.println(string.endsWith("!!!"));
        System.out.println(string.startsWith("I like"));
        System.out.println(string.contains("Java"));
        int a = string.indexOf("Java");
        int b = string.lastIndexOf("Java");
        System.out.println(a);
        System.out.println(string.replace("а","о"));
        System.out.println(string.toUpperCase());
        System.out.println(string.toLowerCase());
        System.out.println(string.substring(a , b));
    }
}
