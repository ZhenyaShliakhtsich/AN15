package com.teachMeSkills.an15.LashkevichGeorgy.hw11;


import java.util.ArrayList;
import java.util.Comparator;
import java.util.stream.Collectors;
import java.util.stream.Stream;

//Условие: Дана коллекция чисел Arrays.asList(1, 2, 3, 4, 2) выполним над ними несколько действий используя reduce.
//
//1. Получить сумму чисел или вернуть 0
//2. Вернуть максимум или -1
//3. Вернуть сумму нечетных чисел или 0
public class Fifth {
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);
        arrayList.add(2);
        Stream<Integer> stream = arrayList.stream();
        // 1 System.out.println(stream.reduce((s,x) -> s + x).orElse(0));
        // 2 System.out.println(stream.reduce(Integer::max).orElse(-1));
        // 3 System.out.println(stream.filter(s -> s % 2 == 0).reduce(Integer::sum).orElse(0));


    }
}
