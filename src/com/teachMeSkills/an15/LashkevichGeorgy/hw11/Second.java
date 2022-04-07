package com.teachMeSkills.an15.LashkevichGeorgy.hw11;

import java.util.Arrays;
import java.util.stream.Stream;

//Условие: дана коллекция строк Arrays.asList(«a1», «a2», «a3», «a1»)
//
//1. Найти существуют ли хоть один «a1» элемент в коллекции
//2. Найти существуют ли хоть один «a8» элемент в коллекции
//3. Найти есть ли символ «1» у всех элементов коллекции
//4. Проверить что не существуют ни одного «a7» элемента в коллекции
//
//
//
public class Second {
    public static void main(String[] args) {
        Stream<String> stream = Stream.of("a1", "a2", "a3", "a1");
        //System.out.println("Найти существуют ли хоть один «a1» элемент в коллекции " + stream.anyMatch("a1"::equals));
        //System.out.println("Найти существуют ли хоть один «a8» элемент в коллекции "+ stream.anyMatch("a8"::equals));
        //System.out.println("Найти есть ли символ «1» у всех элементов коллекции " + stream.allMatch("1"::equals));
        //System.out.println("Проверить что не существуют ни одного «a7» элемента в коллекции " + stream.anyMatch("a7"::equalsIgnoreCase));
    }
}
