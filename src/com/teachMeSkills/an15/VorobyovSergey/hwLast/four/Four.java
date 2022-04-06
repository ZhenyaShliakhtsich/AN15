package com.teachMeSkills.an15.VorobyovSergey.hwLast.four;
//Условие: даны две коллекции коллекция строк Arrays.asList(«a1», «a4», «a3», «a2», «a1», «a4»)
//        и коллекция людей класса People (с полями name — имя, age — возраст, sex — пол),
//        вида Arrays.asList( new People(«Вася», 16, Sex.MAN), new People(«Петя», 23, Sex.MAN),
//        new People(«Елена», 42, Sex.WOMEN), new People(«Иван Иванович», 69, Sex.MAN)).
//
//        1. Отсортировать коллекцию строк по алфавиту
//        2. Отсортировать коллекцию строк по алфавиту в обратном порядке
//        3. Отсортировать коллекцию строк по алфавиту и убрать дубликаты
//        4. Отсортировать коллекцию строк по алфавиту в обратном порядке и убрать дубликаты
//        5. Отсортировать коллекцию людей по имени в обратном алфавитном порядке
//        6. Отсортировать коллекцию людей сначала по полу, а потом по возрасту

import com.teachMeSkills.an15.VorobyovSergey.hwLast.one.People;
import com.teachMeSkills.an15.VorobyovSergey.hwLast.one.SexEnum;

import java.util.ArrayList;
import java.util.Arrays;

public class Four {
    public static void main(String[] args) {
        ArrayList<People> list = new ArrayList<>(Arrays.asList(new People("Вася", 16, SexEnum.MAN),
                new People("Петя", 23, SexEnum.MAN),
                new People("Елена", 42, SexEnum.WOMAN),
                new People("Иван Иванович", 69, SexEnum.MAN)));

        System.out.println("Start - " + list);
    }
}
