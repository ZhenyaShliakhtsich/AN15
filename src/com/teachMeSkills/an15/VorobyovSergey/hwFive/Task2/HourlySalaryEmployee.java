package com.teachMeSkills.an15.VorobyovSergey.hwFive.Task2;

class HourlySalaryEmployee extends Employee {
    int hourlyRate;

    public HourlySalaryEmployee(String fio, int age, GenderOfEmployee gender, int hourlyRate) {
        super(fio, age, gender);
        this.hourlyRate = hourlyRate;
        this.averageSalaryInMonth = salaryCounter();
    }

    @Override
    double salaryCounter() {
        return 20.8 * 8 * hourlyRate;
    }

    @Override
    public String toString() {
        return "HourlySalaryEmployee{" +
                "fio='" + fio + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", averageSalaryInMonth=" + averageSalaryInMonth +
                ", hourlyRate=" + hourlyRate +
                '}';
    }
}
