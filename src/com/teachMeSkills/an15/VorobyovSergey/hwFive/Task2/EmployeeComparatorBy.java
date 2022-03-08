package com.teachMeSkills.an15.VorobyovSergey.hwFive.Task2;

import java.util.Comparator;

public class EmployeeComparatorBy implements Comparator<Employee> {
    @Override
    public int compare(Employee o1, Employee o2) {
        if (o1.getAverageSalaryInMonth() > o2.getAverageSalaryInMonth()) {
            return 1;
        }
        if (o1.getAverageSalaryInMonth() < o2.getAverageSalaryInMonth()) {
            return -1;
            //если че сравниваем по фио.
        } else if (o1.getAverageSalaryInMonth() == o2.getAverageSalaryInMonth()) {
            return o1.getFio().compareTo(o2.getFio());
        }
        return 0;
    }
}
