package com.teachMeSkills.an15.VorobyovSergey.hwLast.four;
//Условие: даны две коллекции коллекция строк Arrays.asList(«a1», «a4», «a3», «a2», «a1», «a4»)
//        и коллекция людей класса People (с полями name — имя, age — возраст, sex — пол),
//        вида Arrays.asList( new People(«Вася», 16, Sex.MAN), new People(«Петя», 23, Sex.MAN),
//        new People(«Елена», 42, Sex.WOMEN), new People(«Иван Иванович», 69, Sex.MAN)).
//
//        1. Отсортировать коллекцию строк по алфавиту
//        2. Отсортировать коллекцию строк по алфавиту в обратном порядке
//        3. Отсортировать коллекцию строк по алфавиту и убрать дубликаты
//        4. Отсортировать коллекцию строк по алфавиту в обратном порядке и убрать дубликаты
//        5. Отсортировать коллекцию людей по имени в обратном алфавитном порядке
//        6. Отсортировать коллекцию людей сначала по полу, а потом по возрасту

import com.teachMeSkills.an15.VorobyovSergey.hwLast.one.People;
import com.teachMeSkills.an15.VorobyovSergey.hwLast.one.SexEnum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class Four {
    public static void main(String[] args) {
        ArrayList<People> list = new ArrayList<>(Arrays.asList(new People("Вася", 16, SexEnum.MAN),
                new People("Петя", 23, SexEnum.MAN),
                new People("Петя", 23, SexEnum.MAN),
                new People("Елена", 42, SexEnum.WOMAN),
                new People("Иван Иванович", 69, SexEnum.MAN)));

        ArrayList<String> collection1 = new ArrayList<>(Arrays.asList("a1", "a2", "a3", "a1", "a4"));

        System.out.println("Start - " + list);

        System.out.println("Task 1:");
//        list.stream().sorted((o1, o2) -> o1.getName()
//                .compareToIgnoreCase(o2.getName())).forEach(s -> System.out.println(s));
        collection1.stream().sorted().forEach(s -> System.out.println(s));

        System.out.println("Task 2:");
//        list.stream().sorted((o1, o2) -> o2.getName()
//                .compareToIgnoreCase(o1.getName())).forEach(s -> System.out.println(s));
        collection1.stream().sorted(Comparator.reverseOrder()).forEach(s -> System.out.println(s));

        System.out.println("Task 3:");
        //Важно чтобы были переопределены equals hashcode в People
        //Иначе оно тупо не знает как сравниваться и сравнивает ссылки
//        list.stream().distinct().sorted((o1, o2) -> o1.getName()
//                .compareToIgnoreCase(o2.getName())).forEach(s -> System.out.println(s));
        collection1.stream().distinct().sorted().forEach(s -> System.out.println(s));

        System.out.println("Task 4:");
//        list.stream().distinct().sorted((o1, o2) -> o2.getName()
//                .compareToIgnoreCase(o1.getName())).forEach(s -> System.out.println(s));
        collection1.stream().distinct().sorted(Comparator.reverseOrder()).forEach(s -> System.out.println(s));

        System.out.println("Task 5:");
        list.stream().sorted((o1, o2) -> o2.getName()
                .compareToIgnoreCase(o1.getName())).forEach(s -> System.out.println(s));

        System.out.println("Task 6:");
        list.stream().sorted(Comparator.comparing(people -> people.getAge()))
                //Comparator должен быть для People а не его параметра
                //Можно еще в компараторе реализовать thenSorted
                .sorted(new ComparatorForEnumSex()).forEach(s -> System.out.println(s));
    }
}
