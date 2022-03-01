package com.teachMeSkills.an15.VorobyovSergey.hWFour;

import java.util.Random;

//Login должен содержать только латинские буквы, цифры и знак подчеркивания.
//Длина login должна быть меньше 20 символов.
class JustMyTestsForHw4 {
    public static void main(String[] args) {
        String login = "22333_Victor";
        System.out.println(login.matches("[A-Za-z\\d\\_]{0,20}"));
        Random random = new Random();
        for (int i =0; i < 20; i++) {
            System.out.println(random.nextInt(1));
        }
    }
}
//помним про 2-а \\ в java
//[A-Za-z\d\_] перечисляем символы которые должны повторятся
//повторение {n}, от до {n,m}
//не забываем что matcher уже реализован в string
