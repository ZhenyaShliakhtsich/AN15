package com.teachMeSkills.an15.ShlyakhtichEvgeniy.hw11.task1;

import com.teachMeSkills.an15.ShlyakhtichEvgeniy.hw11.task4.People;
import com.teachMeSkills.an15.ShlyakhtichEvgeniy.hw11.task4.Sex;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

//дана коллекция класс People (с полями name — имя, age — возраст, sex — пол),
// вида Arrays.asList( new People(«Вася», 16, Sex.MAN), new People(«Петя», 23, Sex.MAN),
// new People(«Елена», 42, Sex.WOMEN), new People(«Иван Иванович», 69, Sex.MAN)).
//
//
//1. Выбрать мужчин-военнообязанных (от 18 до 27 лет)
//2. Найти средний возраст среди мужчин
//3. Найти кол-во потенциально работоспособных людей в выборке (т.е. от 18 лет и учитывая что женщины выходят в 55 лет,
// а мужчина в 60)
public class Main {
    public static void main(String[] args) {
        ArrayList<People> collection = new ArrayList<>(Arrays.asList(new People("Вася", 16, Sex.MAN),
                new People("Петя", 23, Sex.MAN),
                new People("Елена", 42, Sex.WOMEN), new People("Иван Иванович", 69, Sex.MAN)));
        System.out.println(collection.stream().filter(people -> people.getAge()> 18 && people.getAge()<27 &&
                        people.getSex()==Sex.MAN)
                .collect(Collectors.toList()));
        System.out.println( collection.stream().filter(people -> people.getSex() == Sex.MAN)
                .mapToInt(People::getAge).sum()/ collection.size());
        System.out.println(collection.stream().filter(people -> people.getAge()>18
                && (people.getSex()==Sex.MAN&&people.getAge()<60)||(people.getSex()==Sex.WOMEN&&people.getAge()<55))
                .count());

    }
}
