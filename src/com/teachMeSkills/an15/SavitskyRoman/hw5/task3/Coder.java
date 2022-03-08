package com.teachMeSkills.an15.SavitskyRoman.hw5.task3;

import java.util.Objects;

public class Coder extends Worker {
    private String lvl;

    public Coder(String firstName, String surname, String profession, int age, String gender,
                 boolean higherEducation, String lvl) {
        super(firstName, surname, profession, age, gender, higherEducation);
        this.lvl = lvl;
    }

    @Override
    public void setSalary(double salaryRate, double reward) {
        if (higherEducation) salary = 20.8 * 8 * salaryRate * (reward / 100 + 1);
        else salary = 1500 * (reward / 100 + 1);
    }

    public double getSalary() {
        return salary;
    }

    public void getAnothing(int a) {
        System.out.println("in get" + a);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Coder coder = (Coder) o;
        return Objects.equals(lvl, coder.lvl);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), lvl);
    }

    @Override
    public String toString() {
        return "Coder{" +
                "lvl='" + lvl + '\'' +
                ", firstName='" + firstName + '\'' +
                ", surname='" + surname + '\'' +
                ", profession='" + profession + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", higherEducation=" + higherEducation +
                ", salary=" + salary +
                '}';
    }
}
