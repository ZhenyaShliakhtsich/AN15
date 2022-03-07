package com.teachMeSkills.an15.VorobyovSergey.hwFive.Task2;

abstract class Employee {
    String fio;
    int age;
    GenderOfEmployee gender;
    double averageSalaryInMonth;

    public Employee(String fio, int age, GenderOfEmployee gender) {
        this.fio = fio;
        this.age = age;
        this.gender = gender;
        this.averageSalaryInMonth = salaryCounter();
    }

    abstract double salaryCounter();

}
