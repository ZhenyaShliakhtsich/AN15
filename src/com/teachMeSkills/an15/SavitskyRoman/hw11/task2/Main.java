package com.teachMeSkills.an15.SavitskyRoman.hw11.task2;

import java.util.Arrays;
import java.util.Collection;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/*Условие: дана коллекция строк Arrays.asList(«a1», «a2», «a3», «a1»)

1. Найти существуют ли хоть один «a1» элемент в коллекции
2. Найти существуют ли хоть один «a8» элемент в коллекции
3. Найти есть ли символ «1» у всех элементов коллекции
4. Проверить что не существуют ни одного «a7» элемента в коллекции*/
public class Main {
    public static void main(String[] args) {
        Collection<String> collection = Arrays.asList("a1", "a2", "a3", "a1");
        Stream<String> stringStream = collection.stream();
        System.out.println(stringStream.filter("a1"::contains).collect(Collectors.toList()));

    }
}
