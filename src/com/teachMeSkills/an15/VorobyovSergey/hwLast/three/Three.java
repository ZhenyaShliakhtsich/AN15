package com.teachMeSkills.an15.VorobyovSergey.hwLast.three;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

//Условие: даны две коллекции collection1 = Arrays.asList(«a1», «a2», «a3», «a1») и collection2 = Arrays.asList(«1,2,0», «4,5»)
//
//        1. Добавить "_1" к каждому элементу первой коллекции
//        2. В первой коллекции убрать первый символ и вернуть массив чисел (int[])
//        3. Из второй коллекции получить все числа, перечисленные через запятую из всех элементов
//        4. Из второй коллекции получить сумму всех чисел, перечисленных через запятую
public class Three {
    public static void main(String[] args) {
        ArrayList<String> collection1 = new ArrayList<>(Arrays.asList("a1", "a2", "a3", "a1"));
        ArrayList<String> collection2 = new ArrayList<>(Arrays.asList("1,2,0", "4,5"));

        System.out.println("Task 1");
        collection1.stream().map(s -> s +"_1").forEach(System.out::println);

        System.out.println("Task 2");
        int[] arr = collection1.stream().map(x -> x.substring(1)).mapToInt(x -> Integer.valueOf(x)).sorted().toArray();
        for (int i: arr){
            System.out.print(i + " ");
        }
        System.out.println();

        System.out.println("Task 3");
        System.out.println(collection2.stream().map(s -> s.split(",")).flatMap(a -> Arrays.stream(a).map(x -> Integer.parseInt(x)))
                .collect(Collectors.toList()));
//        String s = "1,2,0";
//        String[] ss = s.split(",");
//        ArrayList<Integer> i = (ArrayList<Integer>) Arrays.stream(ss).map(x -> Integer.parseInt(x)).collect(Collectors.toList());
//        System.out.println(i);

        System.out.println("Task 4");
        System.out.println(collection2.stream().map(s -> s.split(","))
                .flatMapToInt(a -> Arrays.stream(a).mapToInt(x -> Integer.parseInt(x))).sum());
    }
}
