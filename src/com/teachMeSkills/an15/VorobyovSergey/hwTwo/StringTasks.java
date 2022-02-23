package com.teachMeSkills.an15.VorobyovSergey.hwTwo;

class StringTasks {
    public StringTasks() {
        //1 - first
        String string = "I like Java!!!";
        System.out.println(string);
        //2 - second
        System.out.println("Последний символ строки \"I like Java!!!\" это - "
                + string.charAt(string.length() - 1));
        //3 - third
        System.out.println("Заканчивается ли строка на \"!!!\" - "
                + string.endsWith("!!!"));
        //4 - fourth
        System.out.println("Начинается ли строка на \"I like\" - "
                + string.startsWith("I like"));
        //5 - fifth
        System.out.println("Содержит ли строка символы \"Java\" - "
                + string.contains("Java"));
        //6 - sixth
        String substring = "Java";
        System.out.println("Позиция подстроки \"Java\" - " +
                (string.contains(substring) ?
                        string.indexOf(substring) : "not contains substring"));
        //7 - seventh
        System.out.println("Замена всех а на о - " +
                string.replaceAll("a", "o"));
        //8 - eighth
        System.out.println("Строка в верхнем регистре - " +
                string.toUpperCase());
        //9 - ninth
        System.out.println("Строка в нижнем регистре - " +
                string.toLowerCase());
        //10 - tenth
        String substringJavaWord = string.substring(7, 11);
        System.out.println("Substring (7, 11) - " + substringJavaWord);
    }
}
