package com.teachMeSkills.an15.VorobyovSergey.hwLast.two;

import java.util.ArrayList;
import java.util.Arrays;

//Условие: дана коллекция строк Arrays.asList(«a1», «a2», «a3», «a1»)
//
//        1. Найти существуют ли хоть один «a1» элемент в коллекции
//        2. Найти существуют ли хоть один «a8» элемент в коллекции
//        3. Найти есть ли символ «1» у всех элементов коллекции
//        4. Проверить что не существуют ни одного «a7» элемента в коллекции
public class Two {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>(Arrays.asList("a1", "a2", "a3", "a1"));

        System.out.println("Task 1:");
        System.out.println(list.stream().anyMatch(x -> x.equals("a1")));

        System.out.println("Task 2:");
        System.out.println(list.stream().anyMatch(x -> x.equals("a8")));

        System.out.println("Task 3:");
        System.out.println("У кого-то - " + list.stream().anyMatch(x -> x.contains("1")));
        System.out.println("У всех - " + list.stream().allMatch(x -> x.contains("1")));

        System.out.println("Task 4:");
        System.out.println("Элемента а7 не существует - " + list.stream().noneMatch(x -> x.equals("a7")));
    }
}
