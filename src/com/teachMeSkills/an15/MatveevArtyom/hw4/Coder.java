package com.teachMeSkills.an15.MatveevArtyom.hw4;

public class Coder {
    String FIO;
    int dateOfBirthday;
    String position;
    int salary;
    int phone;

    public Coder(String FIO) {
        this.FIO = FIO;
    }

    public void takeVacation(int countOfDays){
        System.out.println(FIO + " взял отпуск на " + countOfDays + " день");
    }

    public void takeVacation(int countOfDays, String ... strings){
        System.out.print(FIO + " взял отпуск, чтобы посетить: " );
        for (int i = 0; i < strings.length; i++) {
            System.out.print(strings[i] + " ");
        }
    }

    public void takeVacation(Country ... countries){
        System.out.print("\n" + FIO + " взял отпуск, чтобы посетить: в " );
        for (int i = 0; i < countries.length; i++) {
            System.out.print(countries[i].toString() + ", ");
        }
    }

    public void returnBack(int countOfDays){
        System.out.println("\n" + FIO + " вернулся из отпуска, который длился " + countOfDays + " день");
    }
    public void returnBack(int countOfDays, String ... strings){
        System.out.print(FIO + " вернулся из отпуска, в котором он посетил такие страны, как: " );
        for (int i = 0; i < strings.length; i++) {
            System.out.print(strings[i] + " ");
        }
    }

    public void returnBack(Country ... countries){
        System.out.print("\n" + FIO + " вернулся из отпуска, в котором он посетил такие страны и столицы, как: "  );
        for (int i = 0; i < countries.length; i++) {
            System.out.print(countries[i].toString() + ", ");
        }
    }

}
