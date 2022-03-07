package com.teachMeSkills.an15.SavitskyRoman.hw5.task3;

public class Security extends Worker{
    private boolean isWeapon;

    public Security(String firstName, String surname, String profession, int age, String gender, boolean higherEducation, boolean isWeapon) {
        super(firstName, surname,profession, age, gender, higherEducation);
        this.isWeapon = isWeapon;
    }

    @Override
    public void setSalary(double salaryRate, double reward) {
        if (higherEducation)  salary = 20.8 * 8 * salaryRate * (reward / 100 + 1);
        else  salary = 1500 * (reward / 100 + 1);
    }
    public double getSalary(){
        return salary;
    }
}
