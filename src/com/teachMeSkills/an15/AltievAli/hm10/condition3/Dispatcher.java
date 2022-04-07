package com.teachMeSkills.an15.AltievAli.hm10.condition3;
//Условие: даны две коллекции collection1 = Arrays.asList(«a1», «a2», «a3», «a1») и collection2 = Arrays.asList(«1,2,0», «4,5»)
//        1. Добавить "_1" к каждому элементу первой коллекции
//        2. В первой коллекции убрать первый символ и вернуть массив чисел (int[])
//        3. Из второй коллекции получить все числа, перечисленные через запятую из всех элементов
//        4. Из второй коллекции получить сумму всех чисел, перечисленных через запятую

import java.util.Arrays;
import java.util.List;

public class Dispatcher {
    public static void main(String[] args) {
        //Collections
        List<String> firstList = Arrays.asList("a1", "a2", "a3", "a1");
        List<String> secondList = Arrays.asList("1,2,3", "4,5");

//        1. Добавить "_1" к каждому элементу первой коллекции
        firstList.stream().map(element -> element + "_1").forEach(System.out::println);

//        В первой коллекции убрать первый символ и вернуть массив чисел (int[])
        Object[] numbers = firstList.stream().map(element -> Integer.parseInt(element.toString().substring(1))).toArray();
        System.out.println(Arrays.toString(numbers));

//        Из второй коллекции получить все числа, перечисленные через запятую из всех элементов
        Object[] secondListNumbers = secondList.stream().map(s -> Arrays.asList(s.toString().split(","))).toArray();
        System.out.println(Arrays.toString(secondListNumbers));

//        Из второй коллекции получить сумму всех чисел, перечисленных через запятую
        int secondListResultOfSum = secondList.stream()
                .flatMapToInt((element) ->
                        Arrays.asList(element.split(","))
                                .stream().mapToInt(Integer::parseInt)).sum();
        System.out.println(secondListResultOfSum);
    }
}
