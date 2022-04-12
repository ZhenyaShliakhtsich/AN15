package com.teachMeSkills.an15.TuskalSergey.hw9.Task3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        /*даны две коллекции collection1 = Arrays.asList(«a1», «a2», «a3», «a1»)
        и collection2 = Arrays.asList(«1,2,0», «4,5»)

        1. Добавить "_1" к каждому элементу первой коллекции
        2. В первой коллекции убрать первый символ и вернуть массив чисел (int[])
        3. Из второй коллекции получить все числа, перечисленные через запятую из всех элементов
        4. Из второй коллекции получить сумму всех чисел, перечисленных через запятую*/

        ArrayList<String> collection1 = new ArrayList<>(Arrays.asList("a1", "a2", "a3", "a1"));
        ArrayList<String> collection2 = new ArrayList<>(Arrays.asList("1,2,0", "4,5"));

        System.out.println("1 - " + collection1.stream().map(s -> s + "_1").collect(Collectors.toList()));
        System.out.println("2 - " + collection1.stream().mapToInt((s) ->
                Integer.parseInt(s.substring(1))).toArray());
        System.out.println("3 - " + collection2.stream().flatMap((s) ->
                Arrays.asList(s.split(",")).stream()).toArray(String[]::new));
        System.out.println("4 - " + collection2.stream().flatMapToInt((s) ->
                Arrays.asList(s.split(",")).stream().mapToInt(Integer::parseInt)).sum());
    }
}
