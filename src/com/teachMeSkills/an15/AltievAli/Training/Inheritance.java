package com.teachMeSkills.an15.AltievAli.Training;

public class Inheritance {
    public static void main(String[] args) {

        Doctor doctor = new Doctor();
        System.out.println(doctor.age = 77);
        System.out.println(doctor.Name = "Sara");
        doctor.eat();
        doctor.walk();
        doctor.treat();
        System.out.println(doctor.specialization = "dentist");

        System.out.println();

        Driver driver = new Driver();
        String driverName =  driver.Name = "Filip";
        System.out.println("Driver Name is: " + driverName);
        int ageDriver = driver.age = 47;
        System.out.println("Age driver is: " + ageDriver);
        String carDiver = driver.carName = "BMW";
        System.out.println("Car of Driver is: " + carDiver);
        driver.eat();
        driver.drive();

    }


}


class Employee {
    int age;
    String Name;

    void eat() {
        System.out.println("Eat");
    }

    void walk() {
        System.out.println("Walk");
    }
}

class Doctor extends Employee {
    String specialization;

    void treat() {
        System.out.println("Doctor treats");
    }
}

class Driver extends Employee {
    String carName;

    void drive() {
        System.out.println("Driver drives");
    }
}

