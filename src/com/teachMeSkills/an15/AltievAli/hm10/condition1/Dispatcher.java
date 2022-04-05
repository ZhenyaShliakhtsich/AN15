package com.teachMeSkills.an15.AltievAli.hm10.condition1;

import com.teachMeSkills.an15.AltievAli.hm10.condition1.People;
import com.teachMeSkills.an15.AltievAli.hm10.condition1.Sex;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Dispatcher {
    public static void main(String[] args) {

        List<People> people = Arrays.asList(new People("Вася", 16, Sex.MAN),
                new People("Петя", 23, Sex.MAN),
                new People("Елена", 42, Sex.WOMAN),
                new People("Иван Иванович", 69, Sex.MAN));

        List filteredList = people.stream().filter(element ->
                element.getAge() > 18 && element.getAge() < 27).collect(Collectors.toList());
//        System.out.println(filteredList);

        double averageAgeOfMen = people.stream().filter(element -> element.getSexEnum() == Sex.MAN)
                .mapToInt(element -> element.getAge()).average().getAsDouble();
//        System.out.println(averageAgeOfMen);

        Long l = people.stream().filter(element -> element.getAge() > 18 && element.getAge() < 60).count();
        System.out.println(l);


    }
}
