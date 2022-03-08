package com.teachMeSkills.an15.VorobyovSergey.hwFive.Task2;

class HourlySalaryEmployee extends Employee {
    private int hourlyRate;

    public HourlySalaryEmployee(String fio, int age, GenderOfEmployee gender, int hourlyRate) {
        super(fio, age, gender);
        this.hourlyRate = hourlyRate;
        this.averageSalaryInMonth = salaryCounter();
    }

    public int getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(int hourlyRate) {
        this.hourlyRate = hourlyRate;
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
