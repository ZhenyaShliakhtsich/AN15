package com.teachMeSkills.an15.AltievAli.hm10.condition5;

import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;

public class Dispatcher {
    /*
Условие: Дана коллекция чисел Arrays.asList(1, 2, 3, 4, 2) выполним над ними несколько действий используя reduce.

1. Получить сумму чисел или вернуть 0
2. Вернуть максимум или -1
3. Вернуть сумму нечетных чисел или 0
     */
    @Test
    void test() {
        //Получить сумму чисел или вернуть 0
        List<Integer> numberList = Arrays.asList(1, 2, 3, 4, 2);

        Integer sumNumber = numberList.stream().reduce(Integer::sum).orElse(0);
        System.out.println(sumNumber);

//        Вернуть максимум или -1
        Integer maxNumberOrReturnOtherNum = numberList
                .stream()
                .reduce((accumulator, element)
                        -> Integer.max(accumulator, element))
                .orElse(-1);
        System.out.println(maxNumberOrReturnOtherNum);

//        Вернуть сумму нечетных чисел или 0
        Integer sumOfOddNumbers = numberList
                .stream()
                .filter(element -> element % 2 != 0)
                .reduce(Integer::sum).orElse(0);
        System.out.println(sumOfOddNumbers);


    }

}
