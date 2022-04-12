package com.teachMeSkills.an15.TuskalSergey.hw9.Task5;

import java.util.Arrays;
import java.util.Collection;

public class Main {
    public static void main(String[] args) {
        /*Дана коллекция чисел Arrays.asList(1, 2, 3, 4, 2)
        выполним над ними несколько действий используя reduce.

        1. Получить сумму чисел или вернуть 0
        2. Вернуть максимум или -1
        3. Вернуть сумму нечетных чисел или 0*/

        Collection<Integer> collection = Arrays.asList(1,2,3,4,2);

        System.out.println("1 - " + collection.stream().reduce((c1,c2) -> c1 + c2).orElse(0));

        System.out.println("2 - " + collection.stream().reduce(Integer::max).orElse(-1));

        System.out.println("3 - " + collection.stream().filter(c -> c % 2 != 0).reduce((c1,c2) ->
                c1 + c2).orElse(0));
    }
}
