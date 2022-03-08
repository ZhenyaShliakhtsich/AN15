package com.teachMeSkills.an15.VorobyovSergey.hwFive.Task3;

import java.util.ArrayList;
import java.util.List;

class MainTask2 {
    public static void main(String[] args) {
        //Создали наших чувачков
        FixedSalaryEmployee fse1 =
                new FixedSalaryEmployee("Ивинова И.И.", 35,
                        GenderOfEmployee.FEMALE, 2000);
        FixedSalaryEmployee fse2 =
                new FixedSalaryEmployee("Антонов А.А.", 35,
                        GenderOfEmployee.MALE, 2000);
        FixedSalaryEmployee fse3 =
                new FixedSalaryEmployee("Аатонов А.А.", 35,
                        GenderOfEmployee.MALE, 2000);
        HourlySalaryEmployee hse1 =
                new HourlySalaryEmployee("Сухадрищенко Д.В.", 25,
                        GenderOfEmployee.TRANSGENDER, 23);
        HourlySalaryEmployee hse2 =
                new HourlySalaryEmployee("Зелепупенко З.И.", 46,
                        GenderOfEmployee.IT, 17);
        HourlySalaryEmployee hse3 =
                new HourlySalaryEmployee("Зелепупенко А.И.", 46,
                        GenderOfEmployee.IT, 17);

        //Все что нам надо для сортировки
        System.out.println("Всех в список");
        ArrayList<Employee> list =
                new ArrayList<Employee>(List.of(fse1, fse2, fse3, hse1, hse2, hse3));
        System.out.println(list);
        System.out.println("Сортируем");

        //В этих методах мы все и проверяем
        sortMyList(list);
        getFirstFive(list);
        getLastThree(list);
    }

    //Сортировочка
    static void sortMyList(ArrayList<Employee> list) {
        //Мы ничего не проходили по сортировке обьектов,
        //так что делаю что хочу и как нравится
        list.stream().sorted(new EmployeeComparatorBy())
                .forEach(s -> System.out.println(s));
    }

    static void getFirstFive(ArrayList<Employee> list) {
        System.out.println("First 5");
        if (list.size() >= 5) {
            for (int i = 0; i < 5; i++) {
                System.out.println(list.get(i));
            }
        }
    }

    static void getLastThree(ArrayList<Employee> list) {
        System.out.println("Last 3");
        if (list.size() >= 3) {
            for (int i = list.size() - 1; i > list.size() - 4; i--) {
                System.out.println(list.get(i));
            }
        }
    }
}
