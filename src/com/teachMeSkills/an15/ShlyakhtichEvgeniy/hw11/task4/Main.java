package com.teachMeSkills.an15.ShlyakhtichEvgeniy.hw11.task4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;

//даны две коллекции коллекция строк Arrays.asList(«a1», «a4», «a3», «a2», «a1», «a4»)
// и коллекция людей класса People (с полями name — имя, age — возраст, sex — пол),
// вида Arrays.asList( new People(«Вася», 16, Sex.MAN), new People(«Петя», 23, Sex.MAN),
// new People(«Елена», 42, Sex.WOMEN), new People(«Иван Иванович», 69, Sex.MAN)).
//
//
//1. Отсортировать коллекцию строк по алфавиту
//2. Отсортировать коллекцию строк по алфавиту в обратном порядке
//3. Отсортировать коллекцию строк по алфавиту и убрать дубликаты
//4. Отсортировать коллекцию строк по алфавиту в обратном порядке и убрать дубликаты
//5. Отсортировать коллекцию людей по имени в обратном алфавитном порядке
//6. Отсортировать коллекцию людей сначала по полу, а потом по возрасту
public class Main {
    public static void main(String[] args) {
        ArrayList<String> collection1 = new ArrayList<>(Arrays.asList("a1", "a4", "a3", "a2", "a1", "a4"));
        ArrayList<People> collection2 = new ArrayList<>(Arrays.asList(new People("Вася", 16, Sex.MAN),
                new People("Петя", 23, Sex.MAN),
                new People("Елена", 42, Sex.WOMEN),
                new People("Иван Иванович", 69, Sex.MAN)));
        System.out.println(collection1.stream().sorted().collect(Collectors.toList()));
        System.out.println(collection1.stream().sorted(((o1, o2) -> -o1.compareTo(o2))).collect(Collectors.toList()));
        System.out.println(collection1.stream().sorted().distinct().collect(Collectors.toList()));
        System.out.println(collection1.stream().sorted((o1, o2) -> -o1.compareTo(o2)).collect(Collectors.toList()));
        System.out.println(collection2.stream().sorted((o1, o2) -> -o1.getName().compareTo(o2.getName()))
                .collect(Collectors.toList()));
        System.out.println(collection2.stream().sorted(Comparator.comparing(People::getSex))
                .sorted(Comparator.comparing(People::getAge)).collect(Collectors.toList()));
    }
}
