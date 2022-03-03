package com.teachMeSkills.an15.AltievAli.hm4.Task4;

public class Programmer {


    private String programmerName;
    private String birthDate;
    private String position;
    private int salary;
    private long phoneNumber;

    public Programmer(String programmerName, String birthDate, String position, int salary, long phoneNumber) {
        this.programmerName = programmerName;
        this.birthDate = birthDate;
        this.position = position;
        this.salary = salary;
        this.phoneNumber = phoneNumber;
    }


    public Programmer() {
    }


    public String getProgrammerName() {
        return programmerName;
    }

    public void setProgrammerName(String programmerName) {
        this.programmerName = programmerName;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }


    @Override
    public String toString() {
        return
                "programmerName='" + programmerName + '\'' +
                ", birthDate='" + birthDate + '\'' +
                ", position='" + position + '\'' +
                ", salary=" + salary +
                ", phoneNumber=" + phoneNumber +
                '}';
    }
}
