package com.teachMeSkills.an15.SavitskyRoman.hw5.task3;

import java.util.Objects;

public class Security extends Worker {
    private boolean isWeapon;

    public Security(String firstName, String surname, String profession, int age, String gender,
                    boolean higherEducation, boolean isWeapon) {
        super(firstName, surname, profession, age, gender, higherEducation);
        this.isWeapon = isWeapon;
    }

    @Override
    public void setSalary(double salaryRate, double reward) {
        if (higherEducation) salary = 20.8 * 8 * salaryRate * (reward / 100 + 1);
        else salary = 1500 * (reward / 100 + 1);
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Security security = (Security) o;
        return isWeapon == security.isWeapon;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), isWeapon);
    }

    @Override
    public String toString() {
        return "Security{" +
                "isWeapon=" + isWeapon +
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
