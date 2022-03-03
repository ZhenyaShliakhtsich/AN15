package com.teachMeSkills.an15.TuskalSergey.hw4;

public class Coder {
    String name;
    String dob;
    String position;
    int salary;
    int phoneNumber;
    
    public Coder(String name, String dob, String position, int salary, int phoneNumber) {
        this.name = name;
        this.dob = dob;
        this.position = position;
        this.salary = salary;
        this.phoneNumber = phoneNumber;
    }

public void takeVacation(int daysOfVacation) {
    System.out.println(name + " взял отпуск на " + daysOfVacation + " день");
}

public void takeVacation(String country) {
    System.out.println(name + " взял отпуск, чтобы посетить: " + country);
}

public void returnBack() {
    System.out.println(name + " вернулся из отпуска");
}

    @Override
    public String toString() {
        return "Coder{" +
                "name='" + name + '\'' +
                ", dob='" + dob + '\'' +
                ", position='" + position + '\'' +
                ", salary=" + salary +
                ", phoneNumber=" + phoneNumber +
                '}';
    }
}
