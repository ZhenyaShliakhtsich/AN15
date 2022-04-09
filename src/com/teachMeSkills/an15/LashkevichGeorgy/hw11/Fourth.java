package com.teachMeSkills.an15.LashkevichGeorgy.hw11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

//Условие: даны две коллекции коллекция строк Arrays.asList(«a1», «a4», «a3», «a2», «a1», «a4») и коллекция людей класса People (с полями name — имя, age — возраст, sex — пол), вида Arrays.asList( new People(«Вася», 16, Sex.MAN), new People(«Петя», 23, Sex.MAN), new People(«Елена», 42, Sex.WOMEN), new People(«Иван Иванович», 69, Sex.MAN)).
//
//
//1. Отсортировать коллекцию строк по алфавиту
//2. Отсортировать коллекцию строк по алфавиту в обратном порядке
//3. Отсортировать коллекцию строк по алфавиту и убрать дубликаты
//4. Отсортировать коллекцию строк по алфавиту в обратном порядке и убрать дубликаты
//5. Отсортировать коллекцию людей по имени в обратном алфавитном порядке
//6. Отсортировать коллекцию людей сначала по полу, а потом по возрасту
//
//
public class Fourth {
    public static void main(String[] args) {
        Stream<String> stream1 =Stream.of("a1", "a4", "a3", "a2", "a1", "a4");
        Stream<People> stream = Stream.of(new People("Вася", 16, "Sex.Man"), new People("Петя", 23, "Sex.Man"),
                new People("Елена", 42, "Sex.Woman"), new People("Иван Иванович", 69, "Sex.Man"));
        // 1 System.out.println(stream1.sorted().collect(Collectors.toList()));
        // 2 System.out.println(stream1.sorted(String::lastIndexOf).collect(Collectors.toList()));
        // 3 System.out.println(stream1.sorted().distinct().collect(Collectors.toList()));
        // 4 System.out.println(stream1.sorted().distinct().sorted(String::lastIndexOf).collect(Collectors.toList()));
        //System.out.println(stream.sorted(s -> s.getName()));
    }
}
