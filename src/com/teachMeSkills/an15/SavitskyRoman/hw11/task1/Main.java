package com.teachMeSkills.an15.SavitskyRoman.hw11.task1;

import java.util.Arrays;
import java.util.Collection;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Collection<People> peopleCollection = Arrays.asList(
                new People("Вася", 16, Sex.MAN),
                new People("Петя", 23, Sex.MAN),
                new People("Елена", 42, Sex.WOMEN),
                new People("Иван Иванович", 69, Sex.MAN));
        System.out.println(peopleCollection.stream().filter(people -> people.getAge() >= 18
                && people.getAge() < 27 && people.getGender().equals(Sex.MAN)).collect(Collectors.toList()));

        System.out.println(peopleCollection.stream().filter(people -> people.getGender().equals(Sex.MAN)).
                mapToInt(People::getAge).average().getAsDouble());

        System.out.println(peopleCollection.stream().filter(people -> people.getAge() >= 18).
                filter(people -> people.getGender().equals(Sex.MAN) && people.getAge() < 60 ||
                        people.getGender().equals(Sex.WOMEN) && people.getAge() < 55).count());

    }
}
