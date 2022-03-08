package com.teachMeSkills.an15.VorobyovSergey.hwFive.Task3;

abstract class Employee {
    protected String fio;
    protected int age;
    protected GenderOfEmployee gender;
    protected double averageSalaryInMonth;

    public Employee(String fio, int age, GenderOfEmployee gender) {
        this.fio = fio;
        this.age = age;
        this.gender = gender;
        this.averageSalaryInMonth = salaryCounter();
    }

    abstract double salaryCounter();

    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public GenderOfEmployee getGender() {
        return gender;
    }

    public void setGender(GenderOfEmployee gender) {
        this.gender = gender;
    }

    public double getAverageSalaryInMonth() {
        return averageSalaryInMonth;
    }

    public void setAverageSalaryInMonth(double averageSalaryInMonth) {
        this.averageSalaryInMonth = averageSalaryInMonth;
    }
}
