package com.teachMeSkills.an15.TuskalSergey.hw9.Task4;

import com.company.Task1.People;
import com.company.Task1.Sex;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        /*даны две коллекции коллекция строк Arrays.asList(«a1», «a4», «a3», «a2», «a1», «a4») и
        коллекция людей класса People (с полями name — имя, age — возраст, sex — пол),
        вида Arrays.asList( new People(«Вася», 16, Sex.MAN), new People(«Петя», 23, Sex.MAN),
                new People(«Елена», 42, Sex.WOMAN), new People(«Иван Иванович», 69, Sex.MAN)).

        1. Отсортировать коллекцию строк по алфавиту
        2. Отсортировать коллекцию строк по алфавиту в обратном порядке
        3. Отсортировать коллекцию строк по алфавиту и убрать дубликаты
        4. Отсортировать коллекцию строк по алфавиту в обратном порядке и убрать дубликаты
        5. Отсортировать коллекцию людей по имени в обратном алфавитном порядке
        6. Отсортировать коллекцию людей сначала по полу, а потом по возрасту*/

        ArrayList<String> collection = new ArrayList<>(Arrays.asList("a1", "a4", "a3", "a2", "a1", "a4"));
        Collection<People> people = Arrays.asList(
                new People("Вася", 16, Sex.MAN),
                new People("Петя", 23, Sex.MAN),
                new People("Елена", 42, Sex.WOMAN),
                new People("Иван Иванович", 69, Sex.MAN));

        System.out.println("1 - " + collection.stream().sorted().collect(Collectors.toList()));

        System.out.println("2 - " + collection.stream().sorted((o1, o2) ->
                -o1.compareTo(o2)).collect(Collectors.toList()));

        System.out.println("3 - " + collection.stream().sorted().distinct().collect(Collectors.toList()));

        System.out.println("4 - " + collection.stream().sorted((o1, o2) ->
                -o1.compareTo(o2)).distinct().collect(Collectors.toList()));

        System.out.println("5 - " + people.stream().sorted((p1, p2) ->
                -p1.getName().compareTo(p2.getName())).collect(Collectors.toList()));

        System.out.println("6 - " + people.stream().sorted(Comparator.comparing(People::getAge))
                .sorted(Comparator.comparing(People::getSex)).collect(Collectors.toList()));
    }
}
