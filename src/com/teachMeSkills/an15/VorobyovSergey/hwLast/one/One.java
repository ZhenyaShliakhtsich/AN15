package com.teachMeSkills.an15.VorobyovSergey.hwLast.one;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

//Условие: дана коллекция класс People (с полями name — имя, age — возраст, sex — пол),
//        вида Arrays.asList( new People(«Вася», 16, Sex.MAN), new People(«Петя», 23, Sex.MAN),
//        new People(«Елена», 42, Sex.WOMEN), new People(«Иван Иванович», 69, Sex.MAN)).
//
//        1. Выбрать мужчин-военнообязанных (от 18 до 27 лет)
//        2. Найти средний возраст среди мужчин
//        3. Найти кол-во потенциально работоспособных людей в выборке (т.е. от 18 лет и учитывая что женщины выходят в 55 лет, а мужчина в 60)
class One {
    public static void main(String[] args) {
        ArrayList<People> list = new ArrayList<>(Arrays.asList(new People("Вася", 16, SexEnum.MAN),
                new People("Петя", 23, SexEnum.MAN),
                new People("Елена", 42, SexEnum.WOMAN),
                new People("Иван Иванович", 69, SexEnum.MAN)));

        System.out.println("Start - " + list);

        System.out.println("Призывники:");
        list.stream().filter(x -> x.getAge() >= 18).filter(x -> x.getAge() <= 27).forEach(s -> System.out.println(s));

        System.out.println("Средний возраст мужчин:");
        System.out.println(list.stream().filter(x -> x.getSex().getItem().equalsIgnoreCase("man"))
                .mapToInt(x -> x.getAge()).average().getAsDouble());

        System.out.println("Кто не пенс");
        list.stream().filter(x -> x.getAge() >= 18)
                .filter(x -> {
                    if (x.getSex().getItem().equalsIgnoreCase("man") && x.getAge() <= 60) {
                        return true;
                    }
                    if (x.getSex().getItem().equalsIgnoreCase("woman") && x.getAge() <= 55) {
                        return true;
                    }
                    return false;
                }).forEach(x -> System.out.println(x));
    }
}
