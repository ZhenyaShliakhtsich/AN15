package com.teachMeSkills.an15.LashkevichGeorgy.hw11;

import java.util.ArrayList;
import java.util.OptionalDouble;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        //Условие: дана коллекция класс People (с полями name — имя, age — возраст, sex — пол), вида
// Arrays.asList( new People(«Вася», 16, Sex.MAN), new People(«Петя», 23, Sex.MAN),
// new People(«Елена», 42, Sex.WOMEN), new People(«Иван Иванович», 69, Sex.MAN)).
//
//
//1. Выбрать мужчин-военнообязанных (от 18 до 27 лет)
//2. Найти средний возраст среди мужчин
//3. Найти кол-во потенциально работоспособных людей в выборке (т.е. от 18 лет и учитывая что женщины выходят в 55 лет,
// а мужчина в 60
        Stream<People> stream = Stream.of(new People("Вася", 16, "Sex.Man"), new People("Петя", 23, "Sex.Man"),
                new People("Елена", 42, "Sex.Woman"), new People("Иван Иванович", 69, "Sex.Man"));
        //1.ВОЕННООБЯЗАННЫЕ
       /* ArrayList warriors = (ArrayList) stream.filter(s -> s.getAge() > 17).filter(p -> p.getAge() < 28)
                .filter(g -> g.getSex().equalsIgnoreCase("sex.man"))
                .collect(Collectors.toList());
        System.out.println(warriors);*/

        //2.СРЕДНИЙ ВОЗРАСТ
        //OptionalDouble avgAge = stream.filter(c -> c.getSex().equalsIgnoreCase("sex.man")).mapToInt(s -> s.getAge()).average();
        //System.out.println(avgAge);

        //3 НЕ ПЕНСИОНЕРЫ

       /* System.out.println(stream.filter(s -> s.getAge() > 17).filter(
                s -> (s.getSex().equalsIgnoreCase("sex.man") && s.getAge() <60)
                        || s.getSex().equalsIgnoreCase("sex.woman") && s.getAge() < 55).count());*/

    }
}

