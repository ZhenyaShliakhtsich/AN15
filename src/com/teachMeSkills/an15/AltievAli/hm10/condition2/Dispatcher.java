package com.teachMeSkills.an15.AltievAli.hm10.condition2;

import java.util.Arrays;
import java.util.List;

public class Dispatcher {
    public static void main(String[] args) {
        List<String> stringList = Arrays.asList("a1,a2,a3,a1");
//        1. Найти существуют ли хоть один «a1» элемент в коллекции

        boolean anyMatch = stringList.stream().anyMatch(element -> element.contains("a1"));
        System.out.println(anyMatch);
//        2. Найти существуют ли хоть один «a8» элемент в коллекции
        boolean anyMatch1 = stringList.stream().anyMatch(element -> element.contains("a8"));
        System.out.println(anyMatch1);

//        3. Найти есть ли символ «1» у всех элементов коллекции
        boolean anyMatch2 = stringList.stream().allMatch(element -> element.contains("1"));
        System.out.println(anyMatch2);

//        4. Проверить что не существуют ни одного «a7» элемента в коллекции

        boolean anyMatch3 = stringList.stream().noneMatch(element -> element.contains("a7"));
        System.out.println(anyMatch3);


    }
}
