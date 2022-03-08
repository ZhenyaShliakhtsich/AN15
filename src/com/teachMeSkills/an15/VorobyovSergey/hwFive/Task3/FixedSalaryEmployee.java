package com.teachMeSkills.an15.VorobyovSergey.hwFive.Task3;

class FixedSalaryEmployee extends Employee {
    private int salary;

    public FixedSalaryEmployee(String fio, int age, GenderOfEmployee gender, int salary) {
        super(fio, age, gender);
        this.salary = salary;
        this.averageSalaryInMonth = salaryCounter();
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    double salaryCounter() {
        return this.salary;
    }

    @Override
    public String toString() {
        return "FixedSalaryEmployee{" +
                "fio='" + fio + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", averageSalaryInMonth=" + averageSalaryInMonth +
                ", salary=" + salary +
                '}';
    }
}
