package com.teachMeSkills.an15.LashkevichGeorgy.hw11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Stream;

//Условие: даны две коллекции collection1 = Arrays.asList(«a1», «a2», «a3», «a1») и collection2 = Arrays.asList(«1,2,0», «4,5»)
//
//1. Добавить "_1" к каждому элементу первой коллекции
//2. В первой коллекции убрать первый символ и вернуть массив чисел (int[])
//3. Из второй коллекции получить все числа, перечисленные через запятую из всех элементов
//4. Из второй коллекции получить сумму всех чисел, перечисленных через запятую
//
//
//
public class Third {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList(Arrays.asList("a1", "a2", "a3", "a1"));
        ArrayList<String> arrayList2 = new ArrayList(Arrays.asList("1, 2, 0", "4, 5"));
        Stream<String> stream = arrayList.stream();
        //1. System.out.println(stream.map(s -> s + "_1").collect(Collectors.toList()));
        //2. System.out.println(stream.map(s -> Arrays.stream(s.split("")).skip(1).collect(Collectors.toList())).collect(Collectors.toList()));
        Stream<String> stream1 = arrayList2.stream();
        //System.out.println(stream1.distinct().anyMatch(String::matches) .stream().collect(Collectors.toList()));

    }
}
