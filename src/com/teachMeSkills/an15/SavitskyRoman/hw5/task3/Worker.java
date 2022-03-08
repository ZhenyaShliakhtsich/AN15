package com.teachMeSkills.an15.SavitskyRoman.hw5.task3;

import java.io.Serializable;
import java.util.Objects;

public abstract class Worker implements Serializable {
    public String getFirstName() {
        return firstName;
    }

    public String getSurname() {
        return surname;
    }

    String firstName;
    String surname;
    String profession;
    int age;
    String gender;
    boolean higherEducation;
    double salary;

    public Worker(String firstName, String surname, String profession, int age, String gender, boolean higherEducation) {
        this.firstName = firstName;
        this.surname = surname;
        this.profession = profession;
        this.age = age;
        this.gender = gender;
        this.higherEducation = higherEducation;
    }

    public abstract void setSalary(double salaryRate, double reward);

    public abstract double getSalary();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Worker worker = (Worker) o;
        return age == worker.age && higherEducation == worker.higherEducation &&
                Double.compare(worker.salary, salary) == 0 && Objects.equals(firstName, worker.firstName) &&
                Objects.equals(surname, worker.surname) && Objects.equals(profession, worker.profession) &&
                Objects.equals(gender, worker.gender);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, surname, profession, age, gender, higherEducation, salary);
    }

    @Override
    public String toString() {
        return "Worker{" +
                "firstName='" + firstName + '\'' +
                ", surname='" + surname + '\'' +
                ", profession='" + profession + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", higherEducation=" + higherEducation +
                ", salary=" + salary +
                '}';
    }
}
