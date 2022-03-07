package com.teachMeSkills.an15.TuskalSergey.hw4;

public class Coder {
    String name;
    String dateOfBirth;
    String position;
    int salary;
    int phoneNumber;

    public Coder(String name, String dateOfBirth, String position, int salary, int phoneNumber) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.position = position;
        this.salary = salary;
        this.phoneNumber = phoneNumber;
    }

    public void takeVacation(int daysOfVacation) {
        System.out.println(name + " взял отпуск на " + daysOfVacation + " день");
    }

public void takeVacation(Country country) {
    System.out.println(name + " взял отпуск, чтобы посетить: " + country);
}

    public void takeVacation(PlaceToVisit placeToVisit) {
        System.out.println(name + " взял отпуск, чтобы посетить: " + placeToVisit);
    }

    public void returnBack() {
        System.out.println(name + " вернулся из отпуска");
    }

    @Override
    public String toString() {
        return "Coder{" +
                "name='" + name + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                ", position='" + position + '\'' +
                ", salary=" + salary +
                ", phoneNumber=" + phoneNumber +
                '}';
    }


}
