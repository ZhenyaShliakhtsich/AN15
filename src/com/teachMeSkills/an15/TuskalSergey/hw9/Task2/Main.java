package com.teachMeSkills.an15.TuskalSergey.hw9.Task2;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        /*дана коллекция строк Arrays.asList(«a1», «a2», «a3», «a1»)

        1. Найти существуют ли хоть один «a1» элемент в коллекции
        2. Найти существуют ли хоть один «a8» элемент в коллекции
        3. Найти есть ли символ «1» у всех элементов коллекции
        4. Проверить что не существуют ни одного «a7» элемента в коллекции*/

        ArrayList<String> strings = new ArrayList<>(Arrays.asList("a1","a2","a3","a1"));
        System.out.println("1 - " + (strings.stream().anyMatch("a1"::equals) ? "да" : "нет"));
        System.out.println("2 - " + (strings.stream().anyMatch("a8"::equals) ? "да" : "нет"));
        System.out.println("3 - " + (strings.stream().allMatch(s -> s.contains("1")) ? "у всех" :
                "не у всех"));
        System.out.println("4 - " + (strings.stream().noneMatch("a7"::equals) ? "не существует" :
                "существует"));
    }
}
