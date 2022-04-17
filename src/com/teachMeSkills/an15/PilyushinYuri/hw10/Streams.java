package com.teachMeSkills.an15.PilyushinYuri.hw10;

import java.util.*;
import java.util.stream.Collectors;


public class Streams {
    public static void main(String[] args) {
        List<People> peopleList = Arrays.asList(new People("Вася", 16, "MAN"),
                new People("Петя", 23, "MAN"),
                new People("Елена", 42, "WOMEN"),
                new People("Иван Иванович", 69, "MAN"));
        System.out.println(peopleList.stream().filter(element -> element.getAge() > 18 && element.getAge() < 27).collect(Collectors.toList()));
        int count = 0;
        for (People element : peopleList) {
            if (element.getSex().equals("MAN")) {
                count = count + element.getAge();
            }
        }
        double averageAge = count / (peopleList.stream().filter(element -> element.getSex().equals("MAN")).count());
        System.out.println(averageAge);
        int number;
        number = (int) peopleList.stream().filter(element -> element.getSex().equals("MAN"))
                .filter(element-> element.getAge()< 60 && element.getAge()>18).count()
                 +(int) peopleList.stream().filter(element -> element.getSex().equals("WOMEN"))
                .filter(element-> element.getAge()< 55 && element.getAge()>18).count();
        System.out.println(number);
    }
}



//Условие: дана коллекция класс People (с полями name — имя, age — возраст, sex — пол), вида Arrays.asList
// ( new People(«Вася», 16, Sex.MAN), new People(«Петя», 23, Sex.MAN),
// new People(«Елена», 42, Sex.WOMEN), new People(«Иван Иванович», 69, Sex.MAN)).
//
//
//        1. Выбрать мужчин-военнообязанных (от 18 до 27 лет)
//        2. Найти средний возраст среди мужчин
//        3. Найти кол-во потенциально работоспособных людей в выборке (т.е. от 18 лет и учитывая что женщины выходят в 55 лет,
//        а мужчина в 60)