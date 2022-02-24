package com.teachMeSkills.an15.ProkopchukAndrey.hw1;

import java.util.Locale;

public class StringTask {
    public static void main (String[] args) {
        String string = "I like Java!!!";
        int lengt = string.length();
        System.out.println(string.charAt (lengt-3));
        System.out.println(string.charAt (lengt-2));
        System.out.println(string.charAt (lengt-1));

        boolean End = string.endsWith("!!!");
        System.out.println("Содержит ли строка <!!!> = " + End);
        boolean Start = string.startsWith("I like");
        System.out.println("Содержит ли строка <I like> = " + Start);
        boolean Contain = string.contains("Java");
        System.out.println("Содержит ли строка <Java> = " + Contain);
        int indexJava = string.indexOf("Java");
        System.out.println("Начальный символ слова под № = " + indexJava);
        System.out.println(string.toUpperCase(Locale.ROOT));
        System.out.println(string.toLowerCase(Locale.ROOT));
        System.out.println(string.replace('a','o'));
        string = string.substring(0,7)+string.substring(11,14);
        System.out.println(string);
    }
}

