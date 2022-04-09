package com.teachMeSkills.an15.VorobyovSergey.hwLast.five;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Optional;

//Условие: Дана коллекция чисел Arrays.asList(1, 2, 3, 4, 2)
//        выполним над ними несколько действий используя reduce.
//
//        1. Получить сумму чисел или вернуть 0
//        2. Вернуть максимум или -1
//        3. Вернуть сумму нечетных чисел или 0
public class Five {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 2));

        System.out.println("Task 1:");
        //Важно добавлять всегда orElse иначе придется создавать Optional o на случай если ничего не вернется из стрима
        Integer i = list.stream().reduce((x, y) -> x + y).orElse(0);
        System.out.println(i);

        System.out.println("Task 2:");
        Integer ii = list.stream().mapToInt(x -> x).max().orElse(-1);
        System.out.println(ii);

        System.out.println("Task 3:");
        Integer summa = list.stream().mapToInt(x -> x).filter(x -> x % 2 != 0).sum();
        System.out.println(summa);
    }
}
