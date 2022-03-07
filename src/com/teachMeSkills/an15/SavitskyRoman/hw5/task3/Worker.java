package com.teachMeSkills.an15.SavitskyRoman.hw5.task3;

public abstract class Worker {
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
}
