package com.teachMeSkills.an15.AltievAli.hm10.condition1;

import java.util.Arrays;
import java.util.List;

/*
Условие: дана коллекция класс People
(с полями name — имя, age — возраст, sex — пол),
 вида Arrays.asList( new People(«Вася», 16, Sex.MAN), new People(«Петя», 23, Sex.MAN),
  new People(«Елена», 42, Sex.WOMEN), new People(«Иван Иванович», 69, Sex.MAN)).

 */
public class Dispatcher {
    public static void main(String[] args) {
        List<People> people = Arrays.asList(new People("Вася", 16, Sex.MAN),
                new People("Петя", 23, Sex.MAN),
                new People("Елена", 42, Sex.WOMAN),
                new People("Иван Иванович", 69, Sex.MAN));


        double asDouble = people.stream().filter(element -> element.getAge() >= 18 ||
                element.getAge() <= 27).mapToInt(element -> element.getAge()).average().getAsDouble();

        System.out.println(asDouble);


        double averageAgeOfMen = people.stream().filter(element -> element.getSexEnum() == Sex.MAN)
                .mapToInt(element -> element.getAge()).average().getAsDouble();
        System.out.println(averageAgeOfMen);


        long countOfPeopleWhoCanWork = people
                .stream()
                .filter(element -> element.getAge() >= 18)
                .filter(element -> element.getSexEnum().equals(Sex.WOMAN) && element.getAge() < 55 ||
                        element.getSexEnum().equals(Sex.MAN) && element.getAge() < 60).count();

        System.out.println(countOfPeopleWhoCanWork);


    }
}
