package com.teachMeSkills.an15.AltievAli.hm10.condition4;

import com.teachMeSkills.an15.AltievAli.hm10.condition1.People;
import com.teachMeSkills.an15.AltievAli.hm10.condition1.Sex;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/*
Условие: даны две коллекции коллекция строк
 Arrays.asList(«a1», «a4», «a3», «a2», «a1», «a4»)
 и коллекция людей класса People (с полями name — имя, age — возраст, sex — пол),
  вида Arrays.asList( new People(«Вася», 16, Sex.MAN),
new People(«Петя», 23, Sex.MAN), new People(«Елена», 42, Sex.WOMEN), new People(«Иван Иванович», 69, Sex.MAN)).
 */
public class Dispatcher {
    public static void main(String[] args) {
        List<String> firstList = Arrays.asList("a1", "a4", "a2", "a1", "a4");
//        Отсортировать коллекцию строк по алфавиту
        System.out.println(" Отсортировать коллекцию строк по алфавиту");
        firstList.stream().sorted().collect(Collectors.toList()).stream().forEach(System.out::println);


        System.out.println(" Отсортировать коллекцию строк по алфавиту в обратном порядке");
//        Отсортировать коллекцию строк по алфавиту в обратном порядке
        Stream<String> stringStream = firstList.stream().sorted(Comparator.reverseOrder());
        System.out.println(stringStream.collect(Collectors.toList()));
        System.out.println("Отсортировать коллекцию строк по алфавиту в обратном порядке и убрать дубликаты");
//        Отсортировать коллекцию строк по алфавиту в обратном порядке и убрать дубликаты

        Stream<String> reversedOrderAndWithoutDuplicates =
                firstList
                        .stream()
                        .distinct()
                        .sorted(Comparator.reverseOrder());
        System.out.println(reversedOrderAndWithoutDuplicates.collect(Collectors.toList()));
        List<String> withoutDuplicate = firstList.stream().distinct().collect(Collectors.toList());
        System.out.println(withoutDuplicate);

        List<People> people = Arrays.asList(new People("Вася", 16, Sex.MAN),
                new People("Петя", 23, Sex.MAN),
                new People("Елена", 42, Sex.WOMAN),
                new People("Иван Иванович", 69, Sex.MAN));

        System.out.println("Отсортировать коллекцию людей по имени в обратном алфавитном порядке ");
//        Отсортировать коллекцию людей по имени в обратном алфавитном порядке
        List<People> reversedPeople = people.stream()
                .sorted(Comparator.comparing(People::getName)
                        .reversed()).collect(Collectors.toList());
        System.out.println(reversedPeople);
        System.out.println(" Отсортировать коллекцию людей сначала по полу, а потом по возрасту");

//        Отсортировать коллекцию людей сначала по полу, а потом по возрасту
        System.out.println("-----------------------------------------------------------------------");


    }

}
