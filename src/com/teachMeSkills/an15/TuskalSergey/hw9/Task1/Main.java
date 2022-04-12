package com.teachMeSkills.an15.TuskalSergey.hw9.Task1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        /*1. Выбрать мужчин-военнообязанных (от 18 до 27 лет)
        2. Найти средний возраст среди мужчин
        3. Найти кол-во потенциально работоспособных людей в выборке
                (т.е. от 18 лет и учитывая что женщины выходят в 55 лет, а мужчина в 60)*/

        ArrayList<People> people = new ArrayList<>(Arrays.asList(new People("Вася", 16, Sex.MAN),
                new People("Петя", 23, Sex.MAN), new People("Елена", 42, Sex.WOMAN),
                new People("Иван Иванович", 69, Sex.MAN)));

        System.out.println("1 - " + people.stream().filter(people1 -> people1.getAge() >= 18 &&
                people1.getAge() < 27 && people1.getSex() == Sex.MAN).collect(Collectors.toList()));
        System.out.println("2 - " + people.stream().filter(people1 -> people1.getSex() == Sex.MAN).
                mapToInt(People::getAge).average().getAsDouble());
        System.out.println("3 - " + people.stream().filter(people1 -> people1.getAge() >= 18).filter(people1 ->
                people1.getSex() == Sex.MAN && people1.getAge() < 60 ||
                        people1.getSex() == Sex.WOMAN && people1.getAge() < 55).count());



    }
}
