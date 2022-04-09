package com.teachMeSkills.an15.ShlyakhtichEvgeniy.hw11.task5;

import java.util.Arrays;
//Дана коллекция чисел Arrays.asList(1, 2, 3, 4, 2) выполним над ними несколько действий используя reduce.
//
//1. Получить сумму чисел или вернуть 0
//2. Вернуть максимум или -1
//3. Вернуть сумму нечетных чисел или 0

public class Main {
    public static void main(String[] args) {
        System.out.println(Arrays.asList(1, 2, 3, 4, 2).stream().reduce((Integer::sum)).orElse(0));
        System.out.println(Arrays.asList(1, 2, 3, 4, 2).stream().reduce(Integer::max).orElse(-1));
        System.out.println(Arrays.asList(1, 2, 3, 4, 2).stream().filter(c -> (c % 2) == 1).reduce(Integer::sum).orElse(0));
    }
}
