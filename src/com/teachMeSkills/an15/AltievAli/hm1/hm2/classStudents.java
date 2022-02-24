package com.teachMeSkills.an15.AltievAli.hm1.hm2;

public class classStudents {

    // Properties
    String nameOfStudent;
    String surnameOfStudent;
    String examName;
    int examScore;

    //Generated constructor
    public classStudents(String nameOfStudent, String surnameOfStudent, String examName, int examScore) {
        this.nameOfStudent = nameOfStudent;
        this.surnameOfStudent = surnameOfStudent;
        this.examName = examName;
        this.examScore = examScore;
    }

    //Generated toString
    @Override
    public String toString() {
        return "Студент " + nameOfStudent + " " + surnameOfStudent + " сдал экзамен по " + examName + " на " + examScore;
    }

}


